package alexQI.java.day52_inheritance;

public class Discord extends MobileApp {
    public void chat(String someone) {
        System.out.println("Chatting with " + someone + " on Discord");
    }

    @Override
    public void useTheApp(int minutes) {
        super.useTheApp(minutes);
        chat("Vladislav");
    }
}
