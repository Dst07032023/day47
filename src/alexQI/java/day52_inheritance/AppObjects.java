package alexQI.java.day52_inheritance;

public class AppObjects {
    public static void main(String[] args) {
        MobileApp mobileApp = new MobileApp();
        mobileApp.name = "YouTube";
        mobileApp.useTheApp(10);
        mobileApp.download();

        Instagram instagram = new Instagram();
        instagram.name = "Instagram";
        instagram.useTheApp(20);
        instagram.download();

        Discord b22Discord = new Discord();
        b22Discord.name = "Discord";
        b22Discord.useTheApp(100);
        b22Discord.download();

    }
}
