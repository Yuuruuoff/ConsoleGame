package type.hero;

import Engine.PropertiesReader;

public class Enemy extends Hero {


    public Enemy(){
        super(HeroTypeEnum.ENEMY);
        initHero(PropertiesReader.getPropertyAsInteger("hero.enemy.hp"), PropertiesReader.getPropertyAsInteger("hero.enemy.dmg"));
    }

}
