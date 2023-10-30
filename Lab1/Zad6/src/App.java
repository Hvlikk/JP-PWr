import javax.xml.crypto.Data;
import java.lang.reflect.Array;
import java.util.*;

public class App {

    Database database = new Database(new TreeMap<String, Integer>());

    public App(){}


    public void runApp(){

        Integer choice = 1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0){
            System.out.println("MENU:");
            System.out.println("0 - KONIEC DZIALANIA PROGRAMU");
            System.out.println("1 - DODAWANIE MIAST");
            System.out.println("2 - POSORTUJ LISTE i POKAZ LISTE");
            System.out.println("3 - POKAZ LISTE");
            System.out.println("Wybierz: ");
            choice = scanner.nextInt();

            switch (choice){
                case 0:
                    break;
                case 1:
                    addToMap();
                    break;
                case 2:
                    sortMap();
                    break;
                case 3:
                    showMap();
                    break;
            }
        }
    }


    public void addToMap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwe");
        String name = scanner.nextLine();
        System.out.println("Podaj populacje");
        Integer population = scanner.nextInt();
        City city = new City(name, population);

        database.getDatabase().put(city.getName(), city.getPopulation());
    }



    public void showMap(){

        for (Map.Entry<String, Integer> entry : database.getDatabase().entrySet())
            System.out.println("Name: " + entry.getKey() + " Population: " + entry.getValue());
    }

    public void sortMap(){
        Comparator
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return Integer.compare(o1.getValue(), o2.getValue());
            }
        };

        TreeMap<String, Integer> sortedMap = new TreeMap<>(comparator);
        sortedMap.putAll(sortedMap);
        //Comparator<Map.Entry<String, Integer>> populationComparator = new Comparator<Map.Entry<String, Integer>>() {

        //ArrayList<Map.Entry<String, Integer>> listOfCities = new ArrayList<>(database.getDatabase().entrySet());
        //listOfCities.sort(populationComparator);
        //database.getDatabase().clear();//
            // for (Map.Entry<String, Integer> entry : listOfCities)

        for (Map.Entry<String, Integer> entry : sortedMap.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
}
