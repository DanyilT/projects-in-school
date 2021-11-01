package ExternalLaunch;

import javafx.application.Platform;
import javafx.application.Preloader;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class ExtTest{

    public static void main(String[] args) {
        Platform.startup(new Runnable(){ //JavaFX startup, thread initialization
            @Override
            public void run() {

                Stage primary = new Stage(); //Primary stage creation
                //TODO default window options here
                Preloader pr = new Preloader() { //Like Application, but more advanced
                    private Scene initScene(){
                        Pane pane = new Pane();
                        Scene  scene  =  new  Scene(pane, 640, 480);
                        Text  text  =  new  Text();
                        text.setX(40);
                        text.setY(100);
                        text.setFont(new Font(25));
                        text.setText("Welcome JavaFX!");
                        Button button = new Button("OK");
                        button.relocate(10, 10);
                        button.setOnAction(e -> {
                            Stage win2 = new Stage();
                            Group gr2 = new Group();
                            Scene sc2 = new Scene(gr2, 200, 100);
                            win2.setScene(sc2);
                            win2.show();
                        });
                        pane.getChildren().addAll(text, button);
                        return scene;
                    }
                    @Override
                    public void start(Stage stage) throws Exception {
                        Scene scene = this.initScene();
                        //fxPanel.setScene(scene);
                        stage.setScene(scene);
                        stage.show();
                    }
                    @Override
                    public void init() throws Exception {
                        System.out.println("WOW!");
                    }
                };
                try { //Like launch()
                    pr.init();
                    pr.start(primary);
                    pr.stop();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
//Misha's Code