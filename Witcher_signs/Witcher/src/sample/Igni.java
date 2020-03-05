package sample;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class Igni  implements Sign {
    private GraphicsContext gc;
    private Text text;

    public Igni(Canvas canvas, Text text) {
        gc = canvas.getGraphicsContext2D();
        this.text = text;
    }

    @Override
    public void draw() {
        gc.setStroke(Color.RED);
        gc.strokeLine(405, 400, 490, 100);
        gc.strokeLine(405, 400, 575, 400);
        gc.strokeLine(575, 400, 507, 160);

    }

    @Override
    public void showText() {
        this.text.setText("Igni");
    }
}
