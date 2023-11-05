package Comparable;

import javax.print.attribute.standard.OrientationRequested;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Blue Skinny Jeans", 1500, true));
        items.add(new Item("Black original Chinos", 1200, false));
        items.add(new Item("withe T-Shirt", 500, true));
        items.add(new Item("Adidas Shoes", 800, false));

        Collections.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item item1, Item item2) {
                return Double.compare(item2.getPrice(), item1.getPrice());
            }
        });
        System.out.println("Sort after price (fall):");
        for(Item item : items){
            System.out.println(item);

        }
        Collections.sort(items, new Comparator<Item>() {

            @Override
            public int compare(Item item1, Item item2) {
                if (item1.isPopular() == item2.isPopular()) {
                    return Double.compare((item1.getPrice()), item2.getPrice());
                } else {
                    return Boolean.compare(item2.isPopular(), item1.isPopular());
                }
            }
        });
        System.out.println("\nSort efter popularity and thereafter price");
        for(Item item : items){
            System.out.println(item);
        }
    }
}
