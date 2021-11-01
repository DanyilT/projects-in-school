package _1_DirectotyStream;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        DirectoryStream<Path> stream = null;
        try {
            Path dir = Paths.get("C:/dataJAVA");
            stream = Files.newDirectoryStream(dir,"*.{java,txt,exe}");
            for (Path p : stream) {
                System.out.println(p.getFileName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            stream.close();
        }
    }
}
