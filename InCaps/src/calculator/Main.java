package calculator;

public class Main {
    public static void main(String[] args) {
        Model m1 = new Model();
        m1.x = 50;
        m1.y = 12;
        Model m2 = new Model();
        m2.x = 100;
        m2.y = 45;
        Controller c = new Controller();
        View v = new View();

        int sum = c.add(m1.x, m1.y);
        System.out.print("Сумма = ");
        v.displayInteger(sum);

        int dif = c.dif(m1.x, m1.y);
        System.out.print("Разница = ");
        v.displayInteger(dif);

        int mul = c.mul(m2.x, m2.y);
        System.out.print("Произведение = ");
        v.displayInteger(mul);

        double div = c.div(m2.x, m2.y);
        System.out.print("Деление = ");
        v.displayDouble(div);
    }
}