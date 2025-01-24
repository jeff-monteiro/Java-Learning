package src.start.labs.app.entities;

public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product(){
    }

    // Constructor to set values during instantiation of the class.
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Overload applying a new Constructor with fewer parameters
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }
    // This GET method implementend without SET method protect my object
    public int getQuantity(){
        return quantity;
    }

    public double totalValueInStock(){
        double total = quantity * price;
        return total;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    // Override *toString* method in Object
    public String toString(){
        return name
                + " , $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
