package exception4;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //№1
        File file1 = new File("src/exceptions4/file1"); //путь к файлу
        System.out.println(file1.length());

        //№2
        File file2 = new File("src/exceptions4/file2"); //путь к файлу
        System.out.println(file2.length());
        try {
            file2.createNewFile();
        }catch (IOException ioe){}

        //№3
        File file3 = new File("src/exceptions4/file3");
        create(file3);

        //№4
        File file4 = new File("src/exceptions4/file4");
        try {
            createFile(file4);
        }catch (IOException ioe){
            System.out.println(ioe);
        }
    }

    //№3
    static void create(File file) throws IOException{
        try {
            createFile(file);
        }catch (IOException ioe) {
            System.out.println(ioe);
        }
    }
    static void createFile(File file)throws IOException{
        file.createNewFile();
    }
}
