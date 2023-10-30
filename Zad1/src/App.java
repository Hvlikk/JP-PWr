import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class App {

    private HashSet<Integer> hashSet = new HashSet<>();
    private TreeSet<Integer> treeSet = new TreeSet<>();
    public App(){}

        public void runApp() {

            Integer loop = 1;
            Scanner scanner = new Scanner(System.in);
            while (loop != 0) {

                System.out.println("Podaj liczbe");
                Integer pop = scanner.nextInt();
                hashSet.add(pop);
                treeSet.add(pop);

                System.out.print("Czy chcesz zakonczyc wpisywanie? (0/1)");
                loop = scanner.nextInt();
                scanner.nextLine();
            }

            System.out.println("HashSet:");
            Iterator it = hashSet.iterator();
            while (it.hasNext())
                System.out.println(it.next());

            it = treeSet.iterator();

            System.out.println("TreeSet:");
            while(it.hasNext())
                System.out.println(it.next());
        }

}