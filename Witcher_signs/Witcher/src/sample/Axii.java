package sample;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class Axii implements Sign {
    private GraphicsContext gc;
    private Text text;

    public Axii(Canvas canvas, Text text) {
        gc = canvas.getGraphicsContext2D();
        this.text = text;
    }

    @Override
    public void draw() {
        gc.setStroke(Color.GREEN);
        gc.strokeLine(595, 100, 765, 100);
        gc.strokeLine(595, 100, 680, 400);
        gc.strokeLine(680, 400, 748, 160);

    }

    @Override
    public void showText() {
        this.text.setText("Axii");
    }
}
