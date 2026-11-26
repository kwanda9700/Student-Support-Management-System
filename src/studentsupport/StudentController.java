package studentsupport;

import java.util.ArrayList;
import java.util.List;

// CONTROLLER — connects View and Model, implements StudentActions
public class StudentController implements StudentActions {
    private final List<Student> students = new ArrayList<>();
    private final StudentView view;
    private final StudentFileHandler fileHandler;

    public StudentController(StudentView view, StudentFileHandler fileHandler) {
        this.view = view;
        this.fileHandler = fileHandler;
    }

    @Override
    public void addStudent() {
        try {
            String id = view.readLine("Enter Student ID: ");
            if (id.trim().isEmpty()) {
                throw new IllegalArgumentException("Student ID cannot be empty.");
            }
            String name = view.readLine("Enter Name: ");
            String category = view.readLine("Enter Programme Support Category: ");
            String supportType = view.readLine("Enter Support Type: ");
            String notes = view.readLine("Enter Notes: ");

            SupportRecord record = new SupportRecord(supportType, notes);
            Student student = new Student(name, id, id, category, record);
            students.add(student);
            view.showMessage("Student added successfully.");
        } catch (IllegalArgumentException e) {
            view.showMessage("Could not add student: " + e.getMessage());
        }
    }

    @Override
    public void viewStudents() {
        view.displayStudents(students);
    }

    @Override
    public void deleteStudent() {
        String id = view.readLine("Enter Student ID to delete: ");
        Student found = null;
        for (Student s : students) {
            if (s.getStudentId().equalsIgnoreCase(id)) {
                found = s;
                break;
            }
        }
        if (found != null) {
            students.remove(found);
            view.showMessage("Student removed successfully.");
        } else {
            view.showMessage("Student ID not found.");
        }
    }

    @Override
    public void saveToFile() {
        fileHandler.save(students);
    }

    @Override
    public void loadFromFile() {
        List<Student> loaded = fileHandler.load();
        students.clear();
        students.addAll(loaded);
    }
}