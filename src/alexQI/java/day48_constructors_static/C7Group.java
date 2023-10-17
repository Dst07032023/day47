package alexQI.java.day48_constructors_static;

import alexQI.java.day41_arrayList.ArraysAsList;

import java.util.Arrays;
import java.util.Scanner;

public class C7Group {
    public static void main(String[] args) {
        // dependency injection. Group object creation dependens on String name
        Group group1 = new Group("Cyberbugs");
        //print size of members
        System.out.println(group1.getMembers().size());
        group1.addMember("Berk");
        group1.addMember("Pavel");
        group1.addMember("Elvin");
        group1.addMember("Ali");
        group1.addMember("Parvin");
        group1.addMember("Rasim");
        group1.addMember("Maria");

        System.out.println(group1.getMembers().size());
        System.out.println(group1.toString());

        Group group2 = new Group("CyberCats");
        group2.setMembers(Arrays.asList("Stephen", "Wakshum", "Andrei", "Alexandr", "Theodor", "Nikoli"));
        //print all members. not toString()
        System.out.println("Group 2 members = " + group2.getMembers());
        //use if statement to check if Andrei is in group 2
        if(group2.getMembers().contains("Andrei")) {
            System.out.println("Andrei is member of group2");
        }else{
            System.out.println("Andrei is not in group2");
        }

    }
}
