import java.util.Random;
import java.util.Scanner;

public class DieRoller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        boolean keepRolling;

        do {
            int rollCount = 0, die1, die2, die3, sum;
            System.out.printf("Roll\tDie1\tDie2\tDie3\tSum\n");
            System.out.printf("---------------------------------------\n");

            do {
                die1 = rand.nextInt(6) + 1;
                die2 = rand.nextInt(6) + 1;
                die3 = rand.nextInt(6) + 1;
                sum = die1 + die2 + die3;
                rollCount++;
                System.out.printf("%3d\t%3d\t%3d\t%3d\t%3d\n", rollCount, die1, die2, die3, sum);
            } while (die1 != die2 || die2 != die3);

            System.out.print("Do you want to roll again? (y/n): ");
            String userInput = scanner.next();
            keepRolling = userInput.equalsIgnoreCase("y");

        } while (keepRolling);

        System.out.println("Thank you for playing!");
        scanner.close();
    }
}

