package ExtendableVendingMachine;
import Vending.Chocolate;
import Vending.Product;
import Vending.SaltySnack;
import Vending.SoftDrink;

public class ExtendableVendingMachine {

    private int softDrinkQty;
    private int saltySnacksQty;
    private int chocolatesQty;

    public ExtendableVendingMachine(int softDrink, int saltySnacks, int chocolates) {
        this.softDrinkQty = softDrinkQty;
        this.saltySnacksQty = saltySnacksQty;
        this.chocolatesQty = chocolatesQty;
        System.out.println("This is my constructor!");
    }
    public void buy(Product product) {
        if (product instanceof SoftDrink) {
            if (softDrinkQty > 0) {
                System.out.println("SoftDrinks are available.");
                softDrinkQty--;
            } else {
                System.out.println("SoftDrinks are not available.");
            }
        } else if (product instanceof SaltySnack) {
            if (saltySnacksQty > 0) {
                System.out.println("Snacks are available");
                saltySnacksQty--;
            } else {
                System.out.println("Snacks are not available.");
            }
        } else if (product instanceof Chocolate) {
            if (chocolatesQty > 0) {
                System.out.println("Chocolates are available.");
                chocolatesQty--;
            } else {
                System.out.println("Chocolates are not available.");
            }
        }
    }
    public void buy(Product product, int qty){
        if (product instanceof SoftDrink) {
            if (softDrinkQty > 0) {
                System.out.println("SoftDrinks are available.");
                softDrinkQty = softDrinkQty - qty;
            } else {
                System.out.println("SoftDrinks are not available.");
            }
        } else if (product instanceof SaltySnack) {
            if (saltySnacksQty > 0) {
                System.out.println("Snacks are available");
                saltySnacksQty = saltySnacksQty - qty;
            } else {
                System.out.println("Snacks are not available.");
            }
        } else if (product instanceof Chocolate) {
            if (chocolatesQty > 0) {
                System.out.println("Chocolates are available.");
                chocolatesQty = chocolatesQty - qty;
            } else {
                System.out.println("Chocolates are not available.");
            }

        }
    }
    public void addStock(Product product) {
        if (product instanceof Chocolate) {
            chocolatesQty = chocolatesQty + 3;
        } else if (product instanceof SaltySnack) {
            saltySnacksQty = saltySnacksQty + 3;
        } else if (product instanceof SoftDrink) {
            softDrinkQty = softDrinkQty + 3;
        }
    }
    public void add(Product product, int qty){
        if (product instanceof SoftDrink) {
            if (softDrinkQty > 0) {
                System.out.println("SoftDrinks are available.");
                softDrinkQty = softDrinkQty + qty;
            } else {
                System.out.println("SoftDrinks are not available.");
            }
        } else if (product instanceof SaltySnack) {
            if (saltySnacksQty > 0) {
                System.out.println("Snacks are available");
                saltySnacksQty = saltySnacksQty + qty;
            } else {
                System.out.println("Snacks are not available.");
            }
        } else if (product instanceof Chocolate) {
            if (chocolatesQty > 0) {
                System.out.println("Chocolates are available.");
                chocolatesQty = chocolatesQty + qty;
            } else {
                System.out.println("Chocolates are not available.");
            }

        }
    }
    public int getStock(Product product) {
        if (product instanceof Chocolate) {
            return chocolatesQty;
        } else if (product instanceof SaltySnack) {
            return saltySnacksQty;
        } else if (product instanceof SoftDrink) {
            return softDrinkQty;
        }else {
            return 0;
        }
    }
    public static void main(String[] args){
        ExtendableVendingMachine evm = new ExtendableVendingMachine(2, 1,3);
        evm.buy(new SoftDrink());
        evm.buy(new SaltySnack());
        evm.buy(new Chocolate());
        System.out.println("The machine is running out of stock!");
    }
}

