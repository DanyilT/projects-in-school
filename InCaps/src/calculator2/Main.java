package calculator2;

public class Main {
    public static void main(String[] args) {
        Model m1 = new Model ();
        m1.x = 50;
        m1.y = 12;
        Model m2 = new Model();
        m2.x = 100;
        m2.y = 45;
        //Controller c = new Controller();
        //View v = new View();

        int sum = Controller.add(m1);
        System.out.print("Сумма = ");
        View.displayInteger(sum);

        int dif = Controller.dif(m1);
        System.out.print("Разница = ");
        View.displayInteger(dif);

        int mul = Controller.mul(m2);
        System.out.print("Произведение = ");
        View.displayInteger(mul);

        double div = Controller.div(m2);
        System.out.print("Деление = ");
        View.displayDouble(div);
    }
}