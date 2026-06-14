public class MVCTest {

    public static void main(String[] args) {

        Student model =
                new Student("Eswar", "23BCE7151");

        StudentView view =
                new StudentView();

        StudentController controller =
                new StudentController(
                        model,
                        view
                );

        controller.updateView();

    }

}