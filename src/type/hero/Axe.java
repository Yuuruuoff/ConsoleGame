package type.hero;

import Engine.PropertiesReader;

public class Axe extends Hero {


    public Axe() {
        super(HeroTypeEnum.AXE);
        initHero(PropertiesReader.getPropertyAsInteger("hero.axe.hp"), PropertiesReader.getPropertyAsInteger("hero.axe.dmg"));
    }


}
