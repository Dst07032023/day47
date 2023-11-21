package alexQI.java.day54_abstraction;

public class School {
    public static void main(String[] args) {
//        Student student = new Student(""); //ERROR - cannot create object of Student
        Student student = new OnlineStudent();
        student.code("Java");

        OnlineStudent onlineStudent = new OnlineStudent();
        onlineStudent.attendClass();


        CampusStudent campusStudent = new CampusStudent();
        campusStudent.attendClass();

    }
}
