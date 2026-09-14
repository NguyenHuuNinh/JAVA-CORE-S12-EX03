package vn.edu.rikkei.session12.ex03;

public class ElectronicProduct extends Product {
    public ElectronicProduct(String id, String name, double originalPrice) {
        super(id, name, originalPrice);
    }
    @Override
    public double getDiscountedPrice() {
        return super.getOriginalPrice() * 0.95;
    }
}
