package sample;

import javafx.scene.Cursor;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class Yrden implements Sign {
    private GraphicsContext gc;
    private Text text;

    public Yrden(Canvas canvas, Text text) {
        gc = canvas.getGraphicsContext2D();
        this.text = text;
    }

    @Override
    public void draw() {
        gc.setStroke(Color.PINK);
        gc.strokeLine(25,100, 195, 100);
        gc.strokeLine(25, 100, 195, 400);
        gc.strokeLine(25, 400, 195, 400);
        gc.strokeLine(195, 100, 147.5, 175);
        gc.strokeLine(25, 400, 67.5, 325);
    }

    @Override
    public void showText() {
        this.text.setText("Yrden");
    }
}
