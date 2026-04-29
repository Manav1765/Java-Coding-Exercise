import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.Random;

public class Pr33 extends Application {

    @Override
    public void start(Stage stage) {
        VBox vbox = new VBox(10);
        vbox.setStyle("-fx-alignment: center;");

        Random rand = new Random();

        for (int i = 1; i <= 5; i++) {
            Text text = new Text("Text " + i);
            text.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));

            text.setFill(Color.color(rand.nextDouble(), rand.nextDouble(), rand.nextDouble()));
            text.setOpacity(0.3 + (rand.nextDouble() * 0.7));

            vbox.getChildren().add(text);
        }

        Scene scene = new Scene(vbox, 400, 300);
        stage.setTitle("Styled Text");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}