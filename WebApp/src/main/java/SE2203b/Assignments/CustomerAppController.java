/*
 * Author: Ahmad Sami Abu Shawarib
 * Student #: 251149713
 * Date:  Feb. 28, 2022
 * Description: controller for Customer web version
 */

package SE2203b.Assignments;

import com.jpro.webapi.JProApplication;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.TextAlignment;


import java.net.URL;
import java.util.ResourceBundle;

public class CustomerAppController implements Initializable
{
    protected JProApplication mainApplication;

    public void init(JProApplication jProApplication)
    {
        mainApplication = jProApplication;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //resizes the image on border resize
        BackgroundImage bImg = new BackgroundImage(new Image("file:src/main/resources/SE2203b/Assignments/img/WesternBackground.png"),
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, false));
        Background bGround = new Background(bImg);
        root.setBackground(bGround);
    }

    @FXML
    StackPane root;//the pane
    @FXML
    MenuItem close;//the close button under file menu


    Group popup = new Group();//group containing popup elements
    @FXML
    protected void AboutUs(){
        root.getChildren().remove(popup);//removes previous popup if any

        Label aboutUs = new Label("iFashionStore\nCopyright @2022 SE2203b");//copyright label
        Label name = new Label("Ahmad Abu Shawarib");//red color label
        Button closeButton = new Button("Ok");//close popup button


        aboutUs.setTextAlignment(TextAlignment.CENTER);
        aboutUs.setScaleX(1.5);
        aboutUs.setScaleY(1.5);
        aboutUs.setLayoutX(80);
        aboutUs.setLayoutY(90);


        name.setTextFill(Color.RED);
        name.setScaleX(1.5);
        name.setScaleY(1.5);
        name.setLayoutX(95);
        name.setLayoutY(145);


        closeButton.setOnAction(e ->  root.getChildren().remove(popup));
        closeButton.setLayoutX(250);
        closeButton.setLayoutY(220);


        popup.getChildren().addAll(aboutUs, name, closeButton);
        root.getChildren().add(popup);
        StackPane.setAlignment(popup, Pos.CENTER);
    }
}
