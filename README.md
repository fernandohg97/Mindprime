# Mindprime


Log In MindPrime
==========

## JavaFX y como crear el Log in Stage por Daniel
----------
>El Front End de nuetro proyecto Mind Prime sera hecho con JavaFX  que es compilado a código Java,
por lo que las aplicaciones JavaFX pueden ser ejecutadas en computadores 
con la máquina virtual de Java instalada 



Como crear un primaryStage?

public class MindPrime extends Application {
    Stage window;
    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("Login");
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(Insets.EMPTY);

Para crear el Stage que contendra el Form para poder hacer un Log In 
primero: creas un object  de la clase Stage en este caso "window"
segundo: sobreescribes la clase start y mandas como parametro un object stage
en este caso window hace referencia al primary stage que se mando como parametro
