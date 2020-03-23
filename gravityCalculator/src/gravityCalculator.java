import java.util.Scanner;

public class gravityCalculator {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Here's a simple gravity calculator.");
        System.out.println("So, what's the mass of the gravitating body?");
        Integer massOfBody = inputReader.nextInt();
        System.out.println("So, what's the distance from the gravitating body?");
        Integer distanceFromBody = inputReader.nextInt();
        System.out.println("The gravitational acceleration is " + String.valueOf(findGravity(massOfBody, distanceFromBody)) + " m/s^2");
    }
    public static double findGravity(Integer bodyMass, Integer bodyDistance){
        return (0.00000000000667 * bodyMass)/(bodyDistance * bodyDistance);
    }
}
