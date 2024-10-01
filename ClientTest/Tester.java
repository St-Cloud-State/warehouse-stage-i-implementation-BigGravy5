import java.util.*;

public class Tester {

    public static void main(String[] args) {
        // Create ClientList instance
        ClientList clientList = ClientList.instance();

        // Create some clients
        Client client1 = new Client("Brad", "143rd", "123-1234");
        Client client2 = new Client("Bob", "142nd", "123-1234");
        Client client3 = new Client("Bert", "144th", "123-1234");

        // Insert clients into the client list
        clientList.insertClient(client1);
        clientList.insertClient(client2);
        clientList.insertClient(client3);

        // Display all clients
        System.out.println("All Clients:");
        Iterator<Client> clientsIterator = clientList.getClients();
        while (clientsIterator.hasNext()) {
            Client client = clientsIterator.next();
            System.out.println(client);
        }

        // Search for a client by ID
        String searchId = client1.getId(); 
        System.out.println("\nSearching for client with ID: " + searchId);
        Client foundClient = clientList.search(searchId);

        if (foundClient != null) {
            System.out.println("Client found: " + foundClient);
        } else {
            System.out.println("Client not found.");
        }
    }
}