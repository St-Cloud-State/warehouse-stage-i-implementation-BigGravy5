import java.util.*;
import java.io.*;

public class Warehouse implements Serializable{
    private static final long serialVersionUID = 1L;
    private ClientList clientList;

    public static Warehouse warehouse;
    private Warehouse(){
        clientList = ClientList.instance();
    }

    public static Warehouse instance() {
        if (warehouse == null) {
            ClientIdServer.instance();
            return (warehouse = new Warehouse());
        } else {
            return warehouse;
        }
    }
    
}