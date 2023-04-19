//АРБАЛЕТЧИК

package WORK.Units;

public class CrossBowMan extends Shooter  {
    
    public CrossBowMan(String name){

        super(name, 1, new int [] {1,1}, 1, 3,2,12);
    }
    public String getInfo() {
        return String.format("%s  arrows: %d  accuracy: %d",
                super.getInfo(), this.arrows, this.accuracy, this.range);
    }
}
