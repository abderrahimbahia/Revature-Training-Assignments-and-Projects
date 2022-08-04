import java.math.BigInteger;

public class Engineer extends Employee{

    String skills;

    public Engineer()
    {
        this.skills = null;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Skills: " + this.skills;
    }
}
