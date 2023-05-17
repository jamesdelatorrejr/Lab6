import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        double gasInTank = 0;
        double milesPerGallon = 3;
        double pricePerGallon = 0;
        boolean done = false;
        boolean doneTwo = false;
        boolean doneThree = false;
        String error = "";
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("How many gallons of gas in tank: ");
            if (in.hasNextDouble())
            {
                gasInTank = in.nextDouble();
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
            System.out.println("How many miles per gallon: ");
            if (in.hasNextDouble())
            {
                milesPerGallon = in.nextDouble();
                in.hasNextLine();
                doneTwo = true;
            }
            else
            {
                error = in.nextLine();
                System.out.println("Error in your input " + error + " Provide a number.");
            }
        }
        while (doneTwo == false);

        do {
            System.out.println("Price per gallon: ");
            if (in.hasNextDouble())
            {
                pricePerGallon = in.nextDouble();
                in.hasNextLine();
                doneThree = true;
            }
            else
            {
                error = in.nextLine();
                System.out.println("Error in your input " + error + " Provide a number.");
            }
        }
        while (doneThree == false);

        System.out.println(gasInTank + pricePerGallon + milesPerGallon);
    }
}


