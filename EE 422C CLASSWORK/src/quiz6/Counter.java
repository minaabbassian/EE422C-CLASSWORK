/*
 * EE 422C Fall 2020, Quiz 6
 * Name: Mina Abbassian
 * UT EID: mea2947
 * Unique: 16170
 */

/*
 * Other comments that will help the TA looking at your code.
 */
package quiz6;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Starter code for Java FX program to increment and display a counter
 * every time a button is pressed.
 */
public class Counter extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
    	primaryStage.setTitle("Counter");

        // Define Text Field object, and define its value.
    	TextField text = new TextField();

        // Add the Text Field object to the container defined above.
    	text.setText("0");
    	text.setTranslateY(60);

        // Define Increment Button to press to increment the counter.
    	Button butt = new Button();
    	butt.setText("Click me!");

        // Set an action for the Increment button by calling its setOnAction,
        // updating the counter.
    	butt.setOnAction(new EventHandler<ActionEvent>() {
    		int curr = 0;
    		
    		@Override
    		public void handle(ActionEvent event) {
    			curr++;
    			text.setText("" + curr);
    		}
    		
    	});
    	
    	//StackPane to hold the button and the window
    	StackPane s = new StackPane();
    	s.getChildren().add(butt);
    	s.getChildren().add(text);
    	primaryStage.setScene(new Scene(s, 300, 250));
        primaryStage.show();
    }
}
