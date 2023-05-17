import java.util.Scanner;
import java.lang.Math;

public class Task3 {
    public static void main(String[] args) {
        double height = 0;
        double length = 3;
        double hypot = 0;
        boolean done = false;
        double area = 0;
        double perimeter = 0;
        Scanner in = new Scanner(System.in);
        String error = "";

        do {
            System.out.println("Enter your length: ");
            if (in.hasNextDouble())
            {
                length = in.nextDouble();
                in.hasNextLine();
                done = true;
            }
            else
            {
                error = in.nextLine();
                System.out.println("Error in your input " + error + " Provide a number.");
            }
        }
        while (done == false);

        do {
            System.out.println("Enter your height: ");
            if (in.hasNextDouble())
            {
                height = in.nextDouble();
                in.hasNextLine();
                done = true;
            }
            else
            {
                error = in.nextLine();
                System.out.println("Error in your input " + error + " Provide a number.");
            }
        }
        while (done == false);

        area = length * height;
        perimeter = (length * 2) + (height * 2);
        hypot = Math.sqrt((length * length) + (height * height));

        System.out.println("The area is " + area + ". The perimeter is " + perimeter);
        System.out.println("The length of the diagonal is " + hypot);
    }
}


