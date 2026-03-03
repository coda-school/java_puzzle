package school.coda.javafx.puzzle;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Objects;

///  Exemple d'application ou on affiche une image seule
public class ImageApplication extends Application {


    public static void main(String[] args) {
        Application.launch(ImageApplication.class, args);
    }

    @Override
    public void start(Stage stage) {

        URL url = Objects.requireNonNull(ImageApplication.class.getResource("/duchess.png"));

        Image image = new Image(url.toString());
        ImageView imageView = new ImageView(image);

        VBox root = new VBox(imageView );
        Scene scene = new Scene(root, 800, 600);
        stage.setTitle("Image!");
        stage.setScene(scene);
        stage.show();
    }



}
