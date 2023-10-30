import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class App {

    Database persons = new Database(new ArrayList<Person>());

    public App(){}


    public void runApp(){

        Integer choice = 1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0){
            System.out.println("MENU:");
            System.out.println("0 - KONIEC DZIALANIA PROGRAMU");
            System.out.println("1 - DODAWANIE IMION");
            System.out.println("2 - POSORTUJ LISTE");
            System.out.println("3 - POKAZ LISTE");
            System.out.println("Wybierz: ");
            choice = scanner.nextInt();

            switch (choice){
                case 0:
                    break;
                case 1:
                    addToArray();
                    break;
                case 2:
                    sortArray();
                    break;
                case 3:
                    showArray();
                    break;
            }
        }
    }

    public void addToArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie");
        String name = scanner.nextLine();
        System.out.println("Podaj wiek");
        Integer age = scanner.nextInt();
        persons.getDatabase().add(new Person(name, age));
    }

    public void sortArray() {
        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        };

        persons.getDatabase().sort(comparator);
    }

    public void showArray(){
        for (Person person : persons.getDatabase()){
            System.out.println("Name : " + person.getName() + " Age: " + person.getAge());
        }

    }

}
