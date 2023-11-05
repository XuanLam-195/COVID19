package Comparable;

public class Item {
    private String description;
    private double price;
    private boolean isPopular;

    public Item(String description, double price, boolean isPopular) {
        this.description = description;
        this.price = price;
        this.isPopular = isPopular;
    }

    public double getPrice() {
        return price;
    }

    public boolean isPopular() {
        return isPopular;
    }

    @Override
    public String toString() {
        return "price: " + price + "  --  " + "isPopular: " + isPopular+ "\n";
    }
}
