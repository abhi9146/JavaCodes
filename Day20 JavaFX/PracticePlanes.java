package com.example.javafxpractice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class PracticePlanes extends Application{
    @Override
    public void start(Stage stage) throws Exception {
        Button b1=new Button("One");
        Button b2=new Button("Two");
        Button b3=new Button("Three");
        Button b4=new Button("Four");
        Button b5=new Button("Five");

        BorderPane root=new BorderPane();
        root.setTop(b1);
        root.setLeft(b2);
        root.setBottom(b3);
        root.setRight(b4);
        root.setCenter(b5);

//        FlowPane fp=new FlowPane();
//        fp.getChildren().addAll(b1,b2,b3,b4,b5);
//        fp.setHgap(10);fp.setVgap(10);

//      TilePane tp=new TilePane();
//      tp.getChildren().addAll(b1,b2,b3,b4,b5);



        Scene sc=new Scene(root,400,400);
        Stage st=new Stage();
        st.setScene(sc);
        st.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
