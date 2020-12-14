package calendar;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        int today = gc.get(Calendar.DAY_OF_MONTH);
        int month = gc.get(Calendar.MONTH);
//первое число месяца
        gc.set((Calendar.DAY_OF_MONTH), 1);
        int weekday = gc.get(Calendar.DAY_OF_WEEK);
//вывести заголовки
        System.out.println("*today " + today + "." + (gc.get(Calendar.MONTH) + 1) + "."+ gc.get(Calendar.YEAR));
        System.out.println("Calendar " + (gc.get(Calendar.MONTH) + 1) + "."+ gc.get(Calendar.YEAR));
        System.out.println(" | Sun | Mon | Tue | Wed | Thu | Fri | Sat | ");
//сдвиг на день недели
        for (int i = Calendar.SUNDAY; i < weekday; i++) {
            System.out.print(" |    ");
        }
//Вывод дня месяца
        do {
            int day = gc.get(Calendar.DAY_OF_MONTH);
            System.out.printf(" |%3d", day);
//Символом * помечаем текущий день
            if(day == today) {
                System.out.print("*");
            }else{
                System.out.print(" ");
        }
//После каждой субботы начинается новая строка
            if (weekday == Calendar.SATURDAY) {
                System.out.println(" | ");
            }
//перевод d на следующий день
            gc.add((Calendar.DAY_OF_MONTH),1);
            weekday = gc.get(Calendar.DAY_OF_WEEK);
        }
        while(gc.get(Calendar.MONTH) == month);
//Перевод курсора на новую строку
        if(weekday != Calendar.SUNDAY) {
            System.out.println();
        }
    }
}
