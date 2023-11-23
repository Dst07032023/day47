package alexQI.OficeHours.Practice_06_22_2021;

public class Amazon extends OnlineShopping implements AllowUsersToSell {
    @Override
    public void viewCar() {
        System.out.println("Viewing Amazon Card");
    }

    @Override
    public boolean payForShipping(double price) {
        return price < 50;
    }

    @Override
    public void buyItem() {
        System.out.println("Buying item from amazon");

    }

    @Override
    public void returnItem() {
        System.out.println("Returning item form amazon");
    }

    @Override
    public void uploadProduct() {
        System.out.println("Amazon seller");
    }
}
