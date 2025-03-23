import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //This line creates a scanner for user input later
        Scanner scanner = new Scanner(System.in);

        //this line prompts the user to enter the length of the rectangle
        System.out.println("Enter the length of the rectangle: ");

        //This line allows the user to input the length of the rectangle
        double length = scanner.nextDouble();

        //this line prompts the user to enter the width of the rectangle
        System.out.println("Enter the width of the rectangle: ");

        //This line allows the user to enter the width of the rectangle
        double width = scanner.nextDouble();

        //This line creates the double area and assigns it the value of length * width
        double area = length * width;

        //This line prompts the results of area
        System.out.println("Results: ");

        //This line prints out the results of the area of the rectangle
        System.out.println("Area of the rectangle: " + area);

        //This assigns myPerim as a value of length * 2 plus width * 2
        double myPerim = (length * 2) + (width * 2);

        //This line prints out the perimeter of the rectangle
        System.out.println("Perimeter of the rectangle: " + myPerim);
    }
}