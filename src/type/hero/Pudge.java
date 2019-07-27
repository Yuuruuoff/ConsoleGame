package type.hero;

import Engine.PropertiesReader;

public class Pudge extends Hero {
    private Integer hp;

    public Pudge(){
        super(HeroTypeEnum.PUDGE);
        initHero(PropertiesReader.getPropertyAsInteger("hero.pudge.hp"), PropertiesReader.getPropertyAsInteger("hero.pudge.dmg"));
    }






    }
