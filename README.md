# Multiple-Database-in-Single-Spring-Boot-App
Way to use multiple database in Single Spring Boot Application
## Multiple Database

### First Database
#### MySQL 8 Database

#### Name : Sales

#### Command : create database sales

### CREATE TABLE
``` 
CREATE TABLE `usertest` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(45) DEFAULT NULL,
  `Address` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
```

### SECOND Database
#### MySQL 8 Database

#### Name : Sales

#### Command : create database emp1

### CREATE TABLE
``` 
CREATE TABLE `emp` (
  `id` int NOT NULL AUTO_INCREMENT,
  `empname` varchar(45) DEFAULT NULL,
  `eadd` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
```
