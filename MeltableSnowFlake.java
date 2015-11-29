/* Program:    MeltableSnowFlake.java
 * Student:    Kevin Orr, Seung-Yeon Lee
 * Desc:       
 */

package grouplab2;

import grouplab2.flakes.*;

public class MeltableSnowFlake extends SnowFlake {

    @Override
    public void melt() {
        this.diameter -= this.diameter / (SnowFlake.MELT_MODIFIER + this.TYPE);
        this.radius = this.diameter / 2;
    }

    public static MeltableSnowFlake makeRandomSnowflake() {
        switch (gen.nextInt(35) + 1) {
            case 1:  return new SimplePrism();
            case 2:  return new SolidColumn();
            case 3:  return new Sheath();
            case 4:  return new ScrollsOnPlate();
            case 5:  return new TriangularForm();
            case 6:  return new HexagonalPlate();
            case 7:  return new HollowColumn();
            // case ...
            default: return new MeltableSnowFlake(); //Unreachable, but won't compile without
        }
    }

}
