package com.example.javafxpractice;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TextPropProject extends Application implements EventHandler<ActionEvent>{

    Text t;
    RadioButton r1,r2,r3;
    CheckBox c1,c2,c3;
    ChoiceBox<Integer> cb;
    @Override
    public void start(Stage stage) throws Exception {
        t=new Text("Abhishek's Project");
        HBox hb0=new HBox();
        hb0.getChildren().add(t);

        r1=new RadioButton("Red");
        r2=new RadioButton("Blue");
        r3=new RadioButton("Green");

        ToggleGroup tg=new ToggleGroup();
        r1.setToggleGroup(tg);r1.setOnAction(this);
        r3.setToggleGroup(tg);r2.setOnAction(this);
        r2.setToggleGroup(tg);r3.setOnAction(this);

        HBox hb1=new HBox();
        hb1.getChildren().addAll(r1,r2,r3);
         hb1.setSpacing(15);
         hb1.setPadding(new Insets(10,10,10,10));

        c1=new CheckBox("Normal");
        c2=new CheckBox("Bold");
        c3=new CheckBox("Italic");
        HBox hb2=new HBox();
        c1.setOnAction(this);c2.setOnAction(this);c3.setOnAction(this);
        hb2.getChildren().addAll(c1,c2,c3);
        hb2.setSpacing(15);
        hb2.setPadding(new Insets(10,10,10,10));

        cb=new ChoiceBox<>();
        cb.getItems().addAll(10,20,30,40);
        cb.setOnAction(this);

        VBox vb=new VBox();
        vb.getChildren().addAll(hb0,hb1,hb2,cb);
        vb.setSpacing(15);
        vb.setPadding(new Insets(10,10,10,10));

        Scene sc=new Scene(vb,500,500);

        stage.setTitle("Event Handling Fx Application");
        stage.setScene(sc);
        stage.show();
    }
    @Override
    public void handle(ActionEvent actionEvent) {
        FontWeight fw= FontWeight.NORMAL;
        FontPosture fp= FontPosture.REGULAR;

        if(r1.isSelected()) {
            t.setFill(Color.RED);
        }else if(r2.isSelected()){
            t.setFill(Color.BLUE);
        }else if(r3.isSelected()){
            t.setFill(Color.GREEN);
        }

        if(c2.isSelected()) fw= FontWeight.BOLD;
        else if(c3.isSelected()) fp=FontPosture.ITALIC;

        t.setFont(Font.font("Times New Roman",fw,fp,cb.getValue()));


    }
    public static void main(String[] args) {
        launch(args);
    }

}
