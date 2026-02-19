# Login Web Application (JSP + Servlet + JDBC)

A simple Java Web Application for user login validation using JSP, Servlets, JDBC, and MySQL.

This project demonstrates a basic MVC architecture for handling login authentication in a Dynamic Web Project.

---

## 📌 Project Overview

This application allows users to:

- Enter username and password
- Validate credentials from MySQL database
- Redirect to success page if valid
- Show error message if invalid

---

## 🛠 Technologies Used

- Java
- JSP
- Servlet
- JDBC
- MySQL
- Apache Tomcat
- Eclipse (Dynamic Web Project)

---

## 📁 Project Structure

login-jsp-jdbcexample/
│
├── src/
│ ├── LoginBean.java
│ ├── LoginDao.java
│ └── LoginServlet.java
│
├── WebContent/
│ ├── Login.jsp
│ └── loginsuccess.jsp
│
├── mysql_database.sql
└── README.md


---

## ⚙️ Setup and Installation

### 1️⃣ Create Database

Open MySQL and execute:

```sql
CREATE DATABASE login_db;

USE login_db;

CREATE TABLE users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50),
    password VARCHAR(50)
);

INSERT INTO users (username, password)
VALUES ('admin', 'admin123');
2️⃣ Import Project in Eclipse
Open Eclipse

Go to File → New → Dynamic Web Project

Project Name: login-jsp-jdbcexample

Click Finish

Copy all .java files into src folder

Copy all .jsp files into WebContent folder

Add MySQL Connector JAR file to WEB-INF/lib

3️⃣ Configure Database Connection
Update database credentials inside LoginDao.java:

String url = "jdbc:mysql://localhost:3306/login_db";
String username = "root";
String password = "your_password";
4️⃣ Run the Application
Right click project

Select Run on Server

Choose Apache Tomcat

Open browser and visit:

http://localhost:8080/login-jsp-jdbcexample/Login.jsp
🔄 Application Flow
User enters credentials in Login.jsp

Form submits to LoginServlet

Servlet calls LoginDao

DAO checks credentials from MySQL database

If valid → Redirect to loginsuccess.jsp

If invalid → Display error message

🏗 Architecture
JSP (View)
   ↓
Servlet (Controller)
   ↓
DAO (Database Logic)
   ↓
MySQL Database
📋 Requirements
JDK 8 or higher

MySQL 5.7 or higher

Apache Tomcat 9 or higher

Eclipse IDE
