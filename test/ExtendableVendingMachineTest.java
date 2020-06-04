import Vending.Chocolate;
import ExtendableVendingMachine.ExtendableVendingMachine;
import Vending.OverloadedVendingMachine;
import Vending.SaltySnack;
import Vending.SoftDrink;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExtendableVendingMachineTest {



    @Test

    public void ExtendableVendingMachineShouldBuyMethod() {
        ExtendableVendingMachine evm = new ExtendableVendingMachine(4, 3, 2);
        evm.buy(new Chocolate());
        evm.buy(new SoftDrink());
        evm.buy(new SaltySnack());

        assertEquals(4, evm.getStock(new Chocolate()));
        assertEquals(4, evm.getStock(new SoftDrink()));
        assertEquals(4, evm.getStock(new SaltySnack()));

    }
    @Test
    public void ExtendableVendingMachineShouldGetMethod(){
        ExtendableVendingMachine evm = new ExtendableVendingMachine(7, 14,17);
        evm.getStock(new Chocolate ());
        evm.getStock(new SoftDrink ());
        evm.getStock(new SaltySnack ());

        assertEquals(4, evm.getStock(new Chocolate()));
        assertEquals(4, evm.getStock(new SoftDrink()));
        assertEquals(4, evm.getStock(new SaltySnack()));
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

