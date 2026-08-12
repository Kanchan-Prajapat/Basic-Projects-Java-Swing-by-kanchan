import Controller.StudentController;
import DAO.StudentDAO;
import View.StudentRegistrationView;

public class App {

    public static void main(String[] args) {

        StudentRegistrationView view =
                new StudentRegistrationView();

        StudentDAO dao =
                new StudentDAO();

        new StudentController(view, dao);
    }
}