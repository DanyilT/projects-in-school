package PR_file_sys_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("src/PR_file_sys_1/file");
        FileInputStream fileInputStream = null;
        int c = 0;
        int counter = 0;
        fileInputStream = new FileInputStream(file);
        while ((c = fileInputStream.read()) != -1) {
            System.out.print((char) c);
            if (c == 'k') {
                counter++;
            }
        }
        System.out.println();
        System.out.println(counter + " - letters 'k'");
        fileInputStream.close();
    }
}
