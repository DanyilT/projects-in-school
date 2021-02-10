package user;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class User_1 {
    private String name;
    private String surname;
    private int birthYear;
    User_1(String name, String surname, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }
    @Override
    public String toString() {
        return "name = " + name + ", surname = " + surname + ", age = " + getAge() + ", class = " + clas();
    }
    private int getAge(){
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
        calendar.setTime(new Date());
        int currentYear = calendar.get(Calendar.YEAR);
        return currentYear - birthYear;
    }
    private int clas(){
        return getAge() - 6;
        }
}
