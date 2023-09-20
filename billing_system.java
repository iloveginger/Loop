import java.util.Scanner;

public class billing_system {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int qty_momo = 0;
        int qty_chowmein = 0;
        int qty_cake = 0;
        double total_momo = 0;
        double total_cake = 0;
        double total_chow = 0;

        double grand_total = 0;
        int i;
        System.out.println("Enter the number of bills you want to calculate: ");
        int n = sc.nextInt();
        for (i = 0; i < n; i++) {
            System.out.println("Enter 1 for momo, 2 for cake, 3 for chowmein: ");
            int menu = sc.nextInt();
            double discount = 0;
            if(menu==1) {

                System.out.println("enter the quantity of momo: ");
                qty_momo = sc.nextInt();
                total_momo = 250 * qty_momo;

            }
            else if(menu==2) {
                System.out.println("enter the quantity of cake: ");
                qty_cake = sc.nextInt();
                total_cake = 250 * qty_cake;

            }
            else if (menu==3) {
                System.out.println("enter the quantity of chowmein: ");
                qty_chowmein = sc.nextInt();
                total_chow = 250 * qty_chowmein;

            }
            else{
                System.out.println("Try again");
            }
            double total = total_chow + total_momo + total_cake;
            System.out.println("Do you have membership? (Y/N): ");
            String yn = sc.next();
            if (yn.equals("Y")) {
                discount = 0.1 * total;
                grand_total = total - (0.1 * total);
            } else {
                grand_total = total;
            }
            System.out.println("\t\n Item\tQty  \tRate\tAmount\nMomo    \t" + qty_momo + "\t250   \t" + total_momo + "\nCake    \t" + qty_cake + "\t50   \t" + total_cake + "\nChowmein\t" + qty_chowmein + "\t200   \t" + total_chow + "\n");

            System.out.println("Your total is: " + total + "\n");
            System.out.println("Your discount is: " + discount + "\n");
            System.out.println("Your grand total is: " + grand_total);

        }
    }
}