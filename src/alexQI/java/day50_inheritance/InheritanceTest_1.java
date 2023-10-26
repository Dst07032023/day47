package alexQI.java.day50_inheritance;

public class InheritanceTest_1 {
    public static void main(String[] args) {
        Person_2 p1 = new Person_2();
        p1.name = "Bakyt";
        p1.age = 30;

        p1.talk();
        p1.walk();
        p1.work("SDET");

        Teacher_3 t1 = new Teacher_3();
        t1.teacherID = 4567;
        t1.name = "Sasa";
        t1.age = 40;
        t1.talk();
        t1.walk();
        t1.teach("java inheritance");

        Student_4 student = new Student_4();
        student.name = "Ali";
        student.age = 33;
        student.walk();
        student.talk();
        student.work("Java programmer");
        student.school = "CybertekSchool";
        student.study("java programing inheritance");

        

    }
}
