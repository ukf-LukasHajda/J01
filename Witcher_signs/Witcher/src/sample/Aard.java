package sample;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class Aard implements Sign {
    private GraphicsContext gc;
    private Text text;

    public Aard(Canvas canvas, Text text) {
        gc = canvas.getGraphicsContext2D();
        this.text = text;
    }

    @Override
    public void draw() {
        gc.setStroke(Color.BLUE);
        gc.strokeLine(785, 400, 955, 400);
        gc.strokeLine(955, 400, 870, 100);
        gc.strokeLine(870, 100, 838.125, 212.5);
        gc.strokeLine(785, 400, 806.25, 325);
        gc.strokeLine(806.25, 325, 870, 325);

    }

    @Override
    public void showText() {
        this.text.setText("Aard");
    }
}
