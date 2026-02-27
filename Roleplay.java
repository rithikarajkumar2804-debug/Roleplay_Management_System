import java.util.*;

class User {
    String name;

    void displayRole() {
        System.out.println("User");
    }
}

class Employee extends User {

    void displayRole() {
        System.out.println("Role: Employee");
    }

    void employeeDetails(Scanner s) {
        System.out.print("Enter Salary: ");
        double salary = s.nextDouble();
        s.nextLine();

        System.out.print("Are you assigned to a project? (yes/no): ");
        String projectStatus = s.nextLine();

        System.out.println("--- Employee Details ---");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);

        if (projectStatus.equalsIgnoreCase("yes")) {
            System.out.println("Status: Assigned to current project");
        } else {
            System.out.println("Status: Not assigned to any project");
        }
    }
}

class Course extends User {

    void displayRole() {
        System.out.println("Role: Course");
    }

    void courseDetails(Scanner s) {
        System.out.print("Enter Course Name: ");
        String courseName = s.nextLine();

        System.out.print("Enter Course Duration (months): ");
        int duration = s.nextInt();

        System.out.print("Enter Course Fee: ");
        double fee = s.nextDouble();
        s.nextLine();

        System.out.print("Mode (Online/Offline): ");
        String mode = s.nextLine();

        System.out.println("\n--- Course Details ---");
        System.out.println("Student Name: " + name);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println("Mode: " + mode);
    }
}

// ---------------- ACCOUNT ----------------
class Account extends User {

    void displayRole() {
        System.out.println("Role: Account");
    }

    void accountDetails(Scanner s) {
        System.out.print("Enter Account Number: ");
        long accNo = s.nextLong();

        System.out.println("1. Check Balance");
        System.out.println("2. Transaction History");
        System.out.print("Enter your choice: ");
        int option = s.nextInt();

        System.out.println("\n--- Account Details ---");
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accNo);

        if (option == 1) {
            System.out.println("Account Balance: ₹50,000");
        } 
        else if (option == 2) {
            System.out.println("Transaction History:");
            System.out.println("• ₹2000 Debited");
            System.out.println("• ₹5000 Credited");
        } 
        else {
            System.out.println("Invalid Option");
        }
    }
}

public class Roleplay {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        User u = null;

        System.out.println("===== Enter your Role =====");
        System.out.println("1. Employee");
        System.out.println("2. Course");
        System.out.println("3. Account");
        System.out.print("Enter your choice: ");

        int choice = s.nextInt();
        s.nextLine();

        System.out.print("Enter name: ");
        String name = s.nextLine();

        if (choice == 1) {
            Employee e = new Employee();
            e.name = name;
            u = e;
            u.displayRole();
            e.employeeDetails(s);
        } 
        else if (choice == 2) {
            Course c = new Course();
            c.name = name;
            u = c;
            u.displayRole();
            c.courseDetails(s);
        } 
        else if (choice == 3) {
            Account a = new Account();
            a.name = name;
            u = a;
            u.displayRole();
            a.accountDetails(s);
        } 
        else {
            System.out.println("Invalid Choice");
        }
    }
}