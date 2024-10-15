
Class TreeMap<K,V> - реалізація Interface NavigableMap на основі
червоно-чорного дерева.
Map сортується відповідно до природного порядку його ключів або
за допомогою компаратора, який надається під час створення Map,
залежно від того, який конструктор використовується.
Class TreeMap також може реалізовувати Interface SortedMap.
K - тип підтримуваних ключів.
V - тип зіставлених/відображених значень.
https://docs.oracle.com/javase/8/docs/api/java/util/TreeMap.html
https://en.wikipedia.org/wiki/Red%E2%80%93black_tree
https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html
https://en.wikipedia.org/wiki/Red%E2%80%93black_tree

Class TreeMap:
- Містить значення, що базуються на ключі.
- Містить лише унікальні елементи.
- Не може мати null ключ, але може мати кілька null значень.
- Несинхронізований. Кілька потоків можуть одночасно
модифікувати об'єкт.
- Підтримує зростаючий порядок вставки.

