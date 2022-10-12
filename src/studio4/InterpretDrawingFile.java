package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shapeName = in.next();
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		StdDraw.setPenColor(red, green, blue);
				
		boolean isFilled = in.nextBoolean();
		
		
		if (shapeName.equals("rectangle")||shapeName.equals("ellipse"))
		{
			double w = in.nextDouble();
			double x = in.nextDouble();
			double y = in.nextDouble();
			double z = in.nextDouble();
			
			if (shapeName.equals("rectangle")) {
				if (isFilled) {
					StdDraw.filledRectangle(w, x, y, z);
					
				} else {
					StdDraw.rectangle(w, x, y, z);
				}	
			}
			

			if (shapeName.equals("ellipse")) {
				if (isFilled) {
					StdDraw.filledEllipse(w, x, y, z);
					
				} else {
					StdDraw.ellipse(w, x, y, z);
				}	
			}
			
		}
		else if (shapeName.equals("triangle")) {
			double x1 = in.nextDouble();
			double y1 = in.nextDouble();
			double x2 = in.nextDouble();
			double y2 = in.nextDouble();
			double x3 = in.nextDouble();
			double y3 = in.nextDouble();
			
			double [] x = {x1, x2, x3};
			double [] y = {y1, y2, y3};
			
			if (isFilled) {
				StdDraw.filledPolygon(x, y);
				
			} else {
				StdDraw.polygon(x, y);
			}	
}
		

			
		
	}
}
