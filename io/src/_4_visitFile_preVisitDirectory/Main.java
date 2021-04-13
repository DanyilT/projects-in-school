package _4_visitFile_preVisitDirectory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path pathSource = Paths.get("C:/dataJAVA"); //то что копируется
        Path pathDestination = Paths.get("C:/dataJAVA"); //то куда копируется
        try {
            Files.walkFileTree(pathSource, new MyFileCopyVisitor(pathSource, pathDestination));
            System.out.println("Files copied successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
