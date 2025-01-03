# Interactive Data & Address Organizer

An advanced solution for organizing personal and address-related data, crafted with an emphasis on user experience and modular design. Tailored for both academic and real-world use cases, this project ensures efficient data handling with its intuitive interface and reliable persistent storage.
## 🔍 About the Project

This project was developed as part of the Object-Oriented Programming Laboratory Course (Course Code: 0714 02 CSE 1202) under the supervision of Professor Dr. Md. Anisur Rahman. It exemplifies the principles of object-oriented programming and focuses on creating a practical solution for managing information.
## ✨ Key Features

- **Effortless Data Management**  
  Add, edit, delete, and sort personal and address-related records.

- **Persistent Storage**  
  Utilize serialization to ensure all data is saved and can be retrieved easily.

- **Interactive User Interface**  
  Built using Java Swing for a smooth and intuitive experience.

- **Modular Navigation**  
  - File menu for exiting the application.  
  - Edit menu to access forms for managing personal and student information.
## 🚀 Technology Stack

- **Programming Language**: Java  
- **GUI Framework**: Java Swing  
- **Data Storage**: Serialization
## 📂 Project Structure
```plaintext
InteractiveDataAddressOrganizer/
├── src/
│   ├── OurProject/
│   │   ├── Address.java            # Handles address details (road, post, district)
│   │   ├── JFramemenu.java         # Main menu for navigation
│   │   ├── NewJFrameForPerson.java # GUI for managing personal information
│   │   ├── NewJFrameForStudent.java # GUI for managing student information
│   │   ├── Person_List.java        # Logic for handling person records
│   │   ├── Student_List.java       # Logic for handling student records
│   │   └── Main.java               # Application entry point
├── resources/
│   ├── Person.ser                  # Serialized file for person records
│   └── Student.ser                 # Serialized file for student records
```
## 🔧 Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or later
- NetBeans IDE (Recommended for GUI management and debugging)

### Installation

1. **Clone the repository**:  
   `git clone <repository-url>`

2. **Open the project in NetBeans IDE**:  
   After cloning, open the project in NetBeans IDE.

3. **Compile and run**:  
   Compile and run `Main.java` to launch the application.
## 📘 How to Use

- **Add Records**:  
  Input the required details and click the Add button.

- **Edit Records**:  
  Modify existing entries and click Update to save changes.

- **Delete Records**:  
  Select a record and click Delete to remove it.

- **Sort Records**:  
  Organize entries alphabetically by clicking Sort.

- **Navigate Records**:  
  Use the navigation buttons (|<, <<, >>, >|) to browse through records.

- **Automatic Save**:  
  All changes are saved automatically using serialization.
## 🙏 Acknowledgments

Special thanks to Professor Dr. Md. Anisur Rahman for his guidance and support during the development of this project.
