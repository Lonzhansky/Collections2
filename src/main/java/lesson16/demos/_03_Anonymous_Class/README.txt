
Анонімний клас - внутрішній клас без імені, тобто
можемо одночасно оголошувати та створювати екземпляр
класу.

Лямбда-вираз – коротка форма для написання анонімного
класу. Можемо оголошувати методи без імені.

Лямбда-вирази НЕ анонімні внутрішні класи.

Лямбда-вирази в Java ЗАМІНЯЮТЬ багато поширених
способів використання анонімних внутрішніх класів.
Виходить набагато компактніший, читаємий та
очевидний код.


Анонімний клас vs Лямбда-вирази
-------------------------------------
Анонімний об'єкт класу створює окремий файл класу після
компіляції, лямбда-вираз перетворюється на private метод.
Лямбда-вираз використовує інструкцію invokedynamic байт-коду
для динамічного зв'язування цього методу, що економить час і
пам'ять.

* Invoke Dynamic (також відомий як indy) призначений для
покращення підтримки JVM для мов з динамічною типізацією.
Додана в Java 7 інструкція invokedynamic дозволяє
динамічно вирішувати виклики методів під час виконання.
Для лямбда-виразів ця інструкція використовується для затримки
переведення лямбда-виразу в байт-код до часу виконання.

Використовуємо ключове слово this для представлення поточного
класу у лямбда-виразі, тоді як у разі анонімного класу ключове
слово this може представляти цей конкретний анонімний клас.

Анонімні класи можуть використовуватися у разі більш ніж одного
абстрактного методу, в той час як лямбда-вираз спеціально
використовується для функціональних інтерфейсів.
Функціональний інтерфейс має лише один абстрактний метод.

Потрібно надати тіло функції лише у лямбда-виразі,
тоді як у разі анонімного класу нам потрібно написати
надмірне визначення класу.


РЕСУРСИ
https://www.baeldung.com/java-anonymous-classes
https://www.baeldung.com/java-invoke-dynamic
