package com.example.test;

import com.example.Connectors.MySQLConnector;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException, SQLException {

        MySQLConnector.getInstance().getConnection();
    }

    public static void main(String[] args) {
        launch();
    }
}