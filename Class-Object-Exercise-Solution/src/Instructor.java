import java.math.BigDecimal;
import java.util.List;

public class Instructor extends Employee{
    private List<String> skills;
    private List<String> classes;

    public Instructor(String skill, String classroom) {
        this.skills.add(skill);
        this.classes.add(classroom);

    }

    public Instructor(String id, String fName, String lName, String position, BigDecimal salary, List<String> skills, List<String> classes) {
        super(id, fName, lName, position, salary);
        this.skills = skills;
        this.classes = classes;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public List<String> getClasses() {
        return classes;
    }

    public void setClasses(List<String> classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nSkills: " + this.skills.toString() +
                "\nClasses: " + this.classes.toString();
    }
}
