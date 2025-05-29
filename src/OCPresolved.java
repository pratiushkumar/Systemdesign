import java.util.ArrayList;

class Product4  {
    String name;
    double Price;

    Product4(String name,double Price) {
        this.name=name;
        this.Price=Price;
    }
}

class Shoppingcart4 {
    private ArrayList<Product4> Production =new ArrayList<>();
    void addProduct (Product4 p4) {
        Production.add(p4);
    }
    ArrayList<Product4> getProduction() {
        return Production;
    }

    double calculatetotal() {
        double total=0;
        for(Product4 p : Production) {
            total=total+p.Price;
        }
        return total;
    }
}
class BillingInvoice{
    private Shoppingcart4 carting;

    BillingInvoice(Shoppingcart4 carting) {
        this.carting=carting;
    }

    void invoicecalc() {
        System.out.println("the invoice of the customer");
        for(Product4 p: carting.getProduction()) {
            System.out.println(p.name + " - Rs " + p.Price);
        }
        System.out.println("Total: Rs " + carting.calculatetotal());
    }
}
interface Persistence {

   //abstarct method in java
     void save(Shoppingcart4 cart);

}

class Mongodb implements Persistence {

  @Override
  public  void save(Shoppingcart4 cart) {
        System.out.println("Saving the data in MongoDB database ");
    }
}
public class OCPresolved {
    public static void main(String[] args ) {
        Shoppingcart4 cart = new Shoppingcart4();
        cart.addProduct(new Product4("Laptop", 50000));
        cart.addProduct(new Product4("Mouse", 2000));

        BillingInvoice printer = new BillingInvoice(cart);
        printer.invoicecalc();

//        Persistence db    = new SQLPersistence();
        Persistence mongo = new Mongodb();
//        Persistence file  = new FilePersistence();

//        db.save(cart);    // Save to SQL database
        mongo.save(cart); // Save to MongoDB
//        file.save(cart);  // Save to File
    }
}
