import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle: ");

        double length = scanner.nextDouble();

        System.out.println("Enter the width of the rectangle: ");

        double width = scanner.nextDouble();

        double area = length * width;

        System.out.println("Results: ");

        System.out.println("Area of the rectangle: " + area);

        double myPerim = (length * 2) + (width * 2);

        System.out.println("Perimeter of the rectangle: " + myPerim);
    }
}