import java.math.BigInteger;

public class Employee {
    private String id;
    private String name;
    private BigInteger salary;

    public Employee()
    {
        this.id = null;
        this.name = null;
        this.salary = BigInteger.valueOf(0);
    }

    public Employee(String id, String name, BigInteger salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigInteger getSalary() {
        return salary;
    }

    public void setSalary(BigInteger salary) {
        this.salary = salary;
    }

    @Override
    public String toString()
    {
        return  "Employee ID:" +this.id+
                "Employee Name: " + this.name+
                "Employee Salary: $" + this.salary;
    }
}
