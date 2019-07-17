package type.hero;

import Engine.Console;

public class Hero {

    private Integer hp;
    private Integer damage;


    protected void initHero(Integer hp, Integer damage) {
        this.hp = hp;
        this.damage = damage;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }


    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public void makeDamage(Integer a) {
        hp = hp - a;
    }

    public void outputFormattedHp() {
        Console.formattedOutput("Здоровье: " + hp);
    }

    public void outputFormattedDmg() {
        Console.formattedOutput("Атака: " + damage);
    }
}

