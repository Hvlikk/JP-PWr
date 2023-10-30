import javax.xml.crypto.Data;
import java.util.HashSet;
import java.util.Scanner;

public class App {


    Database booksData = new Database(new HashSet<Book>());
    public App(){}

    public void runApp(){

        Integer choice = 1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0){
            System.out.println("MENU:");
            System.out.println("0 - KONIEC DZIALANIA PROGRAMU");
            System.out.println("1 - DODAWANIE KSIAZEK");
            System.out.println("2 - POKAZ LISTE");
            System.out.println("Wybierz: ");
            choice = scanner.nextInt();

            switch (choice){
                case 0:
                    break;
                case 1:
                    addToHashSet();
                    break;
                case 2:
                    showHashSet();
                    break;
            }
        }
    }

    public void addToHashSet(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj numer ISBN");
        Integer ISBNnumber = scanner.nextInt();
        System.out.println("Podaj tytul");
        scanner.nextLine(); //clear of buffer
        String title = scanner.nextLine();
        System.out.println("Podaj imie autora");
        String authorName = scanner.nextLine();
        System.out.println("Podaj nazwisko autora");
        String authorSurname = scanner.nextLine();
        booksData.getDatabase().add(new Book(ISBNnumber, title, authorName, authorSurname));
    }

    public void showHashSet(){
        for (Book book : booksData.getDatabase())
            System.out.println("ISBN: " + book.getISBNnumber() + " Title: " + book.getTitle() + " Author name: " + book.getAuthorName() + " Author surname: " + book.getAuthorSurname());
    }

}
