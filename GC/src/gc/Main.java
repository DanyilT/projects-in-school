package gc;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        //System.out.println(gc.get(Calendar. DAY_OF_MONTH));
        //System.out.println(gc.get(Calendar. MONTH));
        //System.out.println(gc.get(Calendar. YEAR));
        //System.out.println(gc.get(Calendar. DAY_OF_YEAR));
        //System.out.println(gc.get(Calendar. DAY_OF_WEEK));

        gc.set(Calendar.MONTH, 11); //месяцы считаются с "0", всё остальное с "1"
        gc.set(Calendar.YEAR, 2004);
        gc.set(Calendar.DAY_OF_MONTH, 8);
        System.out.println(gc.get(Calendar.DAY_OF_WEEK)); //считает с воскресенья

        GregorianCalendar gc1 = new GregorianCalendar(2021, 0, 1);
        System.out.println(gc1.get(Calendar.DAY_OF_WEEK));

        GregorianCalendar gc2 = new GregorianCalendar(2020, Calendar.DECEMBER, 29);
        gc2.add(Calendar.DAY_OF_WEEK, 5);
        System.out.println(gc2.get(Calendar.YEAR));
        System.out.println(gc2.get(Calendar.MONTH));
        System.out.println(gc2.get(Calendar.DAY_OF_MONTH));
    }
}
