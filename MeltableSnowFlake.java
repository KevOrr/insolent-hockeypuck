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
            case 8:  return new Cup();
            case 9:  return new ColumnsOnPlate();
            case 10: return new TwelveBranchedStar();
            case 11: return new StellarPlate();
            case 12: return new BulletRosette();
            case 13: return new CappedColumn();
            case 14: return new SplitPlatesAndStars();
            case 15: return new RadiatingPlate();
            case 16: return new SectoredPlate();
            case 17: return new IsolatedBullet();
            case 18: return new MultiplyCappedColumn();
            case 19: return new SkeletalForm();
            case 20: return new RadiatingDendrite();
            case 21: return new SimpleStar();
            case 22: return new SimpleNeedle();
            case 23: return new CappedBullets();
            case 24: return new TwinColumn();
            case 25: return new Irregular();
            
            // case ...
            default: return new MeltableSnowFlake(); //Unreachable, but won't compile without
        }
    }

}
