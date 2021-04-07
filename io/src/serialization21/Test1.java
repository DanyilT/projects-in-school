package serialization21;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test1 {
    public static void main(String[] args) {
        //Пример строки пути для запуска в Windows
        Path TestFilePath = Paths.get(".\\Test");

        System.out.println("Именем файла является = " + TestFilePath.getFileName());
        System.out.println("URI address файла является = " + TestFilePath.toUri());
        System.out.println("Абсолютный путь файла является = " + TestFilePath.toAbsolutePath());
        System.out.println("Нормализованый путь файла является = " + TestFilePath.normalize());

    }
}
