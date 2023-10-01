package Domain;

public class Wallet {

    // PROPERTIES

    private double totalBalance;
    private boolean addedValue = false;

    // METHODS

    public void setOpeningBalance(double totalBalance) {
        if (!addedValue) this.totalBalance = totalBalance;
        else return;

        addedValue = true;
    }

    public void showDescriptionWallet() {
        String description = String.format("""
               ******************************
               Total balance:  R$ %.2f
               ******************************
               """, this.totalBalance);
        System.out.println(description);
    }
}
