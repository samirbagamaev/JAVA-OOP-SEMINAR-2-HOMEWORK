package WORK.Units;

import java.util.Random;

public abstract class Hero {

    protected String name; // имя
    protected int health; // здоровье
    protected int maxHealth; // Макс здоровбе
    protected int[] damage; // урон
    protected int armor; // броня
    protected static Random rnd;

    static {
        Hero.rnd = new Random();
    }

    public Hero(String name, int health, int[] damage, int armor) {
        this.name = name;
        this.health = health;
        this.maxHealth = health;
        this.damage = damage;
        this.armor = armor;
    }

    public String getInfo() {
        return String.format("Name: %s  Health: %d  Type: %s",
                this.name, this.health, this.getClass().getSimpleName());
    }

    public void healed(int Hp) {
        this.health = Hp + this.health > this.maxHealth ? this.maxHealth : Hp + this.health;
    }

    public void getDamage(int doneDamage) {
        doneDamage = (int) (doneDamage * ((100 - this.armor) / 100));
        if ((this.health - doneDamage) > 0) {
            this.health -= doneDamage;
        } // тут будет метод умирания, если полученный урон > текущего здоровья
    }

    public void attack(Hero target) {
        int damage = Hero.rnd.nextInt(this.damage[0], this.damage[1]);
        target.getDamage(damage);
    }

    public void step() {

    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

}
