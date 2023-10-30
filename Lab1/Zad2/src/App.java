//Stwórz program, który dodaje, usuwa i modyfikuje elementy w dwóch listach typu ArrayList i LinkedList.
//Następnie zmierz czas wykonywania tych operacji i porównaj wyniki.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class App {

    private Integer move = 0;
    private ArrayList<Student> studentsArrayList = new ArrayList<>();
    private LinkedList<Student> studentLinkedList = new LinkedList<>();

    public App(){}

    public void runApp(){
        Integer choice = 1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0){
            System.out.println("MENU:");
            System.out.println("0 - KONIEC DZIALANIA PROGRAMU");
            System.out.println("1 - DODAWANIE ELEMENTOW");
            System.out.println("2 - USUWANIE ELEMENTOW");
            System.out.println("3 - MODYFIKOWANIE ELEMENTOW");
            System.out.println("4 - POKAZ TABLICE");
            System.out.println("Wybierz: ");
            choice = scanner.nextInt();

            switch (choice){
                case 0:
                    break;
                case 1:
                    addToArrays();
                    break;
                case 2:
                    subtractFromArrays();
                    break;
                case 3:
                    modifyArrays();
                    break;
                case 4:
                    showTabs();
                    break;
            }
        }
    }


    public void addToArrays(){
        System.out.println("Podaj ilosc elementow do dodania");
        Scanner scan = new Scanner(System.in);
        Integer elements = scan.nextInt();
        Random random = new Random();

        long startTime = System.nanoTime();
        for (int i = 0; i < elements; i++){
            studentsArrayList.add(new Student(i, random.nextInt(1500)));
        }
        long endTime = System.nanoTime();
        long durationArrayList = endTime - startTime;


        startTime = System.nanoTime();
        for (int i = 0; i < elements; i++){
            studentLinkedList.add(new Student(i, random.nextInt(1500)));
        }
        endTime = System.nanoTime();
        long durationLinkedList = endTime - startTime;

        System.out.println("Czas dodawania " + elements + " elementow:");
        System.out.println("ArrayList : " + durationArrayList + " nanosekund" );
        System.out.println("LinkedList : " + durationLinkedList + " nanosekund" );

    }

    public void subtractFromArrays(){
        System.out.println("Podaj ilosc elementow do usuniecia");
        Scanner scan = new Scanner(System.in);
        Integer elementsArrayList = scan.nextInt();
        Integer elementsLinkedList = elementsArrayList;
        Integer elementsInArray = studentsArrayList.size();


        long startTime = System.nanoTime();
        for (int i = studentsArrayList.size() - 1; elementsArrayList > 0;){
            studentsArrayList.remove(i);
            i--;
            elementsArrayList--;
        }
        long endTime = System.nanoTime();
        long durationArrayList = endTime - startTime;


        startTime = System.nanoTime();
        for (int i = studentLinkedList.size() - 1; elementsLinkedList > 0;){
            studentLinkedList.remove(i);
            elementsLinkedList--;
            i--;
        }
        endTime = System.nanoTime();
        long durationLinkedList = endTime - startTime;

        System.out.println("Czas usuwania " + elementsArrayList + " elementow:");
        System.out.println("ArrayList : " + durationArrayList + " nanosekund" );
        System.out.println("LinkedList : " + durationLinkedList + " nanosekund" );

    }

    public void modifyArrays(){

        System.out.println("Podaj ilosc elementow do modyfikacji");
        Scanner scan = new Scanner(System.in);
        Integer elements = scan.nextInt();

        long startTime = System.nanoTime();
        for (int i = 0; i < elements; i++){
            studentsArrayList.set(studentsArrayList.get(i).getIndexNumber(), new Student(i, 3000));
        }
        long endTime = System.nanoTime();
        long durationArrayList = endTime - startTime;


        startTime = System.nanoTime();
        for (int i = 0; i < elements; i++){
            studentLinkedList.set(studentLinkedList.get(i).getIndexNumber(), new Student(i, 3000));
        }
        endTime = System.nanoTime();
        long durationLinkedList = endTime - startTime;

        System.out.println("Czas modyfikacji " + elements + " elementow:");
        System.out.println("ArrayList : " + durationArrayList + " nanosekund" );
        System.out.println("LinkedList : " + durationLinkedList + " nanosekund" );



    }

    public void showTabs() {

        System.out.println("ArrayList:");
        for (int i = 0; i < studentsArrayList.size(); i++) {
            System.out.println(studentsArrayList.get(i).getIndexNumber() + " value: " + studentsArrayList.get(i).getNumber());
        }

        System.out.println("ArrayList:");
        for (int i = 0; i < studentLinkedList.size(); i++) {
            System.out.println(studentLinkedList.get(i).getIndexNumber() + " value: " + studentsArrayList.get(i).getNumber());
        }
    }
}
