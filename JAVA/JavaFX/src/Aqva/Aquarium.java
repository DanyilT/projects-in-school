package Aqva;

public class Aquarium {
    int length;
    int width;
    int height;

    public Aquarium(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    double AquariumVolume() {
        return width * height * length * 0.001;
    }
}
