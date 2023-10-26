package alexQI.java.day50_inheritance;
/**
 * Super class
 * Parent class
 * Base class
 */

public class Person_2 {
    String name;
    int age;

    public void walk () {
        System.out.println("Person is walking");
    }

    public void talk(){
        System.out.println("Person is talking");
    }

    public void work(String job) {
        System.out.println("Person is working as " + job);
    }
}
