/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javafxui;

import javafx.application.Application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.*;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import javafx.stage.FileChooser;  

public class JavaFXUI extends Application {

    @Override
    public void start(Stage stage) {
        //Label for name 
        Label nameLabel = new Label("Name");

        //Text field for name 
        TextField nameText = new TextField();
        
        Tooltip tool = new Tooltip();
        tool.setText("Information");
        
        nameText.setTooltip(tool);

        //Label for date of birth 
//        Label dobLabel = new Label("Date of birth");

        //date picker to choose date 
//        DatePicker datePicker = new DatePicker();

        //Label for gender
        Label genderLabel = new Label("gender");

        //Toggle group of radio buttons       
        ToggleGroup groupGender = new ToggleGroup();
        RadioButton maleRadio = new RadioButton("male");
        maleRadio.setToggleGroup(groupGender);
        RadioButton femaleRadio = new RadioButton("female");
        femaleRadio.setToggleGroup(groupGender);

        //Label for technologies known 
        Label technologiesLabel = new Label("Technologies Known");

        //check box for education 
        CheckBox javaCheckBox = new CheckBox("Java");
        javaCheckBox.setIndeterminate(false);

        //check box for education 
        CheckBox dotnetCheckBox = new CheckBox("DotNet");
        javaCheckBox.setIndeterminate(false);
        
        Label hyperlinkLabel = new Label("Tutorial link");        
        Hyperlink hp = new Hyperlink("http://www.javatpoint.com");  

        //Label for location 
        Label optionLabel = new Label("Options");

        //Choice box for location 
//        ChoiceBox locationchoiceBox = new ChoiceBox();
        MenuBar menubar = new MenuBar();
        Menu FileMenu = new Menu("File");
        MenuItem filemenu1 = new MenuItem("new");
        MenuItem filemenu2 = new MenuItem("Save");
        MenuItem filemenu3 = new MenuItem("Exit");
        FileMenu.getItems().addAll(filemenu1,filemenu2,filemenu3);
        menubar.getMenus().add(FileMenu);
        
        //Label for register 
        Button chooseFile = new Button("Choose File");
        
         chooseFile.setOnAction(e->  
        {  
            FileChooser file = new FileChooser();  
            file.setTitle("Open File");  
            file.showOpenDialog(stage);  
        }); 

        //Creating a Grid Pane 
        GridPane gridPane = new GridPane();

        //Setting size for the pane 
        gridPane.setMinSize(500, 500);

        //Setting the padding    
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        //Setting the vertical and horizontal gaps between the columns 
        gridPane.setVgap(5);
        gridPane.setHgap(5);

        //Setting the Grid alignment 
        gridPane.setAlignment(Pos.CENTER);

        //Arranging all the nodes in the grid 
        gridPane.add(nameLabel, 0, 0);
        gridPane.add(nameText, 1, 0);

//        gridPane.add(dobLabel, 0, 1);
//        gridPane.add(datePicker, 1, 1);

        gridPane.add(genderLabel, 0, 2);
        gridPane.add(maleRadio, 1, 2);
        gridPane.add(femaleRadio, 2, 2);

        gridPane.add(technologiesLabel, 0, 4);
        gridPane.add(javaCheckBox, 1, 4);
        gridPane.add(dotnetCheckBox, 2, 4);
        
        gridPane.add(hyperlinkLabel,1,5);
        gridPane.add(hp, 2, 5);

        gridPane.add(optionLabel, 0, 6);
        gridPane.add(menubar, 1, 6);
//        gridPane.add(file,1,7);

        gridPane.add(chooseFile, 2, 8);

        //Styling nodes   
        chooseFile.setStyle(
                "-fx-background-color: red; -fx-textfill: white;");

        nameLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
//        dobLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        genderLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        technologiesLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        hyperlinkLabel.setStyle("-fx-font: normal bold 15px 'serif' ");
        optionLabel.setStyle("-fx-font: normal bold 15px 'serif' ");

        //Setting the back ground color 
        gridPane.setStyle("-fx-background-color: BEIGE;");

        //Creating a scene object 
        Scene scene = new Scene(gridPane);

        //Setting title to the Stage 
        stage.setTitle("Registration Form");

        //Adding scene to the stage 
        stage.setScene(scene);

        //Displaying the contents of the stage 
        stage.show();
    }

    public static void main(String args[]) {
        launch(args);
    }
}
