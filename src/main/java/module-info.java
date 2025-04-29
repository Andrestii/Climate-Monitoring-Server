module climatemonitorserver {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens climatemonitorserver to javafx.fxml;
    exports climatemonitorserver;
}
