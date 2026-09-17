# Clinic Appointment Management System
# 1. Project Title

Clinic Appointment Management System

## 2. Project Overview

The Clinic Appointment Management System is a console-based application developed using Java. The application is designed to manage basic clinic activities such as patient records, doctor records, appointments, bills, and reports.

The system provides a simple menu-driven interface through which the user can perform different operations. The system also saves the entered data in a local file so that the data can be loaded when the application is started again.

The project is developed as part of the Introduction to Java course.

## 3. Problem Statement

Managing the patient details, doctor information, appointments and billing manually can be time-consuming and prone to errors.

The purpose of the project is to develop a simple Java based application that helps organize the basic clinic information and makes the basic operations easier.

## 4. Objectives

The main objectives of the project are as follows:

To develop a menu-driven application using Java.

To manage patient information.

To manage doctor information.

To book and cancel appointments.

To avoid double-booking of a doctor at the same date and time.

To generate and display patient bills.

To display basic clinic reports.

To demonstrate object-oriented programming concepts.

To handle invalid input using exception handling.

To save and load records using file handling.

To develop a project that can be executed through the command line.

## 5. Features

### Patient Management

Add a new patient.

View all patients.

Search a patient by ID or name.

Update patient phone number and health problem.

Delete a patient record.

### Doctor Management

Add a new doctor.

View all doctors.

Search a doctor by ID, name, or specialization.

Delete a doctor record.

### Appointment Management

Book an appointment.

View all appointments.

Cancel an appointment.

Check whether a doctor is already booked.

Avoid double-booking for the same doctor, date, and time.

### Billing Management

Generate a bill for a patient.

Enter consultation fees.

Enter medicine fees.

Enter test fees.

Calculate the total bill amount.

View all generated bills.

### Reports

Display total patients.

Display total doctors.

Display total appointments.

Display total bills.

Display booked appointments.

Display cancelled appointments.

### Data Storage

Save records in a local file.

Load saved records when the application starts.

Automatically save data after important operations and before exit.

## 6. Technologies Used

Programming Language: Java

Application Type: Console-based application

Development Environment: PowerShell / Command Prompt

Java Version: JDK 17 or above recommended

Data Storage: Local serialized file

Data File: `clinic_data.dat`

## 7. Java Concepts Used

The following Java concepts are used in the project:

Classes and Objects

Constructors

Encapsulation

Private data members

Getter and setter methods

ArrayList

Method overriding

Exception handling

File handling

Object serialization

LocalDate

LocalTime

Switch statements

Loops

Conditional statements

Menu-driven programming

## 8. Project Modules
The project contains the following modules:

1. Patient Management

2. Doctor Management

3. Appointment Management

4. Billing Management

5. Reports

6. Data Storage

## 9. Project Structure

```text

Clinic-Appointment-Management-System/

│

├── README.md

│

├── src/

│ ├── Main.java

│ ├── Patient.java

│ ├── Doctor.java

│ ├── Appointment.java

│ └── Bill.java

│

├── out/

│ └── Generated after compilation

│

├── clinic_data.dat

│ └── Generated automatically after saving data

│

└── screenshots/

├── 1-main-menu.png

├── 2-patient-doctor.png

├── 3-appointment-billing.png

└── 4-reports.png

```
## 10. Description of Important Files

### Main.java

This is the main file of the application. It displays the menu and controls all the modules.

### Patient.java

This class stores patient details such as:

Patient ID

Name

Age

Gender

Phone number

Health problem

### Doctor.java

This class stores doctor details such as:

Doctor ID

Name

Specialization

Phone number

### Appointment.java

This class stores appointment details such as:

Appointment ID

Patient ID

Doctor ID

Appointment date

Appointment time

Appointment status

### Bill.java

This class stores billing details such as:

Bill ID

Patient ID

Consultation fee

Medicine fee

Test fee

Total amount

## 11. System Working

The application works in the following way:



1. The application starts.

2. Previously saved data is loaded if the data file exists.

3. The main menu is displayed.

4. The user selects an operation.

5. The selected module is opened.

6. The user enters the required information.

7. The system validates the input.

8. The operation is performed.

9. The result is displayed.

10. Data is saved after important operations.

11. The application closes when the user selects Exit.

## 12. Requirements

### Hardware Requirements

Computer or laptop

Keyboard

Basic storage space for Java files and project data

### Software Requirements
JDK 17 or above

PowerShell or Command Prompt

Text editor or Java-supported IDE

Git and GitHub account for project submission

## 13. Installation Instructions
### Step 1: Install Java
Install JDK 17 or above.

Check whether Java is installed:

```powershell

java -version

```
Check whether the Java compiler is installed:

```powershell

javac -version

```

### Step 2: Open the Project Folder
Open PowerShell inside the project folder.
Example:
```text

Clinic-Appointment-Management-System

```
Make sure the folder contains:

```text

README.md

src

```

## 14. Compilation Instructions

Run the following command in PowerShell:

```powershell

javac -d out (Get-ChildItem src -Filter .java).FullName

```
This command compiles all Java files and stores the generated `.class` files inside the `out` folder.

## 15. Execution Instructions

After successful compilation, run:

```powershell

java -cp out Main

```
The application will display the main menu.

## 16. Application Menu

```text

CLINIC APPOINTMENT MANAGEMENT SYSTEM

1. Patient Management

2. Doctor Management

3. Appointment Management

4. Billing Management

5. Reports

6. Save Data

0. Exit

```
## 17. Data Storage and Configuration

The application uses a local file named:

```text

clinic_data.dat

```
This file is created automatically when data is saved.

No external database or additional configuration file is required for the current version.

The application does not require:

Database username

Database password

API key

External server

Internet connection

The project can be executed locally through PowerShell or Command Prompt.

## 18. Testing
The application was tested using the command line.

The following test cases were performed:

| Test Case | Expected Result | Actual Result | Status |

| --------------------- | ------------------------------------ | ------------------------------------- | ------ |

| Add Patient | Patient record should be added | Patient added successfully | Pass |

| View Patients | Patient records should be displayed | Patient records displayed | Pass |

| Search Patient | Matching patient should be found | Patient search performed successfully | Pass |

| Update Patient | Patient details should be updated | Patient updated successfully | Pass |

| Delete Patient | Patient record should be deleted | Patient deleted successfully | Pass |

| Add Doctor | Doctor record should be added | Doctor added successfully | Pass |

| View Doctors | Doctor records should be displayed | Doctor records displayed | Pass |

| Search Doctor | Matching doctor should be found | Doctor search performed successfully | Pass |

| Book Appointment | Appointment should be booked | Appointment booked successfully | Pass |

| Duplicate Appointment | Duplicate booking should be rejected | Double-booking message displayed | Pass |

| Cancel Appointment | Appointment status should change | Appointment cancelled successfully | Pass |

| Generate Bill | Total bill should be calculated | Bill generated successfully | Pass |

| View Bills | Bills should be displayed | Bills displayed successfully | Pass |

| View Reports | Summary should be displayed | Reports displayed successfully | Pass |

| Invalid Input | Error message should be displayed | Validation message displayed | Pass |

| Save and Load Data | Data should be stored and loaded | Data saved and loaded successfully | Pass |

## 19. Testing Evidence

The testing was performed through PowerShell.

The following screenshots can be added to the project report:

Main menu and patient/doctor management

Appointment booking and billing

Reports output

The screenshots are stored in the `screenshots` folder.

## 20. Sample Test Data

### Patient Details

```text

Patient Name: Rajnandini

Age: 19

Gender: Female

Phone Number: 1234567891

Health Problem: Memory loss

```

### Doctor Details

```text

Doctor Name: Dr. Amit

Specialization: General Physician

Phone Number: 9876543210

```

### Appointment Details

```text

Patient ID: 1

Doctor ID: 1

Date: 2026-09-20

Time: 10:30

```

### Billing Details
```text

Consultation Fee: 500

Medicine Fee: 300

Test Fee: 200

Total Amount: 1000

```
## 21. Advantages
Simple and easy-to-use console interface.

Easy management of patient records.

Easy management of doctor records.

Helps organize appointments.

Prevents double booking.

Calculates the total bill automatically.

Uses object-oriented programming concepts.

Supports local data storage.

Can be executed through the command line.

Does not require an external database for the current version.

## 22. Limitations
The current version is console-based.

It does not provide a browser-based website.

It does not include online appointment booking.

It does not include login or role-based access.

It does not use a central database.

It does not support multiple users at the same time.

It is mainly designed for academic and small-scale use.

## 23. Future Scope
The project can be improved in the future by adding:

Graphical User Interface.

Web-based interface.

MySQL database using JDBC.

Login system for admin, doctor, and receptionist.

Online appointment booking.

Email or SMS appointment reminders.

Advanced reports.

Database backup.

Multi-user support.

Payment gateway integration.

Patient medical history management.

## 24. Conclusion
The Clinic Appointment Management System was successfully developed using Java. The project provides basic features for managing patients, doctors, appointments, bills, and reports.
The project demonstrates important Java concepts such as classes, objects, constructors, encapsulation, ArrayList, exception handling, file handling, loops, conditions, and date-time operations.
The application can be compiled and executed through PowerShell or Command Prompt. It is simple, easy to understand, and suitable for demonstrating the practical use of Java programming concepts.

## 25. Originality Statement
This project has been developed for academic purposes. The source code, project structure, testing, and documentation should be reviewed and updated by the student before final submission.
The student should add their own name, roll number, GitHub username, screenshots, and any additional changes made to the project.

## 26. Author Details
```text
Name: Alabatte Rajnandini Raju
Roll Number: 25BAI10125
Course: Introduction to Java
Course Code: CSE2006
GitHub Username: alabatterajnandini
```
## 27. Repository Link
After uploading the project to GitHub, add the public repository link below:
```text
https://github.com/YOUR-USERNAME/Clinic-Appointment-Management-System
```
The repository should be public and the link should point to the root of the repository.

## 28. Submission Checklist

Before submitting the project, check the following:

[ ] GitHub repository is public.

[ ] Repository name is correct.

[ ] Root `README.md` file is present.

[ ] Project description is included.

[ ] Features are clearly mentioned.

[ ] Technologies are mentioned.

[ ] Requirements are mentioned.

[ ] Setup instructions are included.

[ ] Compilation command is included.

[ ] Execution command is included.

[ ] Project files are uploaded.

[ ] Source code is present inside the `src` folder.

[ ] Testing has been performed.

[ ] Testing screenshots are added.

[ ] Project report is prepared.

[ ] Student name and roll number are added.

[ ] GitHub repository URL is correct.

[ ] No `/tree/main` or `/blob/main` is added to the submitted root URL.

[ ] The project is original and reviewed before submission.

# 29. How to Run the Project Quickly

```powershell

javac -d out (Get-ChildItem src -Filter .java).FullName

java -cp out Main

```
## 30. End of README



Thank you.
