import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    // ArrayList chosen because:
    // Maintains insertion order
    // Allows fast index-based access (O(1))
    // Supports add/remove operations efficiently
    private List<String> cart = new ArrayList<>();

    public void addItem(String item) {
        cart.add(item);
        System.out.println("Added: " + item);
    }

    public void removeItem(int index) {
        if (index >= 0 && index < cart.size()) {
            System.out.println("Removed: " + cart.remove(index));
        } else {
            System.out.println("Invalid index!");
        }
    }

    public String getItem(int index) {
        if (index >= 0 && index < cart.size()) {
            return cart.get(index);
        }
        return "Invalid index";
    }

    public void displayCart() {
        System.out.println("\nCurrent Cart: " + cart);
    }

    public static void main(String[] args) {
        ShoppingCart c = new ShoppingCart();
        c.addItem("watermelon");
        c.addItem("Chips");
        c.addItem("Pepsi");
        c.addItem("Mug");
        c.addItem("towel");
        c.addItem("Charger");

        c.displayCart();
        c.removeItem(2);
        c.displayCart();

        System.out.println("Item at index 3: " + c.getItem(3));
    }
}
