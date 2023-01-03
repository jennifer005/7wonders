package com.example.seven_wonder;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {

    public static Parent root;
    public static Stage primaryStage;

    @Override
    public void start(Stage stage) throws IOException {
        this.primaryStage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("main-view.fxml"));
        root.getStylesheets().add(MainApplication.class.getResource("../style/style.css").toExternalForm());
        Scene scene = new Scene(fxmlLoader.load(), 1024, 768);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
    public void pressButtonPlay(ActionEvent actionEvent) throws IOException {

        MainApplication.root = FXMLLoader.load(getClass().getResource("/com/example/seven_wonder/gameboard.fxml"));
        MainApplication.root.getStylesheets().add(Gameboard.class.getResource("../style/style.css").toExternalForm());
        MainApplication.primaryStage.setScene(new Scene(MainApplication.root, 1024, 768));
    }


}