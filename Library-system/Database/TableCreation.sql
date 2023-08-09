drop table Users, Books, Borrow, Subscription;
-- User table
CREATE TABLE Users (
    userID INT PRIMARY KEY,
    user_name VARCHAR(50) NOT NULL UNIQUE,
    user_password VARCHAR(100) NOT NULL,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL
);

-- Book table
CREATE TABLE Books (
	serialNumber VARCHAR(20) NOT NULL UNIQUE PRIMARY KEY,
    bookName VARCHAR(200) NOT NULL,
    numOfPages INT NOT NULL,
    genre ENUM('FICTION', 'NOVEL', 'SCIENCE', 'BIOGRAPHY') NOT NULL,
    author VARCHAR(100) NOT NULL,
    availableCopies INT NOT NULL,
    totalCopies INT NOT NULL
);

CREATE TABLE Subscription (
	subscriptionID INT PRIMARY KEY,
    userID INT,
    startDate DATE NOT NULL,
    endDate DATE NOT NULL,
    FOREIGN KEY (userID) REFERENCES Users(userID) ON DELETE CASCADE
);

-- Borrowed Books table
CREATE TABLE Borrow (
    borrowID INT PRIMARY KEY,
    userID INT,
    serialNumber VARCHAR(20),
    borrowDate DATE NOT NULL,
    dueDate DATE NOT NULL,
    FOREIGN KEY (userID) REFERENCES Users(userID) ON DELETE CASCADE,
    FOREIGN KEY (serialNumber) REFERENCES Books(serialNumber) ON DELETE CASCADE
);
