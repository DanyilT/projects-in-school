package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main1 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage myStage) throws Exception {

        myStage.setTitle("First window!");
        VBox rootNode = new VBox();
        //FlowPane rootNode = new FlowPane();
        Scene myScene = new Scene(rootNode, 300, 200);
        myStage.setScene(myScene);
        Label myLabel = new Label("Hello world");
        Label myLabel2 = new Label("Welcome to the JavaFX");
        Label myLabel3 = new Label("This a first project");
        myLabel2.setStyle("{-fx-font-family: Inconsolata:700; -fx-font-size: 25}");
        rootNode.getChildren().addAll(myLabel, myLabel2, myLabel3);
        myStage.show();
    }
}
