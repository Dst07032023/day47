package alexQI.java.day50_inheritance;

//IS-A
public class Student_4 extends Person_2 {
    String school;

    public void study(String topic) {
        System.out.println(name + " is studying " + topic + " at " + school);
    }
}
