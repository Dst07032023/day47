package alexQI.java.day49_static;

public class StaticVariablesTest {
    public static void main(String[] args) {

        System.out.println(StaticVariables.name);
        System.out.println(StaticVariables.userName);
        System.out.println(StaticVariables.age);
        System.out.println(StaticVariables.price);
        System.out.println("driver.findElement(By.xpath("
                + Locators.userName + ").sendKeys(" + StaticVariables.userName + ")");
        System.out.println(Locators.password);
    }
}
