package serialization22;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test2 {
    public static void main(String[] args) {
        Path TestFilePath = Paths.get("O:/dany/my/test.txt");
        //Вывод информации о файле
        System.out.println("Вывод информации о файле");
        System.out.println("\t file name = " + TestFilePath.getFileName());
        System.out.println("\t root of the path = " + TestFilePath.getRoot());
        System.out.println("\t parent of the target = " + TestFilePath.getParent());
        //Вывод элементов пути
        System.out.println("Вывод элементов пути");
        for (Path element : TestFilePath) {
            System.out.println("\t pqth element = " + element);
        }
    }
}
