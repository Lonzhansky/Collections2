
Метод binarySearch() класу Collections
повертає позицію об'єкта у відсортованому
списку.

https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#binarySearch-java.util.List-T-
https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#binarySearch-java.util.List-T-java.util.Comparator-
https://docs.oracle.com/javase/tutorial/collections/algorithms/index.html#searching


public static int binarySearch(List list, T key)
Повертає індекс ключа у списку, відсортованому
в порядку збільшення.

public static int binarySearch(List list, T key, Comparator c)
Повертає індекс ключа у списку, відсортованому в
порядку, що визначається компаратором (Comparator).

Якщо ключ відсутній, повертається (-(insertion point) - 1) .
Insertion point (точка вставки) визначається як точка,
у якій ключ буде внесено до списку.
