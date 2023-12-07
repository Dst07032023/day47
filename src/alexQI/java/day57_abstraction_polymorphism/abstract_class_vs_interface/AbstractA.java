package alexQI.java.day57_abstraction_polymorphism.abstract_class_vs_interface;

public abstract class AbstractA {
    int num1;
    private double price;
    static int count;
    protected final String TYPE = "abstract";
    public static final String LANGUAGE = "java";

    public AbstractA() {
        System.out.println("AbstractA constructor");
    }

    public abstract void absMethodA();
//    private abstract void absMethodA(); ->Abstract methods cannot be private
//      public static abstract void absMethodA();->Abstract methods cannot be static
//      public final abstract void absMethodA();->Abstract methods cannot be final
    public void methodB(){
        System.out.println("methodB is called");
    }
    public static void staticMethodC() {
        System.out.println("static methodC is called");
    }
}
