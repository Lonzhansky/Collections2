package lesson19.demos._1_sorting._02_insertion_sort;

public class InsertionSortB {

    public static void main(String[] args) {
        getOutput(insertionSort(getData()));
    }

    private static String[] getData() {
        return new String[]{"Plum", "Apple", "Orange",
                "Onion", "Grape"};
    }

    private static String[] insertionSort(String[] elements) {
        // Цикл сортування масиву починається з 2-ї позиції (i = 1).
        // Триває прохід за позиціями 1, 2, 3, 4, тобто до 5,
        // оскільки elements.length дорівнює 5
        for (int i = 1; i < elements.length; i++) {
            String key = elements[i];
            int j = i - 1;
            // Метод compareTo() порівнює об'єкт, що викликає,
            // з об'єктом, переданим як параметр, і повертає
            // в результаті виконання порівняння ціле число:
            // - позитивне, якщо об'єкт, що викликає, більше об'єкта,
            // переданого як параметр;
            // - негативне, якщо об'єкт, що викликає, менше об'єкта,
            // переданого як параметр;
            // - нуль, якщо об'єкти рівні.
            while (j >= 0 && (key.compareTo(elements[j]) < 0)) {
                // Заміна елементу
                elements[j + 1] = elements[j];
                j--;
            }
            // Призначення елементу значення
            // для порівняння
            elements[j + 1] = key;
        }
        return elements;
    }

    private static void getOutput(String[] elements) {
        for (String element : elements)
            System.out.println(element);
    }
}
