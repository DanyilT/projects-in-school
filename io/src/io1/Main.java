package io1;

import java.io.*;


public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("src/io1/file");
        //FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String temp = null;
        while ((temp = bufferedReader.readLine()) != null){
            System.out.println(temp);
        }
        bufferedReader.close();

        FileWriter fileWriter = new FileWriter(file, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println("Anna");
        printWriter.println("Max");
        printWriter.flush();
        printWriter.close();
    }
}
