package Main;/**
 * Created by Max on 7/25/2017.
 */

import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
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
        back.setTranslateY(200);
        back.setTranslateX(-300);
        back.setMaxWidth(100);

        Button splitImage = new Button("Splitting");
        back.setTranslateY(-200);
        back.setTranslateX(-300);
        back.setMaxWidth(100);

        splitImage.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Task<Void> task = new Task<Void>() {
                    @Override
                    public Void call() throws Exception {
                        File file = new File("H:\\Fifteen_15\\15Fif\\src\\Main\\test.jpg");
                        FileInputStream fis = new FileInputStream(file);
                        BufferedImage image = ImageIO.read(fis);

                        int rows = 4;
                        int cols = 4;
                        int chunks = rows * cols;

                        int chunkWidth = image.getWidth() / cols;
                        int chunkHeight = image.getHeight() / rows;
                        int count = 0;

                        BufferedImage imgs[] = new BufferedImage[chunks];
                        for (int x = 0; x < rows; x++) {
                            for (int y = 0; y < cols; y++) {

                                imgs[count] = new BufferedImage(chunkWidth, chunkHeight, image.getType());


                                Graphics2D gr = imgs[count++].createGraphics();
                                gr.drawImage(image, 0, 0, chunkWidth, chunkHeight, chunkWidth * y,
                                        chunkHeight * x, chunkWidth * y + chunkWidth, chunkHeight * x + chunkHeight, null);
                                gr.dispose();
                            }
                        }
                        System.out.println("Splitting done");

                        //writing mini images into image files
                        for (int i = 0; i < imgs.length; i++) {
                            ImageIO.write(imgs[i], "jpg", new File("img" + i + ".jpg"));
                        }
                        System.out.println("Mini images created");
                        return null;
                    }
                };
                new Thread(task).start();
            }
        });

        Image image = new Image(String.valueOf(dqw.class.getResource("test.jpg")));
        ImageView imageView = new ImageView();
        imageView.setImage(image);
        PixelReader reader = image.getPixelReader();
        WritableImage newImage = new WritableImage(reader, 400, 400, 100, 100);
        imageView.setImage(newImage);
        ImageView imageView1 = new ImageView();
        WritableImage newImage1 = new WritableImage(reader, 400, 500, 100, 100);
        imageView1.setImage(newImage1);



        Button b = new Button("", imageView);
        b.setStyle("-fx-background-radius: 0; -fs-border: 0");
        b.setTranslateY(100);
        b.setTranslateX(-200);
        b.setMaxWidth(100);
        b.setMaxHeight(100);

        Button b1 = new Button("", imageView1);
        b1.setStyle("-fx-background-radius: 0; -fs-border: 0");
        b1.setTranslateY(200);
        b1.setTranslateX(-200);
        b1.setMaxWidth(100);
        b1.setMaxHeight(100);



        StackPane layout1 = new StackPane();
        scene2 = new Scene(layout1, 800, 650, Color.BLACK);
        layout1.getChildren().addAll(back, splitImage, b, b1);

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
