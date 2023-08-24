package lk.ijse.dep11;

import javafx.animation.FadeTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.Optional;

public class HTMLTextEditorScene {


    public MenuItem mnNew;
    public MenuItem mnExit;
    public AnchorPane root;

    public void mnNewOnAction(ActionEvent actionEvent) throws Exception{

        AnchorPane mainRoot = FXMLLoader.load(getClass().getResource("/view/HTMLTextEditorScene.fxml"));
        Stage htmlStage = new Stage();
        Scene htmlScene = new Scene(mainRoot);
        htmlStage.setScene(htmlScene);
        htmlStage.setTitle("HTML Window");
        htmlStage.show();
    }

    public void mnExit(ActionEvent actionEvent) {

            Optional<ButtonType> result = new Alert(Alert.AlertType.CONFIRMATION,"Are you sure you want to exit?", ButtonType.NO,ButtonType.YES).showAndWait();

            if (result.get()==ButtonType.YES){
                Platform.exit();
            }





    }
}
