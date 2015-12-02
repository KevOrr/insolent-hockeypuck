/* Program:    SnowBallFactory.java
 * Student:    Kevin Orr, Seung-Yeon Lee
 * Desc:       Builds a snowball to throw at someone. Good luck!
 */

package grouplab2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SnowBallFactory {

    static Random gen = new Random(System.currentTimeMillis());
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Craft snowball
        System.out.print("Target size: ");
        double targetSize = scanner.nextDouble();
        ArrayList<MeltableSnowFlake> snowBall = createSnowBall(targetSize, 0, new ArrayList<MeltableSnowFlake>());

        // Inspect snowball
        for (int i=0; i<snowBall.size(); i++) {
            System.out.println(snowBall.get(i));
        }

        // Get total size
        double diameterSum = 0;
        for (MeltableSnowFlake flake : snowBall) {
            diameterSum += flake.getDiameter();
        }
        System.out.println();
        System.out.format("Total count: %d\nTotal size: %f\n", snowBall.size(), diameterSum);

        // What good's a snowball if you don't throw it at someone?
        System.out.println();
        System.out.print("What is your throwing accuracy (0-100)? ");
        double accuracy = scanner.nextDouble() / 100;
        accuracy /= Math.max(1, diameterSum / 100); // penalizes when diameterSum > 100
        scanner.nextLine(); // flush
        System.out.print("Who will you throw this snowball at? ");
        String name = scanner.nextLine();
        accuracy /= Math.max(1, name.length() / 10.0); // penalizes when name.length > 10
        System.out.println(gen.nextDouble() < accuracy ? "You hit " + name + "! Nice throw!" : "'Snow luck, you missed!");
    }

    private static ArrayList<MeltableSnowFlake> createSnowBall(double desiredSize, double currentSize, ArrayList<MeltableSnowFlake> snowBall) {
        if (currentSize < desiredSize) {
            MeltableSnowFlake flake = MeltableSnowFlake.makeRandomSnowflake();
            snowBall.add(flake);
            createSnowBall(desiredSize, currentSize + flake.getDiameter(), snowBall);
        }
        return snowBall;
    }
}
