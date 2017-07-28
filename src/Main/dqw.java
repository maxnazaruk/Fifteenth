package Main;/**
 * Created by Max on 7/25/2017.
 */

import javafx.application.Application;
import javafx.stage.Stage;

import java.util.ArrayList;

public class dqw extends Application {

    public static void main(String[] args) {
        int x = 100;

        for (int i = 0, size = 4; i < size; i++) {

            for (int j = 0; j < size; j++) {

                System.out.println((j*x) - x);
                System.out.println((i*x)- 2 *x);
                System.out.println();

                }
            }
        System.out.println();

        ArrayList<Integer> list = new ArrayList<>();


//        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

    }
}
