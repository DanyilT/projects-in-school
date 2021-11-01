package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main2 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        VBox pane = new VBox();
        Label label = new Label("Something"); //Не поддерживает HTML, как в Swing, жаль...
        pane.getChildren().add(label);
        Scene scene = new Scene(pane, 640, 480);
        stage.setTitle("Okay");
        stage.setScene(scene);
        stage.show();
    }
}
