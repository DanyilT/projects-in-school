package StringBulder_3;

public class Main {
    public static void main(String[] args) {
        StringBuilder peremenaynomer1 = new StringBuilder();
        peremenaynomer1.append("?????Это переменная которая под номером 1 ?????");

        StringBuilder peremenaynomer2 = new StringBuilder("??????Это переменная которая под номером 2??????");

        System.out.println("\t Line 1 = " + peremenaynomer1);
        System.out.println("\t Length 1 = " + peremenaynomer1.length());
        System.out.println("\t Size 1 = " + peremenaynomer1.capacity());

        System.out.println();

        System.out.println("\t Line 2 = " + peremenaynomer2);
        System.out.println("\t Length 2 = " + peremenaynomer2.length());
        System.out.println("\t Size 2 = " + peremenaynomer2.capacity());

        System.out.println();

        StringBuilder novayperemenayvkotoroudveperemenee = new StringBuilder(peremenaynomer1.append(peremenaynomer2));
        //novayperemenayvkotoroudveperemenee = peremenaynomer1.append(peremenaynomer2);

        System.out.println("\t Line 3 = " + novayperemenayvkotoroudveperemenee);
        System.out.println("\t Length 3 = " + novayperemenayvkotoroudveperemenee.length());
        System.out.println("\t Size 3 = " + novayperemenayvkotoroudveperemenee.capacity());
    }
}
