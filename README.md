# Clinic Appointment Management System

A console based Java application for managing patients, doctors, appointments and billing activities in a clinic.

## 1. Project Overview

The Clinic Appointment Management System is a menu driven console application based on Core Java. It helps to manage basic clinic activities like adding patients, adding doctors, booking appointments, viewing records and generating bills.

The project shows the practical usage of Object Oriented Programming concepts, collections, exception handling, file handling and Date and Time API.

The application is run in PowerShell, Windows Terminal or Command Prompt and does not need a browser or external database.

## 2. Problem Statement

Clinic records can be a very time consuming activity to manage manually. Patient details, doctor details, appointments and billing details need to be maintained meticulously.

The project provides a simplified Java based solution for managing basic clinic activities through a menu driven console application.

## 3. Objectives

The main objectives of this project are:

To develop a menu driven Java application
To manage patient information
To manage doctor information
To book clinic appointments
To view appointment records
To generate patient bills
To demonstrate Object Oriented Programming concepts
To use collections for storing records
To handle invalid input using exception handling
To save and load data using file handling
To provide a simple and user friendly console interface

## 4. Features

The application provides the following features:

1. Add Patient
2. View Patients
3. Add Doctor
4. View Doctors
5. Book Appointment
6. View Appointments
7. Generate Bill
8. Exit the Application

### Main Features Description

Patient Management: Add and view patient information.
Doctor Management: Add and view doctor information.
Appointment Management: Book and view appointments.
Billing Management: Generate and display patient bills.
Data Storage: Store application data locally using file handling.
Menu-Driven Interface: Perform operations by selecting menu options.
Input Validation: Handle invalid input using exception handling.

## 5. Technologies Used

Programming Language: Java
Java Version: JDK 17 or above recommended
Application Type: Console based application
Development Environment: PowerShell, Windows Terminal or Command Prompt
Storage: Local file storage
Data File: `clinic_data.dat`
External Database: Not required
External Libraries: Not required

## 6. Java Concepts Used

The following Java concepts are used in this project:

Classes and Objects
Constructors
Encapsulation
Methods
ArrayList
Object Oriented Programming
Exception Handling
Method Overriding
File Handling
ObjectOutputStream
ObjectInputStream
LocalDate
LocalTime
Menu-driven programming

## 7. Project Structure

The project files are arranged as follows:

```text
Clinic-Appointment-Management-System
│
├── Appointment.java
├── Bill.java
├── Doctor.java
├── Main.java
├── Patient.java
├── README.md
└── .gitignore
```

## 8. File Description

### Main.java

This is the main class of the application. It displays the menu and controls the execution of different operations.

### Patient.java

This class represents patient details and stores information related to patients.

### Doctor.java

This class represents doctor details and stores information related to doctors.

### Appointment.java

This class represents appointment details such as patient, doctor, date and time.

### Bill.java

This class is used to calculate and display billing information.

### README.md

This file contains the project description, requirements, setup instructions, compilation commands, execution commands, features and testing information.

## 9. System Requirements

To run this project, the following requirements are needed:

Windows operating system
Java Development Kit installed
JDK 17 or above recommended
PowerShell, Windows Terminal or Command Prompt
Basic knowledge of running Java programs

## 10. Installation Instructions

### Step 1: Download the Repository

Download the project ZIP file from GitHub or clone the repository.

### Step 2: Extract the Project

If the project is downloaded as a ZIP file, extract it to a suitable location.

### Step 3: Open the Project Folder

Open the folder containing the following files:

```text
Appointment.java
Bill.java
Doctor.java
Main.java
Patient.java
README.md
```

The Java files must be present in the same project root folder.

## 11. How to Open the Project in PowerShell

Open PowerShell or Windows Terminal.

Navigate to the project folder using the following command:

```powershell
cd "C:\Users\YourName\Downloads\Clinic-Appointment-Management-System\Clinic-Appointment-Management-System"
```

Replace `YourName` with your Windows username.

If the project is stored in another location, use that folder path instead.

## 12. How to Compile and Run the Project

The project is a console based Java application. It can be compiled and executed using PowerShell or Windows Terminal.

### Step 1: Open PowerShell or Windows Terminal

Open PowerShell or Windows Terminal on your computer.

### Step 2: Navigate to the Project Root Folder

Make sure the terminal is opened in the folder containing all Java files.

Example:

```powershell
cd "C:\Users\YourName\Downloads\Clinic-Appointment-Management-System\Clinic-Appointment-Management-System"
```

### Step 3: Compile the Java Files

Run the following command:

```powershell
javac -d out .java
```

This command compiles all Java source files in the project root folder and stores the generated `.class` files inside the `out` folder.

If the compilation is successful, no error message will be displayed.

### Step 4: Run the Application

After successful compilation, run:

```powershell
java -cp out Main
```

This command starts the application by executing the `Main` class from the `out` folder.

### Step 5: Use the Application

The main menu will be displayed in the terminal.

Enter the number of the required option and follow the instructions shown on the screen.

## 13. Application Menu

The application displays the following menu:

```text
1. Add Patient
2. View Patients
3. Add Doctor
4. View Doctors
5. Book Appointment
6. View Appointments
7. Generate Bill
8. Exit
```

## 14. Working of the System

The working process of the application is as follows:

1. Start the application.
2. The system loads previously saved data if available.
3. The main menu is displayed.
4. The user selects an option.
5. The system performs the selected operation.
6. The entered information is validated.
7. Records are displayed or saved according to the selected operation.
8. The user can continue using the menu or exit the application.
9. The application saves data locally when required.

## 15. Data Storage

The application uses local file handling to store data.

The data is stored in the following file:

```text
clinic_data.dat
```

The application uses Java object serialization through:

`ObjectOutputStream`
`ObjectInputStream`

No external database is required for the current version.

## 16. Testing

The application was tested through PowerShell and the terminal.

The following operations were checked:

| Test Case | Operation    | Expected Result      | Status |
| --------- | --------------------- | -------------------------------------- | ------ |
| TC01  | Start the application | Main menu is displayed     | Passed |
| TC02  | Add Patient   | Patient details are added successfully | Passed |
| TC03  | View Patients   | Patient records are displayed   | Passed |
| TC04  | Add Doctor   | Doctor details are added successfully | Passed |
| TC05  | View Doctors   | Doctor records are displayed   | Passed |
| TC06  | Book Appointment  | Appointment is created successfully | Passed |
| TC07  | View Appointments  | Appointment records are displayed  | Passed |
| TC08  | Generate Bill   | Bill details are displayed    | Passed |
| TC09  | Enter invalid input | Error is handled properly    | Passed |
| TC10  | Exit application  | Application closes successfully  | Passed |

## 17. Sample Compilation Commands

Compile the project using:

```powershell
javac -d out .java
```

Run the project using:

```powershell
java -cp out Main
```

## 18. Advantages

Easy to use.
Simple menu driven interface.
Reduces manual record management.
Demonstrates practical Java programming.
Uses Object Oriented Programming concepts.
Supports local data storage.
Does not require an external database.
Suitable for small scale clinic management demonstration.

## 19. Limitations

The application is console based.
It does not have a graphical user interface.
It does not provide online appointment booking.
It does not use a cloud database.
It does not include online payment integration.
It does not include login and authentication.
Current version is designed for academic demonstration.

## 20. Future Scope

The project can be improved in the future by adding:

Graphical User Interface using Java Swing or JavaFX.
Database connectivity using JDBC and MySQL.
Login and authentication.
Online appointment booking.
Appointment cancellation and rescheduling.
Email or SMS notifications.
Doctor availability management.
Advanced reports.
Online payment integration.
Web based clinic management system.

## 21. Conclusion

The Clinic Appointment Management System successfully demonstrates the use of Core Java concepts in a practical application.

The system manages basic patient, doctor, appointment and billing activities through a console based interface. It uses classes, objects, collections, exception handling, file handling and date-time concepts.

This project helped in understanding how Java programming concepts can be combined to develop a useful real-world application.

## 22. How to Use This Repository

1. Download or clone this repository.
2. Open the project root folder.
3. Make sure Java JDK is installed.
4. Compile the project using:

```powershell
javac -d out .java
```

5. Run the project using:

```powershell
java -cp out Main
```

6. Follow the menu instructions displayed in the terminal.

## 23. Author

Name: Alabatte Rajnandini Raju

Registration Number: 25BAI10125

Project Title: Clinic Appointment Management System

Subject: Introduction to Java

Repository:
`https://github.com/alabatterajnandini/Clinic-Appointment-Management-System`
