package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.Stack;





public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("2BtestSignIn.fxml"));
        primaryStage.setTitle("Welcome");



        primaryStage.setScene(new Scene(root, 800, 387));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
