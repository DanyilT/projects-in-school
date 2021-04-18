package PR_files;

import javax.swing.*;
import java.io.*;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args) throws IOException {
//1
        File file1 = new File("C:/dataJAVA/file.txt");
        if(!file1.exists()) file1.createNewFile();
        System.out.println("File \"file.txt\" create in \"C:/dataJAVA\"");
//2
        File file2 = new File("C:/dataJAVA/inputNew.txt");
        System.out.println("File \"inputNew.txt\"" + (file2.exists() ? "" : " not") + " exist in \"C:/dataJAVA\"");
//3
        File folder = new File("C:/dataJAVA/javaNew");
        if(!folder.exists()) folder.mkdir();
        System.out.println("Folder \"javaNew\" exist or create in \"C:/dataJAVA\"");
//4
        PrintWriter pw = new PrintWriter(new FileWriter(file1));
        pw.println("My name...");
        pw.close();
        System.out.println("File \"file.txt\" length = " + file1.length());
        Files.write(file2.toPath(), "Dany".getBytes());
        System.out.println("File \"inputNew.txt\" length = " + file2.length());
//5
        JFileChooser fileChooser = new JFileChooser("C:/dataJAVA/javaNew");
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        System.out.println("File \"inputNew.txt\" to move in another folder and rename to the \"file.txt\"");
        if(fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION){
            file2.renameTo( new File(fileChooser.getSelectedFile().getAbsolutePath() + "/" + file1.getName()));
        }
        file2 = new File("C:/dataJAVA/javaNew/file.txt");
//6
        file2.delete();
        folder.delete();
        System.out.println("Folder \"javaNex\" delete");
//7
        System.out.println(file1.getPath() +" this "+ (file1.isFile()? "file" : "folder"));
//8
        File Folder = new File("C:/dataJAVA/").getAbsoluteFile();
        System.out.println("In " + Folder.getName() + ":");
        for(File list : Folder.listFiles()) {
            System.out.println("\t" + list.getName());
        }
    }
}
