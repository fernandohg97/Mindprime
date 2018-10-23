/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mindprime;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Daniel
 */
public class admin_interface extends Application {
    Stage window;
    @Override
    public void start(Stage secondaryStage) {
        window = secondaryStage;
      
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.BASELINE_LEFT);
        grid.setVgap(40);
        grid.setHgap(50);
      grid.setPadding(Insets.EMPTY);
        
        Text welcomeTXT=new Text("MindPrime");
        welcomeTXT.setFont(Font.font("Tahoma", FontWeight.LIGHT, 35));
        grid.add(welcomeTXT, 0, 0);
        
        Label lblUser = new Label("Fecha Nacimiento");
        grid.add(lblUser, 0 ,3);
        
      DatePicker datePicker = new DatePicker();
        grid.add(datePicker,1 ,3);
        
        
        Label lblName = new Label("Nombre");
        grid.add(lblName, 0 ,1);
        
             TextField nameBox = new TextField();
        nameBox.setPromptText("Nombre");
        grid.add(nameBox, 1, 1);
        
        Label lblLastName = new Label("Apellido");
        grid.add(lblLastName, 0 ,2);
        
         TextField lastNameBox = new TextField();
        lastNameBox.setPromptText("Apellido");
        grid.add(lastNameBox, 1, 2);
        
        Label lblInstitucion = new Label("Institucion");
        grid.add(lblInstitucion, 0, 4);
        
        TextField institucionBox = new TextField();
        institucionBox.setPromptText("Institucion");
        grid.add(institucionBox, 1, 4);
        
        Button addBtn = new Button("Añadir");
        Button searchBtn = new Button("Buscar");
        Button statsBtn = new Button("Estadisticas");
     grid.add(statsBtn, 2,0);   
     grid.add(addBtn,0,6);
     grid.add(searchBtn,3,0);  
     
            Label lblGrupo = new Label("Grupo");
        grid.add(lblGrupo, 0, 5 );
     ChoiceBox choiceBox = new ChoiceBox();
     choiceBox.getItems().add("Choice 1");
choiceBox.getItems().add("Choice 2");
choiceBox.getItems().add("Choice 3");

grid.add(choiceBox,1,5 );
  
     
        Scene scene = new Scene(grid, 900, 650);
        
        secondaryStage.setTitle("MindPrime");
        secondaryStage.setScene(scene);
        secondaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
