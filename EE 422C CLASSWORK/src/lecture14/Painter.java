/* CRITTERS Critter.java
 * 
 */
package lecture14;

import java.util.Random;

import javafx.application.Application; //the main class for a JavaFX application extends this class
import javafx.scene.layout.GridPane;
import javafx.scene.paint.*; //make sure you use javafx libraries 
import javafx.scene.shape.*;

public class Painter {

	//the size of the three little squares in the grid
	static int size = 100;

	/*
	 * Paint the grid lines in orange.  The purpose is two-fold -- to indicate boundaries of 
	 * icons, and as place-holders for empty cells.  Without placeholders, grid may not display properly.
	 */
	private static void paintGridLines(GridPane grid) {
		
		//3-by-3 grid
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				
				//shape is an abstract class in javaFX -- there are many subclasses
				//making 9 rectangles that are next to each other
				Shape s = new Rectangle(size, size); //instead of lines, make squares 
				
				
				//do not fill the rectangles 
				s.setFill(null); //empty because it's just an outline
				
				
				s.setStroke(Color.ORANGE); //stroke is the outline color 
				
				//s is shape
				grid.add(s, i, j); //row index is i and column index is j
			}
		}
	}

	
	/* 
	 * Paints the icon shapes on a grid. 
	 */
	public static void paint(GridPane grid) {
		
		//grid is a container and a container has children
		grid.getChildren().clear(); // clear the grid 
		
		//paint the borders
		paintGridLines(grid);		
		
		for (int i = 0; i <=2 ; i++) {
			Shape s = getIcon(i); //put the icons in (the squares and circles)
			grid.add(s, i, i); // add along the diagonal, x and y coordinates are the same for diagonal
			//paintRandom(grid);
		}
	}

	/* 
	 * Returns a square or a circle depending on the shapeIndex parameter
	 * Gets the icon that you want
	 * 
	 */
	static Shape getIcon(int shapeIndex) {
		//initialize a shape, create a shape
		Shape s = null;
		
		//different cases depending on the shape index
		switch(shapeIndex) {
		
		//if the shape index is 0, s is a rectangle
		case 0: s = new Rectangle(size, size);
			s.setFill(Color.RED); break; //color is a class and it has fields -- like RED
			
		case 1: s = new Circle(size/2);
			s.setFill(Color.GREEN); break;
			
		//default has no break
		default: s = new Circle(size/2);
		s.setFill(Color.PINK);
		}
		// set the outline
		s.setStroke(Color.BLUE); //blue outlines for all of the shapes
		return s;
	}
	
	/* 
	 * Paints the icon shapes on a grid. 
	 */
	public static void paintRandom(GridPane grid) {
		Random rand = new Random();
		grid.getChildren().clear(); // clear the grid 
		paintGridLines(grid);		// paint the borders
		//instead of painting along diagonal, placing it in any of the 9 locations
		for (int i = 0; i <= 2 ; i++) {
			Shape s = getIcon(i);
			grid.add(s, rand.nextInt(3), rand.nextInt(3)); 
		}
	}
}
