//Alisa Steensen
//Module M11

package com.mycompany.borderpaneexample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {
    @Override
   public void start(Stage stage) {
        // Create a BorderPane 
        BorderPane borderPane = new BorderPane();

        
        Label topLabel = new Label("Top Area");
        Button leftButton = new Button("Left Button");
        Button rightButton = new Button("Right Button");
        Button bottomButton = new Button("Bottom Button");
        Label centerLabel = new Label("Center Area");

        // Borderpane regions
        borderPane.setTop(topLabel);
        borderPane.setLeft(leftButton);
        borderPane.setRight(rightButton);
        borderPane.setBottom(bottomButton);
        borderPane.setCenter(centerLabel);

        
        Scene scene = new Scene(borderPane, 400, 300);

        // Set up the Stage
        stage.setTitle("BorderPane Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}