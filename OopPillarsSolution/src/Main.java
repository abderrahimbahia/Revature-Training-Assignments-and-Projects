//Program Name: Object-Oriented Programming Pillars
//Programmer:   Abderrahim Baha
//Last Update:  08/09/2022
/*
 *   You will create a java project that makes use of Inheritance, Polymorphism, and Encapsulation
 */

public class Main {

    public static void main(String[] args) {

        //Create instances of both parent and child class
        Parent parent = new Parent("Sam", 45, 2);
        Child child1 = new Child("Alex", 12, 1);
        Child child2 = new Child();

        //set attributes of child2 object
        child2.setName("Anna");
        child2.setAge(4);

        //will use the overloaded method  to set age
        child2.setNumberOfSiblings(1.5);

        //Display objects
        System.out.println(parent);
        System.out.println(child1);
        System.out.println(child2);

    }
}
