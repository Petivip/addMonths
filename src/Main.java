import java.util.Scanner;

public class Main {

     public static void main(String [] args) {

         Scanner key = new Scanner(System.in);
         System.out.println("Enter the days of a month: ");
         int days = key.nextInt();
         key.nextLine();

             switch (days) {
                 case 28:
                     System.out.println("The month that have these days is Feb");
                     break;
                 case 30:
                     System.out.println("The months that have these days are Jan, Mar, May, Jul, Sep");
                     break;
                 case 31:
                     System.out.println("The months that have these days are Apr, Jun, Aug, Oct, Nov");
                     break;
                 default:
                     System.out.println("no months have exactly " + days + " days.");
                     System.out.println("Do you want to enter another number?(Y/N)");
                     String answer = key.nextLine();
                     if (answer.equalsIgnoreCase("Y")) {
                         System.out.println("Enter the days of a month: ");
                         days = key.nextInt();
                     }
             }
         }
}



