package alexQI.OficeHours.Practice_07_18_2021;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    /*
    Create a method that will accept a String and returns a String with the duplicate instances of characters removed

    Ex:
        Input: "AAABBBCCCD"
        Output: ABCD

        loop through each char I will compare with each other char in the String
     */

    public static String removeDuplicateChars (String str){

        Set<String> set = new HashSet<>(Arrays.asList(str.split("")));
//        return set.toString().replace("[", "").replace("]", "").replace(", ", "");
        return String.join("", set);

    }
    public static void main(String[] args) {
        System.out.println(removeDuplicateChars("AAABBBCCCD"));

    }
}
