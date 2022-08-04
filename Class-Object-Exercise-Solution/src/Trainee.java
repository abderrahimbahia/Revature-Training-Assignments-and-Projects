import java.math.BigDecimal;
import java.util.List;

public class Trainee extends Employee{

    private List<String>    courses;

    public Trainee() {
        super();
    }

    public Trainee(List<String> courses) {
        this.courses = courses;
    }

    public Trainee(String id, String fName, String lName, String position, BigDecimal salary, List<String> courses) {
        super(id, fName, lName, position, salary);
        this.courses = courses;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    @Override
    public String toString()
    {
        return super.toString() +
                "\nCourses: " + this.courses.toString();

    }
}
