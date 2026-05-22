public class Product{
  
  private String id;
  private String name;
  private double price;
  private int Stock;
  
  public Product( String id, String name, double price, int stock){
    this.id = id;
    this.name = name;
    this. price = price;
    this.stock = stock;
  }
  public String getName(){
    return name;
  }
  public string getId(){
    return id;
  }
  public double getPrice(){
    return price;
  }
  public int getStock(){
    return stock;
  }
  public void setStock(){
    this.stock= stock;
  }
    public void displayProduct(){
      System.out.println("ID:" + id +"Name:" + name + "Price"+ price);
    }
}
