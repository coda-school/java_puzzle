package school.coda.javafx.puzzle;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class PuzzleApplication extends Application {

    public static void main(String[] args) {
        Application.launch(PuzzleApplication.class, args);
    }

    @Override
    public void start(Stage stage) {
        // A vous de jouer !
        Scene scene = new Scene(new StackPane(), 800, 600);
        stage.setTitle("Puzzle!");
        stage.setScene(scene);
        stage.show();
    }

}
