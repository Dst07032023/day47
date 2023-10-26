package alexQI.java.day50_inheritance;

public class StaticBlockTest_B {
    public static void main(String[] args) {
        StaticBlockDemo_A st1 = new StaticBlockDemo_A(); //static > constructor
        StaticBlockDemo_A st2 = new StaticBlockDemo_A(); //constructor(20)
        StaticBlockDemo_A st3 = new StaticBlockDemo_A(); //constructor(25)
        System.out.println(StaticBlockDemo_A.num);//(25)
        StaticBlockDemo_A st4 = new StaticBlockDemo_A(50);
        System.out.println(StaticBlockDemo_A.num);//75


    }
}
