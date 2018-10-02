Log In MindPrime
==========

## JavaFX y como crear el Log in Stage por Daniel
----------
>El Front End de nuetro proyecto Mind Prime sera hecho con JavaFX  que es compilado a código Java,
por lo que las aplicaciones JavaFX pueden ser ejecutadas en computadores 
con la máquina virtual de Java instalada 

----------
>El Front End de nuetro proyecto Mind Prime sera hecho con JavaFX  que es compilado a código Java,
por lo que las aplicaciones JavaFX pueden ser ejecutadas en computadores 
con la máquina virtual de Java instalada 



Como crear un primaryStage?
--------------------------



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

Como crear el texto de bienvenida para la pagina principal?
----------------------------------------------------
        Text welcomeTXT=new Text("Bienvenido a MindPrime");
        welcomeTXT.setFont(Font.font("Tahoma", FontWeight.LIGHT, 25));
        grid.add(welcomeTXT, 0, 0);

Lo importante de este bloque es crear un texto que sera añadido a cierta posicion del GridPane que esta sera la 0, 0 tambien se selecciono el tipo de font ¨Tahoma¨ para este texto 


Como crear los diferentes inputs para un username y su contraseña?
--------------------------------------------------

>usuario

        Label lblUser = new Label("Username");
        grid.add(lblUser, 0 ,1);
        
        TextField txtUser = new TextField();
        txtUser.setPromptText("Username");
        grid.add(txtUser,1 ,1);
        
>contrasena        

        Label lblPassword = new Label("Password");
        grid.add(lblPassword, 0 ,2);
        
        PasswordField pwBox = new PasswordField();
        pwBox.setPromptText("Password");
        grid.add(pwBox, 1, 2);
        
        
En ambos casos es necesario crear una etiqueta(label) para indicar lo que seria introducido en el area de texto despues de crear la etiqueta se coloca dentro del GridPane con un grd.add() y se mandan como parametros el objeto de referencia a la etiqueta y su posicion en el GridPane.

Para las areas de texto se crea primero un objeto referente a la area de texto y se le coloca un nombre con la referencia seguido de 

           object.setPromptText("String");

Al final se posiciona el objeto dentro del GridPane.

Como crear boton Log in?
--------------------------------------

        Button loginBtn = new Button("Log in");
        grid.add(loginBtn,1,3);
        loginBtn.setOnAction(e->{
        System.out.println("Login Presionado");
        });

Los pasos para crear un boton son muy parecidos a crear un Label() o TextField()
solo sigues la misma metodologia de los anteriores
1-Creas el boton con un objeto referencia
2-Lo colocas dentro del GridPane 
