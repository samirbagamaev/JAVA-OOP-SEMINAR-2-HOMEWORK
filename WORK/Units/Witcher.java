//КОЛДУН

package WORK.Units;

public class Witcher extends Magian {
    public Witcher(String name) {

        super(name, 13, new int [] {1,3}, 3, 3,1,2);
    }

    @Override
    public String getInfo() {
        return String.format("%s  mana: %d  accuracy: %d",
                super.getInfo(), this.mana, this.accuracy);
    }
}
