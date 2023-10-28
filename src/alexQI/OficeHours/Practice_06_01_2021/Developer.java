package alexQI.OficeHours.Practice_06_01_2021;

/*
- create a class called Developer
        Attributes:
            name, employeeID, JobTitle, Salary
            hasCodingSkills

        Constructor:
                accepts and sets all instance variables

            Actions:
                getter/setters, coding(), fixingBug, toString()
 */

public class Developer {

    private String name;
    private int employeeId;
    private String jobTitle;
    private double salary;
    private static boolean hasCodingSkills = true;

    public Developer(String name, int employeeId, String jobTitle, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void coding() {
        System.out.println(this.name + " is coding");
    }

    public void fixingBug() {
        System.out.println(this.name + " is fixing a bug");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static boolean hasCodingSkills() {
        return hasCodingSkills;

    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
