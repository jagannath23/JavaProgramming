package examples.products.models;

import java.util.ArrayList;

public class Compound extends Product implements Saleable {
    private String combo_name;
    private ArrayList<Product> children;
    private final Double COMPOUND_IVA = 0.2;

    public String getCombo_name() {
        return combo_name;
    }

    public void setComboName(String combo_name) {
        this.combo_name = combo_name;
    }

    public ArrayList<Product> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Product> children) {
        this.children = children;
    }

    @Override
    public void applyIVA() {
        setPrice(getPrice() * (1+COMPOUND_IVA));
        System.out.println("IVA applied");
    }

    @Override
    public void sell() {
        setStock(getStock()-1);
        System.out.println("Great! Purchased compound product");
    }
}
