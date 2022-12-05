package stock.control.entities;

public class ProductWeight extends Product<Double>{

    @Override
    public boolean isSelleable(Double quantity) {
        return this.kindOfQuantity > quantity;
    }
}
