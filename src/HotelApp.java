import java.util.*;
public class HotelApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        FrontDesk frontDesk = new FrontDesk();

        System.out.println("HOTEL CALIFORNIA");

        boolean hasExit = false;
        while (!hasExit) {
            System.out.println("\n1: Request for vehicle retrieval.");
            System.out.println("2: Request for room cleaning.");
            System.out.println("3: Request to add cart(s).");
            System.out.println("4: Exit.\n");

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter plate number: ");
                    String plateNumber = scanner.nextLine();
                    Valet valetService = new Valet(plateNumber);
                    System.out.println(frontDesk.request(valetService));
                    break;
                case 2:
                    System.out.print("Enter room number: ");
                    int roomNumber = scanner.nextInt();
                    scanner.nextLine();
                    HouseKeeping houseKeepingService = new HouseKeeping(roomNumber);
                    System.out.println(frontDesk.request(houseKeepingService));
                    break;
                case 3:
                    System.out.print("Enter number of carts: ");
                    int numberOfCarts = scanner.nextInt();
                    scanner.nextLine();
                    Cart cartService = new Cart(numberOfCarts);
                    System.out.println(frontDesk.request(cartService));
                case 4:
                    hasExit = true;
                    break;
                default:
                    System.out.println("Invalid choice... Try again!");
            }
        }

        scanner.close();
    }
}
