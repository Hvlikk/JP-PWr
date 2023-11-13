import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*
Wniosek => jedno jest sortowane po kluczu inne nie
 */

public class App {
    private Map<String, Integer> hashMap = new HashMap<>();
    private Map<String, Integer> treeMap = new TreeMap<>();

    public App(){}


    public void runApp() {

        Integer loop = 1;
        Scanner scanner = new Scanner(System.in);
        while (loop != 0) {

            System.out.println("Podaj nazwe miasta");
            String name = scanner.nextLine();
            System.out.println("Podaj liczbe ludnosci");
            Integer pop = scanner.nextInt();
            City city = new City(pop, name);
            hashMap.put(city.getName(), city.getPopulation());
            treeMap.put(city.getName(), city.getPopulation());

            System.out.print("Czy chcesz zakonczyc wpisywanie? (0/1)");
            loop = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("HashMap:");
        hashMap.forEach((key, value) -> {
            System.out.println(key + " :" + value);
        });

        System.out.println("TreeMap:");
        treeMap.forEach((key, value) -> {
            System.out.println(key + " :" + value);
        });
    }
}
