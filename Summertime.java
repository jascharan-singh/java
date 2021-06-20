package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.text.Text;
//import javax.sound.sampled.Line;
import javafx.scene.text.FontWeight;
import javafx.scene.shape.Line;
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Circle mycircle= new Circle();
        mycircle.setCenterX(400.0);
        mycircle.setCenterY(200.0);
        mycircle.setRadius(100);
        mycircle.setFill(Color.AQUA);

        Text mytxt=new Text("Happy Summer 2021!!");
        mytxt.setX(220);
        mytxt.setY(50);
        mytxt.setFont(Font.font(null,FontWeight.BOLD,40));
        mytxt.setFill(Color.GREEN);
        mytxt.setStrokeWidth(1);
        mytxt.setStroke(Color.YELLOW);

        BackgroundFill bkFill= new BackgroundFill(Color.PINK,null,null);
        Button btn1=new Button("STOP");
        Button btn2= new Button("PLAY");
        btn1.setTranslateX(350);
        btn1.setTranslateY(700);
        btn2.setTranslateX(400);
        btn2.setTranslateY(700);

        btn1.setOnAction(new EventHandler<ActionEvent>() {
                             @Override
                             public void handle(ActionEvent actionEvent) {
                                 System.out.println("UNCLICK");

                             }
                         });
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("CLICK");
                for(int i=0; i<5;i++) {
                    mycircle.setCenterY(mycircle.getCenterX() - 10);
                    mycircle.setCenterX(mycircle.getCenterY() + 10);
                }
            }
        });

//            btn2.setOnAction(new EventHandler<ActionEvent>() {
//                @Override
//                public void handle(ActionEvent actionEvent) {
//                    System.out.println("UNCLICK");
//
//                }

            Background bkground = new Background(bkFill);
        Group root =new Group(mycircle, mytxt, btn1,btn2);
        root.setStyle("-fx-background-color: #F0591E;");
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Summer Time");
        primaryStage.setScene(new Scene(root, 800, 800));

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
