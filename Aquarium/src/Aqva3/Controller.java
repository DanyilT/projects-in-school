package Aqva3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextField length, width, height, fish;
    @FXML
    Label water_need, total_water, reply;
    int l;
    int w;
    int h;
    int f;

    @FXML
    protected void ok() {
        this.l = Integer.parseInt(length.getText());
        this.w = Integer.parseInt(width.getText());
        this.h = Integer.parseInt(height.getText());
        this.f = Integer.parseInt(fish.getText());

        Aquarium aquarium = new Aquarium(l, w, h);
        double a = aquarium.Volume(aquarium);
        Aquarium normal = new Aquarium(f);
        double n = normal.Normal(normal);

        water_need.setText(String.valueOf(n));

        total_water.setText(String.valueOf(a));

        if (a >= n) {
            reply.setText("suitable");
        } else {
            reply.setText("not suitable");
        }
    }
}
