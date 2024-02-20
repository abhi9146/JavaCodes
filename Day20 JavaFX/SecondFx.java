package com.example.javafxpractice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SecondFx extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Button bt=new Button("Click me");
        bt.setTextFill(Color.RED);
        bt.setMnemonicParsing(true);

        Tooltip tp=new Tooltip("Click this to save data");
        bt.setTooltip(tp);

        FlowPane fp=new FlowPane();
        fp.getChildren().add(bt);
        Scene sc=new Scene(fp,400,400);

        Alert a=new Alert(Alert.AlertType.INFORMATION,"Button Clicked");
        bt.setOnAction(e->a.show());

        stage.setTitle("Second Fx Application");
        stage.setScene(sc);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
