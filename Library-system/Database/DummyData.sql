-- Inserting dummy data into Users table
INSERT INTO Users (userID, user_name, user_password, first_name, last_name)
VALUES
    (1, 'user1', 'password1', 'John', 'Doe'),
    (2, 'user2', 'password2', 'Jane', 'Smith'),
    (3, 'user3', 'password3', 'Michael', 'Johnson');

-- Inserting dummy data into Books table
INSERT INTO Books (serialNumber, bookName, numOfPages, genre, author, availableCopies, totalCopies)
VALUES
    ('SN123', 'The Great Novel', 300, 'NOVEL', 'Author A', 5, 10),
    ('SN456', 'Science Explained', 250, 'SCIENCE', 'Author B', 3, 5),
    ('SN789', 'Fiction Adventures', 400, 'FICTION', 'Author C', 7, 7);

-- Inserting dummy data into Subscription table
INSERT INTO Subscription (subscriptionID, userID, start_date, end_date)
VALUES
    (1, 1, '2023-01-01', '2023-12-31'),
    (2, 2, '2023-02-15', '2023-08-15'),
    (3, 3, '2022-03-10', '2022-09-10');

-- Inserting dummy data into Borrow table
INSERT INTO Borrow (borrowID, userID, serialNumber, borrowDate, dueDate)
VALUES
    (1, 1, 'SN123', '2023-04-01', '2023-04-08'),
    (2, 2, 'SN456', '2023-05-10', '2023-05-17'),
    (3, 1, 'SN789', '2023-06-20', '2023-06-27');
