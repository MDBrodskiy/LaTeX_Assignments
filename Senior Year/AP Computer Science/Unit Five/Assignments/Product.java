/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This class is used to work with a product
 **/

public class Product

{

    private String name;
    private double price;
    private boolean inStock;

    public Product(String name, double price, boolean inStock) {

        this.name = name;
        this.price = price;
        this.inStock = inStock;

    }

    public void setName(String name) {

        this.name = name;

    }

    public void setPrice(double price) {

        this.price = price;

    }

    public void setStock(boolean inStock) {

        this.inStock = inStock;

    }

    public String getName() {

        return this.name;

    }

    public double getPrice() {

        return this.price;

    }

    public boolean getStock() {

        return this.inStock;

    }

    public String toString() {

        String output = String.format("Product Name: %-20s Product Price: $%-20.2f Available: ", this.name, this.price); 

        output += (inStock) ? "Yes" : "No";

        return output;

    }

}
