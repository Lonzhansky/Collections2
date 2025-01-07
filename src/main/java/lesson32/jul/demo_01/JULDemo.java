package lesson32.jul.demo_01;

import java.io.IOException;
import java.util.logging.*;

public class JULDemo {
    // Створення логера для класу JULDemo
    private static final Logger logger = Logger.getLogger(JULDemo.class.getName());

    public static void main(String[] args) {
        try {
            // Налаштування логера
            setupLogger();
        } catch (IOException e) {
            // Вивід повідомлення про помилку налаштування логера
            System.err.println("Failed to setup logger: " + e.getMessage());
            return;
        }

        // Генерація повідомлень різних рівнів
        logger.severe("This is a SEVERE level log message."); // Критична помилка
        logger.warning("This is a WARNING level log message."); // Попередження
        logger.info("This is an INFO level log message."); // Інформація
        logger.config("This is a CONFIG level log message."); // Конфігураційне повідомлення
        logger.fine("This is a FINE level log message."); // Детальний лог
        logger.finer("This is a FINER level log message."); // Більш детальний лог
        logger.finest("This is a FINEST level log message."); // Найдетальніший лог
    }

    private static void setupLogger() throws IOException {
        // Вимкнення стандартних обробників, щоб уникнути дублювання логів
        logger.setUseParentHandlers(false);

        // Створення обробника для виводу в консоль
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL); // Встановлення рівня логів для обробника
        consoleHandler.setFormatter(new SimpleFormatter()); // Простий формат логів

        // Створення обробника для запису у файл
        FileHandler fileHandler = new FileHandler("jul_demo.log", false); // Логи додаються у файл
        fileHandler.setLevel(Level.WARNING); // Встановлення рівня логів для файлу
        fileHandler.setFormatter(new SimpleFormatter()); // Простий формат логів

        // Додавання обробників до логера
        logger.addHandler(consoleHandler);
        logger.addHandler(fileHandler);

        // Встановлення рівня логів для логера
        logger.setLevel(Level.ALL);
    }
}
