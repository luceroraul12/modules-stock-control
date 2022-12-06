package stock.control.service.implementation;

import org.junit.jupiter.api.Test;
import stock.control.entities.base.Product;
import stock.control.entities.base.Quantity;

import static org.junit.jupiter.api.Assertions.*;

class StockControlServiceTest {
    private final StockControlService service = new StockControlService();

    @Test
    void substractQuantityINTEGER() throws Exception {
        Product p = new Product();
        Quantity q = new Quantity(20);
        q.setIntegerOperate(10);

        p.setQuantity(q);

        service.substractQuantity(p);
        assertEquals(10, p.getQuantity().getInteger());
    }

    @Test
    void addQuantity() {
    }
}