package iMat;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ResourceBundle;

public class iMat extends Application {


    @Override
    public void start(Stage stage) throws Exception {

        ResourceBundle bundle = java.util.ResourceBundle.getBundle("iMat/resources/iMat");
        System.out.println(getClass().getResource("View/iMat.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("View/iMat.fxml"), bundle);
        Scene scene = new Scene(root, 1280, 720);
        stage.setScene(scene);

        stage.setTitle("Hello World");
        stage.show();
    }

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        launch(args);
    }

}


