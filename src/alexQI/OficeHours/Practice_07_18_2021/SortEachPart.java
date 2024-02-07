package alexQI.OficeHours.Practice_07_18_2021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class SortEachPart {

    /*
    Create a method that will take any String of letters and numbers and sort each substring of numbers and letters

    Ex:
        Input: "DC501GCCCA098911"
        Output: "CD015ACCCG011899"
        501
        CD015
     */

    public static void main(String[] args) {
        System.out.println(sortEach("DC501GCCCA098911F"));
    }

    public static String sortEach(String str) {

        String fixedStr = "";
        ArrayList<String> eachSub = new ArrayList<>();


//        Queue<String> eachSub = new PriorityQueue<>();

//        "DC501GCCCA098911"
//        eachSub = 5
//        fixed = CD

        for (int i = 0; i < str.length(); i++) {

            char eachChar = str.charAt(i);
            eachSub.add("" + eachChar);
            boolean nextSubString = false;

            if(Character.isLetter(eachChar)) {
                // we are a character
                if (i == str.length() - 1 || !Character.isLetter(str.charAt(i + 1))) {
                    //next char is a number, do an action
                    nextSubString = true;
                }

            }else{
                //we are a number
                if(i == str.length() - 1 || !Character.isDigit(str.charAt(i + 1))) {
                    //next is letter, do an action
                    nextSubString = true;
                }
            }
            //this is the action
            if (nextSubString) {
                Collections.sort(eachSub);
                fixedStr += String.join("", eachSub);
                eachSub.clear();
                //with queue as eachSub, you don't need this line: Collections.sort(eachSub);
            }
        }
        return fixedStr;
    }

}
