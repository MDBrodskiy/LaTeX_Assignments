/*
 *
 * Written by: Michael Brodskiy
 * Class: AP Computer Science A
 * Instructor: Mr. Davis
 *
 */

/**
 * This program is used to demonstrate the ProductArray and Product classes
 **/

public class ProductArrayDriver

{

    public static void main(String[] args)
    
    {

        ProductArray myStore = new ProductArray();

        myStore.addProduct("Pear", 0.99, true);
        myStore.addProduct("Apple", 1.99, true);
        myStore.addProduct("Watermelon", 6.49, true);
        myStore.addProduct("Kiwi", .49, true);
        myStore.addProduct("Lemon", .59, false);
        myStore.addProduct("Lime", .59, false);
        myStore.addProduct("Dragonfruit", 9.99, true);
        myStore.addProduct("Melon", 3.99, true);
        myStore.addProduct("Banana", .99, true);
        myStore.addProduct("Cherry", 1.99, false);

        System.out.println("Fruit Stand:");
        System.out.println(myStore);
        System.out.print("\n");
        System.out.println("Removing out of stock items: " + myStore.removeOutOfStockItems());
        System.out.println(myStore);

    }

}
