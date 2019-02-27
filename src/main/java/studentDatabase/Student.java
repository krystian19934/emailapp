package studentDatabase;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses = null;
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 1000;

    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println("Student class level: \n1 Junior \n2 Mid \n3 Senior \nEnter student class level: ");
        this.gradeYear = in.nextInt();

        setStudentId();

    }

    private void setStudentId(){
        id++;
        this.studentId = gradeYear + "" + id;
    }

    public void enroll(){
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equalsIgnoreCase("Q")) {
                courses = courses + "\n   " + course;
                tuitionBalance += costOfCourse;
            }
            else {break;}
        }while(true);
    }

    public void viewBalance(){
        System.out.println("Your balance is: " + tuitionBalance);
    }

    public void payTuition(){
        viewBalance();
        System.out.println("Enter your payment: ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance -= payment;
        System.out.println("Thank you for you payment: " + payment);
        viewBalance();
    }

    public String toString(){
        return "\n***INFO***" +
                "\nName: " + firstName + " " + lastName +
                "\nGrade level: " + gradeYear +
                "\nStudent ID: " + studentId +
                "\nBalance: " + tuitionBalance;
    }


}
