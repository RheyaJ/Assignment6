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
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("watermelon");
        cart.addItem("Chips");
        cart.addItem("Pepsi");
        cart.addItem("Mug");
        cart.addItem("towel");
        cart.addItem("Charger");

        cart.displayCart();
        cart.removeItem(2);
        cart.displayCart();

        System.out.println("Item at index 3: " + cart.getItem(3));
    }
}
