/* Program:     SnowFlake.java
 * Students:    Kevin Orr, Seung-Yeon Lee
 * Desc:        Describes an abstract SnowFlake
 */

package grouplab2;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import grouplab2.flakes.SimplePrism;
import grouplab2.flakes.SolidColumn;

public abstract class SnowFlake {
    int TYPE;
    double radius;
    double diameter;
    double meltModifier = 0.05;

    static Random gen = new Random(System.currentTimeMillis());
    static int snowFall = 0; // number of SnowFlake created
    static List<Class<? extends MeltableSnowFlake>> snowflakeTypes = Arrays.asList(
        SimplePrism.class,
        SolidColumn.class
    );

    public SnowFlake() {
        SnowFlake.snowFall++;
        this.radius = this.diameter / 2;
    }

    public static MeltableSnowFlake makeRandomSnowflake() {
        try {
            return snowflakeTypes.get(gen.nextInt(snowflakeTypes.size())).newInstance();
        } catch (IllegalAccessException|InstantiationException e) {
            System.out.println("Couldn't instantiate class: " + e.getLocalizedMessage());
            return new SimplePrism();
        }
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
