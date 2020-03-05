package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        HBox root = new HBox();

        Canvas canvas = new Canvas(1000, 500);
        canvas.setCursor(Cursor.HAND);

        Text text = new Text(100, 100, "Nothing is selected");
        text.setStroke(Color.WHITE);
        text.setFont(Font.font(20));

        Sign[] signs = {
                new Yrden(canvas, text),
                new Quen(canvas, text),
                new Igni(canvas, text),
                new Axii(canvas, text),
                new Aard(canvas, text)
        };

        for(int i = 0; i < 5; i++) {
            signs[i].draw();
        }
        root.getChildren().add(canvas);
        root.getChildren().add(text);

        // Get X and Y coordinates from click event 
        root.setOnMouseClicked(e -> {
            double xCor = e.getSceneX();
            double yCor = e.getSceneY();

            if (yCor > 400 || yCor < 100) {
                text.setText("Nothing is Selected");
                return;
            }

            if (xCor >= 25 && xCor <= 195) {
                signs[0].showText();
            } else if (xCor >= 215 && xCor <= 385) {
                signs[1].showText();
            } else if (xCor >= 405 && xCor <= 575) {
                signs[2].showText();
            } else if (xCor >= 595 && xCor <= 765) {
                signs[3].showText();
            } else if (xCor >= 615 && xCor <= 955) {
                signs[4].showText();
            } else {
                text.setText("Nothing is selected");
            }

        });

        Scene scene = new Scene(root, Color.BLACK);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Witcher Signs");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
