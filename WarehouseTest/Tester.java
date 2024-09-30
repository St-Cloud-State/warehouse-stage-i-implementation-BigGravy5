import java.util.*;

public class Tester {

    public static void main(String[] args) {
        // Create ClientList instance
        ClientList clientList = ClientList.instance();

        // Create some clients
        Client client1 = new Client("Alice", "123 Elm St", "555-1234");
        Client client2 = new Client("Bob", "456 Oak St", "555-5678");
        Client client3 = new Client("Charlie", "789 Pine St", "555-9876");

        // Insert clients into the client list
        clientList.insertClient(client1);
        clientList.insertClient(client2);
        clientList.insertClient(client3);

        // Display all clients
        System.out.println("All Clients:");
        for (Client client : clientList.getClients()) {
            System.out.println(client);
        }

        // Search for a client by ID
        String searchId = client1.getId();  // You can use any valid client ID here
        System.out.println("\nSearching for client with ID: " + searchId);
        Client foundClient = clientList.search(searchId);

        if (foundClient != null) {
            System.out.println("Client found: " + foundClient);
        } else {
            System.out.println("Client not found.");
        }
    }
}