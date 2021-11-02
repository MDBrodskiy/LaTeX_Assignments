/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This class is used to work with an array of Product objects
 **/

public class ProductArray

{

    private Product[] stockItems;

    public ProductArray() {

        stockItems = new Product[0];

    }

    public String toString() {

        String allProducts = "";

        for (Product item : stockItems) {

            allProducts += item.toString() + "\n";

        }

        return allProducts;

    }

    public void addProduct(String name, double price, boolean inStock) {

        Product[] swap = new Product[stockItems.length + 1];

        for (int i = 0; i < stockItems.length; i++) {

            swap[i] = new Product(stockItems[i].getName(), stockItems[i].getPrice(), stockItems[i].getStock());

        }

        swap[stockItems.length] = new Product(name, price, inStock);

        stockItems = new Product[swap.length];

        for (int i = 0; i < stockItems.length; i++) {

            stockItems[i] = new Product(swap[i].getName(), swap[i].getPrice(), swap[i].getStock());

        }

    }

    public boolean findByName(String search) {

        String allProducts = toString();

        return (allProducts.contains(search)) ? true : false;

    }

    public ProductArray findByPrice(double price) {

        ProductArray pricesFound = new ProductArray();

        for (int i = 0; i < stockItems.length; i++) {

            if (price >= stockItems[i].getPrice() && stockItems[i].getStock()) {

                pricesFound.addProduct(stockItems[i].getName(), stockItems[i].getPrice(), stockItems[i].getStock());

            }

        }
        
        return pricesFound;

    }

    public int firstOutOfStockItem() {

        for (int i = 0; i < stockItems.length; i++) {

            if (!stockItems[i].getStock()) {

                return i;

            }

        }

        return -1;

    }

    public boolean removeOutOfStockItems() {
        
        int counter = 0;

        while (firstOutOfStockItem() != -1) {

            Product[] tmp1 = new Product[firstOutOfStockItem()];
            Product[] tmp2 = new Product[stockItems.length - firstOutOfStockItem() - 1];

            for (int i = 0; i < firstOutOfStockItem(); i++) {

                tmp1[i] = new Product(stockItems[i].getName(), stockItems[i].getPrice(), stockItems[i].getStock());

            }

            for (int i = firstOutOfStockItem() + 1; i < stockItems.length; i++) {

                tmp2[i - (firstOutOfStockItem() + 1)] = new Product(stockItems[i].getName(), stockItems[i].getPrice(), stockItems[i].getStock());

            }

            stockItems = new Product[tmp1.length + tmp2.length];

            for (int i = 0; i < (tmp1.length + tmp2.length); i++) {

                if (i < tmp1.length) stockItems[i] = new Product(tmp1[i].getName(), tmp1[i].getPrice(), tmp1[i].getStock());
                else stockItems[i] = new Product(tmp2[i - tmp1.length].getName(), tmp2[i - tmp1.length].getPrice(), tmp2[i - tmp1.length].getStock());

            }

            counter++;

        }

        if (counter != 0) return true;

        return false;

    }

}
