import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
public class W13dot1 {
    public static void main(String[] args) throws IOException {
        // Tell the user what the program does
        System.out.println("""
                This program creates geometric objects
                and display its corresponding area""");
        // Create an ArrayList to fill with shapes
        ArrayList<GeometricObject> list = new ArrayList<>();
        // Create the shapes to fill the ArrayList
        Circle c = new Circle(156,1,1,10);
        Square s = new Square(237, 1,3,2);
        RightTriangle rt = new RightTriangle(212, 3,3,3,4);
        // Fill add the objects
        list.add(c);
        list.add(s);
        list.add(rt);

        // Create a new data.txt file, fill the document with the ArrayList shapes information
        try  (PrintWriter data = new PrintWriter("data.txt") ) {
            data.format("Shape      ID Position  Area");
            for (GeometricObject shape: list) {
                data.format("\n" + shape.toString());
            }
        }
        System.out.println("output complete.");

        // read data.txt file back in and output the shapes and its info
        System.out.println("Contents of the file");

        File myFile = new File("data.txt");
        try(Scanner input = new Scanner(myFile) ) {
            while(input.hasNextLine() ) {
                String line = input.nextLine().trim();
                System.out.println(line);
            }
        } catch (FileNotFoundException ex1){
            System.out.println("Invalid source path. \nPlease enter only the file name");
        }

    }
}