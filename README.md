# Role-Based-System-java
To design and implement an Object-Oriented Role Based System using Java.  The system allows different users such as Employee and Student to access system  features based on their roles.  This project demonstrates core Object-Oriented Programming concepts such as:  • Inheritance  • Polymorphism  • Class and Object  • Method Overriding  • Association
🎓 User Management System using Java (OOP)

A simple Java-based application that demonstrates key Object-Oriented Programming (OOP) concepts such as Inheritance, Composition, Polymorphism, and Upcasting/Downcasting using a real-world academic system.

🚀 Features
👤 Base class: User
👨‍💼 Employee manages courses
🎓 Student enrolls in courses
🏦 Account linked to Employee (Composition)
📚 Course assigned to Student
🔁 Method overriding for role-based behavior
🔄 Upcasting and Downcasting demonstration
🛠️ Technologies Used
Java
OOP Concepts:
Inheritance
Polymorphism
Composition
Method Overriding
Upcasting & Downcasting
📌 Concepts Demonstrated
🔹 Inheritance
Employee and Student inherit from User
🔹 Composition
Employee has an Account
Student has a Course
🔹 Polymorphism
Parent reference (User) refers to child objects
🔹 Upcasting
User u1 = new Employee("Shankar", empAcc);
User u2 = new Student("Shalini", java);
🔹 Downcasting
Employee e = (Employee) u1;
Student s = (Student) u2;
📂 Project Structure
User
 ┣ Employee
 ┗ Student

Employee → Account
Student → Course
▶️ How to Run
javac Main.java
java Main
💻 Source Code
class Course { 
    String courseName; 

    Course(String courseName) { 
        this.courseName = courseName; 
    } 
} 

class Account { 
    String accountId; 

    Account(String accountId) { 
        this.accountId = accountId; 
    } 

    void showAccount() { 
        System.out.println("Account ID: " + accountId); 
    } 
} 

class User { 
    String name; 

    User(String name) { 
        this.name = name; 
    } 

    void displayRole() { 
        System.out.println("Generic User"); 
    } 

    void accessSystem() { 
        System.out.println(name + " is accessing the system"); 
    } 
} 

class Employee extends User { 
    Account account; 

    Employee(String name, Account account) { 
        super(name); 
        this.account = account; 
    } 

    @Override 
    void displayRole() { 
        System.out.println("Role: Employee"); 
    } 

    void manageCourse(Course c) { 
        System.out.println(name + " manages course: " + c.courseName); 
    } 
} 

class Student extends User { 
    Course course; 

    Student(String name, Course course) { 
        super(name); 
        this.course = course; 
    } 

    @Override 
    void displayRole() { 
        System.out.println("Role: Student"); 
    } 

    void enrollCourse() { 
        System.out.println(name + " enrolled in " + course.courseName); 
    } 
} 

public class Main {    
    public static void main(String[] args) { 

        Course java = new Course("Java Programming"); 
        Account empAcc = new Account("EMP123"); 

        User u1 = new Employee("Shankar", empAcc);   // Upcasting 
        User u2 = new Student("Shalini", java); 

        u1.displayRole(); 
        u1.accessSystem(); 

        u2.displayRole(); 
        u2.accessSystem(); 

        Employee e = (Employee) u1; 
        e.manageCourse(java); 
        e.account.showAccount(); 

        Student s = (Student) u2; 
        s.enrollCourse(); 
    } 
}
<img width="1918" height="740" alt="Role based system 1" src="https://github.com/user-attachments/assets/01af9ba9-f853-4fdd-90f6-1e4490673deb" />
<img width="1911" height="741" alt="Role based system 2" src="https://github.com/user-attachments/assets/626cce3f-3c08-41db-b32e-36f60d9e885e" />
<img width="1918" height="737" alt="Role based system 3" src="https://github.com/user-attachments/assets/8f65446f-af2d-4530-ac9c-a8be51e839b0" />

📊 Sample Output
Role: Employee
Shankar is accessing the system
Role: Student
Shalini is accessing the system
Shankar manages course: Java Programming
Account ID: EMP123
Shalini enrolled in Java Programming
🎯 Learning Outcomes
Understanding Inheritance & Class Hierarchy
Applying Composition between classes
Using Polymorphism (Runtime behavior)
Implementing Upcasting & Downcasting
Designing real-world systems using OOP
🙌 Conclusion

This project clearly demonstrates how Java OOP concepts can be applied to design a structured user management system with employees and students interacting with courses and accounts.
