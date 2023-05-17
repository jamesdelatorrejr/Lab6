import java.util.Scanner;
public class Task1 {

    static double celToFah(double cel)
    {
        return (cel * 1.8) + 32;
    }

    public static void main(String[] args) {
        double celcius = 0;
        double fahrenheit = 3;
        boolean done = false;


        Scanner in = new Scanner(System.in);
        String error = "";
        do {
            System.out.println("Enter temperature in celcius: ");
            if (in.hasNextDouble())
            {
                celcius = in.nextDouble();
                fahrenheit = celToFah(celcius);
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

        if (fahrenheit < 32)
        {
            System.out.println("Your temperature is " + fahrenheit + ". This means it is freezing");
        }
        else if (fahrenheit >= 212)
        {
            System.out.println("Your temperature is " + fahrenheit + ". This means it is boiling hot!");
        }
        else
        {
            System.out.println("Your temperature is " + fahrenheit + ". It is normal.");
        }


    }
}


