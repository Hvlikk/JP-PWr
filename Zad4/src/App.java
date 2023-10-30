import javax.xml.crypto.Data;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class App {


    Database productDatabase = new Database(new HashSet<Product>());
    public App(){}

    public void runApp(){

        Integer choice = 1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0){
            System.out.println("MENU:");
            System.out.println("0 - KONIEC DZIALANIA PROGRAMU");
            System.out.println("1 - DODAWANIE PRODUKTOW");
            System.out.println("2 - POKAZ HASHMAPE");
            System.out.println("Wybierz: ");
            choice = scanner.nextInt();

            switch (choice){
                case 0:
                    break;
                case 1:
                    addToHashMap();
                    break;
                case 2:
                    showHashMap();
                    break;
            }
        }
    }

    public void addToHashMap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ID");
        Integer id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj nazwe");
        String name = scanner.nextLine();
        System.out.println("Podaj cene");
        Float price = scanner.nextFloat();

        productDatabase.getDatabase().add(new Product(id, name, price));
    }


    public void showHashMap(){

        Iterator<Product> it = productDatabase.getDatabase().iterator();

        while(it.hasNext()){
            Product product = it.next();
            System.out.println("ID: " + product.getID());
            System.out.println("Name: " + product.getName());
            System.out.println("Price: " + product.getPrice());
        }
    }

}
