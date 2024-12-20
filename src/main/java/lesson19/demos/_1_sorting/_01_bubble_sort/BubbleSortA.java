package lesson19.demos._1_sorting._01_bubble_sort;


public class BubbleSortA {

    public static void main(String[] args) {

        int[] numbers = {4, 5, 21, 7, 2, 8, 13, 3, 11, 6};

        bubbleSort(numbers);

        for (int number : numbers)
            System.out.print(number + " ");
    }

    private static void bubbleSort(int[] numbers) {

        int n = numbers.length;
        int temp;
        int counter = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                counter++;
                if (numbers[j] > numbers[j + 1]) {
                    // swap (перестановка) елементів
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;

                }
            }
        }
        System.out.println(counter);
    }
}
