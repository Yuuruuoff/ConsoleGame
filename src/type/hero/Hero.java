package type.hero;

import Engine.Console;

public abstract class Hero {

    private Integer hp;
    private Integer damage;
    private HeroTypeEnum heroType;

    Hero() {
    }

    Hero(HeroTypeEnum heroType) {
        this.heroType = heroType;
    }

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

    public void getDmgFrom(Hero a) {
        hp -= a.getDamage();
        if (hp <= 0) {
            hp = 0;
        }
        Console.formattedOutput(a.heroType.toString() + " нанес урон " + this.heroType.toString() + " и теперь его здоровье : " + this.getHp());


    }

    public Boolean isAlive() {
        return getHp() > 0;


    }

    public void outputFormattedHp() {
        Console.formattedOutput("Здоровье: " + hp);
    }

    public void outputFormattedDmg() {
        Console.formattedOutput("Атака: " + damage);
    }

    @Override
    public int hashCode() {
        return hp.hashCode() + damage.hashCode() + heroType.hashCode();
    }


}

