/* Program:    SnowBallFactory.java
 * Student:    Kevin Orr, Seung-Yeon Lee
 * Desc:       
 */

package grouplab2;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Random;

public class SnowBallFactory {

    static Random gen = new Random(System.currentTimeMillis());

    public static void main(String[] args) {
        createSnowBall(25, 0, new ArrayList<MeltableSnowFlake>());
    }

    private static void createSnowBall(int desiredSize, int currentSize, ArrayList<MeltableSnowFlake> snowBall) {
        if (currentSize < desiredSize) {
            snowBall.add(SnowFlake.makeRandomSnowflake());
            createSnowBall(currentSize + 1, desiredSize, snowBall);
        }
    }
}
