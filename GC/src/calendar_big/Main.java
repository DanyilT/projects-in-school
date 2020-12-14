package calendar_big;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        int today = gc.get(Calendar.DAY_OF_MONTH);
        int month = gc.get(Calendar.MONTH) + 1;
        System.out.println("*today " + today + "." + month + "." + gc.get(Calendar.YEAR));

        GregorianCalendar gc1 = new GregorianCalendar(Calendar.YEAR, 0, Calendar.DAY_OF_MONTH);
        int month1 = gc1.get(Calendar.MONTH);
        gc1.set((Calendar.DAY_OF_MONTH), 1);
        int weekday1 = gc1.get(Calendar.DAY_OF_WEEK);
        System.out.println("Calendar " + (gc1.get(Calendar.MONTH) + 1) + "." + gc1.get(Calendar.YEAR));
        System.out.println(" | Mon | Tue | Wed | Thu | Fri | Sat | Sun | ");
        for (int i = Calendar.MONDAY; i < weekday1; i++) {
            System.out.print(" |    ");
        }
        do {
            int day1 = gc1.get(Calendar.DAY_OF_MONTH);
            System.out.printf(" |%3d", day1);
            if (day1 == today & month1 == month) {
                System.out.print("*");

            } else {
                System.out.print(" ");
            }
            if (weekday1 == Calendar.SUNDAY) {
                System.out.println(" | ");
            }
            gc1.add((Calendar.DAY_OF_MONTH), 1);
            weekday1 = gc1.get(Calendar.DAY_OF_WEEK);
        }
        while (gc1.get(Calendar.MONTH) == month1);
        if (weekday1 != Calendar.MONDAY) {
            System.out.println();
        }

        GregorianCalendar gc2 = new GregorianCalendar(Calendar.YEAR, 1, Calendar.DAY_OF_MONTH);
        int month2 = gc2.get(Calendar.MONTH);
        gc2.set((Calendar.DAY_OF_MONTH), 1);
        int weekday2 = gc2.get(Calendar.DAY_OF_WEEK);
        System.out.println("Calendar " + (gc2.get(Calendar.MONTH) + 1) + "." + gc2.get(Calendar.YEAR));
        System.out.println(" | Mon | Tue | Wed | Thu | Fri | Sat | Sun | ");
        for (int i = Calendar.MONDAY; i < weekday2; i++) {
            System.out.print(" |    ");
        }
        do {
            int day2 = gc2.get(Calendar.DAY_OF_MONTH);
            System.out.printf(" |%3d", day2);
            if (day2 == today & month2 == month) {
                System.out.print("*");

            } else {
                System.out.print(" ");
            }
            if (weekday2 == Calendar.SUNDAY) {
                System.out.println(" | ");
            }
            gc2.add((Calendar.DAY_OF_MONTH), 1);
            weekday2 = gc2.get(Calendar.DAY_OF_WEEK);
        }
        while (gc2.get(Calendar.MONTH) == month2);
        if (weekday2 != Calendar.MONDAY) {
            System.out.println();
        }

        GregorianCalendar gc3 = new GregorianCalendar(Calendar.YEAR, 2, Calendar.DAY_OF_MONTH);
        int month3 = gc3.get(Calendar.MONTH);
        gc3.set((Calendar.DAY_OF_MONTH), 1);
        int weekday3 = gc3.get(Calendar.DAY_OF_WEEK);
        System.out.println("Calendar " + (gc3.get(Calendar.MONTH) + 1) + "." + gc3.get(Calendar.YEAR));
        System.out.println(" | Mon | Tue | Wed | Thu | Fri | Sat | Sun | ");
        for (int i = Calendar.MONDAY; i < weekday3; i++) {
            System.out.print(" |    ");
        }
        do {
            int day3 = gc3.get(Calendar.DAY_OF_MONTH);
            System.out.printf(" |%3d", day3);
            if (day3 == today & month3 == month) {
                System.out.print("*");

            } else {
                System.out.print(" ");
            }
            if (weekday3 == Calendar.SUNDAY) {
                System.out.println(" | ");
            }
            gc3.add((Calendar.DAY_OF_MONTH), 1);
            weekday3 = gc3.get(Calendar.DAY_OF_WEEK);
        }
        while (gc3.get(Calendar.MONTH) == month3);
        if (weekday3 != Calendar.MONDAY) {
            System.out.println();
        }

        GregorianCalendar gc4 = new GregorianCalendar(Calendar.YEAR, 3, Calendar.DAY_OF_MONTH);
        int month4 = gc4.get(Calendar.MONTH);
        gc4.set((Calendar.DAY_OF_MONTH), 1);
        int weekday4 = gc4.get(Calendar.DAY_OF_WEEK);
        System.out.println("Calendar " + (gc4.get(Calendar.MONTH) + 1) + "." + gc4.get(Calendar.YEAR));
        System.out.println(" | Mon | Tue | Wed | Thu | Fri | Sat | Sun | ");
        for (int i = Calendar.MONDAY; i < weekday4; i++) {
            System.out.print(" |    ");
        }
        do {
            int day4 = gc4.get(Calendar.DAY_OF_MONTH);
            System.out.printf(" |%3d", day4);
            if (day4 == today & month4 == month) {
                System.out.print("*");

            } else {
                System.out.print(" ");
            }
            if (weekday4 == Calendar.SUNDAY) {
                System.out.println(" | ");
            }
            gc4.add((Calendar.DAY_OF_MONTH), 1);
            weekday4 = gc4.get(Calendar.DAY_OF_WEEK);
        }
        while (gc4.get(Calendar.MONTH) == month4);
        if (weekday4 != Calendar.MONDAY) {
            System.out.println();
        }

        GregorianCalendar gc5 = new GregorianCalendar(Calendar.YEAR, 4, Calendar.DAY_OF_MONTH);
        int month5 = gc5.get(Calendar.MONTH);
        gc5.set((Calendar.DAY_OF_MONTH), 1);
        int weekday5 = gc5.get(Calendar.DAY_OF_WEEK);
        System.out.println("Calendar " + (gc5.get(Calendar.MONTH) + 1) + "." + gc5.get(Calendar.YEAR));
        System.out.println(" | Mon | Tue | Wed | Thu | Fri | Sat | Sun | ");
        for (int i = Calendar.MONDAY; i < weekday5; i++) {
            System.out.print(" |    ");
        }
        do {
            int day5 = gc5.get(Calendar.DAY_OF_MONTH);
            System.out.printf(" |%3d", day5);
            if (day5 == today & month5 == month) {
                System.out.print("*");

            } else {
                System.out.print(" ");
            }
            if (weekday5 == Calendar.SUNDAY) {
                System.out.println(" | ");
            }
            gc5.add((Calendar.DAY_OF_MONTH), 1);
            weekday5 = gc5.get(Calendar.DAY_OF_WEEK);
        }
        while (gc5.get(Calendar.MONTH) == month5);
        if (weekday5 != Calendar.MONDAY) {
            System.out.println();
        }

        GregorianCalendar gc6 = new GregorianCalendar(Calendar.YEAR, 5, Calendar.DAY_OF_MONTH);
        int month6 = gc6.get(Calendar.MONTH);
        gc6.set((Calendar.DAY_OF_MONTH), 1);
        int weekday6 = gc6.get(Calendar.DAY_OF_WEEK);
        System.out.println("Calendar " + (gc6.get(Calendar.MONTH) + 1) + "." + gc.get(Calendar.YEAR));
        System.out.println(" | Mon | Tue | Wed | Thu | Fri | Sat | Sun | ");
        for (int i = Calendar.MONDAY; i < weekday6; i++) {
            System.out.print(" |    ");
        }
        do {
            int day6 = gc6.get(Calendar.DAY_OF_MONTH);
            System.out.printf(" |%3d", day6);
            if (day6 == today & month6 == month) {
                System.out.print("*");

            } else {
                System.out.print(" ");
            }
            if (weekday6 == Calendar.SUNDAY) {
                System.out.println(" | ");
            }
            gc6.add((Calendar.DAY_OF_MONTH), 1);
            weekday6 = gc6.get(Calendar.DAY_OF_WEEK);
        }
        while (gc6.get(Calendar.MONTH) == month6);
        if (weekday6 != Calendar.MONDAY) {
            System.out.println();
        }

        GregorianCalendar gc7 = new GregorianCalendar(Calendar.YEAR, 6, Calendar.DAY_OF_MONTH);
        int month7 = gc7.get(Calendar.MONTH);
        gc7.set((Calendar.DAY_OF_MONTH), 1);
        int weekday7 = gc7.get(Calendar.DAY_OF_WEEK);
        System.out.println("Calendar " + (gc7.get(Calendar.MONTH) + 1) + "." + gc7.get(Calendar.YEAR));
        System.out.println(" | Mon | Tue | Wed | Thu | Fri | Sat | Sun | ");
        for (int i = Calendar.MONDAY; i < weekday7; i++) {
            System.out.print(" |    ");
        }
        do {
            int day7 = gc7.get(Calendar.DAY_OF_MONTH);
            System.out.printf(" |%3d", day7);
            if (day7 == today & month7 == month) {
                System.out.print("*");

            } else {
                System.out.print(" ");
            }
            if (weekday7 == Calendar.SUNDAY) {
                System.out.println(" | ");
            }
            gc7.add((Calendar.DAY_OF_MONTH), 1);
            weekday7 = gc7.get(Calendar.DAY_OF_WEEK);
        }
        while (gc7.get(Calendar.MONTH) == month7);
        if (weekday7 != Calendar.MONDAY) {
            System.out.println();
        }

        GregorianCalendar gc8 = new GregorianCalendar(Calendar.YEAR, 7, Calendar.DAY_OF_MONTH);
        int month8 = gc8.get(Calendar.MONTH);
        gc8.set((Calendar.DAY_OF_MONTH), 1);
        int weekday8 = gc8.get(Calendar.DAY_OF_WEEK);
        System.out.println("Calendar " + (gc8.get(Calendar.MONTH) + 1) + "." + gc8.get(Calendar.YEAR));
        System.out.println(" | Mon | Tue | Wed | Thu | Fri | Sat | Sun | ");
        for (int i = Calendar.MONDAY; i < weekday8; i++) {
            System.out.print(" |    ");
        }
        do {
            int day8 = gc8.get(Calendar.DAY_OF_MONTH);
            System.out.printf(" |%3d", day8);
            if (day8 == today & month8 == month) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            if (weekday8 == Calendar.SUNDAY) {
                System.out.println(" | ");
            }
            gc8.add((Calendar.DAY_OF_MONTH), 1);
            weekday8 = gc8.get(Calendar.DAY_OF_WEEK);
        }
        while (gc8.get(Calendar.MONTH) == month8);
        if (weekday8 != Calendar.MONDAY) {
            System.out.println();
        }

        GregorianCalendar gc9 = new GregorianCalendar(Calendar.YEAR, 8, Calendar.DAY_OF_MONTH);
        int month9 = gc9.get(Calendar.MONTH);
        gc9.set((Calendar.DAY_OF_MONTH), 1);
        int weekday9 = gc9.get(Calendar.DAY_OF_WEEK);
        System.out.println("Calendar " + (gc9.get(Calendar.MONTH) + 1) + "." + gc9.get(Calendar.YEAR));
        System.out.println(" | Mon | Tue | Wed | Thu | Fri | Sat | Sun | ");
        for (int i = Calendar.MONDAY; i < weekday9; i++) {
            System.out.print(" |    ");
        }
        do {
            int day9 = gc9.get(Calendar.DAY_OF_MONTH);
            System.out.printf(" |%3d", day9);
            if (day9 == today & month9 == month) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            if (weekday9 == Calendar.SUNDAY) {
                System.out.println(" | ");
            }
            gc9.add((Calendar.DAY_OF_MONTH), 1);
            weekday9 = gc9.get(Calendar.DAY_OF_WEEK);
        }
        while (gc9.get(Calendar.MONTH) == month9);
        if (weekday9 != Calendar.MONDAY) {
            System.out.println();
        }

        GregorianCalendar gc10 = new GregorianCalendar(Calendar.YEAR, 9, Calendar.DAY_OF_MONTH);
        int month10 = gc10.get(Calendar.MONTH);
        gc10.set((Calendar.DAY_OF_MONTH), 1);
        int weekday10 = gc10.get(Calendar.DAY_OF_WEEK);
        System.out.println("Calendar " + (gc10.get(Calendar.MONTH) + 1) + "." + gc10.get(Calendar.YEAR));
        System.out.println(" | Mon | Tue | Wed | Thu | Fri | Sat | Sun | ");
        for (int i = Calendar.MONDAY; i < weekday10; i++) {
            System.out.print(" |    ");
        }
        do {
            int day10 = gc10.get(Calendar.DAY_OF_MONTH);
            System.out.printf(" |%3d", day10);
            if (day10 == today & month10 == month) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            if (weekday10 == Calendar.SUNDAY) {
                System.out.println(" | ");
            }
            gc10.add((Calendar.DAY_OF_MONTH), 1);
            weekday10 = gc10.get(Calendar.DAY_OF_WEEK);
        }
        while (gc10.get(Calendar.MONTH) == month10);
        if (weekday10 != Calendar.MONDAY) {
            System.out.println();
        }

        GregorianCalendar gc11 = new GregorianCalendar(Calendar.YEAR, 10, Calendar.DAY_OF_MONTH);
        int month11 = gc11.get(Calendar.MONTH);
        gc11.set((Calendar.DAY_OF_MONTH), 1);
        int weekday11 = gc11.get(Calendar.DAY_OF_WEEK);
        System.out.println("Calendar " + (gc11.get(Calendar.MONTH) + 1) + "." + gc11.get(Calendar.YEAR));
        System.out.println(" | Mon | Tue | Wed | Thu | Fri | Sat | Sun | ");
        for (int i = Calendar.MONDAY; i < weekday11; i++) {
            System.out.print(" |    ");
        }
        do {
            int day11 = gc11.get(Calendar.DAY_OF_MONTH);
            System.out.printf(" |%3d", day11);
            if (day11 == today & month11 == month) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            if (weekday11 == Calendar.SUNDAY) {
                System.out.println(" | ");
            }
            gc11.add((Calendar.DAY_OF_MONTH), 1);
            weekday11 = gc11.get(Calendar.DAY_OF_WEEK);
        }
        while (gc11.get(Calendar.MONTH) == month11);
        if (weekday11 != Calendar.MONDAY) {
            System.out.println();
        }

        GregorianCalendar gc12 = new GregorianCalendar(Calendar.YEAR, 11, Calendar.DAY_OF_MONTH);
        int month12= gc12.get(Calendar.MONTH);
        gc12.set((Calendar.DAY_OF_MONTH), 1);
        int weekday12 = gc12.get(Calendar.DAY_OF_WEEK);
        System.out.println("Calendar " + (gc12.get(Calendar.MONTH) + 1) + "." + gc12.get(Calendar.YEAR));
        System.out.println(" | Mon | Tue | Wed | Thu | Fri | Sat | Sun | ");
        for (int i = Calendar.MONDAY; i < weekday12; i++) {
            System.out.print(" |    ");
        }
        do {
            int day12 = gc12.get(Calendar.DAY_OF_MONTH);
            System.out.printf(" |%3d", day12);
            if (day12 == today & month12 == month) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            if (weekday12 == Calendar.SUNDAY) {
                System.out.println(" | ");
            }
            gc12.add((Calendar.DAY_OF_MONTH), 1);
            weekday12 = gc12.get(Calendar.DAY_OF_WEEK);
        }
        while (gc12.get(Calendar.MONTH) == month12);
        if (weekday12 != Calendar.MONDAY) {
            System.out.println();
        }
    }
}