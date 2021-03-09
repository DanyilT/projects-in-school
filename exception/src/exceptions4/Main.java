package exceptions4;

import java.io.*;

public class Main {
    public static void main(String[] args) {
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
        creat(file3);

        //№4
        File file4 = new File("src/exceptions4/file4");
        try {
            creatFile(file4);
        }catch (IOException ioe){
            System.out.println(ioe);
        }
    }

    //№3
    static void creat(File file){
        try {
            creatFile(file);
        }catch (IOException ioe) {
            System.out.println(ioe);
        }
    }
    static void creatFile(File file)throws IOException{
        file.createNewFile();
    }
}
