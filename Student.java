package SDA;
import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int yearLevel;
    private String SID;
    private String units;
    private int debt;
    private static int coursePrice = 600;
    private static int id = 1000;

    // constructor: driver code to source students name and year level via terminal user input prompt

    public Student() {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Student's First Name:  ");
        this.firstName = in.nextLine();

        System.out.print("Enter Students's Last Name:  ");
        this.lastName = in.nextLine();

        System.out.print("Enter Students Year Level: ");
        this.yearLevel = in.nextInt();

        //Student ID Generation class being called
        setSID();

        System.out.println(firstName + " " + lastName + " " + yearLevel + " " + SID);

        id++;
        
    }

    // Generation of a Student ID (SID)
    private void setSID() {
        // Year level ++ ID
        id++;
        this.SID = yearLevel + "" + id;
    }

    //Driver code to enroll current Student into all selected courses
    public void enroll() {
        //via Loop Model , kill switch when User enters Q
        do {
            System.out.println("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();

            // if/else for kill switch detection
            if (!course.equals("Q")) {
                units = units + "\n" + course;
                debt = debt + coursePrice;
            }

            else {
                System.out.println("Sessions Expired!");
                break; }

        } while (1 != 0);


        System.out.println("ENROLLED IN: " + units);
        System.out.println("CURRENT DEBT BALANCE: " + debt);

    }

    //Driver code for allowing user to view current debt balance
    public void viewDebt() {
        System.out.println("Your Current Debt Balance Is: $" + debt);

    }

    //Driver code for payment processing for enrolled courses
    public void payFee() {
        viewDebt();
        System.out.print("Enter Payment Amount: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        debt = debt - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewDebt();
    }

    //Driver code to support information display to terminal
    public String showInfo() {

        return "Name: " + firstName + " " + lastName +
                "\nYear Level:" + yearLevel +
                "\nStudent ID:" + SID +
                "\nCourses Enrolled:" + units +
                "\nBalance $" + debt;

    }

}