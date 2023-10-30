import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App{

    Database database = new Database(new ArrayList<Product>());

    public App(){}

    public void runApp(){

        Integer choice = 1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0){
            System.out.println("MENU:");
            System.out.println("0 - KONIEC DZIALANIA PROGRAMU");
            System.out.println("1 - DODAWANIE PRODUKTOW");
            System.out.println("2 - POKAZ LISTE");
            System.out.println("Wybierz: ");
            choice = scanner.nextInt();

            switch (choice){
                case 0:
                    break;
                case 1:
                    addToArray();
                    break;
                case 2:
                    showAndSortArray();
                    break;
            }
        }
    }

    public void addToArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwe przedmiotu");
        String name = scanner.nextLine();
        System.out.println("Podaj cene");
        Float price = scanner.nextFloat();
        database.getProducts().add(new Product(name, price));
    }

    public void showAndSortArray(){

        System.out.println("Przed");
        for (Product product : database.getProducts())
            System.out.println(product.getName() + " " + product.getPrice());

        Collections.sort(database.getProducts());
        System.out.println("Po");
        for (Product product : database.getProducts())
            System.out.println(product.getName() + " " + product.getPrice());

    }
}
