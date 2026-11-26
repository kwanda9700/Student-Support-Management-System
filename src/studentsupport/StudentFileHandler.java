package studentsupport;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

// MODEL — handles reading/writing students.txt
public class StudentFileHandler {
    private static final String FILE_NAME = "students.txt";

    public void save(List<Student> students) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Student s : students) {
                writer.write(s.toFileString());
                writer.newLine();
            }
            System.out.println("Saved " + students.size() + " student(s) to " + FILE_NAME);
        } catch (IOException e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }

    public List<Student> load() {
        List<Student> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",", -1);
                if (parts.length < 5) continue; // skip malformed lines
                String studentId = parts[0];
                String name = parts[1];
                String category = parts[2];
                SupportRecord record = new SupportRecord(parts[3], parts[4]);
                students.add(new Student(name, studentId, studentId, category, record));
            }
            System.out.println("Loaded " + students.size() + " student(s) from " + FILE_NAME);
        } catch (FileNotFoundException e) {
            System.out.println("No existing file found — starting with an empty list.");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return students;
    }
}