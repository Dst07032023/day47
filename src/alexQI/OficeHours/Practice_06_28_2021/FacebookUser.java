package alexQI.OficeHours.Practice_06_28_2021;

/*
Facebook User
* Create a class for a facebook user which inherits the Social Media class and has additional instance variables: username,
password, full name, age, number of friends, and posts (ArrayList of Post)
* Encapsulate all the variables.
* Set the platform for "Facebook" using static block
* Create a constructor that will create a Facebook user by taking username and password.
- If the password contains the username then it is not a valid password and should not be saved. In this case Print "Password
contained username. Default password created: 'password' and set the password for the user to the default value.
- Create and assign the user's person url by using 'facebook.com/' and adding their username
- Create an empty ArrayList of Posts

* Overload the constructor to accept username, password, and the user's name
- If the name entered has any characters that are not letters from the alphabet, then the name is invalid. In this case print
  "invalid name" and assign the name value to be 'no name'

* Overload the constructor to accept username, password, the user's name, age and number of friends.
- Only store the age and number of friends into the variables if they are valid numbers. The age cannot be a negative number
  and the number of friends cannot be negative or more than 5000. If they are invalid print "Invalid(age/number of friends)"
  and keep the values as the default of 0.

* Implement all methods coming from Social Media class
~ Direct massaging(String username, String message) - print = %message sent to %username
~ Post(String body)
- Should be added to the ArrayList of Posts of the user
~ Notifications()
- Checks the current time. If the time is between 8am - 5 pm print
"Notification", otherwise print "Sleep mode"

Note: use this code to get the current hour: LocalTime.now().getHour() - The return value will be given in 24 hour format.

* Override the toString method to print all of the information of a Facebook user when they are searched.
* Create a sendFriendRequest method that will accept a Facebook user object and send them a friend request. The method should
  return a boolean of it the friend request was sent (true) or if the friend request was not sent (false).

- If your friend list is at the 5000 limit then do not send the request and print "You have reached the limit of friends."
- If the user you are trying to send the request to has already hit the limit, then print "$theUserName cannot accept any
  more friend request.
- If both the user and you are under the limit print "Friend request sent to $theUsersName" and increase your number of
* friends by one.
 */

import java.time.LocalTime;
import java.util.ArrayList;

public class FacebookUser extends SocialMedia{

    private String username;
    private String password;
    private String fullName;
    private int age;
    private int numberOfFriends;
    private ArrayList<Post> allPosts;

    static {
        platform = "Facebook";
    }

    public FacebookUser(String username, String password) {
        this.username = username;
        setPassword(password);
        personUrl = "facebook.com/" + username;
        allPosts = new ArrayList<>();

    }

    //this() -> constructor chaining
    public FacebookUser(String username, String password, String fullName){
       this(username, password);
       setFullName(fullName);
    }

    public FacebookUser(String username, String password, String fullName, int age, int numberOfFriends){
        this(username, password, fullName);
        setAge(age);
        setNumberOfFriends(numberOfFriends);
    }

    @Override
    public void directMessage(String username, String message) {
        System.out.println(message + " was sent to " + username);

    }

    @Override
    public void post(String body) {
        allPosts.add(new Post(body));

    }

    @Override
    public void notification() {
        int currentHour = LocalTime.now().getHour();
        if(currentHour >= 8 && currentHour <= 17) {
            System.out.println("Notification");
        }else{
            System.out.println("Sleep mode");
        }
    }

    public boolean sendFriendRequest(FacebookUser other) {

        boolean sent = false;

        if(this.getNumberOfFriends() < 5000 && other.getNumberOfFriends() < 5000) {
            System.out.println("Friend request sent to " + other.getUsername());
            sent = true;
            this.setNumberOfFriends(this.getNumberOfFriends() + 1);
            other.setNumberOfFriends(other.getNumberOfFriends() + 1);
        }else if(this.getNumberOfFriends() == 5000) {
            System.out.println("You have reached the max friend limit");
        }else{
            System.out.println(other.getUsername() + " cannot accept anymore friends");
        }

        return sent;

    }

    //Facebook user - 4001
    // other user -> 301

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if(password.contains(this.username)){
            System.out.println("Password contained username");
            this.password = "password";
        }else{
        this.username = username;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {

        boolean validName = true;

        for (int i = 0; i < fullName.length(); i++) {

            if (fullName.charAt(i) == ' ') continue;


            if(!Character.isLetter(fullName.charAt(i))){
                validName = false;
                break;
            }
        }

        if (validName) {
            this.fullName = fullName;
        }else{
            System.out.println("Invalid name");
            this.fullName = "no name";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }else{
            System.out.println("Invalid age");
        }
    }

    public int getNumberOfFriends() {
        return numberOfFriends;
    }

    public void setNumberOfFriends(int numberOfFriends) {
        if (this.numberOfFriends < 5000) {
            this.numberOfFriends = numberOfFriends;
        } else {
            System.out.println("Invalid number of friends");

        }
    }

    public ArrayList<Post> getAllPosts() {
        return allPosts;
    }

    public void setAllPosts(ArrayList<Post> allPosts) {
        this.allPosts = allPosts;
    }

    @Override
    public String toString() {
        return "Facebook{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", numberOfFriends=" + numberOfFriends +
                ", allPosts=" + allPosts +
                '}';
    }
}
