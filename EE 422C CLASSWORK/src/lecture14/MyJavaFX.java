package lecture14;

import java.util.Random;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
//import javafx.scene.layout.GridPane; //can replace GridPane with * (means all classes in layout)
import javafx.stage.Stage;


public class MyJavaFX extends Application {
	
	@Override 
	public void start(Stage primaryStage) {
		Button btOK = new Button("OK");
		Scene scene = new Scene(btOK, 200, 250);
		primaryStage.setTitle("MyJavaFX");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	

}
