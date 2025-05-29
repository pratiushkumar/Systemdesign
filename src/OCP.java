import java.util.ArrayList;

class Product3  {
    String name;
    double Price;

    Product3(String name,double Price) {
        this.name=name;
        this.Price=Price;
    }
}

class Shoppingcart1 {
    private ArrayList<Product3> Production =new ArrayList<>();
    void addProduct (Product3 p3) {
        Production.add(p3);
    }
    ArrayList<Product3> getProduction() {
        return Production;
    }

    double calculatetotal() {
        double total=0;
        for(Product3 p : Production) {
            total=total+p.Price;
        }
        return total;
    }
}
class ShoppincartInvoice{
    private Shoppingcart1 carting;

    ShoppincartInvoice(Shoppingcart1 carting) {
        this.carting=carting;
    }

    void invoicecalc() {
        System.out.println("the invoice of the customer");
        for(Product3 p: carting.getProduction()) {
            System.out.println(p.name + " - Rs " + p.Price);
        }
        System.out.println("Total: Rs " + carting.calculatetotal());
    }
}
class shoppingcartStorage {
    Shoppingcart1 cart1;

    shoppingcartStorage(Shoppingcart1 cart1) {
        this.cart1=cart1;
    }

    void sqldb() {
        System.out.println("saving the data inside sql database ");
    }
    void mongodb() {
        System.out.println("saving the data inside mongodb ");
    }

    void mysql() {
        System.out.println("saving the data inside mysql");
    }
}
public class OCP {
public static void main(String[] args) {
    Shoppingcart1 sc =new Shoppingcart1();
    sc.addProduct (new Product3("laptop",20000));

    Product3 p3 =new Product3("iphone",50000);
    sc.addProduct(p3);

    ShoppincartInvoice in =new ShoppincartInvoice(sc);
    in.invoicecalc();
    shoppingcartStorage store =new shoppingcartStorage(sc);
    store.mongodb();
}
}
