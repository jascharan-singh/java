import java.util.Scanner;

public class TankVolumeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // User Input
        double radius = getUserInput("Please Enter Radius in inches", input);
        double depth = getUserInput("Please Enter Depth", input);

        // Volume Calculation
        double totalVolume = calculateTankVolume(radius, depth);

        // Conversion to Gallons
        double totalGallons = convertToGallons(totalVolume);

        // Decision Making and Output
        checkTankCapacity(totalGallons);
    }

    // Function to get user input with exception handling
    private static double getUserInput(String prompt, Scanner scanner) {
        double userInput = 0;
        boolean validInput = false;

        do {
            try {
                System.out.println(prompt);
                userInput = scanner.nextDouble();
                validInput = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // clear the invalid input
            }
        } while (!validInput);

        return userInput;
    }

    // Function to calculate tank volume
    private static double calculateTankVolume(double radius, double depth) {
        return 3.14 * radius * radius * depth;
    }

    // Function to convert volume to gallons
    private static double convertToGallons(double volume) {
        return volume * 7.48;
    }

    // Function to check tank capacity and provide output
    private static void checkTankCapacity(double totalGallons) {
        if (totalGallons > 300) {
            System.out.println(totalGallons + " gallons are enough for a family of four people, so you do not need a separate tank.");
        } else {
            System.out.println(totalGallons + " gallons are not enough for a family of four people, so you do need a separate tank.");
        }
    }
}
