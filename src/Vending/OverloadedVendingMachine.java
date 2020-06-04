package Vending;

public class OverloadedVendingMachine {

    private int stockLevel = 0;
    private int softDrinkQty;
    private int saltySnacksQty;
    private int chocolatesQty;

    public OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty) {
        // private int stockLevel = 0;
        this.softDrinkQty = softDrinkQty;
        this.saltySnacksQty = saltySnacksQty;
        this.chocolatesQty = chocolatesQty;
        System.out.println("This is my constructor!");
    }

    public void buy(SoftDrink softdrink) {
        if (softDrinkQty > 0) {
            System.out.println("SoftDrink is available");
            softDrinkQty--;
        } else {
            System.out.println("SoftDrink is not available");
        }
    }

    public void buy(SaltySnack saltySnack) {
        if (saltySnacksQty > 0) {
            System.out.println("SaltySnack is available");
            saltySnacksQty--;
        } else {
            System.out.println("SaltySnack is not available");
        }
    }

    public void buy(Chocolate chocolate) {
        if (chocolatesQty > 0) {
            System.out.println("Chocolates are available");
            chocolatesQty--;
        } else {
            System.out.println("Chocolates are not available");
        }
    }

    public void addStock(SoftDrink softdrink) {
        System.out.println("SoftDrink is added");
        stockLevel++;
    }

    public void addStock(SaltySnack saltySnack) {
        System.out.println("SaltySnack is added");
        stockLevel++;
    }

    public void addStock(Chocolate chocolate) {
        System.out.println("Chocolates are added");
        stockLevel++;
    }

    public void addStock(Product product) {
        softDrinkQty = softDrinkQty + 3;
        saltySnacksQty = saltySnacksQty + 3;
        chocolatesQty = chocolatesQty + 3;
    }

    public int getStock(SoftDrink softdrink) {
        //return softDrinkQty;
        return stockLevel;
    }

    public int getStock(SaltySnack saltySnack) {
        //return saltySnacksQty;
        return stockLevel;
    }

    public int getStock(Chocolate chocolate) {
        //return chocolatesQty;
        return stockLevel;
    }

    public static void main(String[] args) {
        OverloadedVendingMachine ovm = new OverloadedVendingMachine(2, 1, 3);
        ovm.buy(new SoftDrink());
        ovm.buy(new SaltySnack());
        ovm.buy(new Chocolate());
        System.out.println("The machine is running out of stock!");
    }

}
