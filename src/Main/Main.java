package Main;

import java.util.Scanner;

import Domain.Wallet;


public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Wallet wallet = new Wallet();

        System.out.print("Add opening balance: ");
        wallet.setOpeningBalance(input.nextDouble());
        wallet.showDescriptionWallet();

    }
}
