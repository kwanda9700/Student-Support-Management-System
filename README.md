
# Student Support Management System

A Java-based console application developed to manage student information and programme support records.

The system allows users to register students, view existing records, delete student entries, and save or load student information using text-file storage.

The project demonstrates Object-Oriented Programming (OOP), Model-View-Controller (MVC) architecture, inheritance, polymorphism, composition, interfaces, Java Collections and File Handling.

## Project Overview

The Student Support Management System provides a simple menu-driven interface for managing student records.

Each student record contains personal information, a student ID, a programme support category, and additional support information.

The application stores student records in an ArrayList during execution and provides file handling functionality to save records to and retrieve them from a text file called `students.txt`.

## Features

- Add new student records.
- View all registered students.
- Delete students using their Student ID.
- Capture student names and identification numbers.
- Assign programme support categories.
- Record student support types.
- Store additional support notes.
- Save student records to a text file.
- Load previously saved student records.
- Handle invalid menu selections.
- Validate that Student IDs are not empty.
- Display student information through a console interface.

## Technology Stack

| Technology | Purpose |
|---|---|
| Java | Programming language |
| Java SE | Core application development |
| Java Collections | Managing student records |
| ArrayList | In-memory student storage |
| Java File I/O | Reading and writing student records |
| BufferedReader | Reading text files |
| BufferedWriter | Writing text files |
| Scanner | Console input handling |
| Apache NetBeans | Development environment |

## Project Structure

```text
StudentSupport/
│
├── src/
│   └── studentsupport/
│       ├── Main.java
│       ├── Person.java
│       ├── Student.java
│       ├── StudentActions.java
│       ├── StudentController.java
│       ├── StudentFileHandler.java
│       ├── StudentView.java
│       └── SupportRecord.java
│
├── nbproject/
│   ├── build-impl.xml
│   ├── genfiles.properties
│   └── project.properties
│
├── build.xml
├── manifest.mf
└── README.md
```

## Object-Oriented Programming Concepts

The project demonstrates several fundamental Object-Oriented Programming concepts.

### 1. Encapsulation

The application uses private attributes and public getter and setter methods to control access to object data.

Examples:

- `Person.java`
- `Student.java`
- `SupportRecord.java`

### 2. Inheritance

The `Student` class extends the abstract `Person` class.

This allows the Student class to inherit shared attributes such as:

- Name.
- Identification number.

### 3. Polymorphism

The `Person` class defines an abstract `displayDetails()` method.

The `Student` class overrides this method to provide its own implementation for displaying student information.

### 4. Abstraction

The abstract `Person` class provides a common structure for people within the application.

The `StudentActions` interface defines the core operations that the student management controller must implement.

### 5. Composition

The `Student` class contains a `SupportRecord` object.

This demonstrates a HAS-A relationship between a student and their support information.

## MVC Architecture

The application follows the Model-View-Controller (MVC) architectural pattern.

### Model

The model represents the application's data and core structures.

| Class | Responsibility |
|---|---|
| Person.java | Abstract base class containing shared personal information |
| Student.java | Represents an individual student |
| SupportRecord.java | Stores student support types and notes |
| StudentActions.java | Defines the student management operations |

### View

**StudentView.java**

Handles all console input and output.

Responsibilities include:

- Displaying the application menu.
- Capturing user input.
- Displaying student records.
- Showing application messages.
- Handling invalid numerical menu input.

### Controller

**StudentController.java**

Connects the view with the student data and implements the `StudentActions` interface.

Responsibilities include:

- Adding students.
- Retrieving student records.
- Deleting student records.
- Saving student information.
- Loading previously saved records.

### File Handling

**StudentFileHandler.java**

Manages reading and writing student records using Java File I/O.

The application uses:

- `BufferedWriter` to save student records.
- `BufferedReader` to load student records.
- `FileWriter` to write information.
- `FileReader` to read information.

## Application Menu

When the application starts, users are presented with the following menu:

```text
=== Student Support Management System ===

1. Add Student
2. View Students
3. Delete Student
4. Save to File
5. Load from File
6. Exit

Enter choice:
```

### Menu Options

| Option | Functionality |
|---|---|
| 1 | Add a new student |
| 2 | View registered students |
| 3 | Delete a student using their Student ID |
| 4 | Save student records to students.txt |
| 5 | Load student records from students.txt |
| 6 | Exit the application |

## Student Information

Each student record contains the following information:

| Field | Description |
|---|---|
| Student ID | Unique student identifier used for record operations |
| Name | Student's name |
| Identification Number | Student identification information |
| Programme Support Category | Category assigned to the student |
| Support Type | Type of support provided |
| Notes | Additional support information |

## File Storage

The application uses a text file called:

`students.txt`

Student records are stored using comma-separated values.

Example:

```text
STU001,John Smith,Academic Support,Tutoring,Needs assistance with mathematics
STU002,Mary Jones,Financial Support,Bursary,Requires financial assistance
```

### Saving Records

When the user selects option 4, the application writes the current student records to `students.txt`.

Existing file contents are overwritten when saving.

### Loading Records

When the user selects option 5, the application reads the stored records and loads them into the application's student list.

Malformed records containing fewer than five fields are skipped.

If the file does not exist, the application displays a message and starts with an empty list.

**Note:** The text file is created in the application's current working directory. Student information remains in memory during execution until it is saved.

## Running the Application

### Using Apache NetBeans

1. Extract the project ZIP file.
2. Open Apache NetBeans IDE.
3. Select File → Open Project.
4. Navigate to the StudentSupport project directory.
5. Open the project.
6. Allow NetBeans to configure the project.
7. Build the project.
8. Run the application.

The application starts in the NetBeans output window.

### Using the Command Line

Ensure that Java JDK is installed and configured.

Open a terminal in the project root directory.

Compile the Java source files:

```bash
mkdir -p build/classes
javac -d build/classes src/studentsupport/*.java
```

Run the application:

```bash
java -cp build/classes studentsupport.Main
```

## Error Handling

The application includes basic error handling for:

- Empty Student IDs.
- Invalid menu selections.
- Invalid numerical input.
- Student IDs that cannot be found during deletion.
- Missing student data files.
- File reading and writing errors.
- Malformed records during file loading.

## Future Improvements

Potential enhancements include:

- Search students by Student ID.
- Update existing student records.
- Prevent duplicate student registrations.
- Improve input validation.
- Replace comma-separated storage with a more robust CSV format.
- Introduce database integration using MySQL.
- Develop a graphical user interface.
- Implement student support history.
- Add reporting and filtering functionality.
- Introduce user authentication and access control.

## Academic Context

Originally developed as part of:

**HSYD201-1: Systems Development 2A**

Summative Assessment 1.

---

Developed using Java and Apache NetBeans.
