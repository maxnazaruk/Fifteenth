package Main;

/**
 * Created by Max on 7/25/2017.
 */

        import javafx.application.Application;
        import javafx.application.Platform;
        import javafx.beans.binding.Bindings;
        import javafx.beans.property.ObjectProperty;
        import javafx.concurrent.Task;
        import javafx.concurrent.WorkerStateEvent;
        import javafx.event.ActionEvent;
        import javafx.event.EventHandler;
        import javafx.geometry.Insets;
        import javafx.geometry.Pos;
        import javafx.geometry.VPos;
        import javafx.scene.Node;
        import javafx.scene.Scene;
        import javafx.scene.control.Alert;
        import javafx.scene.control.Button;
        import javafx.scene.control.Hyperlink;
        import javafx.scene.control.Label;
        import javafx.scene.image.Image;
        import javafx.scene.image.ImageView;
        import javafx.scene.input.KeyCode;
        import javafx.scene.input.KeyEvent;
        import javafx.scene.input.MouseEvent;
        import javafx.scene.layout.*;
        import javafx.scene.paint.Color;
        import javafx.scene.paint.CycleMethod;
        import javafx.scene.paint.LinearGradient;
        import javafx.scene.paint.Stop;
        import javafx.scene.shape.Rectangle;
        import javafx.scene.text.Font;
        import javafx.scene.text.FontWeight;
        import javafx.scene.text.Text;
        import javafx.stage.Stage;

        import java.awt.*;
        import java.time.Duration;
        import java.util.ArrayList;
        import java.util.stream.IntStream;

        import static javafx.scene.layout.BackgroundSize.DEFAULT;


/**
 * Sample application that shows examples of the different layout panes
 * provided by the JavaFX layout API.
 * The resulting UI is for demonstration purposes only and is not interactive.
 */


public class LayoutSample extends Application {
    static boolean switcher = true;
    static dqw dqw = new dqw();
    Scene scene1, scene2;
    static int nClicks = 0;
    static ArrayList<Button> list = new ArrayList<>();
    static boolean flag = false;
    static Color text = Color.web("#ffffff");
    static int timer = 25;
    static String imageURL = "https://s-media-cache-ak0.pinimg.com/originals/3c/c7/29/3cc729139e45856c382a8a674366d9d7.jpg";

static String styleSet = "-fx-background-color: #000023;";
//static String styleSet = "-fx-background-radius: 5em; " +
//        "-fx-min-width: 100px; " +
//        "-fx-min-height: 100px; " +
//        "-fx-max-width: 100px; " +
//        "-fx-max-height: 100px;" +
//        "-fx-background-color: #111122; ";




    @Override
    public void start(Stage primaryStage) {

        Color textOnHover = Color.web("#000000");
        String onHover = "-fx-background-color: #ffec8b; ";

        Button reset = new Button("Reset");
        reset.setTranslateY(-300);
        reset.setTranslateX(-300);
        reset.setMaxWidth(100);

        Button start = new Button("Start");
        start.setTranslateY(-340);
        start.setTranslateX(-300);
        start.setMaxWidth(100);

        Button quit = new Button("Quit");
        quit.setTranslateY(200);
        quit.setTranslateX(-300);
        quit.setMaxWidth(100);

        Button shuffle = new Button("Shuffle");
        shuffle.setTranslateY(- 260);
        shuffle.setTranslateX(-300);
        shuffle.setMaxWidth(100);

        Button sorting = new Button("Do NOT click!");
        sorting.setTranslateY(- 220);
        sorting.setTranslateX(-300);
        sorting.setMaxWidth(100);

        Button set = new Button("SET");
        set.setTranslateY(- 180);
        set.setTranslateX(-300);
        set.setMaxWidth(100);

        primaryStage.setTitle("My First JavaFX GUI");

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Completed");
        alert.setHeaderText(null);
        alert.setContentText("You have successfully completed the puzzle");

        Button up = new Button("Up");
        up.setTranslateY(-40);
        up.setTranslateX(-300);
        up.setMaxWidth(100);

        Button down = new Button("Down");
        down.setTranslateY(0);
        down.setTranslateX(-300);
        down.setMaxWidth(100);

        Button left = new Button("Left");
        left.setTranslateY(40);
        left.setTranslateX(-300);
        left.setMaxWidth(100);

        Button right = new Button("Right");
        right.setTranslateY(80);
        right.setTranslateX(-300);
        right.setMaxWidth(100);

        Button image = new Button("Image");
        image.setTranslateY(-140);
        image.setTranslateX(-300);
        image.setMaxWidth(100);

        Button defaultBackground = new Button("default");
        defaultBackground.setTranslateY(160);
        defaultBackground.setTranslateX(-300);
        defaultBackground.setMaxWidth(100);

        list = buttons(text, styleSet);

//        IntStream.range(0, 4).forEach(
//                i -> button1.fire()
//        );

        StackPane layout1 = new StackPane();
        scene1 = new Scene(layout1, 800, 800);

        layout1.getChildren().addAll(reset, start, quit, shuffle, sorting, set, up, down, left, right, image,defaultBackground);

        layout1.getChildren().addAll(list);
        Image image1 = new Image(String.valueOf(LayoutSample.class.getResource("test.jpg")));
        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(image1, BackgroundRepeat.REPEAT,
                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        image.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    dqw.start(primaryStage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        defaultBackground.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(switcher) {
                    layout1.setBackground(background);
                    switcher = false;
                }else{
                    layout1.setStyle("-fx-background-color: #f4f4f4");
                    switcher = true;
                }
            }
        });


        quit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
                primaryStage.close();
            }
        });

        start.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                onReset(onHover, textOnHover, styleSet, text, primaryStage, alert);
                start.setDisable(true);
            }
        });

            shuffle.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    Task<Void> task = new Task<Void>() {
                        @Override
                        public Void call() throws Exception {
                            for (int i = 1; i <= 150; i++) {
                                shufflePuzzle(list);
                                Thread.sleep(25);
                            }
                            return null;
                        }
                    };
                    new Thread(task).start();
                }
            });

            set.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    TestShuffle();
                }
            });

            sorting.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    Task<Void> task = new Task<Void>() {
                        @Override
                        public Void call() throws Exception {

                            enteringMatrix(list);

                            return null;
                        }
                    };
                    new Thread(task).start();
                }
            });

            up.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    up(list);
                }
            });

            down.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    down(list);
                }
            });

            left.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    left(list);
                }
            });

            right.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    right(list);
                }
            });

        validation(list);

        if(flag){
            start.fire();
        }

        reset.setOnAction(e -> {
            flag = true;
            restart(primaryStage);
                });



        layout1.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                switch (event.getCode()) {
                    case UP:    up.fire(); validation(list); break;
                    case DOWN:  down.fire(); validation(list); break;
                    case LEFT:  left.fire(); validation(list); break;
                    case RIGHT: right.fire(); validation(list); break;
                }
            }
        });


        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static void TestShuffle(){

        //1-----------------------------------------
        list.get(0).setTranslateX(-100);
        list.get(0).setTranslateY(-200);

        list.get(1).setTranslateX(0);
        list.get(1).setTranslateY(-200);

        list.get(2).setTranslateX(100);
        list.get(2).setTranslateY(-200);

        list.get(3).setTranslateX(200);
        list.get(3).setTranslateY(-200);

        //2------------------------------------------
        list.get(4).setTranslateX(-100);
        list.get(4).setTranslateY(-100);

        list.get(5).setTranslateX(0);
        list.get(5).setTranslateY(-100);

        list.get(6).setTranslateX(100);
        list.get(6).setTranslateY(-100);

        list.get(7).setTranslateX(200);
        list.get(7).setTranslateY(-100);

        //3------------------------------------------
        list.get(8).setTranslateX(-100);
        list.get(8).setTranslateY(0);

        list.get(9).setTranslateX(0);
        list.get(9).setTranslateY(0);

        list.get(10).setTranslateX(100);
        list.get(10).setTranslateY(0);

        list.get(11).setTranslateX(200);
        list.get(11).setTranslateY(0);

        //4------------------------------------------
        list.get(13).setTranslateX(-100);
        list.get(13).setTranslateY(100);

        list.get(14).setTranslateX(0);
        list.get(14).setTranslateY(100);

        list.get(12).setTranslateX(100);
        list.get(12).setTranslateY(100);

        list.get(15).setTranslateX(200);
        list.get(15).setTranslateY(100);

    }

    public static void mouseOnHover(Button button, String onHover, Color textOnHover, String styleSet, Color text){
        if(button.getId() != "0"){
        button.setOnMouseMoved(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                button.setStyle(onHover);
                button.setTextFill(textOnHover);

            }
        });
        }

        if(button.getId() != "0") {
            button.setOnMouseExited(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    button.setStyle(styleSet);
                    button.setTextFill(text);
                }
            });
        }
    }

    public static boolean checkRight(ArrayList<Button> list, Button button){

        if (button.getTranslateX() == 200.0){
            return true;
        }
        for (Button b : list){
            if((button.getTranslateX() + 100 == b.getTranslateX() && b.getId() != "0") &&
                    (button.getTranslateY() == b.getTranslateY() && b.getId() != "0")){
                return true;
            }
//            if(button.getTranslateX() + 100 == b.getTranslateX() && button.getTranslateY() == b.getTranslateY()){
//                return true;
//            }
        }
        return false;
    }

    public static boolean checkBottom(ArrayList<Button> list, Button button){
        if(button.getTranslateY() == 100.0){
            return true;
        }
        for (Button b : list){
            if((button.getTranslateX() == b.getTranslateX() && b.getId() != "0") &&
                    (button.getTranslateY() + 100 == b.getTranslateY() && b.getId() != "0")){
                return true;
            }
//            if(button.getTranslateX() == b.getTranslateX() && button.getTranslateY() + 100 == b.getTranslateY()){
//                return true;
//            }
        }
        return false;
    }

    public static boolean checkLeft(ArrayList<Button> list, Button button){
        if(button.getTranslateX() == -100.0){
            return true;
        }
        for (Button b : list){
            if((button.getTranslateX() - 100 == b.getTranslateX() && b.getId() != "0") &&
                    (button.getTranslateY() == b.getTranslateY() && b.getId() != "0")){
                return true;
            }
//            if(button.getTranslateX() - 100 == b.getTranslateX() && button.getTranslateY() == b.getTranslateY()){
//                return true;
//            }
        }
        return false;
    }

    public static boolean checkUp(ArrayList<Button> list, Button button){
        if(button.getTranslateY() == -200.0){
            return true;
        }
        for (Button b : list){
            if((button.getTranslateX() == b.getTranslateX() && b.getId() != "0") &&
                    (button.getTranslateY() - 100 == b.getTranslateY() && b.getId() != "0")){
                return true;
            }
//            if(button.getTranslateX() == b.getTranslateX() && button.getTranslateY() - 100 == b.getTranslateY()){
//                return true;
//            }
        }
        return false;
    }

    public static void onMouseAction(Button button, ArrayList<Button> list, Stage primaryStage, Alert alert){
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                boolean flag = false;
                Button zero = new Button();

                for (Button b : list){
                    if(b.getId() == "0"){
                        zero = b;
                    }
                }

                if(!checkRight(list, button)){
                    button.setTranslateX(button.getTranslateX() + 100);
                    zero.setTranslateX(button.getTranslateX() - 100);
                    if(validation(list)){
                        alert.show();
                    }
                    return;
                }

                if(!checkBottom(list, button)) {
                    button.setTranslateY(button.getTranslateY() + 100);
                    zero.setTranslateY(button.getTranslateY() - 100);
                    if(validation(list)){
                        alert.show();
                    }
                    return;
                }

                if(!checkLeft(list, button)) {

                    button.setTranslateX(button.getTranslateX() - 100);
                    zero.setTranslateX(button.getTranslateX() + 100);
                    if(validation(list)){
                        alert.show();
                    }
                    return;
                }

                if(!checkUp(list, button)) {

                    button.setTranslateY(button.getTranslateY() - 100);
                    zero.setTranslateY(button.getTranslateY() + 100);
                    if(validation(list)){
                        alert.show();
                    }
                    return;
                }
            }
        });
    }

    public static ArrayList<Button> buttons(Color text, String styleSet){
        Button button1= new Button("1");
        button1.setTextFill(text);
        button1.setStyle(styleSet);
        button1.setFont(Font.font("Time New Roman", 20));
        button1.setMaxWidth(100);
        button1.setMaxHeight(100);
        button1.setTranslateX(-100);
        button1.setTranslateY(-200);
        button1.setId("1");


        String firstID = button1.getId();
        System.out.println(firstID);


        Button button2= new Button("2");
        button2.setMaxWidth(100);
        button2.setMaxHeight(100);
        button2.setTextFill(text);
        button2.setStyle(styleSet);
        button2.setFont(Font.font("Time New Roman", 20));


        button2.setTranslateX(button1.getTranslateX() + 100);
        button2.setTranslateY(button1.getTranslateY());

        button2.setId("2");


        Button button3= new Button("3");
        button3.setMaxWidth(100);
        button3.setMaxHeight(100);
        button3.setTextFill(text);
        button3.setStyle(styleSet);
        button3.setFont(Font.font("Time New Roman", 20));


        button3.setTranslateX(button2.getTranslateX() + 100);
        button3.setTranslateY(button2.getTranslateY());

        Button button4= new Button("4");
        button4.setMaxWidth(100);
        button4.setMaxHeight(100);
        button4.setTextFill(text);
        button4.setStyle(styleSet);
        button4.setFont(Font.font("Time New Roman", 20));


        button4.setTranslateX(button3.getTranslateX() + 100);
        button4.setTranslateY(button3.getTranslateY());

        Button button5= new Button("5");
        button5.setMaxWidth(100);
        button5.setMaxHeight(100);
        button5.setTextFill(text);
        button5.setStyle(styleSet);
        button5.setFont(Font.font("Time New Roman", 20));


        button5.setTranslateX(button1.getTranslateX());
        button5.setTranslateY(button1.getTranslateY() + 100);

        Button button6= new Button("6");
        button6.setMaxWidth(100);
        button6.setMaxHeight(100);
        button6.setTextFill(text);
        button6.setStyle(styleSet);
        button6.setFont(Font.font("Time New Roman", 20));


        button6.setTranslateX(button5.getTranslateX() + 100);
        button6.setTranslateY(button5.getTranslateY());

        Button button7= new Button("7");
        button7.setMaxWidth(100);
        button7.setMaxHeight(100);
        button7.setTextFill(text);
        button7.setStyle(styleSet);
        button7.setFont(Font.font("Time New Roman", 20));


        button7.setTranslateX(button6.getTranslateX() + 100);
        button7.setTranslateY(button6.getTranslateY());

        Button button8= new Button("8");
        button8.setMaxWidth(100);
        button8.setMaxHeight(100);
        button8.setTextFill(text);
        button8.setStyle(styleSet);
        button8.setFont(Font.font("Time New Roman", 20));


        button8.setTranslateX(button7.getTranslateX() + 100);
        button8.setTranslateY(button7.getTranslateY());

        Button button9= new Button("9");
        button9.setMaxWidth(100);
        button9.setMaxHeight(100);
        button9.setTextFill(text);
        button9.setStyle(styleSet);
        button9.setFont(Font.font("Time New Roman", 20));


        button9.setTranslateX(button5.getTranslateX());
        button9.setTranslateY(button5.getTranslateY() + 100);

        Button button10= new Button("10");
        button10.setMaxWidth(100);
        button10.setMaxHeight(100);
        button10.setTextFill(text);
        button10.setStyle(styleSet);
        button10.setFont(Font.font("Time New Roman", 20));


        button10.setTranslateX(button9.getTranslateX() + 100);
        button10.setTranslateY(button9.getTranslateY());

        Button button11= new Button("11");
        button11.setMaxWidth(100);
        button11.setMaxHeight(100);
        button11.setTextFill(text);
        button11.setStyle(styleSet);
        button11.setFont(Font.font("Time New Roman", 20));


        button11.setTranslateX(button10.getTranslateX() + 100);
        button11.setTranslateY(button10.getTranslateY());

        Button button12= new Button("12");
        button12.setMaxWidth(100);
        button12.setMaxHeight(100);
        button12.setTextFill(text);
        button12.setStyle(styleSet);
        button12.setFont(Font.font("Time New Roman", 20));


        button12.setTranslateX(button11.getTranslateX() + 100);
        button12.setTranslateY(button11.getTranslateY());

        Button button13= new Button("13");
        button13.setMaxWidth(100);
        button13.setMaxHeight(100);
        button13.setTextFill(text);
        button13.setStyle(styleSet);
        button13.setFont(Font.font("Time New Roman", 20));


        button13.setTranslateX(button9.getTranslateX());
        button13.setTranslateY(button9.getTranslateY() + 100);

        Button button14= new Button("14");
        button14.setMaxWidth(100);
        button14.setMaxHeight(100);
        button14.setTextFill(text);
        button14.setStyle(styleSet);
        button14.setFont(Font.font("Time New Roman", 20));


        button14.setTranslateX(button13.getTranslateX() + 100);
        button14.setTranslateY(button13.getTranslateY());

        Button button15= new Button("15");
        button15.setMaxWidth(100);
        button15.setMaxHeight(100);
        button15.setTextFill(text);
        button15.setStyle(styleSet);
        button15.setFont(Font.font("Time New Roman", 20));


        button15.setTranslateX(button14.getTranslateX() + 100);
        button15.setTranslateY(button14.getTranslateY());

//        button15.setTranslateX(200);
//        button15.setTranslateY(100);

        Button zero= new Button();
        zero.setStyle("-fx-background-color: transparent");
        zero.setMaxWidth(100);
        zero.setMaxHeight(100);
        zero.setTranslateX(-100);
        zero.setTranslateY(-200);
        zero.setTranslateX(button15.getTranslateX() + 100);
        zero.setTranslateY(button15.getTranslateY());
        zero.setId("0");


        button3.setId("3");
        button4.setId("4");
        button5.setId("5");
        button6.setId("6");
        button7.setId("7");
        button8.setId("8");
        button9.setId("9");
        button10.setId("10");
        button11.setId("11");
        button12.setId("12");
        button13.setId("13");
        button14.setId("14");
        button15.setId("15");

        ArrayList<Button> list = new ArrayList<>();
        list.add(button1);
        list.add(button2);
        list.add(button3);
        list.add(button4);
        list.add(button5);
        list.add(button6);
        list.add(button7);
        list.add(button8);
        list.add(button9);
        list.add(button10);
        list.add(button11);
        list.add(button12);
        list.add(button13);
        list.add(button14);
        list.add(button15);
        list.add(zero);

        return list;
    }

    public static void onReset(String onHover, Color textOnHover, String styleSet, Color text, Stage primaryStage, Alert alert){

            for (Button b : list) {
                mouseOnHover(b, onHover, textOnHover, styleSet, text);
                onMouseAction(b, list, primaryStage, alert);

            }

    }

    void restart(Stage stage) {
        cleanup();
        start(stage);
    }

    void cleanup(){
        list = buttons(text, styleSet);
    }

    public static boolean validation(ArrayList<Button> list){
        double x = 100.0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(list.get(i*3 + i +j).getTranslateX() == (double)((j*x) - x) && list.get(i*3 + i +j).getTranslateY() == (double)((i*x)- 2*x)){
                    continue;
                }else{
                    return false;
                }
            }

        }
        System.out.println("FINISH");
        return true;
    }

    public static void shufflePuzzle(ArrayList<Button> list, int number){
        for (int i = 0; i < number; i++) {

        }
    }

    public static void shufflePuzzle(ArrayList<Button> list){
                    int match = generateNumber();
                    if (match == 1) {
                        try {
                            up(list);
                        } catch (ArrayIndexOutOfBoundsException e) {
                            down(list);
                        }
                    } else if (match == 2) {
                        try {
                            down(list);
                        } catch (ArrayIndexOutOfBoundsException e) {
                            up(list);
                        }
                    } else if (match == 3) {
                        try {
                            left(list);
                        } catch (ArrayIndexOutOfBoundsException e) {
                            right(list);
                        }
                    } else {
                        try {
                            right(list);
                        } catch (ArrayIndexOutOfBoundsException e) {
                            left(list);
                        }
                    }
    }

    public static void up(ArrayList<Button> list){

        try {
            Thread.sleep(timer);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        double row =  findeZero(list)[0];
        double place =  findeZero(list)[1];
        Button zero = list.get(list.size()-1);


                for (Button b : list){
                    if(b.getTranslateX() == zero.getTranslateX() && b.getTranslateY() + 100 == zero.getTranslateY()){
                        list.get(list.size()-1).setTranslateX(b.getTranslateX());
                        list.get(list.size()-1).setTranslateY(b.getTranslateY());

                        b.setTranslateX(place);
                        b.setTranslateY(row);

                        return;
                    }
                }

    }

    public static void down(ArrayList<Button> list){

        try {
            Thread.sleep(timer);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        double row =  findeZero(list)[0];
        double place =  findeZero(list)[1];
        Button zero = list.get(list.size()-1);


                for (Button b : list){
                    if(b.getTranslateX() == zero.getTranslateX() && b.getTranslateY() - 100 == zero.getTranslateY()){

                        list.get(list.size()-1).setTranslateX(b.getTranslateX());
                        list.get(list.size()-1).setTranslateY(b.getTranslateY());

                        b.setTranslateX(place);
                        b.setTranslateY(row);
                        return;
                    }
                }


    }


    public static void left(ArrayList<Button> list){
        try {
            Thread.sleep(timer);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        double row =  findeZero(list)[0];
        double place =  findeZero(list)[1];
        Button zero = list.get(list.size()-1);

                for (Button b : list){
                    if(b.getTranslateX() + 100 == zero.getTranslateX() && b.getTranslateY() == zero.getTranslateY()){

                        zero.setTranslateX(b.getTranslateX());
                        zero.setTranslateY(b.getTranslateY());

                        b.setTranslateX(zero.getTranslateX() + 100);
                        b.setTranslateY(zero.getTranslateY());
                        return;
                    }
                }

    }

    public static void right(ArrayList<Button> list){
        try {
            Thread.sleep(timer);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        double row =  findeZero(list)[0];
        double place =  findeZero(list)[1];
        Button zero = list.get(list.size()-1);

                for (Button b : list){
                    if(b.getTranslateX() - 100 == zero.getTranslateX() && b.getTranslateY() == zero.getTranslateY()){


                        zero.setTranslateX(b.getTranslateX());
                        zero.setTranslateY(b.getTranslateY());

                        b.setTranslateX(zero.getTranslateX() - 100);
                        b.setTranslateY(zero.getTranslateY());
                        return;
                    }
                }
    }


    public static double[] findeZero(ArrayList<Button> list){
        double[] x = new double[2];

            for (Button b : list){
                if(b.getId() == "0"){
                    x[1] = b.getTranslateX();
                    x[0] = b.getTranslateY();
                }
            }

            return x;
    }

    public static int generateNumber(){
        int match = 0;
        try {
            match = (int)(Math.random()*4 + 1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return match;
    }

public static final double END_OF_ROW = 200.0;
public static final double END_OF_COLUMN = 100.0;
public static final double START_OF_ROW = -100.0;
public static final double START_OF_COLUMN = -200.0;



            public static void enteringMatrix(ArrayList<Button> list){
                flag = true;


                navigation(list, 1, -200.0, -100.0);
                navigation(list, 2, -200.0, 0.0);
                navigation(list, 3, -200.0, 100.0);
                navigation(list, 4, -200.0, 200.0);
                navigation(list, 5, -100.0, -100.0);
                navigation(list, 6, -100.0, 0.0);
                navigation(list, 7, -100.0, 100.0);
                navigation(list, 8, -100.0, 200.0);
                navigation(list, 9, 0.0, -100.0);
                navigation(list, 10, 0.0, 0.0);
                navigation(list, 11, 0.0, 100.0);
                navigation(list, 12, 0.0, 200.0);
                navigation(list, 13, 100.0, -100.0);




            }

            public static void lastRowNavigation(ArrayList<Button> list, int number, double targetPlace, double targetRow) {
                Button zero = list.get(list.size() - 1);
                while (zero.getTranslateX() != END_OF_ROW) {
                    right(list);
                }
//                if(a[a.length-1][0] == a[a.length-1][1] + 1 || a[a.length-1][1] == a[a.length-1][2] + 1){
//                    System.out.println("unfortunatly this combination cannot be completed!");
//                    flag = false;
//                    return;
//                }

                double rowNumber = list.get(number - 1).getTranslateY();
                double placeNumber = list.get(number - 1).getTranslateX();

                if (targetPlace == placeNumber) {
                    return;
                }
                while (true) {

                    while (zero.getTranslateX() != START_OF_ROW) {
                        left(list);
                    }
                    up(list);
                    right(list);
                    down(list);
                    while (zero.getTranslateX() != END_OF_ROW) {
                        right(list);
                    }
                    up(list);
                    left(list);
                    down(list);
                    left(list);
                    up(list);
                    while (zero.getTranslateX() != END_OF_ROW) {
                        right(list);
                    }
                    down(list);

                    while (zero.getTranslateX() != targetPlace + 100.0) {
                        left(list);
                    }
                    up(list);
                    left(list);
                    down(list);
                    while (zero.getTranslateX() != END_OF_ROW) {
                        right(list);
                    }

                    rowNumber = list.get(number - 1).getTranslateY();
                    placeNumber = list.get(number - 1).getTranslateX();

                    if (rowNumber == targetRow && targetPlace == placeNumber) {
                        break;
                    }
                }
            }

            public static void lastRowNumber(ArrayList<Button> list, int number, double targetPlace, double targetRow){
                Button zero = list.get(list.size() - 1);

                double rowNumber = list.get(number - 1).getTranslateY();
                double placeNumber = list.get(number - 1).getTranslateX();

                if(rowNumber == END_OF_COLUMN && zero.getTranslateX() == targetPlace && placeNumber == targetPlace){
                    down(list);

                    rowNumber = list.get(number - 1).getTranslateY();
                    placeNumber = list.get(number - 1).getTranslateX();
                }

                if(rowNumber == targetRow && placeNumber == targetPlace){
                    return;
                }



                if((placeNumber == targetPlace && zero.getTranslateX() <= targetPlace) ||
                        (placeNumber == targetPlace - 100.0 && zero.getTranslateX() == targetPlace)){
                    while (zero.getTranslateX() != START_OF_ROW){
                        left(list);

                        rowNumber = list.get(number - 1).getTranslateY();
                        placeNumber = list.get(number - 1).getTranslateX();
                    }

                    up(list);

                    while (zero.getTranslateX() != END_OF_ROW){
                        right(list);
                    }

                    down(list);
                    left(list);
                    up(list);

                    while (zero.getTranslateX() != START_OF_ROW){
                        left(list);
                    }
                    down(list);
                }

                if((placeNumber == (END_OF_ROW/2)-100.0 && zero.getTranslateX() >= placeNumber+100.0) ||
                        (placeNumber == targetPlace - 100.0 && zero.getTranslateX() <= placeNumber - 100.0)){
                    while (zero.getTranslateX() != START_OF_ROW){
                        left(list);
                    }
                    up(list);
                    while (zero.getTranslateX() != targetPlace-100.0){
                        right(list);
                    }
                    down(list);
                    right(list);
                    up(list);

                    while (zero.getTranslateX() != START_OF_ROW){
                        left(list);
                    }
                    down(list);

                    rowNumber = list.get(number - 1).getTranslateY();
                    placeNumber = list.get(number - 1).getTranslateX();

                    if(rowNumber == targetRow && placeNumber == targetPlace){
                        return;
                    }
                }


                if((placeNumber == 0.0 && zero.getTranslateX() > placeNumber+100.0)  ||
                        (placeNumber == (100.0) && zero.getTranslateX() < placeNumber - 100.0)){
                    while (zero.getTranslateX() != 0){
                        left(list);
                    }

                    trickMove(list, targetPlace);
                }


                if(placeNumber == START_OF_ROW || (placeNumber == 0.0 && zero.getTranslateX() == START_OF_ROW) ){
                    while (zero.getTranslateX() != START_OF_ROW) {
                        left(list);
                    }
                    up(list);

                    while (zero.getTranslateX() != targetPlace-100.0){
                        right(list);
                    }
                    down(list);
                    left(list);
                    up(list);
                    right(list);

                    down(list);
                    right(list);
                    up(list);
                    left(list);

                    left(list);
                    down(list);
                    right(list);
                    up(list);

                    while (zero.getTranslateX() != 0){
                        left(list);
                    }
                    down(list);
                }
            }

            public static void navigation(ArrayList<Button> list, int number, double targetRow, double targetPlace) {
                Button zero = list.get(list.size() - 1);

                double rowNumber = list.get(number - 1).getTranslateY();
                double placeNumber = list.get(number - 1).getTranslateX();

                double fixedRow = rowNumber;

                if(targetRow == END_OF_COLUMN){
                    lastRowNavigation(list, number, targetPlace, targetRow);
                }


                if (targetPlace == END_OF_ROW && targetRow == END_OF_COLUMN - 100.0){
                    lastRowNumber(list, number, targetPlace, targetRow);
                }

                rowNumber = list.get(number - 1).getTranslateY();
                placeNumber = list.get(number - 1).getTranslateX();

                if (targetRow == rowNumber && targetPlace == placeNumber) {
                    return;
                }

                if (targetRow == rowNumber && targetPlace < END_OF_ROW && targetRow != END_OF_COLUMN) {

                    onSameRow(list, number, targetRow, targetPlace);
                }

                if (rowNumber == END_OF_COLUMN && zero.getTranslateY() <= rowNumber && targetRow <= -100.0 && targetPlace < END_OF_ROW) {

                    moveTargetOnLastRow(list, number, targetPlace, targetRow);

                    setZeroToRollPosition(list, number, targetRow, targetPlace);

                    rollNumber(list, number, targetRow, targetPlace);

                }
                if (rowNumber > targetRow && rowNumber < END_OF_COLUMN && targetPlace < END_OF_ROW) {

                    if (placeNumber != targetPlace) {
                        moveNumberOnTheMiddleArea(list, number, targetPlace, targetRow);
                    }

                    setZeroToRollPosition(list, number, targetRow, targetPlace);

                    rollNumber(list, number, targetRow, targetPlace);

                }

                if (targetPlace == END_OF_ROW && targetRow != END_OF_COLUMN - 100.0) {
                    rowNumber = list.get(number - 1).getTranslateY();
                    placeNumber = list.get(number - 1).getTranslateX();

                    fixedRow = rowNumber;

                    if (rowNumber != targetRow || targetPlace != placeNumber) {


                        if (rowNumber == END_OF_COLUMN) {
                            moveTargetOnLastRow(list, number, targetPlace - 100.0, targetRow);

                            setZeroToRollPosition(list, number, targetRow + 100.0, targetPlace);

                            rollNumber(list, number, targetRow + 100.0, targetPlace - 100.0);

                            upZeroToNumber(list, number, targetRow);

                            moveLastNumberToThePlace(list, number, targetRow, targetPlace);
                        }

                        if (rowNumber < END_OF_COLUMN) {
                            decomposition1(list, number, targetPlace, targetRow);
                        }
                    }
                }

                if(targetRow == END_OF_COLUMN - 100.0 && targetPlace < 100.0){
                    preLastRowLowMiddleItems(list, number, targetPlace, targetRow);
                }
//----------------------------------------------------------------------------------------------------------

                if(targetRow == END_OF_COLUMN - 100.0 && targetPlace >= 100.0 && targetPlace != END_OF_ROW){

                    rowNumber = list.get(number - 1).getTranslateY();
                    placeNumber = list.get(number - 1).getTranslateX();

                    if(zero.getTranslateX() < placeNumber && zero.getTranslateY() == END_OF_COLUMN &&
                            placeNumber == END_OF_ROW && rowNumber == END_OF_COLUMN){
                        while (zero.getTranslateX() != targetPlace){
                            right(list);
                        }
                    }

                    if((rowNumber == END_OF_COLUMN && placeNumber >= targetPlace && zero.getTranslateX() >= targetPlace) ||
                            rowNumber == targetRow && placeNumber>targetPlace){
                        if(zero.getTranslateX() < targetPlace && placeNumber != targetPlace){
                            while (zero.getTranslateX() != targetPlace){
                                right(list);

                                rowNumber = list.get(number - 1).getTranslateY();
                                placeNumber = list.get(number - 1).getTranslateX();
                            }
                        }
                        if(placeNumber >= targetPlace) {
                            while (true) {
                                afterMiddleRoll(list, number, targetRow, targetPlace);

                                rowNumber = list.get(number - 1).getTranslateY();
                                placeNumber = list.get(number - 1).getTranslateX();

                                if (rowNumber == targetRow && targetPlace == placeNumber) {
                                    return;
                                }
                            }
                        }
                    }

                    rowNumber = list.get(number - 1).getTranslateY();
                    placeNumber = list.get(number - 1).getTranslateX();

                    if (rowNumber == targetRow && targetPlace == placeNumber) {
                        return;
                    }

                    if((placeNumber <= targetPlace - 100.0 && rowNumber == END_OF_COLUMN) ||
                            (placeNumber == targetPlace && zero.getTranslateX() <= targetPlace - 100.0)){

                        onLowerPolace(list, number, targetRow, targetPlace);
                    }
                }
                //----------------------------------------------------------------------------------------------------------

            }

            public static void roll(ArrayList<Button> list){
                left(list);
                up(list);
                right(list);
            }

            public static void trickMove(ArrayList<Button> list, double targetPlace){
                Button zero = list.get(list.size() - 1);

                up(list);

                while ( zero.getTranslateX() != targetPlace - 100.0){
                    right(list);
                }

                down(list);

                right(list);

                up(list);

                while (zero.getTranslateX() != START_OF_ROW){
                    left(list);
                }
                down(list);
            }

            public static void rightRoll(ArrayList<Button> list){
                down(list);
                left(list);
                up(list);
            }

            public static void afterMiddleRoll(ArrayList<Button> list, int number, double targetRow, double targetPlace){
                Button zero = list.get(list.size() - 1);

                double rowNumber = list.get(number - 1).getTranslateY();
                double placeNumber = list.get(number - 1).getTranslateX();


                if (zero.getTranslateY() == targetRow && zero.getTranslateX() == targetPlace) {
                    down(list);
                    rowNumber = list.get(number - 1).getTranslateY();
                    placeNumber = list.get(number - 1).getTranslateX();

                    if (targetPlace == placeNumber && targetRow == rowNumber) {
                        return;
                    }
                }

                if (zero.getTranslateY() == END_OF_COLUMN && zero.getTranslateX() == targetPlace) {
                    while (zero.getTranslateX() != END_OF_ROW) {
                        right(list);
                        rowNumber = list.get(number - 1).getTranslateY();
                        placeNumber = list.get(number - 1).getTranslateX();

                        if (targetPlace == placeNumber && targetRow == rowNumber) {
                            return;
                        }
                    }
                }

                if (zero.getTranslateY() == END_OF_COLUMN && zero.getTranslateX() == END_OF_ROW) {
                    up(list);
                }


                if (zero.getTranslateY() == targetRow && zero.getTranslateX() == END_OF_ROW) {
                    while (zero.getTranslateX() != targetPlace) {
                        left(list);
                    }
                }

            }


            public static void onSameRow(ArrayList<Button> lsit, int number, double targetRow, double targetPlace) {

                Button zero = list.get(list.size() - 1);

                double rowNumber = list.get(number - 1).getTranslateY();
                double placeNumber = list.get(number - 1).getTranslateX();

                while (rowNumber != targetRow || placeNumber != targetPlace) {

                    if (zero.getTranslateY() > targetRow + 100.0) {
                        while (zero.getTranslateY() != targetRow + 100.0) {
                            up(list);

                            rowNumber = list.get(number - 1).getTranslateY();
                            placeNumber = list.get(number - 1).getTranslateX();

                            if (rowNumber == targetRow && placeNumber == targetPlace) {
                                break;
                            }
                        }
                    }
                    rowNumber = list.get(number - 1).getTranslateY();
                    placeNumber = list.get(number - 1).getTranslateX();
                    if (rowNumber == targetRow && placeNumber == targetPlace) {
                        break;
                    }
                    if (zero.getTranslateY() == targetRow) {
                        while (zero.getTranslateX() != targetPlace) {
                            left(list);

                            rowNumber = list.get(number - 1).getTranslateY();
                            placeNumber = list.get(number - 1).getTranslateX();

                            if (rowNumber == targetRow && placeNumber == targetPlace) {
                                break;
                            }
                        }
                    }
                    if (zero.getTranslateY() == targetRow && zero.getTranslateX() == targetPlace) {
                        down(list);
                    }
                    rowNumber = list.get(number - 1).getTranslateY();
                    placeNumber = list.get(number - 1).getTranslateX();
                    if (rowNumber == targetRow && placeNumber == targetPlace) {
                        break;
                    }

                    if (zero.getTranslateY() == targetRow + 100.0) {
                        while (zero.getTranslateX() != END_OF_ROW) {
                            right(lsit);

                            rowNumber = list.get(number - 1).getTranslateY();
                            placeNumber = list.get(number - 1).getTranslateX();

                            if (rowNumber == targetRow && placeNumber == targetPlace) {
                                break;
                            }
                        }
                    }

                    if (zero.getTranslateY() == targetRow + 100.0 && zero.getTranslateX() == END_OF_ROW) {
                        up(list);
                    }

                    rowNumber = list.get(number - 1).getTranslateY();
                    placeNumber = list.get(number - 1).getTranslateX();

                }
            }
//
            public static void moveTargetOnLastRow(ArrayList<Button> list, int number, double targetPlace, double targetRow) {
                Button zero = list.get(list.size() - 1);

                double rowNumber = list.get(number - 1).getTranslateY();
                double placeNumber = list.get(number - 1).getTranslateX();


                double fixedRow = rowNumber;

                while (true) {

                    if (zero.getTranslateY() == fixedRow) {
                        up(list);

                        rowNumber = list.get(number - 1).getTranslateY();
                        placeNumber = list.get(number - 1).getTranslateX();
                    }

                    while (zero.getTranslateY() != fixedRow - 100.0) {
                        down(list);
                    }

                    if (zero.getTranslateX() > START_OF_ROW && zero.getTranslateY() == fixedRow - 100.0) {
                        while (zero.getTranslateX() != START_OF_ROW) {
                            left(list);

                            rowNumber = list.get(number - 1).getTranslateY();
                            placeNumber = list.get(number - 1).getTranslateX();

                            if (placeNumber == targetPlace && rowNumber == fixedRow - 100.0) {
                                break;
                            }
                        }
                    }

                    if (placeNumber == targetPlace && rowNumber == fixedRow - 100.0) {
                        break;
                    }

                    if (zero.getTranslateX() == START_OF_ROW && zero.getTranslateY() == fixedRow - 100.0) {
                        down(list);

                        rowNumber = list.get(number - 1).getTranslateY();
                        placeNumber = list.get(number - 1).getTranslateX();
                    }

                    if (placeNumber == targetPlace && rowNumber == fixedRow - 100.0) {
                        break;
                    }

                    if (zero.getTranslateX() < END_OF_ROW && zero.getTranslateY() == fixedRow) {
                        while (zero.getTranslateX() != END_OF_ROW) {
                            right(list);
                        }
                    }
                    if (zero.getTranslateX() == END_OF_ROW && zero.getTranslateY() == fixedRow) {
                        up(list);
                    }
                }
            }

            public static void setZeroToRollPosition(ArrayList<Button> list, int number, double targetRow, double targetPlace) {
                Button zero = list.get(list.size() - 1);

                double rowNumber = list.get(number - 1).getTranslateY();
                double placeNumber = list.get(number - 1).getTranslateX();

                if(targetPlace == placeNumber && zero.getTranslateX() > targetPlace + 100.0){
                    while (zero.getTranslateX() != targetPlace + 100.0){
                        left(list);
                    }

                    while (zero.getTranslateY() != targetRow){
                        up(list);
                    }
                }

                if(targetPlace == placeNumber && zero.getTranslateX() <= targetPlace){


                    while (zero.getTranslateY() != END_OF_COLUMN) {
                        down(list);
                    }

                    while (zero.getTranslateX() != targetPlace + 100.0) {
                        right(list);
                    }

                    while (zero.getTranslateY() != targetRow) {
                        up(list);
                    }

                }

                if (targetRow == rowNumber && targetPlace == placeNumber) {
                    return;
                }

                rowNumber = list.get(number - 1).getTranslateY();
                placeNumber = list.get(number - 1).getTranslateX();

                if (zero.getTranslateY() <= rowNumber && zero.getTranslateX() <= placeNumber) {
                    while (zero.getTranslateY() != END_OF_COLUMN) {
                        down(list);

                        rowNumber = list.get(number - 1).getTranslateY();
                        placeNumber = list.get(number - 1).getTranslateX();

                        if (rowNumber == targetRow && targetPlace == placeNumber) {
                            break;
                        }
                    }
                }

                rowNumber = list.get(number - 1).getTranslateY();
                placeNumber = list.get(number - 1).getTranslateX();

                if (zero.getTranslateY() <= rowNumber && zero.getTranslateX() == placeNumber + 100.0) {
                    while (zero.getTranslateY() != END_OF_COLUMN) {
                        down(list);

                        rowNumber = list.get(number - 1).getTranslateY();
                        placeNumber = list.get(number - 1).getTranslateX();

                        if (rowNumber == targetRow && targetPlace == placeNumber) {
                            break;
                        }
                    }
                }

                if (zero.getTranslateY() == END_OF_COLUMN && zero.getTranslateX() <= placeNumber) {
                    while (zero.getTranslateX() != placeNumber + 100.0) {
                        right(list);

                        rowNumber = list.get(number - 1).getTranslateY();
                        placeNumber = list.get(number - 1).getTranslateX();

                        if (rowNumber == targetRow && targetPlace == placeNumber) {
                            break;
                        }
                    }
                }

                if(zero.getTranslateY() == targetRow && zero.getTranslateX() > targetPlace && placeNumber == targetPlace){
                    while (zero.getTranslateX() != targetPlace){
                        left(list);
                    }
                }

                if(zero.getTranslateY() == targetRow && zero.getTranslateX()<= targetPlace && placeNumber == targetPlace){
                    while (zero.getTranslateX() != targetPlace){
                        right(list);
                    }
                }

                if(zero.getTranslateY() == targetRow && zero.getTranslateX() == placeNumber){
                    return;
                }

                if (zero.getTranslateY() == END_OF_COLUMN && zero.getTranslateX() == placeNumber + 100.0) {
                    while (zero.getTranslateY() != targetRow) {
                        up(list);

                        rowNumber = list.get(number - 1).getTranslateY();
                        placeNumber = list.get(number - 1).getTranslateX();

                        if (rowNumber == targetRow && targetPlace == placeNumber) {
                            break;
                        }
                    }
                }
            }

            public static void moveNumberOnTheMiddleArea(ArrayList<Button> list, int number, double targetPlace, double targetRow) {
                Button zero = list.get(list.size() - 1);

                double rowNumber = list.get(number - 1).getTranslateY();
                double placeNumber = list.get(number - 1).getTranslateX();

                if(rowNumber == zero.getTranslateY() + 100.0 && targetPlace + 100.0 == placeNumber && targetPlace+100.0 == END_OF_ROW &&
                        zero.getTranslateX() == targetPlace + 100.0 && zero.getTranslateY() == targetRow){
                    down(list);
                    return;
                }

                double fixedRow = rowNumber;
                if (zero.getTranslateY() <= rowNumber) {
                    if (zero.getTranslateX() == placeNumber) {
                        fixedRow -= 100.0;
                    }

                    while (zero.getTranslateY() != rowNumber + 100.0) {
                        down(list);

                        rowNumber = list.get(number - 1).getTranslateY();
                        placeNumber = list.get(number - 1).getTranslateX();

                        if (rowNumber == targetRow && targetPlace == placeNumber) {
                            break;
                        }


                        if(targetPlace+100.0 == zero.getTranslateX() && targetPlace+100.0 == placeNumber && rowNumber == targetRow){
                            break;
                        }
                    }
                }



                rowNumber = list.get(number - 1).getTranslateY();
                placeNumber = list.get(number - 1).getTranslateX();

                if (rowNumber == targetRow && targetPlace == placeNumber + 100.0 && targetPlace == END_OF_ROW) {
                    return;
                }

                if (zero.getTranslateY() > rowNumber) {
                    while (zero.getTranslateY() != rowNumber + 100.0) {
                        up(list);

                        rowNumber = list.get(number - 1).getTranslateY();
                        placeNumber = list.get(number - 1).getTranslateX();

                        if (rowNumber == targetRow && targetPlace == placeNumber) {
                            break;
                        }
                    }
                }

                rowNumber = list.get(number - 1).getTranslateY();
                placeNumber = list.get(number - 1).getTranslateX();
                while (true) {
                    if (zero.getTranslateY() == fixedRow + 100.0 && zero.getTranslateX() >= START_OF_ROW) {
                        while (zero.getTranslateX() != END_OF_ROW) {
                            right(list);

                            placeNumber = list.get(number - 1).getTranslateX();

                            if (placeNumber == targetPlace) {
                                break;
                            }

                            rowNumber = list.get(number - 1).getTranslateY();
                            placeNumber = list.get(number - 1).getTranslateX();

                            if (rowNumber == targetRow && targetPlace == placeNumber) {
                                break;
                            }
                        }
                    }

                    if (placeNumber == targetPlace) {
                        break;
                    }

                    rowNumber = list.get(number - 1).getTranslateY();
                    placeNumber = list.get(number - 1).getTranslateX();

                    if (rowNumber == targetRow && targetPlace == placeNumber) {
                        break;
                    }

                    rowNumber = list.get(number - 1).getTranslateY();
                    placeNumber = list.get(number - 1).getTranslateX();

                    if (zero.getTranslateY() == fixedRow + 100.0 && zero.getTranslateX() == END_OF_ROW) {
                        up(list);

                        rowNumber = list.get(number - 1).getTranslateY();
                        placeNumber = list.get(number - 1).getTranslateX();

                        if (rowNumber == targetRow && targetPlace == placeNumber) {
                            break;
                        }
                    }

                    if (zero.getTranslateY() == fixedRow && zero.getTranslateX() == END_OF_ROW) {
                        while (zero.getTranslateX() != START_OF_ROW) {
                            left(list);

                            placeNumber = list.get(number - 1).getTranslateX();


                            if (placeNumber == targetPlace) {
                                break;
                            }

                            rowNumber = list.get(number - 1).getTranslateY();
                            placeNumber = list.get(number - 1).getTranslateX();

                            if (rowNumber == targetRow && targetPlace == placeNumber) {
                                break;
                            }
                        }
                    }

                    rowNumber = list.get(number - 1).getTranslateY();
                    placeNumber = list.get(number - 1).getTranslateX();

                    if (rowNumber == targetRow && targetPlace == placeNumber) {
                        break;
                    }

                    placeNumber = list.get(number - 1).getTranslateX();

                    if (placeNumber == targetPlace) {
                        break;
                    }

                    if (zero.getTranslateY() == fixedRow && zero.getTranslateX() == START_OF_ROW) {
                        down(list);

                        rowNumber = list.get(number - 1).getTranslateY();
                        placeNumber = list.get(number - 1).getTranslateX();

                        if (rowNumber == targetRow && targetPlace == placeNumber) {
                            break;
                        }
                    }
                }
            }

            public static void rollNumber(ArrayList<Button> list, int number, double targetRow, double targetPlace) {
                Button zero = list.get(list.size() - 1);

                double rowNumber = list.get(number - 1).getTranslateY();
                double placeNumber = list.get(number - 1).getTranslateX();

                while (true) {

                 rowNumber = list.get(number - 1).getTranslateY();
                 placeNumber = list.get(number - 1).getTranslateX();

                    if (zero.getTranslateY() >= targetRow && zero.getTranslateX() == targetPlace + 100.0) {
                        while (zero.getTranslateY() != END_OF_COLUMN) {
                            down(list);
                        }
                    }


                    if (zero.getTranslateY() == END_OF_COLUMN && zero.getTranslateX() == targetPlace + 100.0) {
                        left(list);
                    }

                    if (zero.getTranslateY() == END_OF_COLUMN && zero.getTranslateX() == targetPlace) {
                        while (zero.getTranslateY() != targetRow) {
                            up(list);
                        }
                    }

                    if (zero.getTranslateY() == targetRow && zero.getTranslateX() == targetPlace) {
                        right(list);

                        rowNumber = list.get(number - 1).getTranslateY();
                        placeNumber = list.get(number - 1).getTranslateX();

                        if (placeNumber == targetPlace && rowNumber == targetRow) {
                            break;
                        }
                    }

                    if (placeNumber == targetPlace && rowNumber == targetRow) {
                        break;
                    }
                }
            }

            public static void upZeroToNumber(ArrayList<Button> list, int number, double targetRow) {
                Button zero = list.get(list.size() - 1);
                    double rowNumber = list.get(number - 1).getTranslateY();
                    double placeNumber = list.get(number - 1).getTranslateX();

                double fixedRow = rowNumber;

                if (zero.getTranslateY() == targetRow + 100.0 && zero.getTranslateX() == END_OF_ROW) {
                    while (zero.getTranslateY() != END_OF_COLUMN) {
                        down(list);
                    }
                }
                if (zero.getTranslateY()== END_OF_COLUMN && zero.getTranslateX() == END_OF_ROW) {
                    while (zero.getTranslateX() != START_OF_ROW) {
                        left(list);
                    }
                }


                if (zero.getTranslateY() == END_OF_COLUMN && zero.getTranslateX() == START_OF_ROW) {
                    while (zero.getTranslateY() != rowNumber) {
                        up(list);
                    }
                }
            }

            public static void moveLastNumberToThePlace(ArrayList<Button> list, int number, double targetRow, double targetPlace) {
                Button zero = list.get(list.size() - 1);

                double rowNumber = list.get(number - 1).getTranslateY();
                double placeNumber = list.get(number - 1).getTranslateX();

                double fixedRow = rowNumber;

                if (zero.getTranslateY() == rowNumber && zero.getTranslateX() == START_OF_ROW) {
                    up(list);

                    while (zero.getTranslateX() != placeNumber) {
                        right(list);
                    }
                }

                if (zero.getTranslateX() == placeNumber && zero.getTranslateY() == rowNumber - 100.0) {
                    down(list);
                }

                if (zero.getTranslateY() == rowNumber && zero.getTranslateX() == placeNumber) {
                    right(list);
                }

                if (zero.getTranslateY() == rowNumber && zero.getTranslateX() == END_OF_ROW) {
                    up(list);
                }

                if (zero.getTranslateY() == targetRow && zero.getTranslateX() == targetPlace) {
                    while (zero.getTranslateX() != START_OF_ROW) {
                        left(list);
                    }
                }

                if (zero.getTranslateY() == targetRow && zero.getTranslateX() == START_OF_ROW) {
                    down(list);
                }
            }

            public static void decomposition1(ArrayList<Button> list, int number, double targetPlace, double targetRow){

                Button zero = list.get(list.size() - 1);

                double rowNumber = list.get(number - 1).getTranslateY();
                double placeNumber = list.get(number - 1).getTranslateX();

                moveNumberOnTheMiddleArea(list, number, targetPlace - 100.0, targetRow);

                rowNumber = list.get(number - 1).getTranslateY();
                placeNumber = list.get(number - 1).getTranslateX();

                if (targetRow == rowNumber && targetPlace == placeNumber) {
                    return;
                }

                setZeroToRollPosition(list, number, targetRow + 100.0, targetPlace);

                rowNumber = list.get(number - 1).getTranslateY();
                placeNumber = list.get(number - 1).getTranslateX();

                if (targetRow == rowNumber && targetPlace == placeNumber) {
                    return;
                }
                rollNumber(list, number, targetRow + 100.0, targetPlace - 100.0);

                rowNumber = list.get(number - 1).getTranslateY();
                placeNumber = list.get(number - 1).getTranslateX();

                if (targetRow == rowNumber && targetPlace == placeNumber) {
                    return;
                }

                upZeroToNumber(list, number, targetRow);

                rowNumber = list.get(number - 1).getTranslateY();
                placeNumber = list.get(number - 1).getTranslateX();

                if (targetRow == rowNumber && targetPlace == placeNumber) {
                    return;
                }

                moveLastNumberToThePlace(list, number, targetRow, targetPlace);

                rowNumber = list.get(number - 1).getTranslateY();
                placeNumber = list.get(number - 1).getTranslateX();

                if (targetRow == rowNumber && targetPlace == placeNumber) {
                    return;
                }
            }

            public static void preLastRowLowMiddleItems(ArrayList<Button> list, int number, double targetPlace ,double targetRow){
                Button zero = list.get(list.size() - 1);

                double rowNumber = list.get(number - 1).getTranslateY();
                double placeNumber = list.get(number - 1).getTranslateX();

                double fixedRow = rowNumber;

                if(targetPlace == START_OF_ROW){
                    onSameRow(list, number, targetRow, targetPlace);
                }

                if(targetPlace > START_OF_ROW && targetPlace < END_OF_ROW){

                    rowNumber = list.get(number - 1).getTranslateY();
                    placeNumber = list.get(number - 1).getTranslateX();

                    if(zero.getTranslateY() != END_OF_COLUMN) {
                        down(list);

                        rowNumber = list.get(number - 1).getTranslateY();
                        placeNumber = list.get(number - 1).getTranslateX();
                    }

                    if(rowNumber == targetRow && placeNumber == targetPlace){
                        return;
                    }

                    if(zero.getTranslateX() < targetPlace){

                        while (zero.getTranslateX() != targetPlace) {
                            right(list);
                        }
                    }

                    if(zero.getTranslateX() > targetPlace){

                        while (zero.getTranslateX() != targetPlace) {
                            left(list);
                        }
                    }

                    while(true) {
                        if (zero.getTranslateY() == END_OF_COLUMN && placeNumber < targetPlace) {
                            roll(list);

                            right(list);
                            down(list);
                            left(list);

                            roll(list);

                            down(list);

                            roll(list);

                            right(list);
                            down(list);

                            roll(list);
                        }

                        rowNumber = list.get(number - 1).getTranslateY();
                        placeNumber = list.get(number - 1).getTranslateX();

                        if (targetRow == rowNumber && targetPlace == placeNumber) {
                            return;
                        }

                        if (zero.getTranslateY() == END_OF_COLUMN && placeNumber >= targetPlace) {

                            while (true) {
                                while (zero.getTranslateX() != END_OF_ROW) {
                                    right(list);
                                }

                                if (zero.getTranslateX() == END_OF_ROW && zero.getTranslateY() == END_OF_COLUMN) {
                                    up(list);
                                }

                                if (zero.getTranslateX() == END_OF_ROW && zero.getTranslateY() == targetRow) {
                                    while (zero.getTranslateX() != targetPlace) {
                                        left(list);
                                    }
                                }

                                if (zero.getTranslateX() == targetPlace && zero.getTranslateY() == targetRow) {
                                    down(list);

                                    rowNumber = list.get(number - 1).getTranslateY();
                                    placeNumber = list.get(number - 1).getTranslateX();

                                    if (rowNumber == targetRow && placeNumber == targetPlace) {
                                        break;
                                    }

                                }
                            }
                        }


                    }

                }
            }

            public static void onLowerPolace(ArrayList<Button> list, int number, double targetRow, double targetPlace){
                Button zero = list.get(list.size() - 1);

                double rowNumber = list.get(number - 1).getTranslateY();
                double placeNumber = list.get(number - 1).getTranslateX();

                if(zero.getTranslateY() != END_OF_COLUMN){
                    down(list);

                    rowNumber = list.get(number - 1).getTranslateY();
                    placeNumber = list.get(number - 1).getTranslateX();
                }

                if(zero.getTranslateY() == END_OF_COLUMN){
                    while (zero.getTranslateX() != START_OF_ROW){
                        left(list);

                   rowNumber = list.get(number - 1).getTranslateY();
                   placeNumber = list.get(number - 1).getTranslateX();
                    }
                }

                if(zero.getTranslateY() == END_OF_COLUMN && zero.getTranslateX() == START_OF_ROW){
                    up(list);

                    rowNumber = list.get(number - 1).getTranslateY();
                    placeNumber = list.get(number - 1).getTranslateX();
                }

                right(list);

                rowNumber = list.get(number - 1).getTranslateY();
                placeNumber = list.get(number - 1).getTranslateX();

                while (true){

                    right(list);
                    rowNumber = list.get(number - 1).getTranslateY();
                    placeNumber = list.get(number - 1).getTranslateX();

                    if(rowNumber == targetRow && placeNumber == targetPlace - 100.0){
                        break;
                    }
                    rightRoll(list);
                }

                while (zero.getTranslateX() != START_OF_ROW){
                    left(list);
                    rowNumber = list.get(number - 1).getTranslateY();
                    placeNumber = list.get(number - 1).getTranslateX();
                }

                down(list);
            }

}
