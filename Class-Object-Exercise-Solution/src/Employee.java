import java.math.BigDecimal;
import java.util.Date;

public class Employee {
    private String id;
    private String fName;
    private String lName;
    private String position;
    private BigDecimal salary;

    public Employee() {
        this.id = null;
        this.fName = null;
        this.lName = null;
        this.position = null;
        this.salary = new BigDecimal(0);
    }

    public Employee(String id, String fName, String lName, String position, BigDecimal salary) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.position = position;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }


    public String toString()
    {
        return  "\nEmployee ID:" +this.id+
                "\nEmployee First Name: " + this.fName+
                "\nEmployee Last Name: " + this.lName+
                "\nEmployee First Name: " + this.fName+
                "\nEmployee Position: " + this.position+
                "\nEmployee Salary: $" + this.salary;
    }
}
