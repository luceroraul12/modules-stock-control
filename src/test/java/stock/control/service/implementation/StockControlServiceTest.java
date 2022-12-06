package stock.control.service.implementation;

import org.junit.jupiter.api.Test;
import stock.control.entities.base.Product;
import stock.control.entities.base.Quantity;

import static org.junit.jupiter.api.Assertions.*;

class StockControlServiceTest {
    private final StockControlService service = new StockControlService();

    @Test
    void substractQuantityINTEGER() throws Exception {
        Quantity q = new Quantity(20);
        q.setIntegerOperate(10);

        service.substractQuantity(q);
        assertEquals(10, q.getInteger());
    }

    @Test
    void addQuantity() {
    }
}