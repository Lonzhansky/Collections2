
Class TreeSet<E> – набір сортованих об’єктів у вигляді дерева.
Зберігає свої елементи у червоно-чорному дереві, упорядковує
свої елементи з урахуванням їх значень.
https://docs.oracle.com/javase/8/docs/api/java/util/TreeSet.html
https://en.wikipedia.org/wiki/Red%E2%80%93black_tree

Class TreeSet - реалізація NavigableSet на основі TreeMap.
Елементи впорядковуються за допомогою їх природного порядку
або за допомогою компаратора, який надається під час створення,
залежно від того, який конструктор використовується.

Class TreeSet, серед інших, може імплементувати (реалізувати)
Interface Set<E>, Interface SortedSet<E>, Interface NavigableSet<E>.

Interface Comparator<T>
https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html
Функція порівняння, яка накладає загальне впорядкування на деяку колекцію
об’єктів.
Компаратори можна використовувати для керування порядком певних структур
даних (наприклад, SortedSet або SortedMap) або для забезпечення порядку
для колекцій об’єктів, які не мають природного порядку.

