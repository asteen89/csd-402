//Alisa Steensen
//Module M11

package com.mycompany.hboxexample;


/**
 * JavaFX App
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        HBox hbox = new HBox(15); 
        var label = new Label("Hello, This is an HBox example.");
        
        hbox.getChildren().add(label); 
        
        var scene = new Scene(hbox, 640, 480); //HBox is root
        stage.setScene(scene);
        stage.setTitle("HBox Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
