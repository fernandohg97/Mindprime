/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mindprime;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Daniel
 */
public class MindPrimePlay extends Application {

    @Override
    public void start(Stage primaryStage) {

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.BASELINE_LEFT);
        grid.setVgap(70);
        grid.setHgap(90);
      grid.setPadding(Insets.EMPTY);
        
        Button btnOne = new Button();
        btnOne.setText("Palabra 1");

        Button btnTwo = new Button();
        btnTwo.setText("Palabra 2");

        Button btnThree = new Button();
        btnThree.setText("Palabra 3");

        Button btnFour = new Button();
        btnFour.setText("Palabra 4");

       grid.add(btnOne, 2, 5);
       grid.add(btnTwo, 3, 5);
       grid.add(btnThree, 4, 5);
       grid.add(btnFour, 5 ,5);

          
        

        Scene scene = new Scene(grid, 900, 650);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
