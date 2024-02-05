package alexQI.java.day63_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExamples {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        //list -> ArrayList

        set.add(100);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2);
        set.add(100);

        System.out.println(set);

        Set<String> words = new HashSet<>();
        words.add("hello");
        words.add("world");
        words.add("java");
        words.add("java");
        words.add("collection");
        System.out.println(words);

        for (String String : words) {


        //convert your Set to a list

        List<String> wordsList = new ArrayList<>(words);
        wordsList.add("world");
        System.out.println(wordsList);

        }

    }
}
