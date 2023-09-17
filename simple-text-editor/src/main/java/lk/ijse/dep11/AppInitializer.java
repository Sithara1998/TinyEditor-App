package lk.ijse.dep11;

import javafx.animation.FadeTransition;
import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import javax.swing.text.html.HTML;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{


        AnchorPane root = FXMLLoader.load(getClass().getResource("/view/SplashScene.fxml"));
        Scene mainScene = new Scene(root);
        primaryStage.setScene(mainScene);

        primaryStage.initStyle(StageStyle.TRANSPARENT);
        root.setBackground(Background.fill(Color.TRANSPARENT));
        mainScene.setFill(Color.TRANSPARENT);
        primaryStage.centerOnScreen();
        primaryStage.show();


        PauseTransition pause = new PauseTransition(Duration.millis(4000));
        pause.setOnFinished(e->{

            try {
                primaryStage.close();
                HTMLMethod();
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        });
        pause.play();


    }
    public void HTMLMethod() throws Exception{
        AnchorPane mainRoot = FXMLLoader.load(getClass().getResource("/view/HTMLTextEditorScene.fxml"));
        Stage htmlStage = new Stage();
        Scene htmlScene = new Scene(mainRoot);
        htmlStage.setScene(htmlScene);
        htmlStage.setTitle("Tiny Text Editor");
        htmlStage.show();
    }
}
