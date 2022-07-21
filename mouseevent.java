

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MouseEventEx extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new Pane();
        Text t = new Text(20, 20, "Welcome");
        pane.getChildren().add(t);

        t.setOnMouseDragged(e -> {
            t.setX(e.getX());
            t.setY(e.getY());
        });

        Scene scene = new Scene(pane, 200, 200);
        stage.setScene(scene);
        stage.show();
    }
}