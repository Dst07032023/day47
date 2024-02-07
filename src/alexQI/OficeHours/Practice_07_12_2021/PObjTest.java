package alexQI.OficeHours.Practice_07_12_2021;

public class PObjTest {
    public static void main(String[] args) {

        PA obj1 = new PA();
        Object obj2 = new PA();
        obj1.go();
        ((PA) obj2).go();

        PB obj3 = new PC();
        obj3.go();

        ((PC) obj3).math();
        ((PI) obj3).math();

        //ChromeDriver()
        //FireFoxDriver()

        PB obj4 = new PB(); //if it was new PB() -> PB GO
        obj4.go();
        ((PA) obj4).go();
        ((PI)obj4).math(); //PB doesn't have math method
    }
}
