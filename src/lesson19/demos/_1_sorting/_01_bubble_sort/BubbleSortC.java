package lesson19.demos._1_sorting._01_bubble_sort;

import java.util.Scanner;

public class BubbleSortC {

    public static void main(String[] args) {
        getOutput(getDataSorted(getData()));
    }

    private static int[] getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; ++i)
            arr[i] = sc.nextInt();
        sc.close();
        return arr;
    }

    private static int[] getDataSorted(int[] arr) {
        int n = arr.length;
        // Сортування у зростаючому порядку
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < (n - i - 1); ++j) {
                // Для сортування у спадному порядку,
                // змінюємо знак на <
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    private static void getOutput(int[] arr) {
        System.out.println("Array sorted: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
