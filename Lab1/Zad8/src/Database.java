import javax.xml.crypto.Data;
import java.util.ArrayList;

public class Database {

    private ArrayList<Product> products = new ArrayList<>();

    public Database(ArrayList<Product> products){
        this.products = products;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}
