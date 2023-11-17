package alexQI.OficeHours.Practice_06_15_2021;

public class EmailObjects {

    public static void main(String[] args) {

        Email email = new Email("batelio@mail.com", 56);
        //email.ADDRESS = "email"; -> ADDRESS is final, so cannot be changed
        System.out.println(email);
        System.out.println(Email.domain);
        System.out.println(Gmail.domain);
        System.out.println(Yahoo.domain);
        System.out.println();

        Gmail gmail = new Gmail("c_deonisis@mail.com" , 3224);
        System.out.println(gmail);
        System.out.println(Email.domain);
        System.out.println(Gmail.domain);
        System.out.println(Yahoo.domain);
        System.out.println();

        Yahoo yahoo = new Yahoo("james@yahoo.com", 43);

        System.out.println(Email.domain);
        System.out.println(Gmail.domain);
        System.out.println(Yahoo.domain);
        System.out.println();

        Email email2 = new Email("rest@email", 32);
        System.out.println(Email.domain);
        System.out.println(Gmail.domain);
        System.out.println(Yahoo.domain);
        System.out.println();

        Email.sendEmail();
        Gmail.sendEmail();
        Yahoo.sendEmail();

        System.out.println();

        Gmail.sendSuperEmail();
    }
}
