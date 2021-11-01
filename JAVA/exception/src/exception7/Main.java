package exception7;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

    }
}

class Parent{
    void create(File file) {//throws IOException {
        //file.createNewFile();
        System.out.println(file.length());
    }
}
class Children extends Parent{
    void create(File file) {
        super.create(file);
        System.out.println(file.length());
        try {
            file.createNewFile();
        }catch (IOException ioe){}
    }
}