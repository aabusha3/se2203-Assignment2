/*
 * Author: Ahmad Sami Abu Shawarib
 * Student #: 251149713
 * Date:  Feb. 28, 2022
 * Description: application for Customer web version
 */

package SE2203b.Assignments;

import com.jpro.webapi.JProApplication;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class CustomerApplication extends JProApplication
{
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {

        //load user interface as FXML file
        FXMLLoader loader = new FXMLLoader(CustomerApplication.class.getResource("fxml/CustomerApp-view.fxml"));
        Parent root = loader.load();

        CustomerAppController controller = loader.getController();
        controller.init(this);
        controller.close.setOnAction(e -> {
            stage.close();
            Platform.exit();
            System.exit(0);
        });//ends program

        //create JavaFX scene
        Scene scene = new Scene(root);
        stage.setTitle("iFashionStore");
        stage.getIcons().add(new Image("file:src/main/resources/SE2203b/Assignments/img/WesternLogo.png"));
        stage.setScene(scene);
        //open JavaFX window
        stage.show();

    }
}
