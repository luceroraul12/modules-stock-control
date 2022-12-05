package stock.control.entities;

public class ProductUnit extends Product<Integer>{
    @Override
    public boolean isSelleable(Integer quantity) {
        return this.kindOfQuantity > quantity;
    }
}
