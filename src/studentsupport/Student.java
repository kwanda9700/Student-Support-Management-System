package studentsupport;

// MODEL — Student IS-A Person, HAS-A SupportRecord (composition)
public class Student extends Person {
    private String studentId;
    private String programmeSupportCategory;
    private SupportRecord supportRecord;

    public Student(String name, String idNumber, String studentId,
                   String programmeSupportCategory, SupportRecord supportRecord) {
        super(name, idNumber);
        this.studentId = studentId;
        this.programmeSupportCategory = programmeSupportCategory;
        this.supportRecord = supportRecord;
    }

    public String getStudentId() { return studentId; }
    public String getProgrammeSupportCategory() { return programmeSupportCategory; }
    public void setProgrammeSupportCategory(String category) { this.programmeSupportCategory = category; }
    public SupportRecord getSupportRecord() { return supportRecord; }

    @Override
    public void displayDetails() {
        System.out.println("Student ID: " + studentId
                + " | Name: " + getName()
                + " | Category: " + programmeSupportCategory
                + " | " + supportRecord);
    }

    // Used when writing to students.txt
    public String toFileString() {
        return studentId + "," + getName() + "," + programmeSupportCategory
                + "," + supportRecord.getSupportType() + "," + supportRecord.getNotes();
    }
}