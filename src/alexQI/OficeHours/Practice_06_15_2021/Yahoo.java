package alexQI.OficeHours.Practice_06_15_2021;

public class Yahoo extends Email {

//    static String domain;

    static {
        domain = "Yahoo";
    }

    public static void sendEmail() {
        System.out.println("Sending from YAHOO");
    }
    public static void sendSuperEmail() {
        Email.sendEmail();
    }

    public Yahoo(String address, int numberOfEmail) {
        super(address, numberOfEmail);
    }
}
