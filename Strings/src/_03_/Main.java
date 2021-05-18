package _03_;

public class Main {
    public static void main(String[] args) {
        StringBuffer peremennayvprakticheskoupostringam = new StringBuffer();
        peremennayvprakticheskoupostringam.append("Спят усталые игрушки, книжки спят");

        //1
        System.out.println("Length = " + peremennayvprakticheskoupostringam.length());

        //2
        System.out.println("Index later \"ы\" = " + peremennayvprakticheskoupostringam.indexOf("ы"));

        //3
        System.out.println("Delete word \"устал\" = " + peremennayvprakticheskoupostringam.delete(5,10));

        //4
        System.out.println("Replace word \"игрушки\" on \"зверюшки\" = " + peremennayvprakticheskoupostringam.replace(8,15,"зверюшки"));

        //5
        System.out.println("The words in high letters = " + peremennayvprakticheskoupostringam.toString().toUpperCase());

        //6
        System.out.println("Revers = " + peremennayvprakticheskoupostringam.reverse());
    }
}
