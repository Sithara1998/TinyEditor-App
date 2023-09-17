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
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.util.Optional;

public class HTMLTextEditorScene {


    public MenuItem mnNew;
    public MenuItem mnExit;
    public AnchorPane root;
    public MenuItem mnUserGuide;
    public MenuItem mnAboutUs;


    public void mnNewOnAction(ActionEvent actionEvent) throws Exception{

        AnchorPane mainRoot = FXMLLoader.load(getClass().getResource("/view/HTMLTextEditorScene.fxml"));
        Stage htmlStage = new Stage();
        Scene htmlScene = new Scene(mainRoot);
        htmlStage.setScene(htmlScene);
        htmlStage.setTitle("Tiny Text Editor");
        htmlStage.show();
    }

    public void mnExit(ActionEvent actionEvent) {
        Optional<ButtonType> result = new Alert(Alert.AlertType.CONFIRMATION,"Are you sure you want to exit?",
                ButtonType.NO,ButtonType.YES).showAndWait();
        if (result.get()==ButtonType.YES){
            Platform.exit();
        }
    }


    public void mnUserGuideOnAction(ActionEvent actionEvent) throws Exception{
        AnchorPane UserGuideRoot = FXMLLoader.load(getClass().getResource("/view/UserGuideScene.fxml"));
        Stage userguideStage = new Stage();
        Scene UserGuideScene = new Scene(UserGuideRoot);

        userguideStage.initModality(Modality.WINDOW_MODAL);
        userguideStage.initOwner(root.getScene().getWindow());

        userguideStage.setScene(UserGuideScene);
        userguideStage.setTitle("User Guide");
        userguideStage.show();

    }

    public void mnAboutUsOnAction(ActionEvent actionEvent) throws Exception{
        AnchorPane aboutUsRoot = FXMLLoader.load(getClass().getResource("/view/AboutUsScene.fxml"));
        Stage aboutUsStage = new Stage();
        Scene aboutUsScene = new Scene(aboutUsRoot);
        aboutUsStage.setScene(aboutUsScene);

//        aboutUsStage.initStyle(StageStyle.TRANSPARENT);
//        aboutUsRoot.setBackground(Background.fill(Color.TRANSPARENT));
//        aboutUsScene.setFill(Color.TRANSPARENT);

        aboutUsStage.setTitle("About TinyEDITOR");
        aboutUsStage.show();

    }
}
