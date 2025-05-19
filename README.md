# Library Management System - Java Swing (NetBeans IDE)

## Project Overview
A desktop-based Library Management System built using Java Swing framework in NetBeans IDE. This application helps librarians manage books, members, and transactions efficiently.

## Features
- **Book Management**: Add, update, delete, and search books
- **Member Management**: Register and manage library members
- **Transaction System**: Handle book checkouts and returns
- **Reports**: Generate various library reports
- **User Authentication**: Secure login system for librarians

## Technologies Used
- Java Swing for GUI
- JDBC for database connectivity
- MySQL/MariaDB as database backend
- NetBeans IDE for development

## Installation
1. **Prerequisites**:
   - Java JDK 8 or later
   - NetBeans IDE 8.2 or later
   - MySQL/MariaDB server

2. **Setup**:
   - Clone or download the project
   - Import into NetBeans as existing project
   - Configure database connection in `src/database/Database_Connection.java`
   - Run the SQL script to create database schema

## Usage
1. Launch the application
2. Login with admin credentials (default: admin/admin)
3. Use the navigation menu to access different modules

## Project Structure
```
src/
├── controllers/      - Business logic handlers
├── models/           - Data models and DAOs
├── views/            - Swing GUI components
├── database/         - Database connection and setup
└── utils/            - Utility classes and helpers
```
