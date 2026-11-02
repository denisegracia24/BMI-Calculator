package com.denisa.bmicalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BmiCalculator extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Memuat file FXML tampilan BMI
        Parent root = FXMLLoader.load(getClass().getResource("bmi_view.fxml")); 
        
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("Kalkulator BMI");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}