package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String company = "company.com";

    public Email(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        this.password = randomPassword(defaultPasswordLength);
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + company;
    }

    private String setDepartment(){
        System.out.println("Department codes \n1 for Sales \n2 for Development \n3 for Accounting \nEnter department code:");
        Scanner input = new Scanner(System.in);
        int depChoice = input.nextInt();
        if(depChoice == 1){
            return "sales";
        }
        else if(depChoice == 2){
            return "development";
        }
        else if(depChoice == 3){
            return "accounting";
        }
        else{
            return "";
        }
    }

    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    public void setAlternateEmail(String alternateEmail){
        this.alternateEmail = alternateEmail;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail(){
        return alternateEmail;
    }

    public String getPassword(){
        return password;
    }

    public String showInfo(){
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY MAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + " MB" +
                "\nPASSWORD: " + password + "\n";
    }

    public void changePassword(String password){
        this.password = password;
    }

    private String randomPassword (int length){
        String passwordSet = "ABCDEFGHIJKLMNOPRSTUWXYZ1234567890!@#$%^&*()";
        char [] password = new char [length];
        for (int i = 0; i<length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }

        return new String(password);
    }
}
