package AtributsFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;

public class Main {
    public static void main(String[] args) throws IOException {
        File f1 = new File("src/AtributsFile/file1");
        File f2 = new File("src/AtributsFile/file2");

        try {
            f1.createNewFile();
            f2.createNewFile();
        } catch (IOException e) {}

        FileWriter fw1 = new FileWriter(f1,true);
        PrintWriter pw1 = new PrintWriter(fw1);
        pw1.println("Task");
        pw1.println("Complete");
        FileWriter fw2 = new FileWriter(f2,true);
        PrintWriter pw2 = new PrintWriter(fw2);
        pw2.println("Now");
        pw2.println("April");
        pw1.flush();
        pw2.flush();
        pw1.close();
        pw2.close();
        System.out.println(f1.length());
        System.out.println(f2.length());

        //f1
        String a1 = f1.getAbsolutePath();
        Path p1 = Paths.get(a1);
        System.out.println(a1);

        BasicFileAttributes bfa1 = Files.readAttributes(p1, BasicFileAttributes.class);
        System.out.println(bfa1.creationTime());
        System.out.println(bfa1.isDirectory());
        System.out.println(bfa1.isRegularFile());

        DosFileAttributes dfa1 = Files.readAttributes(p1, DosFileAttributes.class);
        System.out.println(dfa1.isHidden());

        //f2
        String a2 = f2.getAbsolutePath();
        Path p2 = Paths.get(a2);
        System.out.println(a2);

        BasicFileAttributes bfa2 = Files.readAttributes(p2, BasicFileAttributes.class);
        System.out.println(bfa2.isOther());
        System.out.println(bfa2.getClass());
        System.out.println(bfa2.hashCode());

        DosFileAttributes dfa2 = Files.readAttributes(p2, DosFileAttributes.class);
        System.out.println(dfa2.isReadOnly());
    }
}
