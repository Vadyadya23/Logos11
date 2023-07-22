DROP DATABASE IF EXISTS magazine;
CREATE DATABASE magazine CHAR SET utf8;
USE magazine;
SELECT DATABASE();

CREATE TABLE magazine.magazine (
  id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  title VARCHAR(255) NOT NULL,
  descript VARCHAR(255) NOT NULL,
  price double NOT NULL
);
INSERT INTO magazine.magazine (id, title, descript, price) VALUES
(1, 'Harry Potter and Secret Room', 'Harry Potter and Secret Room', 231.22),
(2, 'Кобзар', 'Збірник', 2111.44),
(3, 'One Piece', 'One Piece is real', 224.99),
(4, 'Wolf from Wall Street', 'Money', 222.55),
(5, 'Time', 'Expensive time using', 100.09);
