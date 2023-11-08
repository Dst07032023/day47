package alexQI.OficeHours.Practice_06_14_2021;

/*
Create a class Twix [Child class]

    * Inherits Candy class
    * constructor that invokes the parent constructor
    * extra: static hiding, final, sub class
 */

/*
    Twix is a Candy
    Twix is a Object
    Twix has a brand
    Twix has a quantity
  */

public class Twix extends Candy {

    public Twix(int quantity, boolean hasPeanuts) {
        super("Mars", quantity, hasPeanuts);
    }

}
