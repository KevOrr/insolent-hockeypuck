/* Program:    SnowBallFactory.java
 * Student:    Kevin Orr, Seung-Yeon Lee
 * Desc:       
 */

package grouplab2;

import java.util.ArrayList;
import java.util.Random;

public class SnowBallFactory {

    static Random gen = new Random(System.currentTimeMillis());

    public static void main(String[] args) {
        ArrayList<MeltableSnowFlake> snowBall = createSnowBall(25, 0, new ArrayList<MeltableSnowFlake>());
        for (int i=0; i<snowBall.size(); i++) {
            System.out.println(snowBall.get(i));
        }
    }

    private static ArrayList<MeltableSnowFlake> createSnowBall(int desiredSize, int currentSize, ArrayList<MeltableSnowFlake> snowBall) {
        if (currentSize < desiredSize) {
            snowBall.add(SnowFlake.makeRandomSnowflake());
            createSnowBall(currentSize + 1, desiredSize, snowBall);
        }
        return snowBall;
    }
}
