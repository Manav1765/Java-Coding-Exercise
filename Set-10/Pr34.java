import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Pr34 extends Application {

    @Override
    public void start(Stage stage) {

        GridPane grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(10);

        TextField roll = new TextField();
        TextField name = new TextField();
        TextField age = new TextField();
        TextField email = new TextField();

        Button submit = new Button("Submit");

        grid.add(new Label("Roll No:"), 0, 0);
        grid.add(roll, 1, 0);
        grid.add(new Label("Name:"), 0, 1);
        grid.add(name, 1, 1);
        grid.add(new Label("Age:"), 0, 2);
        grid.add(age, 1, 2);
        grid.add(new Label("Email:"), 0, 3);
        grid.add(email, 1, 3);
        grid.add(submit, 1, 4);

        submit.setOnAction(e -> {
            try {
                int r = Integer.parseInt(roll.getText());
                int a = Integer.parseInt(age.getText());

                if (!email.getText().contains("@") || !email.getText().contains(".")) {
                    throw new Exception("Invalid Email");
                }

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setContentText("Success!\nRoll: " + r + "\nName: " + name.getText() +
                        "\nAge: " + a + "\nEmail: " + email.getText());
                alert.show();

            } catch (Exception ex) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Error: " + ex.getMessage());
                alert.show();
            }
        });

        Scene scene = new Scene(grid, 400, 250);
        stage.setScene(scene);
        stage.setTitle("Registration Form");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}