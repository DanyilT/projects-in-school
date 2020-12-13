package house;

public class House {
    int square = 160;//2
    String color;//3
    {System.out.println("Nachinaem stroit house:");}//блок иницалиализации
    Door d = new Door(210);//4
    House(String c){//9
        color = c;//10
        System.out.println("constructor of class House");//11
    }
    void u(){}
}
class Door{
    int hight;//5
    Door(int h){//6
        hight = h;//7
        System.out.println("constructor of class Door");//8git
    }
}