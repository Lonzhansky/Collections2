package lesson19.demos._1_sorting._02_insertion_sort;

public class InsertionSortA {

    public static void main(String[] args) {
        String title = "Initial data:";
        getOutput(title, getData());
        title = "\nSorted data:";
        getOutput(title, insertionSort(getData()));
    }

    private static int[] getData() {
        return new int[]{4, 5, 21, 7, 2, 8, 13, 3, 11, 6};
    }

    private static int[] insertionSort(int[] elements) {
        for (int i = 1; i < elements.length; i++) {
            int key = elements[i];
            // Пошук розпочнеться з попереднього індексу
            // до індексу ключа
            int j = i - 1;
            // Пошук буде продовжуватися доти, доки не буде
            // знайдено елемент менший, ніж ключ
            while (j >= 0 && key < elements[j]) {
                elements[j + 1] = elements[j];
                j--;
            }
            // Після знаходження меншого елемента,
            // ключ у наступний індекс
            elements[j + 1] = key;
        }
        return elements;
    }

    private static void getOutput(String title, int[] elements) {
        System.out.println(title);
        for (int element : elements) {
            System.out.print(element + " ");
        }
    }
}
