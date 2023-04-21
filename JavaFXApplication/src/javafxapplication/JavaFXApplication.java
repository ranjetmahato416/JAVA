/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javafxapplication;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 *
 * @author Dell
 */
public class JavaFXApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
//        BorderPane BPane = new BorderPane();  
//        BPane.setTop(new Label("This will be at the top"));  
//        BPane.setLeft(new Label("This will be at the left"));  
//        BPane.setRight(new Label("This will be at the Right"));  
//        BPane.setCenter(new Label("This will be at the Centre"));  
//        BPane.setBottom(new Label("This will be at the bottom"));  
//        Scene scene1 = new Scene(BPane,600,400); 
//        primaryStage.setScene(scene1);
//        primaryStage.show();

//        Button btn1 = new Button("Button 1");
//        Button btn2 = new Button("Button 2");
//        HBox root = new HBox();
//        VBox root = new VBox();
//        Scene scene = new Scene(root, 200, 200);
//        root.getChildren().addAll(btn1, btn2);
//        primaryStage.setScene(scene2);
//        primaryStage.show();
        Label first_name = new Label("First Name");
        Label last_name = new Label("Last Name");
        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        Button Submit = new Button("Submit");
        GridPane root = new GridPane();
        Scene scene = new Scene(root, 400, 200);
        root.addRow(0, first_name, tf1);
        root.addRow(1, last_name, tf2);
        root.addRow(2, Submit);
//        primaryStage.setTitle("FlowPane Example");
//        FlowPane root = new FlowPane();
//        root.setVgap(6);
//        root.setHgap(5);
//        root.setPrefWrapLength(250);
//        root.getChildren().add(new Button("Start"));
//        root.getChildren().add(new Button("Stop"));
//        root.getChildren().add(new Button("Reset"));
//        Scene scene = new Scene(root, 300, 200);200
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
