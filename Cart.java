import java.util.ArrayList;
public class Cart{
  //list to store products
  private ArrayList<Product> products ;

  public Cart(){
    products = new Arraylist<>();
  }
  public void addProduct(Product product){
    products.add(product);
    System.out.println(poduct.getName()+ "Added to cart")
  }
  public void removeProduct(Product product){
    products.remove(product);
    System.out.println(product.getName()+"removed from cart");
  }
  public void displayCart(){
    if (products.isEmpty()){
      System.out.println("Cart is empty!!!");
      return; // early exitas it stops the method right here
    }
    System.out.println("Products in cart:");
    for(Product product : products){
      System.out.println(product.getName()+"-P"+ product.getPrice());
    }
  public double CalculateTotal(){
    double total = 0;
    for(Product product: products){
      total+= product.getPrice();
    }
    return total;
  }
  }
