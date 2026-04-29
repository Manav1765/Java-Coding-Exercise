import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Pr35 extends Application {

    @Override
    public void start(Stage stage) {

        HBox root = new HBox(20);
        root.setStyle("-fx-alignment: center;");

        root.getChildren().add(createBar("Projects", 20, Color.RED));
        root.getChildren().add(createBar("Quizzes", 10, Color.BLUE));
        root.getChildren().add(createBar("Midterm", 30, Color.GREEN));
        root.getChildren().add(createBar("Final", 40, Color.ORANGE));

        Scene scene = new Scene(root, 500, 300);
        stage.setTitle("Bar Chart");
        stage.setScene(scene);
        stage.show();
    }

    private VBox createBar(String name, int percentage, Color color) {
        Rectangle rect = new Rectangle(50, percentage * 3);
        rect.setFill(color);

        Text label = new Text(name + " - " + percentage + "%");

        VBox vbox = new VBox(10);
        vbox.setStyle("-fx-alignment: bottom_center;");
        vbox.getChildren().addAll(rect, label);

        return vbox;
    }

    public static void main(String[] args) {
        launch();
    }
}