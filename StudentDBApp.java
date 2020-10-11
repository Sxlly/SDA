package SDA;
import java.util.Scanner;
public class StudentDBApp {

    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.enroll();
        stu1.payFee();

        System.out.println(stu1.showInfo());

        // Ask how many new users are desired to be added at current compile session (runtime)
        
        System.out.print("Enter Number Of Students For Entry: ");
        Scanner in = new Scanner(System.in);
        int numStudents = in.nextInt();
        Student[] students = new Student[numStudents];


        // Create "n" number of Student Class objects

        for (int n = 0; n < numStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payFee();

            System.out.println(students[n].showInfo());
        }

    }

    
}