CREATE DATABASE `testdb` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

CREATE TABLE `board` (
     `board_no` int NOT NULL AUTO_INCREMENT,
     `board_title` varchar(100) DEFAULT NULL,
     `board_content` varchar(200) DEFAULT NULL,
     `board_writer` varchar(25) DEFAULT NULL,
     `board_write_dt` datetime NOT NULL,
     PRIMARY KEY (`board_no`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
