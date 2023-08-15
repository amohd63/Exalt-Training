package com.example.demo.services;

import com.example.demo.models.Borrow;
import com.example.demo.repositories.BorrowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BorrowService {
    @Autowired
    BorrowRepository borrowRepository;

    public List<Borrow> getUserBorrowHistory(Integer userID) {
        List<Borrow> borrowList = borrowRepository.findAll();

        if (borrowList == null || borrowList.isEmpty()) {
            return null;
        }

        return borrowList.stream()
                .filter(borrow -> borrow.getUserID().equals(userID))
                .collect(Collectors.toList());
    }

    //handle if the user have two active books
    public String borrowBook(Integer userID, String serialNumber) {
        if (borrowRepository.findBorrowByUserIDAndEndDateGreaterThanEqual(userID, Date.valueOf(LocalDate.now())).size() > 2) {
            return "You can borrow up to 2 books only.";
        }
        if (borrowRepository.existsBorrowByUserIDAndSerialNumber(userID, serialNumber)) {
            Borrow borrow = borrowRepository.findBorrowByUserIDAndSerialNumber(userID, serialNumber);
            if (borrow.getEndDate().after(Date.valueOf(LocalDate.now()))) {
                return "You already borrowed the book!";
            } else if (borrow.getEndDate().equals(Date.valueOf(LocalDate.now()))) {
                return "You have to extend the borrow.";
            }
            borrow.setStartDate(Date.valueOf(LocalDate.now()));
            borrowRepository.saveAndFlush(borrow);
            return "You borrowed the book again!";
        }
        borrowRepository.save(
                new Borrow(userID, serialNumber)
        );
        return "Borrowed the book successfully!";
    }

    public String extendBorrow(Integer userID, String serialNumber) {
        if (borrowRepository.existsBorrowByUserIDAndSerialNumber(userID, serialNumber)) {
            Borrow borrow = borrowRepository.findBorrowByUserIDAndSerialNumber(userID, serialNumber);
            if (borrow.getEndDate().equals(Date.valueOf(LocalDate.now()))) {
                borrow.setStartDate(Date.valueOf(LocalDate.now()));
                borrowRepository.saveAndFlush(borrow);
                return "Borrow extended successfully!";
            }
        }
        return "You have to borrow the book again!";
    }

    public int deleteBorrow(Integer userID, String serialNumber) {
        return borrowRepository.deleteBorrowByUserIDAndSerialNumber(userID, serialNumber);
    }
}
