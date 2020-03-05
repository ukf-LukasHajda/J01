package sample;

import javafx.scene.Cursor;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class Quen implements Sign {
    private GraphicsContext gc;
    private Text text;

    public Quen(Canvas canvas, Text text) {
        gc = canvas.getGraphicsContext2D();
        this.text = text;
    }
    @Override
    // Little bit of Analytic geometry
    public void draw() {
        gc.setStroke(Color.YELLOW);
        gc.strokeLine(215, 100, 385, 100);
        gc.strokeLine(215, 100, 300, 400);
        gc.strokeLine(300, 400, 300 + (0.75 * 42.5), 400 - (0.75*150));
        gc.strokeLine(385, 100, 368, 160);
        gc.strokeLine(368, 160, 300, 160);

    }

    @Override
    public void showText() {
        this.text.setText("Quen");
    }
}
