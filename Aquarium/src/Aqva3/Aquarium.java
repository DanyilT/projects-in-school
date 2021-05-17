package Aqva3;

public class Aquarium {
    int fish;
    int length;
    int width;
    int height;

    public Aquarium (int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Aquarium(int fish) {
        this.fish = fish;
    }

    double Volume(Aquarium aquarium) {
        return width * height * length * 0.001;
    }
    double Normal(Aquarium aquarium) {
        return 9 * fish;
    }
}
