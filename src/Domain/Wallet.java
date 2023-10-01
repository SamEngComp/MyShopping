package Domain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Wallet {

    // PROPERTIES

    private double totalBalance;
    private boolean addedValue = false;
    private List<Product> purchases = new ArrayList<>();

    // METHODS

    public void setOpeningBalance(double totalBalance) {
        if (!addedValue) this.totalBalance = totalBalance;
        else return;

        addedValue = true;
    }

    public void showDescriptionWallet() {
        String description = String.format("""
               ******************************
               Total balance:  $ %.2f
               ******************************
               """, this.totalBalance);
        System.out.println(description);
    }

    public boolean purchase(Product product) {
        if(product.getPrice() > this.totalBalance) {
            System.out.println("*!!!* Insufficient balance!\n");
            return false;
        }
        this.totalBalance -= product.getPrice();
        this.purchases.add(product);

        System.out.println("Purchase made!\n");
        return true;
    }

    public void showPurhasesMade() {
        this.purchases.sort(Comparator.comparing(Product::getPrice));
        String purchasesMade = """
                   ******************************
                   PURCHASES MADE
                   
                   """;
        for(Product purchase: purchases) purchasesMade += purchase.toString();
        purchasesMade += "\n******************************";

        System.out.println(purchasesMade);
    }
}
