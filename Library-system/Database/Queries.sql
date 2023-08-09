/*Get all users and their borrowed book details:*/
SELECT U.userID, U.userName, B.bookName, B.author, BR.borrowDate, BR.dueDate
FROM Users U
LEFT JOIN Borrow BR ON U.userID = BR.userID
LEFT JOIN Books B ON BR.serialNumber = B.serialNumber;

/*Get the count of available books in each genre:*/
SELECT genre, SUM(availableCopies) AS available_books
FROM Books
GROUP BY genre;

/*Extend the due date for a specific borrowed book:*/
UPDATE Borrow
SET dueDate = DATE_ADD(dueDate, INTERVAL 7 DAY)
WHERE borrowID = 2;

/*List users whose subscriptions have expired:*/
SELECT U.userID, U.userName
FROM Users U
LEFT JOIN Subscription S ON U.userID = S.userID
WHERE CURDATE() > S.endDate;
