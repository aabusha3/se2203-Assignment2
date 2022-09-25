/*
 * Author: Ahmad Sami Abu Shawarib
 * Student #: 251149713
 * Date:  Feb. 28, 2022
 * Description: application for admin standalone version
 */

package admin.adminapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AdminApplication.class.getResource("AdminApp-view.fxml"));
        //create JavaFX scene
        Scene scene = new Scene(fxmlLoader.load(), 1040, 725);
        stage.setTitle("iFashionStore");
        stage.getIcons().add(new Image("file:src/main/resources/admin/adminapp/WesternLogo.png"));
        stage.setScene(scene);
        //open JavaFX window
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}