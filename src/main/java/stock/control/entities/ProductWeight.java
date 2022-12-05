package stock.control.entities;

public class ProductWeight extends Product<Double>{
    @Override
    public boolean isSelleable(Double aDouble) {
        return false;
    }
}
