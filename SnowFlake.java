/* Program:     SnowFlake.java
 * Students:    Kevin Orr, Seung-Yeon Lee
 * Desc:        Describes an abstract SnowFlake
 */

package grouplab2;

import java.util.Random;

public abstract class SnowFlake {
    protected int TYPE;
    private int id;
    protected double radius;
    protected double diameter;

    static final double MELT_MODIFIER = 0.05;
    private static Random gen = new Random(System.currentTimeMillis());
    private static int snowFall = 0; // number of SnowFlake created

    public SnowFlake() {
        SnowFlake.snowFall++;
        this.id = snowFall;
        this.diameter = gen.nextDouble() * (gen.nextInt(3) + 8);
        this.radius = this.diameter / 2;
    }

    public int getId() {
        return this.id;
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
        return String.format("%3d %s(type=%d, diameter=%f)", this.id,
                this.getClass().getSimpleName(), this.TYPE, this.diameter);
    }

    public abstract void melt();
}
