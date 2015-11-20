/* Program:    SnowBallFactory.java
 * Student:    Kevin Orr, Seung-Yeon Lee
 * Desc:       
 */

package grouplab2;

import java.util.ArrayList;
import java.util.Random;

public class SnowBallFactory {

    Random gen = new Random(System.currentTimeMillis());

    public static void main(String[] args) {
        new SimplePrisms();
    }

    private void createSnowBall(int desiredSize, int currentSize,
                                ArrayList<MeltableSnowFlake> snowBall) {
        if (currentSize < desiredSize) {
            MeltableSnowFlake flake = SnowFlake.snowflakeTypes.get(gen.nextInt(SnowFlake.snowflakeTypes.size()));
            //snowBall.add();
            //createSnowBall(currentSize + 1, desiredSize)
        }
    }

}
