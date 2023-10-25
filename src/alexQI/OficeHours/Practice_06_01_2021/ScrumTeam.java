package alexQI.OficeHours.Practice_06_01_2021;

/*
- Create a class called ScrumTeam

        Attributes:
            PO, BA, SM,
            ArrayList<Tester> testerList = new ArrayList<>(),
            ArrayList<Developer> devopsList = new ArrayList<>(),
            sprintNumber

        Constructor:
            sets the names of: PO, BA, SM

        Actions:

            addTester(Tester tester): adds the given tester to the testers arrayList
            addTester(Tester[] tester): adds the given testers to the testers arrayList
            addDeveloper(Developer developer): adds the given developer to the developers arrayList
            addDeveloper(Developer[] developer): adds the given developers to the developers arrayList
            removeTester(long employeeID): removes the given tester from the testers arrayList
            removeDeveloper(long employeeID): removes the given developer from the developers arrayList
            toString(): prints number of tester, & developers, PO name, SM name, BA name

 */

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    String productOwner;
    String scrumMaster;
    String businessAnalyst;
    ArrayList<Tester> allTesters;
    ArrayList<Developer> allDevelopers;
    int sprintNumber;

    public ScrumTeam(String productOwner, String scrumMaster, String businessAnalyst) {
        this.productOwner = productOwner;
        this.scrumMaster = scrumMaster;
        this.businessAnalyst = businessAnalyst;
        this.allTesters = new ArrayList<>();
        this.allDevelopers = new ArrayList<>();

    }

    public void addTester(Tester tester) {
        this.allTesters.add(tester);
    }

    public void addTester(Tester ... testers) { //Tester [] testers
        this.allTesters.addAll(Arrays.asList(testers));
    }
    public void addDeveloper(Developer developer) {
        this.allDevelopers.add(developer);
    }

    public void addDeveloper(Developer ... developers) { //Developer [] developers
        this.allDevelopers.addAll(Arrays.asList(developers));
    }

    public static void main(String[] args) {
        ScrumTeam scrumTeam = new ScrumTeam("Ziba", "John", "Fikret");
        System.out.println(scrumTeam.allTesters);
        Tester tester1 = new Tester("Maxim", 10, "SDET", 1000000);
        scrumTeam.addTester(tester1);
        scrumTeam.addTester(new Tester ("Anna", 11, "SDET", 100000000));
        System.out.println(scrumTeam.allTesters);

        scrumTeam.addDeveloper(new Developer("Anton", 1, "dev", 1000000));
        System.out.println(scrumTeam.allDevelopers);


    }
}
