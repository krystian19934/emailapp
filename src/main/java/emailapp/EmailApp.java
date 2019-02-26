package emailapp;


import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = input.nextLine();
        System.out.println("Enter last name: ");
        String lastName = input.nextLine();

        Email e1 = new Email(firstName,lastName);


        Scanner option = new Scanner(System.in);
        boolean tmp = true;
        while(tmp) {
            System.out.println("Please type option: \n1 Change password \n2 Set alternative email \n3 Set mailbox capacity \n4 Show info \n0 END");
            switch (option.nextInt()) {
                case(0):
                    tmp=false;
                    break;
                case (1):
                    System.out.println("Please type new password: ");
                    Scanner s1 = new Scanner(System.in);
                    String tempPassword = s1.nextLine();
                    e1.changePassword(tempPassword);
                    break;
                case (2):
                    System.out.println("Type alternative email: ");
                    Scanner s2 = new Scanner(System.in);
                    String temp = s2.nextLine();
                    e1.setAlternateEmail(temp);
                    break;
                case (3):
                    System.out.println("Type mailbox capacity in MB: ");
                    Scanner s3 = new Scanner(System.in);
                    int tempCapacity = s3.nextInt();
                    e1.setMailboxCapacity(tempCapacity);
                    break;
                case(4):
                    System.out.println(e1.showInfo());
                    break;
                default:
                    break;
            }
        }
    }
}
