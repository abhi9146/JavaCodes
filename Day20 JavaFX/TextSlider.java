package com.example.javafxpractice;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
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
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.util.Scanner;

public class TextSlider extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        TextArea ta=new TextArea();
        ta.setPrefColumnCount(100);
        ta.setPrefRowCount(20);

        Slider sl=new Slider(10,50,10);
        sl.setMajorTickUnit(5);
        sl.setShowTickMarks(true);

        sl.valueProperty().addListener(e->ta.setFont(Font.font(sl.getValue())));

        DatePicker dp=new DatePicker();
        dp.setShowWeekNumbers(true);

        dp.setOnAction(e->ta.setText("Date :"+dp.getValue()+"\n"+ta.getText()));
        ColorPicker cp= new ColorPicker();

        cp.setOnAction(e->ta.setStyle("-fx-text-fill:#"+cp.getValue().toString().substring(2,8)));
        Button b=new Button("Open File");

        b.setOnAction(e->{
            FileChooser fc=new FileChooser();
            java.io.File file=fc.showOpenDialog(stage);

            try(Scanner sc=new Scanner(new FileInputStream(file))){
                String str="";
                while(sc.hasNext()){
                    str=str+sc.nextLine()+"\n";
                }
                ta.setText(str);
            }
            catch (Exception ex) {
                ta.setText("Select Valid file");
            }

        });

        VBox v=new VBox();
        v.getChildren().addAll(ta,sl,dp,cp,b);
        v.setAlignment(Pos.TOP_CENTER);
        Scene sc=new Scene(v,500,500);

        stage.setTitle("Event Handling Fx Application");
        stage.setScene(sc);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
