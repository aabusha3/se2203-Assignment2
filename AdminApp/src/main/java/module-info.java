module admin.adminapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens admin.adminapp to javafx.fxml;
    exports admin.adminapp;
}