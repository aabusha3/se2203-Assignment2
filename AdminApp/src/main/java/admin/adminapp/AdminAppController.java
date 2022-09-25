/*
 * Author: Ahmad Sami Abu Shawarib
 * Student #: 251149713
 * Date:  Feb. 28, 2022
 * Description: controller for admin standalone version
 */

package admin.adminapp;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;


public class AdminAppController {

    @FXML
    BorderPane root;

    public void initialize(){
        //resizes the image on border resize
        BackgroundImage bImg = new BackgroundImage(new Image("file:src/main/resources/admin/adminapp/WesternBackground.png"),
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, false));
        Background bGround = new Background(bImg);
        root.setBackground(bGround);
    }


    @FXML
    protected void CloseApp() {//ends program
        System.exit(0);
    }


    Stage aboutUsPopUp = new Stage();//group containing popup elements
    @FXML
    protected void AboutUs() {
        aboutUsPopUp.close();//removes previous popup if any
        aboutUsPopUp.setTitle("About Us");
        aboutUsPopUp.getIcons().add(new Image("file:src/main/resources/admin/adminapp/WesternLogo.png"));

        Label aboutUs = new Label("iFashionStore\nCopyright @2022 SE2203b");//copyright label
        aboutUs.setTextAlignment(TextAlignment.CENTER);
        aboutUs.setScaleX(1.5);
        aboutUs.setScaleY(1.5);
        aboutUs.setLayoutX(80);
        aboutUs.setLayoutY(90);

        Label name = new Label("Ahmad Abu Shawarib");//red color label
        name.setTextFill(Color.RED);
        name.setScaleX(1.5);
        name.setScaleY(1.5);
        name.setLayoutX(95);
        name.setLayoutY(145);

        Button closeButton = new Button("Ok");//close popup button
        closeButton.setOnAction(e -> aboutUsPopUp.close());
        closeButton.setLayoutX(250);
        closeButton.setLayoutY(220);

        Pane popUpRoot = new Pane();
        popUpRoot.getChildren().addAll(aboutUs, name, closeButton);

        Scene popUpScene= new Scene(popUpRoot, 300, 260);
        aboutUsPopUp.setScene(popUpScene);
        aboutUsPopUp.show();
    }
}