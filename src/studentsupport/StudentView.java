package studentsupport;

import java.util.List;
import java.util.Scanner;

// VIEW — all console input/output lives here
public class StudentView {
    private final Scanner scanner = new Scanner(System.in);

    public int getMenuChoice() {
        System.out.println("\n=== Student Support Management System ===");
        System.out.println("1. Add Student");
        System.out.println("2. View Students");
        System.out.println("3. Delete Student");
        System.out.println("4. Save to File");
        System.out.println("5. Load from File");
        System.out.println("6. Exit");
        System.out.print("Enter choice: ");
        return readInt();
    }

    public String readLine(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public int readInt() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("Invalid number, please try again: ");
            }
        }
    }

    public void displayStudents(List<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students on record.");
            return;
        }
        System.out.println("\n--- Student Records ---");
        for (Student s : students) {
            s.displayDetails();
        }
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}