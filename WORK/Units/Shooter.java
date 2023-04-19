//СТРЕЛОК

package WORK.Units;

public abstract class Shooter extends Hero { ///СТРЕЛКИ  --> --> --> --> -->
    protected int arrows;
    protected int maxArrows;
    protected int accuracy;
    protected int range;

    public Shooter(String name, int health, int[] damage, int armor, int arrows, int accuracy, int range) {
        super(name, health, damage, armor);
        this.arrows = arrows;
        this.maxArrows = arrows;
        this.accuracy = accuracy;
        this.range = range;
    }


}