package lesson16.demos._05_pkg_JUF._07_BiPredicate;

import lesson16.utils.Constants;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;

// Тут, метод, який приймає BiPredicate
// як аргумент методу.
// Метод перевіряє, чи є файл за наданим шляхом
// звичайним файлом або каталогом.
public class Main02 {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get(Constants.BASE_PATH + "abc/");
        System.out.println("1) Result is " + isFile(path,
                (p, fileAttributes) ->
                        fileAttributes.isRegularFile()));

        path = Paths.get(Constants.BASE_PATH + "abc/info.txt");
        System.out.println("2) Result is " + isFile(path,
                (p, fileAttributes) ->
                        fileAttributes.isRegularFile()));
    }

    private static boolean isFile(Path path, BiPredicate<Path,
            BasicFileAttributes> matcher) throws IOException {
        return matcher.test(path, Files.readAttributes(path,
                BasicFileAttributes.class));
    }
}
