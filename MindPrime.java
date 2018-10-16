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
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Daniel
 */
public class MindPrime extends Application {
    Stage window;
    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
      
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(5);
        grid.setHgap(5);
        grid.setPadding(Insets.EMPTY);
        
        Text welcomeTXT=new Text("Bienvenido a MindPrime");
        welcomeTXT.setFont(Font.font("Tahoma", FontWeight.LIGHT, 25));
        grid.add(welcomeTXT, 0, 0);
        
        Label lblUser = new Label("Username");
        grid.add(lblUser, 0 ,1);
        
        TextField txtUser = new TextField();
        txtUser.setPromptText("Username");
        grid.add(txtUser,1 ,1);
        
        
        Label lblPassword = new Label("Password");
        grid.add(lblPassword, 0 ,2);
        
        PasswordField pwBox = new PasswordField();
        pwBox.setPromptText("Password");
        grid.add(pwBox, 1, 2);
        
        
        Button loginBtn = new Button("Log in");
        grid.add(loginBtn,1,3);
        loginBtn.setOnAction((ActionEvent e)->{
      admin_interface admin;
        // admin.show;
             
            
        });
        
        Scene scene = new Scene(grid, 900, 650);
        
        primaryStage.setTitle("MindPrime");
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
