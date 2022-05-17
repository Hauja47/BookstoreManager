package com.team15.bookstoremanager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("fxml/login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1000, 400);
        stage.setTitle("JavaFX Application");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() {
        // HibernateUtil.shutdown();
    }

    public static void main(String[] args) {
        launch();
    }
}