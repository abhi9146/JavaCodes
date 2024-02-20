package com.example.javafxpractice;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class EventHandling extends Application implements EventHandler<ActionEvent> {

    Button bt;
    int cnt=0;
    @Override
    public void start(Stage stage) throws Exception {
         bt=new Button("Count : "+cnt);
         // using interface implementation of methods
         bt.setOnAction(this);

         // using lambda expression
        bt.setOnAction(e->{cnt+=3;bt.setText("Count : "+cnt);;});

        // using anonymous method
        bt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ae) {
                cnt+=2;
                bt.setText("Count : "+cnt);
            }
        });

        FlowPane fp=new FlowPane(bt);
        Scene sc=new Scene(fp,400,400);

        stage.setTitle("Event Handling Fx Application");
        stage.setScene(sc);
        stage.show();
    }
    @Override
    public void handle(ActionEvent actionEvent) {
        cnt+=1;
        bt.setText("Count : "+cnt);
    }
    public static void main(String[] args) {
        launch(args);
    }
}
