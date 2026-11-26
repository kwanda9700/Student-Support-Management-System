package studentsupport;

// MODEL — represents additional support info, composed inside Student
public class SupportRecord {
    private String supportType;
    private String notes;

    public SupportRecord(String supportType, String notes) {
        this.supportType = supportType;
        this.notes = notes;
    }

    public String getSupportType() { return supportType; }
    public void setSupportType(String supportType) { this.supportType = supportType; }

    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }

    @Override
    public String toString() {
        return "Support Type: " + supportType + ", Notes: " + notes;
    }
}