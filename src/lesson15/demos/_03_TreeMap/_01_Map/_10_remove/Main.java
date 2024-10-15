package lesson15.demos._03_TreeMap._01_Map._10_remove;

import java.util.Map;
import java.util.TreeMap;

// Метод remove(Object key) видаляє зіставлення
// для вказаного ключа з Map, якщо воно є.
// Повертає попереднє значення, пов’язане з ключем,
// або значення null, якщо для ключа не було відображення.
//
// Метод remove(Object key, Object value) видаляє запис
// для вказаного ключа, лише якщо він наразі зіставлений
// із вказаним значенням.
// Повертає true, якщо значення було видалено.
public class Main {

    public static void main(String[] args) {
        // Створюємо Map
        Map<String, String> map = new TreeMap<>();
        // Додаємо елементи
        map.put("abc1", "orange");
        map.put("dvc3", "apricot");
        map.put("sat2", "pepper");
        map.put("est8", null); // <- null значення
        // Виведення елементів
        System.out.println("1) Data: " + map);

        // Намагаємося видалити значення для неіснуючого ключа
        map.remove("syo5");
        // Виведення елементів. Без змін.
        System.out.println("2) Data: " + map);

        // Намагаємося видалити значення для існуючого ключа
        map.remove("dvc3");
        // Виведення елементів. Є зміни.
        System.out.println("3) Data: " + map);

        // Намагаємося видалити значення для існуючого ключа,
        // який зіставлено зі значенням null
        map.remove("est8");
        // Виведення елементів. Є зміни.
        System.out.println("4) Data: " + map);

        // Намагаємося видалити значення для існуючого ключа,
        // який зіставлено не з відповідним йому значенням.
        map.remove("abc1", "kiwi");
        // Виведення елементів. Без змін.
        System.out.println("5) Data: " + map);

        // Намагаємося видалити значення для існуючого ключа,
        // який зіставлено з відповідним йому значенням.
        map.remove("abc1", "orange");
        // Виведення елементів. Є зміни.
        System.out.println("6) Data: " + map);
    }
}
