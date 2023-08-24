package lk.ijse.dep11;

import javafx.animation.FadeTransition;
import javafx.animation.PauseTransition;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class SplashSceneController {
    public ImageView ivSplash;
    public AnchorPane root;
    public void initialize() throws Exception{
        FadeTransition fadeIn = new FadeTransition(Duration.millis(600),root);
        fadeIn.setFromValue(0);   //This is opacity value
        fadeIn.setToValue(1);
        fadeIn.playFromStart();

    }

}

