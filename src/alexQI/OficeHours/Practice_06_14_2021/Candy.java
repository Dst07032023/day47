package alexQI.OficeHours.Practice_06_14_2021;
/*
Create a class Candy [Parent class]

    * instance variables:
        - brand (String), quantity (int), contains peanuts (boolean),

    * static variables:
        - number of total candy (int)

    * constructor to set all variables
        -Also increments total candy every time an object is made

    * encapsulate
        - Add one set of logic for quantity [given number cannot be less than 0, otherwise it is not assigned]

    * override toString
 */

public class Candy {

    private String brand;
    private int quantity;
    private boolean hasPeanuts;
    private static int totalNumOfCandies; // purpose -> know how many total Candy objects were made

    public Candy(String brand, int quantity, boolean hasPeanuts) {
        this.brand = brand;
        setQuantity(quantity);
        this.hasPeanuts = hasPeanuts;
        totalNumOfCandies++;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity > 0) {
        this.quantity = quantity;
        }
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }

    public static int getTotalNumOfCandies() {
        return totalNumOfCandies;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", hasPeanuts=" + hasPeanuts +
                '}';
    }
}
