package demos._01_List._01_ArrayList.list_iterating;

import java.util.ArrayList;
import java.util.List;

// Ітерація (перебирання) елементів списку
public class Main02 {

    public static void main(String[] args) {

        // Створення List через конструктор ArrayList
        List<Integer> list = new ArrayList<>();
        // Додавання Integer елементів до List
        list.add(25);
        list.add(17);
        list.add(98);
        list.add(25); // <- Дублікат дозволено
        list.add(5);

        // Виведення елементів через цикл for.
        // Метод size() повертає кількість елементів
        // у списку.
        // Метод get() повертає елемент у вказаній
        // позиції (індексі) в списку.
        System.out.println("\nA. Data:");
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));

        // Виведення елементів через цикл for-each
        System.out.println("\nB. Data:");
        for (Integer item : list)
            System.out.println(item);

        // Виведення елементів через цикл for-each,
        // з нумерацією елементів
        int count = 0; // <- Лічильник
        System.out.println("\nC. Data:");
        for (Integer item : list) {
            count++;
            System.out.println(count + ") value is " + item);
        }

        // Метод forEach(Consumer<? super E> action)
        // виконує задану дію для кожного елемента списку,
        // доки всі елементи не будуть оброблені або дія
        // не викличе виняткову ситуацію.
        // Тут - виведення всіх елементів списку.
        System.out.println("\nD. Data:");
        list.forEach(
                // Лямбда-вираз, який стосується галузі
                // функціонального програмування (розглядається окремо).
                item -> System.out.println("Item is " + item)
        );

    }
}
