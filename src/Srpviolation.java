import java.util.ArrayList;

//THIS IS THE PRODUCT CLASS THAT HAS ONE TO MANY RELATION WITH SHOPPING CART
class Product {
    public String Productname;
    public int Price;
    public int quantity;

    public Product(String Productname, int Price, int quantity) {
        this.Productname = Productname;
        this.Price = Price;
        this.quantity = quantity;
    }

    // Added toString() method for better display
    @Override
    public String toString() {
        return "Product: " + Productname + ", Price: $" + Price + ", Quantity: " + quantity;
    }
}

// SHOPPING CART CLASS
class ShoppingCart {
    private ArrayList<Product> Products;

    public ShoppingCart() {
        Products = new ArrayList<>();
    }

    // Fixed: Only add one product per call
    public void addProduct(String Productname, int Price, int quantity) {
        Product p = new Product(Productname, Price, quantity);
        Products.add(p);
        System.out.println("Added: " + p);
    }

    public ArrayList<Product> getall() {
        return Products;
    }

    public void displaycart() {
        System.out.println("=== Customer Cart ===");
        if (Products.isEmpty()) {
            System.out.println("Cart is empty!");
        } else {
            for (Product pro : Products) {
                System.out.println(pro);
            }
            System.out.println("Total items: " + Products.size());
        }
        System.out.println("==================");
    }

    // Added method to calculate total price
    public double getTotalPrice() {
        double total = 0;
        for (Product pro : Products) {
            total += pro.Price * pro.quantity;
        }
        return total;
    }
}

public class Srpviolation {
    public static void main(String[] args) {
        ShoppingCart sc = new ShoppingCart();

        System.out.println("Initial cart:");
        sc.displaycart();

        System.out.println("\nAdding products:");
        sc.addProduct("bat", 2000, 10);
        sc.addProduct("ball", 50, 10);

        System.out.println("\nFinal cart:");
        sc.displaycart();

        System.out.println("Total Price: $" + sc.getTotalPrice());

        // Fixed: Call getall() on the object, not the class
        ArrayList<Product> allProducts = sc.getall();
        System.out.println("\nNumber of products retrieved: " + allProducts.size());
    }
}