
Використовуючи Java Reflection API, можемо отримати
інформацію про методи класу і навіть викликати
методи під час виконання.

В Java Reflection API, клас java.lang.reflect.Method
має методи доступу до типу поля, модифікатору
поля і налаштування, а також для отримання значень поля.
https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Method.html

Можна викликати метод класу під час виконання
через метод invoke() класу Method.

Для отримання екземпляра класу Method,
використовуємо java.lang.Class, оскільки цей
клас є точкою входу для всіх операцій
рефлексии.
https://docs.oracle.com/javase/8/docs/api/java/lang/Class.html

