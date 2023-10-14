package alexQI.java.day47_constructors.student;

public class StudentObjects {
    public static void main(String[] args) {
        Student st1 = new Student();//runs no-args constructor
        Student st2 = new Student();//runs no-args constructor

        Student st3 = new Student("Burak");
        Student st4 = new Student("Alihan");

        Student st5 = new Student("Nasiba", 38);

    }
}
