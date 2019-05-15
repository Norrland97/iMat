import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import se.chalmers.cse.dat216.project.IMatDataHandler;

import java.util.ResourceBundle;

public class IMat extends Application {
    public static void main(String[] args){
        launch(args);
        System.out.println("Hej");
        System.out.println("Pontus e fett");
        System.out.println("Hentoo e brett med fett");
        System.out.println("Hentoo är flytande");
        

    }

    @Override
    public void start(Stage stage) throws Exception {

        ResourceBundle bundle = java.util.ResourceBundle.getBundle("resources/iMAt");

        Parent root = FXMLLoader.load(getClass().getResource("iMat.fxml"), bundle);

        Scene scene = new Scene(root, 1280, 720);

        stage.setTitle(bundle.getString("application.name"));
        stage.setScene(scene);
        stage.show();
    }
}
