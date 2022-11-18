import java.util.Scanner;

public class App {
        
    public static void main(String[] args) throws Exception {
        ApLinkedList list = new ApLinkedList();
        final int BOOK = 1, CANCEl = 2,CHECK = 3, DISPLAY = 4;
        Scanner scanner = new Scanner(System.in);
        int choice = 1;
        while(choice != 5){
            System.out.println(
                "=======================================\n" + 
                "Aprtment Booking\n" + 
                "=======================================\n" + 
                "(1) Book an apartment\n" + 
                "(2) Cancel aprtments's booking\n" + 
                "(3) Check aprtments's booking\n" + 
                "(4) Display all bookings\n" +
                "(5) Exit.\n" + 
                "=======================================\n"
                
            );
            
            System.out.print("Enter your option: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            System.out.println("***************************************");
            switch(choice){
                case BOOK:
                    System.out.print( 
                        "Book an Apartment: \n" + 
                        "Enter renter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter number of rooms: ");
                    int rooms = scanner.nextInt();
                    list.addRenter(name, rooms);
                    break;
                case CANCEl:
                    System.out.print(
                        "Check Booking\n" + 
                        "Enter renter name: "
                    );
                    String cancelRenter = scanner.nextLine();
                    list.cancelRenter(cancelRenter);
                    break;
                case CHECK:
                    System.out.print(
                        "Check Booking\n" + 
                        "Enter renter name: "
                    );
                    String checkRenter = scanner.nextLine();
                    var current = list.existsRenter(checkRenter);
                    if(current != null){
                        System.out.println("The renter " + checkRenter + " has booked an aprtment with " + current.getRooms() + " rooms.");
                        System.out.println("Checking renter processed successfully.");
                    }
                    else{
                        System.out.println("The renter does not exist");
                    }
                    break;
                case DISPLAY:
                    list.display();
                    break;
                default:
                    choice = 5;
            }
            System.out.println("***************************************\n");
        } 
    }
}
