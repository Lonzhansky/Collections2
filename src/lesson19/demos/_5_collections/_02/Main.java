package lesson19.demos._5_collections._02;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x = getSearchValue();
        DataRepository repository = new DataRepository();
        getOutput(repository.getData());
        DataHandler handler = new DataHandler();
        int index = handler.search(repository.getData(), x);
        getOutput(x, index);
    }

    // Отримаємо значення для пошуку
    private static int getSearchValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter int value to search: ");
        return scanner.nextInt();
    }

    // Виводимо первинні данні
    private static void getOutput(List<Integer> list) {
        System.out.print("Initial data: ");
        for (int element : list)
            System.out.print(element + " ");
    }

    // Виводимо результат пошуку
    private static void getOutput(int x, int index) {
        if (index == -1)
            System.out.print("\nValue is absent!");
        else
            System.out.print("\nValue " + x +
                    " is at index " + index);
    }
}
