import java.util.Scanner;
public class OnlineOrderSystem {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int choice, quantity;
        double price = 0, total = 0, grandTotal = 0;
        char more;
        System.out.println("===== ONLINE ORDER PROCESSING AND INVOICE 
GENERATION SYSTEM =====");
        do {
            System.out.println("\n----------- PRODUCT MENU -----------");
            System.out.println("1. Laptop        - Rs 50000");
            System.out.println("2. Mobile Phone  - Rs 20000");
            System.out.println("3. Headphones
    - Rs 2000");
            System.out.println("4. Keyboard      - Rs 1500");
            System.out.println("5. Mouse
         - Rs 500");
            System.out.print("Enter product number: ");
            choice = sc.nextInt();
            System.out.print("Enter quantity: ");
            quantity = sc.nextInt();
            switch (choice) {
                 case 1:
                    price = 50000;
                    break;
                case 2:
                    price = 20000;
                    break;
                case 3:
                    price = 2000;
                    break;
                case 4:
                    price = 1500;
                    break;
                case 5:
                    price = 500;
                    break;
                default:
                    System.out.println("Invalid choice!");
                    price = 0;
            }
            total = price * quantity;
            grandTotal += total;
            System.out.println("Item Total = Rs " + total);
System.out.print("Do you want to sale more items? (y/n): ");
            more = sc.next().charAt(0);
        } while (more == 'y' || more == 'Y');
        System.out.println("\n=========== INVOICE ===========");
        System.out.println("Total Amount to Pay: Rs " + grandTotal);
        System.out.println("Thank you for your sale!");
        sc.close();
    }
}