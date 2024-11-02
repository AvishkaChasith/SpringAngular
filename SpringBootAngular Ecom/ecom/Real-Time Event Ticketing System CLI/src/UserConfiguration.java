import java.util.InputMismatchException;
import java.util.Scanner;

public class UserConfiguration {

    private static int totalTickets;
    private static int ticketReleaseRate;
    private static int customerRetrievalRate;
    private static int maxTicketCapacity;
    private static boolean validInput;


    public static int UserConfigurationMenu(){
        Scanner input = new Scanner(System.in);
        validInput=false;
        while (!validInput){
            try{
                System.out.println("////////////////======================/////////////////");
                System.out.println("=============== Configuration Menu ====================");
                System.out.print("Enter Total Tickets: ");
                totalTickets=input.nextInt();
                validInput=true;
            }catch (InputMismatchException e) {
                System.out.println("Please enter a valid number for Total Tickets: .");
                input.nextLine();
                validInput = false;
            }
        }
        validInput=false;
        while(!validInput) {
            try {
                System.out.print("Enter Ticket Release Rate: ");
                ticketReleaseRate = input.nextInt();
                validInput=true;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number for Ticket Release Rate: .");
                input.nextLine();
                validInput = false;
            }
        }
        validInput=false;
        while (!validInput) {
            try {
                System.out.print("Enter Customer Retrieval Rate: ");
                customerRetrievalRate = input.nextInt();
                validInput=true;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number for Customer Retrieval Rate: .");
                input.nextLine();
                validInput = false;
            }
        }
        validInput=false;
        while (!validInput) {
            try {
                System.out.print("Enter Max Ticket Capacity: ");
                maxTicketCapacity = input.nextInt();
                if(maxTicketCapacity<totalTickets) {
                    System.out.println("Wrong value for Max Ticket Capacity.Total Tickets Value is more than Max Ticket Capacity Value.");
                    validInput = false;
                }else
                    validInput=true;
            } catch (InputMismatchException e) {
                    System.out.println("Please enter a valid number for Max Ticket Capacity: .");
                    input.nextLine();
                    validInput = false;
            }
        }
        System.out.println("////////////////======================/////////////////");
        System.out.println("=============== Configuration Details =================");
        System.out.println("Total Tickets: "+totalTickets);
        System.out.println("Ticket Release Rate: "+ticketReleaseRate);
        System.out.println("Customer Retrieval Rate: "+customerRetrievalRate);
        System.out.println("Max Ticket Capacity: "+maxTicketCapacity);
        return maxTicketCapacity;
    }
}
