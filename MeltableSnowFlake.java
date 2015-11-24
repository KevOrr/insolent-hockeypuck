/* Program:    MeltableSnowFlake.java
 * Student:    Kevin Orr, Seung-Yeon Lee
 * Desc:       
 */

package grouplab2;

import grouplab2.flakes.SimplePrism;
import grouplab2.flakes.SolidColumn;

public class MeltableSnowFlake extends SnowFlake {

    @Override
    public void melt() {
        this.diameter -= this.diameter / (SnowFlake.MELT_MODIFIER + this.TYPE);
        this.radius = this.diameter / 2;
    }

    public static MeltableSnowFlake makeRandomSnowflake() {
        MeltableSnowFlake flake = null;
        switch (gen.nextInt(35)) {
        case 1:  flake = new SimplePrism();
        case 2:  flake = new SolidColumn();
        //case 3
        // ...
        default: flake = new SimplePrism(); // TODO remove this line
        }

        return flake;
    }

}
