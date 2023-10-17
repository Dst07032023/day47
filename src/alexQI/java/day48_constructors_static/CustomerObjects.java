package alexQI.java.day48_constructors_static;

import java.util.ArrayList;
import java.util.List;

public class CustomerObjects {
    public static void main(String[] args) {
        Customer cs1 = new Customer();
        System.out.println(cs1); //print with default values that are set in no-args constructor
        cs1.setId(1);
        cs1.setName("Bob");
        System.out.println(cs1);

        Customer cs2 = new Customer("Mike", 2); //create object and assign values in same statement
        Customer cs3 = new Customer("John ward III", 2345);
        System.out.println(cs2);
        System.out.println(cs3);

        //array of Customers
        Customer[] todaysCustomers = {cs1, cs2, cs3, new Customer("Bashir", 449)};

        //arrayList of Customer objects
        List<Customer> customerList = new ArrayList<>();
        customerList.add(cs1);
        customerList.add(cs2);
        customerList.add(cs3);
        customerList.add(new Customer("Bashir", 449));
        customerList.add(new Customer("Suleyman", 3456));

        //Print into of first customer object in array and arrayList
        System.out.println(todaysCustomers[0].toString());
        System.out.println(customerList.get(0).toString());

        System.out.println(customerList); //print toString() info of all Customer objects
        System.out.println("----- FOR LOOP -----");
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println(customerList.get(i));

        }

        System.out.println("----- FOR EACH LOOP -----");
        for(Customer eachCustomer : customerList) {
            System.out.println(eachCustomer);
        }

        //print only names of Customers in the list
        System.out.println("----- NAMES OF CUSTOMERS -----");
        //forEach method and lambda expression
        customerList.forEach(each -> System.out.println(each.getName()));
        for(Customer eachCustomer : customerList) {
            System.out.println(eachCustomer.getName());
        }
    }

}
