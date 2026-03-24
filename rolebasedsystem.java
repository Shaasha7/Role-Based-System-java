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