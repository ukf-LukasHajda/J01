package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();
        Scene scene = new Scene(root, 500, 500);

        TextField input = new TextField();
        input.setMaxWidth(300);

        root.getChildren().add(input);
        // When you want to fill scene with color hit enter in input field.
        input.setOnKeyPressed((event) -> {
            // ENTER == 0 as ordinal value
            if (event.getCode().ordinal() == 0) {
                String text = input.getText();
                int red, green, blue;
                int len = text.length();
                int samo = 0;
                int spolu = 0;
                blue = (len % 25) * 10;
               for(int i = 0; i < len; i++) {
                   if ("aeiouyAEIOUY".contains("" + text.charAt(i))) {
                       samo++;
                   }else if ("dtnlhgkDTNLHGmbpvzsfrMBPVZSFR".contains("" + text.charAt(i))){
                       spolu++;
                   }
               }

               red = samo * 16;
               green = spolu * 24;
               // RGB does not take number bigger then 255 otherwise White color is set
               try{
                   scene.setFill(Color.rgb(red, green, blue));
               }catch (Exception e) {
                   scene.setFill(Color.WHITE);
               }

            }
        });

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
