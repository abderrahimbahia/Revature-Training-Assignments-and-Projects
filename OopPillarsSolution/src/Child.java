//Program Name: Object-Oriented Programming Pillars
//Programmer:   Abderrahim Baha
//Last Update:  08/09/2022

public class Child extends Parent{

    private int numberOfSiblings;

    public Child()
    {
        super();
        this.numberOfSiblings = 0;
    }

    public Child(String name, int age, int numberOfSiblings)
    {
        super(name, age);
        this.numberOfSiblings = numberOfSiblings;
    }

    public int getNumberOfSiblings() {
        return numberOfSiblings;
    }

    public void setNumberOfSiblings(int numberOfSiblings) {
        this.numberOfSiblings = numberOfSiblings;
    }

    //Overload method to take double
    public void setNumberOfSiblings(double numberOfSiblings) {
        this.numberOfSiblings = (int)numberOfSiblings;
    }

    @Override
    public String toString() {
        return super.toString() +
                " numberOfSiblings: " + numberOfSiblings;
    }
}
