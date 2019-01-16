
import java.util.Scanner;

public class labFour {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		String userWantsToPlay = "y";

		while (userWantsToPlay.startsWith("y")) {

			System.out.println("Please, enter a number to be listed, squared, and cubed:");
			int loopCount = scnr.nextInt();
			scnr.nextLine();

			System.out.println("\tNumber\tSquared\tCubed\t");
			System.out.println("\t====\t====\t====\t");

			for (int i = 1; i <= loopCount; i++) {

				System.out.println("\t" + i + "\t");
				System.out.println("\t\t" + Math.pow(i, 2) + "\t\t");
				System.out.println("\t\t\t" + Math.pow(i, 3) + "\t\t\t");
			}
			System.out.println("===========================");
			System.out.println("Yo, peep dat wick'd slant!");
			System.out.println();
			System.out.println("Would you like to enter another number? (y/n)");
			userWantsToPlay = scnr.nextLine();
		}

	}

}
