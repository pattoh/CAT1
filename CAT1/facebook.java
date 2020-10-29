import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.EventHandler;

import javafx.scene.Group;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;

import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;





public class facebook extends Application {
    @Override
    public void start(Stage stage) {

         //creating label First Name
         Text text1 = new Text("Email or Phone");

         //creating label second name
         Text text2 = new Text("Password");
 
         //creating Text Field for First Name
         TextField textField1 = new TextField();
 
         //creating Text Field for Password
         PasswordField textField2 = new PasswordField();
 
         //Creating Buttons
         Button button1 = new Button("Create Account");
         Button button2 = new Button("Sign In");
 
         //Creating a Grid Pane
         GridPane gridPane = new GridPane();
 
         //Setting size for the pane
         gridPane.setMinSize(800, 400);
 
         //Setting the padding
         gridPane.setPadding(new Insets(10, 10, 10, 10));
 
         //Setting the vertical and horizontal gaps between the columns
         gridPane.setVgap(5);
         gridPane.setHgap(5);
 
         //Setting the Grid alignment
         gridPane.setAlignment(Pos.CENTER);
 
         //Arranging all the nodes in the grid
         gridPane.add(text1, 0, 0);
         gridPane.add(textField1, 1, 0);
         gridPane.add(text2, 0, 1);
         gridPane.add(textField2, 1, 1);
         gridPane.add(button1, 0, 2);
         gridPane.add(button2, 1, 2);
 
         //Styling nodes
 
         button1.setStyle("-fx-background-color: green; -fx-text-fill: white;");
         button2.setStyle("-fx-background-color: darkslateblue; -fx-text-fill:white;");
 
         text1.setStyle("-fx-font: normal bold 10px 'serif' ");
         text2.setStyle("-fx-font: normal bold 10px 'serif' ");
         gridPane.setStyle("-fx-background-color: CORNFLOWERBLUE;");




         EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent> () {
            @Override
            public void handle(MouseEvent e) {
                System.out.println("Thank you for registering to facebook Application");
                
            }
        };
        //Registering the event filter
        button1.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);

        
        

        
 
         //Creating a scene object
         Scene scene = new Scene(gridPane);
 
         //Setting title to the Stage
         stage.setTitle("FACEBOOK UI");
 
         //Adding scene to the stage
         stage.setScene(scene);
 
         //Displaying the contents of the stage
         stage.show();
 
 
 
     }

    public static void main(String args[]) {
        launch(args);
    }
}