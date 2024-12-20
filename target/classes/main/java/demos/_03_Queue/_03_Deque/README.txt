
Interface Deque<E> - лінійна колекція, яка підтримує вставлення
та видалення елементів з обох кінців.
Назва deque є скороченням від "double ended queue"
(«двостороння черга»).
Е - тип елементів, що містяться в цій колекції.
https://docs.oracle.com/javase/8/docs/api/java/util/Deque.html

Крім базових операцій зі збору, Interface Deque забезпечує
додаткові операції вставки, вилучення та перевірки.

Interface Deque може використовуватися як
FIFO (first-in-first-out, "першим увійшов - першим вийшов"),
так і LIFO (last-in-first-out, "останнім увійшов - першим вийшов").

Всі нові елементи можуть бути вставлені, вилучені та видалені
з обох кінців.

Interface Deque може бути реалізованим через: Class LinkedList,
Class ArrayDeque.

Також реалізацію Interface Deque можна забезпечити через
Class LinkedBlockingDeque<E>, який є опціонально-обмеженою
блокувальною двокінцевою чергою на основі зв’язаних вузлів.
https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/LinkedBlockingDeque.html

Interface BlockingDeque<E> (блокувальна двокінцева черга) - Deque,
який додатково підтримує операції блокування, які очікують, поки
Deque стане непорожнім під час отримання елемента, і чекають, поки
звільниться простір у Deque під час зберігання елемента.


