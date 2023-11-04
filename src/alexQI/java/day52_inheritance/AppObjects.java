package alexQI.java.day52_inheritance;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class AppObjects {
    public static void main(String[] args) {
        MobileApp mobileApp = new MobileApp();
//        mobileApp.name = "YouTube";
        mobileApp.setName("YouTube");
        mobileApp.useTheApp(10);
        mobileApp.download();

        Instagram instagram = new Instagram();
//        instagram.name = "Instagram";
        instagram.setName("Instagram");
        instagram.setVersion(2.3);
        instagram.useTheApp(20);
        instagram.download();

        Discord b22Discord = new Discord();
//        b22Discord.name = "Discord";
        b22Discord.setName("Discord");
        b22Discord.setVersion(6.234);
        b22Discord.useTheApp(100);
        b22Discord.download();
        b22Discord.printInfo();
        System.out.println(b22Discord.getName());

    }
}
