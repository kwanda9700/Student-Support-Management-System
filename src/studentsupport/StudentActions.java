package studentsupport;

// MODEL — contract for core system operations
public interface StudentActions {
    void addStudent();
    void viewStudents();
    void deleteStudent();
    void saveToFile();
    void loadFromFile();
}