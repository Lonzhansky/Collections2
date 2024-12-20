package lesson19.demos._5_collections._03;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x = getSearchValue();
        DataRepository repository = new DataRepository();
        List<Integer> list = repository.getData();
        getOutput(list, false);
        Collections.sort(list);
        getOutput(list, true);
        DataHandler handler = new DataHandler();
        int index = handler.search(list, x);
        getOutput(x, index);
    }

    // Отримаємо значення для пошуку
    private static int getSearchValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter int value to search: ");
        return scanner.nextInt();
    }

    // Метод виведення даних з урахуванням їх сортування
    private static void getOutput(List<Integer> list,
                                  boolean isSorted) {
        if (!isSorted) System.out.print("\nInitial data: ");
        else System.out.print("\nSorted data: ");
        for (int element : list)
            System.out.print(element + " ");
    }

    // Отримаємо результат пошуку
    private static void getOutput(int key, int index) {
        if (index == -1)
            System.out.println("\nElement not found");
        else
            System.out.println("\nElement " + key +
                    " found at index " + index);
    }
}
