package examples.products.models;

public class Variant extends Product implements Saleable {
    private String details;
    private Product parent;
    private final Double VARIANT_IVA = 0.2;

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Product getParent() {
        return parent;
    }

    public void setParent(Product parent) {
        this.parent = parent;
    }

    @Override
    public void applyIVA() {
        setPrice(getPrice() * (1+VARIANT_IVA));
    }

    @Override
    public void sell() {
        setStock(getStock()-1);
        System.out.println("Great! Purchased variant product");
    }
}
