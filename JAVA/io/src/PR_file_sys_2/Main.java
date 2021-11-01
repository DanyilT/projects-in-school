package PR_file_sys_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file1 = new File("src/PR_file_sys_2/file1");
        File file2 = new File("src/PR_file_sys_2/file2");
        FileInputStream fileInputStream1 = new FileInputStream(file1);
        FileInputStream fileInputStream2 = new FileInputStream(file2);
        boolean identical = true;
        while(true) {
            int a = fileInputStream1.read(), b = fileInputStream2.read();
            if (a != b) {
                identical = false;
                break;
            }
            if (a == -1 && b == -1) break;
        }
        System.out.println(identical);
        fileInputStream1.close();
        fileInputStream2.close();
    }
}
