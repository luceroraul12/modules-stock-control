package stock.control.service.implementation;

import org.junit.jupiter.api.Test;
import stock.control.entities.base.Product;
import stock.control.entities.base.Quantity;
import stock.control.enums.KindOfQuantity;

import static org.junit.jupiter.api.Assertions.*;

class StockControlServiceTest {
    private final StockControlService service = new StockControlService();

    @Test
    void substractQuantityINTEGER() throws Exception {
        Quantity q = Quantity.builder()
                .quantityInteger(20)
                .quantityIntegerOperate(10)
                .kindOfQuantity(KindOfQuantity.UNIT)
                .build();

        service.substractQuantity(q);
        assertEquals(10, q.getQuantityInteger());
    }

    @Test
    void addQuantityINTEGER() throws Exception {
        Quantity q = Quantity.builder()
                .quantityInteger(20)
                .quantityIntegerOperate(10)
                .kindOfQuantity(KindOfQuantity.UNIT)
                .build();

        service.addQuantity(q);
        assertEquals(30, q.getQuantityInteger());
    }

    @Test
    void substractQuantityDOUBLE() throws Exception {
        Quantity q = Quantity.builder()
                .quantityDouble(20.34)
                .quantityDoubleOperate(10.24)
                .kindOfQuantity(KindOfQuantity.WHEIGHT)
                .build();

        service.substractQuantity(q);
        assertEquals(10.1, q.getQuantityDouble());
    }

    @Test
    void addQuantityDOUBLE() throws Exception {
        Quantity q = Quantity.builder()
                .quantityDouble(20.241)
                .quantityDoubleOperate(10.23)
                .kindOfQuantity(KindOfQuantity.WHEIGHT)
                .build();

        service.addQuantity(q);
        assertEquals(30.471, q.getQuantityDouble());
    }

    @Test
    void addQuantityThrowException() throws Exception {
        Quantity q = Quantity.builder()
                .quantityDouble(20.241)
                .quantityDoubleOperate(-1000.23)
                .kindOfQuantity(KindOfQuantity.WHEIGHT)
                .build();

        assertThrows(Exception.class, () -> service.addQuantity(q));
    }

    @Test
    void substractQuantityThrowException() throws Exception {
        Quantity q = Quantity.builder()
                .quantityDouble(20.241)
                .quantityDoubleOperate(1000.23)
                .kindOfQuantity(KindOfQuantity.WHEIGHT)
                .build();

        assertThrows(Exception.class, () -> service.substractQuantity(q));
    }
}