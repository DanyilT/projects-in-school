package homework__21_01;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class User_2 {
        private String name;
        private String surname;
        private int birthYear;
        private int clas;
        User_2(String name, String surname, int birthYear) {
            this.name = name;
            this.surname = surname;
            this.birthYear = birthYear;
        }
        @Override
        public String toString() {
            return "name = " + name + ", surname = " + surname + ", getAge = " + getAge() + ", class = " + getClas();
        }
        private int getAge(){
            Calendar calendar = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
            calendar.setTime(new Date());
            int currentYear = calendar.get(Calendar.YEAR);
            return currentYear - birthYear;
        }
        private int getClas(){
            return getAge() - 6;
    }
}
