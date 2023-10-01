package Main;

import java.util.Scanner;

import Domain.Product;
import Domain.Wallet;


public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Wallet wallet = new Wallet();

        System.out.print("Add opening balance: ");
        wallet.setOpeningBalance(input.nextDouble());
        wallet.showDescriptionWallet();

        boolean menuActivated = true;
        while (menuActivated) {
            String menu = """
                   ******************************
                   MENU SHOPPING
                   1 - Purchase
                   0 - Quit
                   ******************************
                   """;
            System.out.println(menu);

            switch (input.nextInt()) {
                case 1:
                    System.out.print("Name of product: ");
                    String nameProduct = input.next();

                    System.out.print("Price of product: ");
                    double priceProduct = input.nextDouble();

                    if (!wallet.purchase(new Product(nameProduct, priceProduct)))
                        menuActivated = false;
                    break;
                case 0:
                    menuActivated = false;
                    break;
                default: break;
            }
        }

        wallet.showPurhasesMade();
        wallet.showDescriptionWallet();
    }
}
