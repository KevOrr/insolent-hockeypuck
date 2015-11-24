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

    static final double MELT_MODIFIER = 0.05;
    static Random gen = new Random(System.currentTimeMillis());
    static int snowFall = 0; // number of SnowFlake created

    public SnowFlake() {
        SnowFlake.snowFall++;
        // TODO define diameter
        this.radius = this.diameter / 2;
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

    @Override
    public String toString() {
        return "Placeholder"; // TODO
    }

    public abstract void melt();
}
