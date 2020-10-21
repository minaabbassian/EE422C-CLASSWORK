package lecture14;
	
import javafx.application.Application;
import javafx.event.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class TwoStageMain extends Application {
	
	//don't mess with main method
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	//more than just displaying a picture 
	//primaryStage -- one stage is just given to you as a parameter
	public void start(Stage primaryStage) { // primaryStage is created by Java VM
		
		try {
			/*
			 * Create the first window with the grid of shapes
			 * same as in PaintGridMain
			 */
			GridPane grid = new GridPane(); // Holds the painted grid
			Scene scene = new Scene(grid, 300, 300); // creates a scene object with the GridPane
			primaryStage.setTitle("First Stage"); 		
			primaryStage.setScene(scene); // puts the scene onto the stage
			primaryStage.show(); // display the stage with the scene
			Painter.paint(grid); // paints the icons on the grid
			
			/*
			 * Create the second window with the button
			 * A program with two windows
			 */
			Stage secondStage = new Stage(); // creates a second stage for the button.
			
			//setting the position
			//I don't want it overlapping the first stage
			secondStage.setX(200); //top left corner of the window
			secondStage.setY(400);
			secondStage.setTitle("Second Stage"); 		
			
			//just another container like grid pane 
			StackPane pane = new StackPane(); //google to see what this is
			Button butt = new Button("Press Me");	// create a Button object
			
			//to add something to the stack pane 
			//adding it to an array list
			pane.getChildren().add(butt);	// add the butt to the pane object

			//200 is width and 50 is height
			Scene secondScene = new Scene(pane, 200, 50); // creates a second scene object with the Stackpane
			secondStage.setScene(secondScene); // puts the scene onto the second stage 
			secondStage.show(); // display the stage with the scene

			/*
			 * Action to be performed when button is pressed.
			 * call the function setOnAction -- background action that keeps on running
			 * when a button is pressed, something happens 
			 * pass in an EventHandler -- anonymous class
			 * defining the class inside the function
			 * EventHandler is actually an interface but you use new and it becomes an anonymous class
			 */
			butt.setOnAction(new EventHandler<ActionEvent>() { // what to do when butt is pressed
				@Override
				//event is a button click
				public void handle(ActionEvent event) {
					
					// Three kinds of actions are below
					// a. Show something about the object that triggered the event
					//the source is the button, prints out the button object
					System.out.println(event.getSource().toString());
					
					
					// b. Print something to the console
					System.out.println("Hello World!");
					
					
					// c. Change something in one of the JavaFX scenes
					Painter.paintRandom(grid); //randomly moves the x and y around
				}
			});

			} catch (Exception e) {
				e.printStackTrace();
			}
	}
}
