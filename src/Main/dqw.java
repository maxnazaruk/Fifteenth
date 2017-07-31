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
import javafx.scene.paint.*;
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
    static String style = "-fx-background-radius: 0; -fs-border: 0; -fx-background-color: transparent";
static ArrayList<Button> list = new ArrayList<>();

    public static void main(String[] args) {
        launch(args);
    }
    Scene scene2;

    @Override
    public void start(Stage primaryStage) throws Exception {

        Button back = new Button("Back");
        back.setTranslateY(-200);
        back.setTranslateX(-300);
        back.setMaxWidth(100);

        Button splitImage = new Button("Splitting");
        splitImage.setTranslateY(-160);
        splitImage.setTranslateX(-300);
        splitImage.setMaxWidth(100);

        list = generateList();


        StackPane layout1 = new StackPane();
        scene2 = new Scene(layout1, 800, 650, Color.BLACK);
        layout1.getChildren().addAll(back, splitImage);
        layout1.getChildren().addAll(list);
//        layout1.getChildren().addAll(back, splitImage);

        back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                layoutSample.start(primaryStage);
            }
        });

        splitImage.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Task<Void> task1 = new Task<Void>() {
                    @Override
                    public Void call() throws Exception {
                        for (int i = 0; i < 3; i++) {
                            splitAndBack(list);
                            Thread.sleep(500);

                        }
                        return null;
                    }
                };
                new Thread(task1).start();
            }
        });

        layout1.getChildren().addAll();
        primaryStage.setScene(scene2);
        primaryStage.show();
    }

    public static void splitAndBack(ArrayList<Button> list){
        list.get(1).setTranslateY(-100);
        list.get(1).setTranslateX(-100);

        list.get(2).setTranslateY(0);
        list.get(2).setTranslateX(-100);

        list.get(3).setTranslateY(100);
        list.get(3).setTranslateX(-100);
//---------------------------------
        list.get(4).setTranslateY(-200);
        list.get(4).setTranslateX(0);

        list.get(5).setTranslateY(-100);
        list.get(5).setTranslateX(0);

        list.get(6).setTranslateY(0);
        list.get(6).setTranslateX(0);

        list.get(7).setTranslateY(100);
        list.get(7).setTranslateX(0);
//-----------------------------------------------
        list.get(8).setTranslateY(-200);
        list.get(8).setTranslateX(100);

        list.get(9).setTranslateY(-100);
        list.get(9).setTranslateX(100);

        list.get(10).setTranslateY(0);
        list.get(10).setTranslateX(100);

        list.get(11).setTranslateY(100);
        list.get(11).setTranslateX(100);
        //--------------------------------------

        list.get(12).setTranslateY(-200);
        list.get(12).setTranslateX(200);

        list.get(13).setTranslateY(-100);
        list.get(13).setTranslateX(200);

        list.get(14).setTranslateY(0);
        list.get(14).setTranslateX(200);

        list.get(15).setTranslateY(100);
        list.get(15).setTranslateX(200);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        splitAndBack1(list);

    }

    public static void splitAndBack1(ArrayList<Button> list){
        list.get(1).setTranslateY(-90);
        list.get(1).setTranslateX(-100);

        list.get(2).setTranslateY(20);
        list.get(2).setTranslateX(-100);

        list.get(3).setTranslateY(130);
        list.get(3).setTranslateX(-100);
//---------------------------
        list.get(4).setTranslateY(-200);
        list.get(4).setTranslateX(10);

        list.get(5).setTranslateY(-90);
        list.get(5).setTranslateX(10);

        list.get(6).setTranslateY(20);
        list.get(6).setTranslateX(10);

        list.get(7).setTranslateY(130);
        list.get(7).setTranslateX(10);
//---------------------------------------------------
        list.get(8).setTranslateY(-200);
        list.get(8).setTranslateX(120);

        list.get(9).setTranslateY(-90);
        list.get(9).setTranslateX(120);

        list.get(10).setTranslateY(20);
        list.get(10).setTranslateX(120);

        list.get(11).setTranslateY(130);
        list.get(11).setTranslateX(120);
        //-------------------------------------------
        list.get(12).setTranslateY(-200);
        list.get(12).setTranslateX(230);

        list.get(13).setTranslateY(-90);
        list.get(13).setTranslateX(230);

        list.get(14).setTranslateY(20);
        list.get(14).setTranslateX(230);

        list.get(15).setTranslateY(130);
        list.get(15).setTranslateX(230);

    }

    public static ArrayList<ImageView> viewGenerator(){
        Image image = new Image(String.valueOf(dqw.class.getResource("puzzle.jpeg")));
        ImageView imageView = new ImageView();
        imageView.setImage(image);
        PixelReader reader = image.getPixelReader();
        //-- First Column crop-----------------------------------------------------------
        ImageView imageView1 = new ImageView();
        WritableImage newImage1 = new WritableImage(reader, 0, 0, 100, 100);
        imageView1.setImage(newImage1);

        ImageView imageView2 = new ImageView();
        WritableImage newImage2 = new WritableImage(reader, 0, 100, 100, 100);
        imageView2.setImage(newImage2);

        ImageView imageView3 = new ImageView();
        WritableImage newImage3 = new WritableImage(reader, 0, 200, 100, 100);
        imageView3.setImage(newImage3);

        ImageView imageView4 = new ImageView();
        WritableImage newImage4 = new WritableImage(reader, 0, 300, 100, 100);
        imageView4.setImage(newImage4);

        //-- Second Column crop-----------------------------------------------------------
        ImageView imageView11 = new ImageView();
        WritableImage newImage11 = new WritableImage(reader, 100, 0, 100, 100);
        imageView11.setImage(newImage11);

        ImageView imageView12 = new ImageView();
        WritableImage newImage12 = new WritableImage(reader, 100, 100, 100, 100);
        imageView12.setImage(newImage12);

        ImageView imageView13 = new ImageView();
        WritableImage newImage13 = new WritableImage(reader, 100, 200, 100, 100);
        imageView13.setImage(newImage13);

        ImageView imageView14 = new ImageView();
        WritableImage newImage14 = new WritableImage(reader, 100, 300, 100, 100);
        imageView14.setImage(newImage14);


        //-- Third Column crop-----------------------------------------------------------
        ImageView imageView21 = new ImageView();
        WritableImage newImage21 = new WritableImage(reader, 200, 0, 100, 100);
        imageView21.setImage(newImage21);

        ImageView imageView22 = new ImageView();
        WritableImage newImage22 = new WritableImage(reader, 200, 100, 100, 100);
        imageView22.setImage(newImage22);

        ImageView imageView23 = new ImageView();
        WritableImage newImage23 = new WritableImage(reader, 200, 200, 100, 100);
        imageView23.setImage(newImage23);

        ImageView imageView24 = new ImageView();
        WritableImage newImage24 = new WritableImage(reader, 200, 300, 100, 100);
        imageView24.setImage(newImage24);

        //-- Fourth Column crop-----------------------------------------------------------
        ImageView imageView31 = new ImageView();
        WritableImage newImage31 = new WritableImage(reader, 300, 0, 100, 100);
        imageView31.setImage(newImage31);

        ImageView imageView32 = new ImageView();
        WritableImage newImage32 = new WritableImage(reader, 300, 100, 100, 100);
        imageView32.setImage(newImage32);

        ImageView imageView33 = new ImageView();
        WritableImage newImage33 = new WritableImage(reader, 300, 200, 100, 100);
        imageView33.setImage(newImage33);

        ImageView imageView34 = new ImageView();
        WritableImage newImage34 = new WritableImage(reader, 300, 300, 100, 100);
        imageView34.setImage(newImage34);

        ArrayList<ImageView> list = new ArrayList<>();

        list.add(imageView1);
        list.add(imageView2);
        list.add(imageView3);
        list.add(imageView4);
        list.add(imageView11);
        list.add(imageView12);
        list.add(imageView13);
        list.add(imageView14);
        list.add(imageView21);
        list.add(imageView22);
        list.add(imageView23);
        list.add(imageView24);
        list.add(imageView31);
        list.add(imageView32);
        list.add(imageView33);
        list.add(imageView34);

        return list;
    }


    public static ArrayList<Button> generateList(){
        Image image = new Image(String.valueOf(dqw.class.getResource("puzzle.jpeg")));
        ImageView imageView = new ImageView();
        imageView.setImage(image);
        PixelReader reader = image.getPixelReader();
        //-- First Column crop-----------------------------------------------------------
        ImageView imageView1 = new ImageView();
        WritableImage newImage1 = new WritableImage(reader, 0, 0, 100, 100);
        imageView1.setImage(newImage1);

        ImageView imageView2 = new ImageView();
        WritableImage newImage2 = new WritableImage(reader, 0, 100, 100, 100);
        imageView2.setImage(newImage2);

        ImageView imageView3 = new ImageView();
        WritableImage newImage3 = new WritableImage(reader, 0, 200, 100, 100);
        imageView3.setImage(newImage3);

        ImageView imageView4 = new ImageView();
        WritableImage newImage4 = new WritableImage(reader, 0, 300, 100, 100);
        imageView4.setImage(newImage4);

        Button b = new Button(null , imageView1);
        b.setStyle(style);
        b.setTranslateY(-200);
        b.setTranslateX(-100);
        b.setMaxWidth(100);
        b.setMaxHeight(100);

        Button b1 = new Button(null , imageView2);
        b1.setStyle(style);
        b1.setTranslateY(-90);
        b1.setTranslateX(-100);
        b1.setMaxWidth(100);
        b1.setMaxHeight(100);

        Button b2 = new Button(null , imageView3);
        b2.setStyle(style);
        b2.setTranslateY(20);
        b2.setTranslateX(-100);
        b2.setMaxWidth(100);
        b2.setMaxHeight(100);

        Button b3 = new Button(null , imageView4);
        b3.setStyle(style);
        b3.setTranslateY(130);
        b3.setTranslateX(-100);
        b3.setMaxWidth(100);
        b3.setMaxHeight(100);

        //-- Second Column crop-----------------------------------------------------------
        ImageView imageView11 = new ImageView();
        WritableImage newImage11 = new WritableImage(reader, 100, 0, 100, 100);
        imageView11.setImage(newImage11);

        ImageView imageView12 = new ImageView();
        WritableImage newImage12 = new WritableImage(reader, 100, 100, 100, 100);
        imageView12.setImage(newImage12);

        ImageView imageView13 = new ImageView();
        WritableImage newImage13 = new WritableImage(reader, 100, 200, 100, 100);
        imageView13.setImage(newImage13);

        ImageView imageView14 = new ImageView();
        WritableImage newImage14 = new WritableImage(reader, 100, 300, 100, 100);
        imageView14.setImage(newImage14);

        Button b11 = new Button(null , imageView11);
        b11.setStyle(style);
        b11.setTranslateY(-200);
        b11.setTranslateX(10);
        b11.setMaxWidth(100);
        b11.setMaxHeight(100);

        Button b12 = new Button(null , imageView12);
        b12.setStyle(style);
        b12.setTranslateY(-90);
        b12.setTranslateX(10);
        b12.setMaxWidth(100);
        b12.setMaxHeight(100);

        Button b13 = new Button(null , imageView13);
        b13.setStyle(style);
        b13.setTranslateY(20);
        b13.setTranslateX(10);
        b13.setMaxWidth(100);
        b13.setMaxHeight(100);

        Button b14 = new Button(null , imageView14);
        b14.setStyle(style);
        b14.setTranslateY(130);
        b14.setTranslateX(10);
        b14.setMaxWidth(100);
        b14.setMaxHeight(100);

        //-- Third Column crop-----------------------------------------------------------
        ImageView imageView21 = new ImageView();
        WritableImage newImage21 = new WritableImage(reader, 200, 0, 100, 100);
        imageView21.setImage(newImage21);

        ImageView imageView22 = new ImageView();
        WritableImage newImage22 = new WritableImage(reader, 200, 100, 100, 100);
        imageView22.setImage(newImage22);

        ImageView imageView23 = new ImageView();
        WritableImage newImage23 = new WritableImage(reader, 200, 200, 100, 100);
        imageView23.setImage(newImage23);

        ImageView imageView24 = new ImageView();
        WritableImage newImage24 = new WritableImage(reader, 200, 300, 100, 100);
        imageView24.setImage(newImage24);

        Button b21 = new Button(null , imageView21);
        b21.setStyle(style);
        b21.setTranslateY(-200);
        b21.setTranslateX(120);
        b21.setMaxWidth(100);
        b21.setMaxHeight(100);

        Button b22 = new Button(null , imageView22);
        b22.setStyle(style);
        b22.setTranslateY(-90);
        b22.setTranslateX(120);
        b22.setMaxWidth(100);
        b22.setMaxHeight(100);

        Button b23 = new Button(null , imageView23);
        b23.setStyle(style);
        b23.setTranslateY(20);
        b23.setTranslateX(120);
        b23.setMaxWidth(100);
        b23.setMaxHeight(100);

        Button b24 = new Button(null , imageView24);
        b24.setStyle(style);
        b24.setTranslateY(130);
        b24.setTranslateX(120);
        b24.setMaxWidth(100);
        b24.setMaxHeight(100);

        //-- Fourth Column crop-----------------------------------------------------------
        ImageView imageView31 = new ImageView();
        WritableImage newImage31 = new WritableImage(reader, 300, 0, 100, 100);
        imageView31.setImage(newImage31);

        ImageView imageView32 = new ImageView();
        WritableImage newImage32 = new WritableImage(reader, 300, 100, 100, 100);
        imageView32.setImage(newImage32);

        ImageView imageView33 = new ImageView();
        WritableImage newImage33 = new WritableImage(reader, 300, 200, 100, 100);
        imageView33.setImage(newImage33);

        ImageView imageView34 = new ImageView();
        WritableImage newImage34 = new WritableImage(reader, 300, 300, 100, 100);
        imageView34.setImage(newImage34);

        Button b31 = new Button(null , imageView31);
        b31.setStyle(style);
        b31.setTranslateY(-200);
        b31.setTranslateX(230);
        b31.setMaxWidth(100);
        b31.setMaxHeight(100);

        Button b32 = new Button(null , imageView32);
        b32.setStyle(style);
        b32.setTranslateY(-90);
        b32.setTranslateX(230);
        b32.setMaxWidth(100);
        b32.setMaxHeight(100);

        Button b33 = new Button(null , imageView33);
        b33.setStyle(style);
        b33.setTranslateY(20);
        b33.setTranslateX(230);
        b33.setMaxWidth(100);
        b33.setMaxHeight(100);

        Button b34 = new Button(null , imageView34);
        b34.setStyle(style);
        b34.setTranslateY(130);
        b34.setTranslateX(230);
        b34.setMaxWidth(100);
        b34.setMaxHeight(100);

        ArrayList<Button> list = new ArrayList<>();
        list.add(b);
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b11);
        list.add(b12);
        list.add(b13);
        list.add(b14);
        list.add(b21);
        list.add(b22);
        list.add(b23);
        list.add(b24);
        list.add(b31);
        list.add(b32);
        list.add(b33);
        list.add(b34);

        return list;
    }
}
