package stock.control.entities.base;

import org.junit.jupiter.api.Test;
import stock.control.enums.KindOfQuantity;

import static org.junit.jupiter.api.Assertions.*;

class QuantityTest {

    @Test
     void withUNIt() {
        Quantity quantity = Quantity.builder()
                .quantityInteger(500)
                .kindOfQuantity(KindOfQuantity.UNIT)
                .build();

        assertTrue(quantity.isMinorOrEqualThanQuantityStocked(200));
        assertTrue(quantity.isMinorOrEqualThanQuantityStocked(500));
        assertFalse(quantity.isMinorOrEqualThanQuantityStocked(1230));
    }

    @Test
    void withWEIGHT() {
        Quantity quantity = Quantity.builder()
                .quantityDouble(200.0)
                .kindOfQuantity(KindOfQuantity.WHEIGHT)
                .build();

        assertTrue(quantity.isMinorOrEqualThanQuantityStocked(200.0));
        assertTrue(quantity.isMinorOrEqualThanQuantityStocked(50.0));
        assertFalse(quantity.isMinorOrEqualThanQuantityStocked(500.0));
        assertFalse(quantity.isMinorOrEqualThanQuantityStocked(252.34));
    }
}