import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        double meters = 0;
        double miles = 0;
        double feet = 0;
        double inches = 0;
        boolean done = false;


        Scanner in = new Scanner(System.in);
        String error = "";
        do {
            System.out.println("Enter your meters: ");
            if (in.hasNextDouble())
            {
                meters = in.nextDouble();
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

        miles = (meters / 1609);
        feet = (meters * 3.281);
        inches = (feet * 12);

        System.out.println(meters + " meters equals " + miles + " miles, " + feet + " feet, and " + inches + " inches.");
    }
}


