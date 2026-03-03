module school.coda.javafx.puzzle {
    requires javafx.controls;
    requires javafx.fxml;

    opens school.coda.javafx.puzzle to javafx.graphics, javafx.fxml;
}