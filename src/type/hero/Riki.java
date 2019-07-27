package type.hero;

import Engine.PropertiesReader;

public class Riki extends Hero {

    public Riki() {
        super(HeroTypeEnum.RIKI);
        initHero(PropertiesReader.getPropertyAsInteger("hero.riki.hp"), PropertiesReader.getPropertyAsInteger("hero.riki.dmg"));
    }
}