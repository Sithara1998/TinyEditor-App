package lk.ijse.dep11;

import javafx.animation.FadeTransition;
import javafx.animation.PauseTransition;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class SplashSceneController {

    public AnchorPane root;
    public ImageView imgCrazy;
    public Point2D point;

    public void initialize() throws Exception{


        FadeTransition fadeIn = new FadeTransition(Duration.millis(600),root);
        fadeIn.setFromValue(0);   //This is opacity value
        fadeIn.setToValue(1);
        fadeIn.playFromStart();

    }

    public void onMouseMove(MouseEvent mouseEvent) {
        Stage primaryStage = (Stage) root.getScene().getWindow();
        primaryStage.setX(mouseEvent.getScreenX()- point.getX());
        primaryStage.setY(mouseEvent.getScreenY()- point.getY());
    }

    public void onMouseClicked(MouseEvent mouseEvent) {
        point = new Point2D(mouseEvent.getX(), mouseEvent.getY());
    }
}

