//МОНАХ

package WORK.Units;

public class Monk extends Magian {
    public Monk(String name) {

        super(name, 13, new int [] {1,3}, 3, 3,1,8);
    }

    @Override
    public String getInfo() {
        return String.format("%s  mana: %d  field: %d",
                super.getInfo(), this.mana, this.field);
    }
}