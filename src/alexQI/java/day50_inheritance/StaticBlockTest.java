package alexQI.java.day50_inheritance;

public class StaticBlockTest {
    public static void main(String[] args) {
        StaticBlockDemo st1 = new StaticBlockDemo(); //static > constructor
        StaticBlockDemo st2 = new StaticBlockDemo(); //constructor(20)
        StaticBlockDemo st3 = new StaticBlockDemo(); //constructor(25)
        System.out.println(StaticBlockDemo.num);//(25)


    }
}
