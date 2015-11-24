/* Program:     SnowFlake.java
 * Students:    Kevin Orr, Seung-Yeon Lee
 * Desc:        Describes an abstract SnowFlake
 */

package grouplab2;

import java.util.ArrayList;
import java.util.Random;

public abstract class SnowFlake {
    int TYPE;
    double radius;
    double diameter;
    double meltModifier = 0.05;

    static Random gen = new Random(System.currentTimeMillis());
    static int snowFall = 0; // number of SnowFlake created
    static ArrayList<Class<? extends MeltableSnowFlake>> snowflakeTypes =
            new ArrayList<Class<? extends MeltableSnowFlake>>();

    public SnowFlake() {
        SnowFlake.snowFall++;
        this.radius = this.diameter / 2;
    }

    public static MeltableSnowFlake makeRandomSnowflake() {
        return new SimplePrism();
    }

    public int getType() {
        return this.TYPE;
    }

    public double getDiameter() {
        return this.diameter;
    }

    public double getRadius() {
        return this.radius;
    }

    public String toString() {
        return "Placeholder"; // TODO
    }

    public abstract void melt();
}
