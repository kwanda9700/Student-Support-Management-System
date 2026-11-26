package studentsupport;
public class Main {
    public static void main(String[] args) {
        StudentView view = new StudentView();
        StudentFileHandler fileHandler = new StudentFileHandler();
        StudentController controller = new StudentController(view, fileHandler);
        
        

        boolean running = true;
        while (running) {
            int choice = view.getMenuChoice();
            switch (choice) {
                case 1:
                    controller.addStudent();
                    break;
                case 2:
                    controller.viewStudents();
                    break;
                case 3:
                    controller.deleteStudent();
                    break;
                case 4:
                    controller.saveToFile();
                    break;
                case 5:
                    controller.loadFromFile();
                    break;
                case 6:
                    view.showMessage("Goodbye.");
                    running = false;
                    break;
                default:
                    view.showMessage("Invalid menu option, try again.");
                    break;
            }
        }
    }
}