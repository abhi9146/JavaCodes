package com.example.javafxpractice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FirsrFx extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Button bt=new Button("Click me");
        FlowPane fp=new FlowPane();
        fp.getChildren().add(bt);
        Scene sc=new Scene(fp);

        stage.setTitle("First Fx Application");
        stage.setScene(sc);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
