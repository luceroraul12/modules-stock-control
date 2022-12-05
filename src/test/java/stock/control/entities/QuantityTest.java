package stock.control.entities;

import org.junit.jupiter.api.Test;
import stock.control.enums.KindOfQuantity;

import static org.junit.jupiter.api.Assertions.*;

class QuantityTest {

    @Test
     void withUNIt() {
        Quantity quantity = new Quantity();
        quantity.setQuantity(500);
        quantity.setKindOfQuantity(KindOfQuantity.UNIT);

        assertTrue(quantity.isMinorOrEqualThanQuantityStocked(200));
        assertTrue(quantity.isMinorOrEqualThanQuantityStocked(500));
        assertFalse(quantity.isMinorOrEqualThanQuantityStocked(1230));
    }

    @Test
    void withWEIGHT() {
        Quantity quantity = new Quantity();
        quantity.setQuantity(252.34);
        quantity.setKindOfQuantity(KindOfQuantity.WHEIGHT);

        assertTrue(quantity.isMinorOrEqualThanQuantityStocked(200.0));
        assertFalse(quantity.isMinorOrEqualThanQuantityStocked(500.0));
        assertTrue(quantity.isMinorOrEqualThanQuantityStocked(252.34));
    }
}