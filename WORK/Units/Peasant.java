//КРЕСТЬЯНИН

package WORK.Units;

public class Peasant extends Infantry{
    protected int workHelp; // рабочая помощь

    public Peasant(String name, int health, int[] damage, int armor, int tool, int workHelp) {
        super(name, health, damage, armor, tool);
        this.workHelp = workHelp;
    }
    public Peasant(String name) {
        this(name, 7, new int [] {1,3}, 2, 2,8);
    }

    

    @Override
    public String getInfo() {

        return super.getInfo();

    }
}