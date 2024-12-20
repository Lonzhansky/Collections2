package lesson19.demos._2_searching._01_array_search;

import java.util.Arrays;
import java.util.Scanner;

/**
 ДУБЛІКАТИ У МАСИВІ.
 Для виявлення значення, що повторюється в масиві, потрібно порівняти
 кожен елемент масиву з усіма, що залишилися, у випадку
 збіги отримаємо дубльований елемент.
 Для цього використовуємо два цикли, де внутрішній
 цикл починається з i + 1 (де i - змінна зовнішнього циклу),
 щоб уникнути повторень у порівнянні.
 Результат: індекс дублікату.
 BUG: При повторному дублікаті може повторно видавати індекс дубліката.
*/

public class ArrayDuplicate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] myArray = new int[size];
        System.out.println("Enter array elements: ");

        for(int i = 0; i < size; i++) {
            myArray[i] = sc.nextInt();
        }

        System.out.println("Your array: " + Arrays.toString(myArray));
        System.out.println("Duplicate indexes: ");

        for(int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if(myArray[i] == myArray[j]) {
                    System.out.print(j);
                }
            }
        }
    }
}
