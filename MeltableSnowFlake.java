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
        MeltableSnowFlake flake;
        switch (gen.nextInt(35) + 1) {
            case 1:  flake = new SimplePrism();
            case 2:  flake = new SolidColumn();
            case 3:  flake = new Sheath();
            case 4:  flake = new ScrollsOnPlate();
            case 5:  flake = new TriangularForm();
            case 6:  flake = new HexagonalPlate();
            case 7:  flake = new HollowColumn();
            case 8:  flake = new Cup();
            case 9:  flake = new ColumnsOnPlate();
            case 10: flake = new TwelveBranchedStar();
            case 11: flake = new StellarPlate();
            case 12: flake = new BulletRosette();
            case 13: flake = new CappedColumn();
            case 14: flake = new SplitPlatesAndStars();
            case 15: flake = new RadiatingPlate();
            case 16: flake = new SectoredPlate();
            case 17: flake = new IsolatedBullet();
            case 18: flake = new MultiplyCappedColumn();
            case 19: flake = new SkeletalForm();
            case 20: flake = new RadiatingDendrite();
            case 21: flake = new SimpleStar();
            case 22: flake = new SimpleNeedle();
            case 23: flake = new CappedBullets();
            case 24: flake = new TwinColumn();
            case 25: flake = new Irregular();
            default: flake = new MeltableSnowFlake(); //Unreachable, but won't compile without
        }
        return flake;
    }

}
