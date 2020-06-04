import Vending.Chocolate;
import Vending.OverloadedVendingMachine;
import Vending.SaltySnack;
import Vending.SoftDrink;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {

    @Test

    public void OverloadedVendingMachineShouldBuyMethod() {
        OverloadedVendingMachine ovm = new OverloadedVendingMachine(4, 3, 2);
        ovm.buy(new Chocolate());
        ovm.buy(new SoftDrink());
        ovm.buy(new SaltySnack());

        assertEquals(4, ovm.getStock(new Chocolate()));
        assertEquals(4, ovm.getStock(new SoftDrink()));
        assertEquals(4, ovm.getStock(new SaltySnack()));

    }

    @Test
    public void OverloadedVendingMachineShouldGetMethod() {
        OverloadedVendingMachine ovm = new OverloadedVendingMachine(7, 14, 17);
        ovm.getStock(new Chocolate());
        ovm.getStock(new SoftDrink());
        ovm.getStock(new SaltySnack());

        assertEquals(4, ovm.getStock(new Chocolate()));
        assertEquals(4, ovm.getStock(new SoftDrink()));
        assertEquals(4, ovm.getStock(new SaltySnack()));
    }

    @Test
    public void OverloadedVendingMachineShouldAddMethod() {
        OverloadedVendingMachine ovm = new OverloadedVendingMachine(10, 10, 10);
        ovm.addStock(new Chocolate());
        ovm.addStock(new SoftDrink());
        ovm.addStock(new SaltySnack());

        assertEquals(4, ovm.getStock(new Chocolate()));
        assertEquals(4, ovm.getStock(new SoftDrink()));
        assertEquals(4, ovm.getStock(new SaltySnack()));


    }
}

