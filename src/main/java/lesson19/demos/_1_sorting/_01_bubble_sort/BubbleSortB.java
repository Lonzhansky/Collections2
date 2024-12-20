package lesson19.demos._1_sorting._01_bubble_sort;


public class BubbleSortB {

    public static void main(String[] args) {

        double[] numbers = {18.77, 19.99, 15.89, 74.55, 22.59, 8.89, 13.25, 3.99};

        bubbleSort(numbers);

        for (double number : numbers)
            System.out.print(number + " ");
    }


    public static void bubbleSort(double[] numbers) {

        int n = numbers.length;
        double temp;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (numbers[j - 1] > numbers[j]) {
                    // swap (перестановка) елементів
                    temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }

}
