package alexQI.java.day61_exceptions_collections;

public class ElementaryStudentTest {
    public static void main(String[] args) throws IllegalAccessException {
        try {
            ElementaryStudent el1 = new ElementaryStudent();
            el1.setName("Britney");
            el1.setAge(1);
            System.out.println(el1.toString());
        } catch (Exception e) {
            e.printStackTrace(); //print the error stacktrace and continue. does not stop code
        }

        System.out.println("--- EXECUTION COMPLETED ---");
    }
}
