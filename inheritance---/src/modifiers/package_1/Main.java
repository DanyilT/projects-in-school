package modifiers.package_1;

import modifiers.package_2.Parent;
import modifiers.package_2.TestInPackage_2;

public class Main extends Parent {
    public static void main(String[] args) {
        TestInPackage_1 t1 = new TestInPackage_1();
        TestInPackage_2 t2 = new TestInPackage_2();
        Parent p = new Parent();
        //System.out.println(t1.x1);
        System.out.println(t1.x2);
        System.out.println(t1.x3);
        System.out.println(t1.x4);
        //System.out.println(t2.x1);
        //System.out.println(t2.x2);
        //System.out.println(t2.x3);
        System.out.println(t2.x4);
        //System.out.println(p.x1);
        //System.out.println(p.x2);
        //System.out.println(p.x3);
        System.out.println(p.x4);
    }
}
