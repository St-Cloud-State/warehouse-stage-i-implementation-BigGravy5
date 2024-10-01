import java.util.List;

public class Tester {
    // Test Client Class (Add Client)
    System.out.println("Test Client Class:");
    Client client1 = new Client("Benjamin Nelson", "100 Bower St", "123-456-7890");
    Client client2 = new Client("Rachel Mixon", "200 Bower St", "456-789-0123");
    Client client3 = new Client("Chris Low", "300 Bower St", "789-012-3456");

    // Test Product Class (Add Product)
    Product product1 = new Product("Iphone", 20, "1", 999.99);
    Product product2 = new Product("Imac", 30, "2", 1999.99);
    Product product3 = new Product("Iwatch", 10, "3", 499.99);

    // Test Wishlist Class (Add Product to Wishlist)
    client1.addProductToWishlist(product1, 2);
    client1.addProductToWishlist(product2, 3);

    client2.addProductToWishlist(product3, 5);


    // Instance of ClientList and Catalog
    ClientList clientList = ClientList.instance();
    Catalog catalog = Catalog.instance();

    // Insert Clients to ClientList
    clientList.insertClient(client1);
    clientList.insertClient(client2);
    clientList.insertClient(client3);

    // Insert Products to Catalog
    catalog.insertProduct(product1);
    catalog.insertProduct(product2);
    catalog.insertProduct(product3);

    // Display all Clients
    System.out.println("List of Clients: ")
    Iterator<Client> clients = clientList
}