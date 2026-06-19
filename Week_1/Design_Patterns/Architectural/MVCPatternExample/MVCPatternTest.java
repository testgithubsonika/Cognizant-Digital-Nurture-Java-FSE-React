package Week_1.Design_Patterns.Architectural.MVCPatternExample;

public class MVCPatternTest {

    public static void main(String[] args) {

        // Create Model
        Student student = new Student(
                "Sonika",
                101,
                "A"
        );

        // Create View
        StudentView view = new StudentView();

        // Create Controller
        StudentController controller =
                new StudentController(student, view);

        // Display Initial Data
        System.out.println("Initial Student Details:");
        controller.updateView();

        System.out.println();

        // Update Data using Controller
        controller.setStudentName("Anjali");
        controller.setStudentGrade("A+");

        System.out.println("Updated Student Details:");
        controller.updateView();
    }
}






// MVC (Model-View-Controller) is a design pattern that separates:

// Model → Data and business logic,   View → User interface
// Controller → Handles communication between Model and View

// Advantages
// Separation of concerns
// Easier maintenance
// Better code organization
// Reusable components