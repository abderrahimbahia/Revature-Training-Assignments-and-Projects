//Program Name: Object-Oriented Programming Pillars
//Programmer:   Abderrahim Baha
//Last Update:  08/09/2022

public class Parent {
    private String name;
    private int age;
    private int numberOfKids;

    public Parent()
    {
        this.name = null;
        this.age = 0;
        this.numberOfKids = 0;
    }

    public Parent(String name, int age, int numberOfKids)
    {
        this.name = name;
        this.age  = age;
        this.numberOfKids = numberOfKids;
    }

    public Parent(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //overload method to take a double parameter
    public void setAge(double age)
    {
        this.age = (int)age;
    }

    public int getNumberOfKids() {
        return numberOfKids;
    }

    public void setNumberOfKids(int numberOfKids) {
        this.numberOfKids = numberOfKids;
    }


    @Override
    public String toString() {
        return "name: " + name+
                ", age: " + age +
                ", numberOfKids: " + numberOfKids;
    }
}