/* Program:    MeltableSnowFlake.java
 * Student:    Kevin Orr, Seung-Yeon Lee
 * Desc:       
 */

package grouplab2;

public class MeltableSnowFlake extends SnowFlake {

    @Override
    public void melt() {
        this.diameter /= this.diameter + this.TYPE;
        this.radius = this.diameter / 2;
    }

}
