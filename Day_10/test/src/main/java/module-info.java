module minor {
    requires javafx.controls;
    requires javafx.fxml;

    opens minor to javafx.fxml;
    exports minor;
}
