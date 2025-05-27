import java.util.ArrayList;

//THIS IS THE PRODUCT CLASSS THAT HAS ONE TO MANY RELATION WITH SHOPPING CART
class Product {
     public String Productname;
     public int Price;
     public int quantity;

     public Product(String Productname,int Price,int quantity) {
         this.Productname=Productname;
         this.Price=Price;
         this.quantity=quantity;
     }
 }

 // SHOPPING CLASS
class ShoppingCart {
    private ArrayList<Product>Products;

    public ShoppingCart() {
        Products=new ArrayList<>();
    }
    public void addProduct(String Productname,int Price,int quantiy) {
        Product p= new Product("bat",5000,10);
        Product p2 =new Product("ball",200,10);
        Products.add(p);
        Products.add(p2);

    }

//    public boolean discardProduct() {
//         Product p3=new Product();

     public ArrayList<Product> getall() {
        return Products;
     }

     public void  displaycart() {
System.out.println("this is the customer art ");
System.out.println();
     }
    }

public class Srpviolation {
public static void main(String[] args) {


    ShoppingCart sc =new ShoppingCart();
    sc.displaycart();
      }
   }


