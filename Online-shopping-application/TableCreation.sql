DROP TABLE Product;

-- Product
CREATE TABLE Product (
    id INT PRIMARY KEY UNIQUE AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL UNIQUE,
    description VARCHAR(100) NOT NULL default '',
    price BIGINT NOT NULL,
    creation_time LONG NOT NULL,
    last_update_time LONG,
    category VARCHAR(20),
    version VARCHAR(20)
);

ALTER TABLE Product AUTO_INCREMENT=1;

SET FOREIGN_KEY_CHECKS=0; -- to disable them
