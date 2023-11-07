package hotelManagementSystem;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class HotelApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueChoice;
        List<String> inputs = new ArrayList<>();

        do {
            System.out.println("Choose a service: \n 1. Valet \n 2. HouseKeeping \n 3. Cart");
            int serviceChoice = scanner.nextInt();
            scanner.nextLine(); // consume newline left-over

            switch (serviceChoice) {
                case 1:
                    System.out.println("Enter plate number:");
                    String plateNumber = scanner.nextLine();
                    inputs.add("Valet service for vehicle with plate number: " + plateNumber);
                    HotelService valet = new Valet(plateNumber);
                    valet.executeService();
                    break;
                case 2:
                    System.out.println("Enter room number:");
                    int roomNumber = scanner.nextInt();
                    inputs.add("HouseKeeping service for room number: " + roomNumber);
                    HotelService houseKeeping = new HouseKeeping(roomNumber);
                    houseKeeping.executeService();
                    break;
                case 3:
                    System.out.println("Enter number of carts:");
                    int numberOfCarts = scanner.nextInt();
                    inputs.add("Cart service for " + numberOfCarts + " carts");
                    HotelService cart = new Cart(numberOfCarts);
                    cart.executeService();
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid service.");
                    break;
            }

            System.out.println("Do you want to continue? (yes/no)");
            continueChoice = scanner.next();
            scanner.nextLine(); 
        } while (continueChoice.equalsIgnoreCase("yes"));

        System.out.println("You're good to go!! \n Here are the services you availed:");
        for (String input : inputs) {
            System.out.println(input);
        }

        scanner.close();
    }
}