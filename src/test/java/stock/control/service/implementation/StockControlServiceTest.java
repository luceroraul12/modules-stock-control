package stock.control.service.implementation;

import org.junit.jupiter.api.Test;
import stock.control.entities.base.Product;
import stock.control.entities.base.Quantity;

import static org.junit.jupiter.api.Assertions.*;

class StockControlServiceTest {
    private final StockControlService service = new StockControlService();

    @Test
    void substractQuantityINTEGER() throws Exception {
        Quantity q = Quantity.builder()
                .quantityInteger(20)
                .quantityIntegerOperate(10)
                .build();

        service.substractQuantity(q);
        assertEquals(10, q.getQuantityInteger());
    }

    @Test
    void addQuantity() {
    }
}