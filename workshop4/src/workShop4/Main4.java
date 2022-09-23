/*
 * 	Student name: Deepkumar Rajendrakumar Patel
	Student Email: drpatel33@myseneca.ca
	Student number: 153693189
	Section: ZAA
 * */

package workShop4;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;


public class Main4 {

	public static void main(String[] args) {
		
		int index = 0;
		Shape[] shapes;		
		
		System.out.println("------->JAC 444 Assignment 1<-------");
		System.out.printf("------->Task 1 ... <-------%n");

		try {
			Path path = Paths.get("shapes.txt");
			index = (int)Files.lines(path).count();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

		shapes = new Shape[(int) index];
		task1("shapes.txt",shapes);
		
		
	}

	private static void task1(String fileName, Shape[] shapes) {
		
		String s;
		int totalShapes = 0;
		//split each line to its composing items
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
			
			while((s = br.readLine()) != null) {
				String[] tokens = s.split(",");
				
				try {
					Shape shape  = getShape(tokens);					
					if(shape != null ) {
						shapes[totalShapes] = shape;
						totalShapes++;
					}
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
			} 
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}

		System.out.printf("%n%s shapes were created: %n", totalShapes); // total shapes
		displayResult(shapes);
	}
	
 
	private static double parseDouble(String s) {
		return Double.parseDouble(s);
	}

	// validation for shapes
	private static Shape getShape(String[] token) throws CircleException, SquareException, ParallelogramException, TriangleException {
		
		Shape shape = null;

		switch(token[0]) {
		
		//circle
		case "Circle":
			if(token.length == 2) {
				shape = new Circle(parseDouble(token[1]));
			}
			break;
			
		//Parallelogram
		case "Parallelogram":
			if(token.length == 3) {
				shape = new Parallelogram(parseDouble(token[1]),parseDouble(token[2]));
			}
			break;
			
		//Square
		case "Square":
			if(token.length == 2) {
				shape= new Square(parseDouble(token[1]));
			}
			break;
			
		//Rectangle
		case "Rectangle":
			if(token.length == 3) {
				shape = new Rectangle(parseDouble(token[1]),parseDouble(token[2]));
			}
			break;			
		
		//Triangle	
		case "Triangle":
			if(token.length == 4) {
				shape = new Triangle(parseDouble(token[1]),parseDouble(token[2]), parseDouble(token[3]));
			}
			break;
			
		default:
			break;
		} 
		return shape;
	}

	// display task 1
	private static void displayResult(Shape[] shapes) {
		for(Shape shape: shapes) {
			if(shape != null) {
				System.out.printf("%sperimeter = %g %n%n", shape.toString(), shape.getPerimeter());
			}
		}
	}
	
	
}