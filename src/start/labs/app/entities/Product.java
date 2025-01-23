package src.start.labs.app.entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    // Constructor to set values during instantiation of the class.
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
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
