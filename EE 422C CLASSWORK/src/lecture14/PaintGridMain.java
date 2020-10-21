
package lecture14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
//import javafx.scene.layout.GridPane; //can replace GridPane with * (means all classes in layout)
import javafx.stage.Stage;

public class PaintGridMain extends Application {


	//don't ever fool around with this
	//just needed for things to run smoothly
	public static void main(String[] args) {
		launch(args); //does nothing usually
	}

	@Override
	/*
	 * the start() method is the main entry point for all JavaFX applications 
	 * without start() it is not going to work because Application is an abstract class 
	 * 		and you need to implement start()
	 */
	public void start(Stage primaryStage) { 
		
		//GridPane is an object
		//GridPane is going to be my main root container and it is going to hold everything
		GridPane grid = new GridPane();
		
		//creates a scene object
		Scene scene = new Scene(grid, 350, 350);	
		
		//puts the scene onto the stage
		primaryStage.setScene(scene);	
		
		//display the stage with the scene
		primaryStage.show();	
		
		primaryStage.setTitle("Grid of Colors");
		
		
		//paints the icons on the grid
		//grid is going to be passed as a parameter
		Painter.paint(grid);	
	}
}
