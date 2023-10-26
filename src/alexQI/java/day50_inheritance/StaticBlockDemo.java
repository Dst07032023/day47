package alexQI.java.day50_inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StaticBlockDemo {

    public static class Inner {
        //variables and methods of inner static class

    }
    static int num;
    static List<String> carModels;
    static {
        System.out.println("static initializer block");
        num = 10;
        carModels = new ArrayList<>();
        carModels.addAll(Arrays.asList("Abarth",
                "Alfa Romeo",
                "Aston Martin",
                "Audi",
                "Bentley",
                "BMW",
                "Bugatti",
                "Cadillac",
                "Chevrolet",
                "Chrysler",
                "Citroen",
                "Dacia",
                "Daewoo",
                "Dainhatsu",
                "Dodge",
                "Donkervoort"));
    }

    {//initializer block -> runs each time object created, before constructor
        System.out.println("Initializer block");

    }


    public StaticBlockDemo() {
        System.out.println("Constructor method");
        num += 5;
    }

    public StaticBlockDemo(int value) {
        System.out.println("Overloaded constructor value = " + value);
        num += value;
    }

    //other methods that use the carModels arraylist
}
