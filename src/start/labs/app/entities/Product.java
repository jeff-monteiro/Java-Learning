package src.start.labs.app.entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

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
