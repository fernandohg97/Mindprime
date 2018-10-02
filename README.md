Log In MindPrime
==========

## JavaFX y como crear el Log in Stage por Daniel
----------
>El Front End de nuetro proyecto Mind Prime sera hecho con JavaFX  que es compilado a código Java,
por lo que las aplicaciones JavaFX pueden ser ejecutadas en computadores 
con la máquina virtual de Java instalada 
-----------


Como crear un primaryStage?


        public class MindPrime extends Application {
    Stage window;
    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(Insets.EMPTY);
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(Insets.EMPTY);

Para crear el Stage que contendra el Form para poder hacer un Log In 
primero: creas un object  de la clase Stage en este caso "window"
segundo: sobreescribes la clase start y mandas como parametro un object stage
en este caso window hace referencia al primary stage que se mando como parametro

El resto del snippet son lineamientos para centrar el contenido y crear un GridPane 

Como crear el texto de bienvenida(label) para la pagina principal?

 Text welcomeTXT=new Text("Bienvenido a MindPrime");
        welcomeTXT.setFont(Font.font("Tahoma", FontWeight.LIGHT, 25));
        grid.add(welcomeTXT, 0, 0);

