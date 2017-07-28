package Main;/**
 * Created by Max on 7/25/2017.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;

public class dqw extends Application {
    static LayoutSample layoutSample = new LayoutSample();
    public static void main(String[] args) {
        launch(args);
    }
    Scene scene2;

    @Override
    public void start(Stage primaryStage) throws Exception {

        Button back = new Button("Back");
        back.setTranslateX(-340);
        back.setTranslateY(-300);
        back.setMaxWidth(100);

        StackPane layout1 = new StackPane();
        scene2 = new Scene(layout1, 800, 800, Color.BLACK);
        layout1.getChildren().addAll(back);

        back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                layoutSample.start(primaryStage);
            }
        });

        layout1.getChildren().addAll();
        primaryStage.setScene(scene2);
        primaryStage.show();
    }
}
