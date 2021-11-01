package _5_PafhMatcher;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path startPath = Paths.get("C:/dataJAVA");
//Строка с glob-шаблоном  
        String pattern = "glob:*.java";
//Строка с regex-шаблоном  
//String pattern = "regex:\\S+\\.java"; 
        try {
            Files.walkFileTree(startPath, new MyFileFindVisitor(pattern));
            System.out.println("File search completed!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}