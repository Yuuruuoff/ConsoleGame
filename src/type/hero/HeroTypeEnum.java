package type.hero;

public enum HeroTypeEnum {
    PUDGE, RIKI, AXE, ENEMY;


    public static String getAllHeroes() {
        return PUDGE.toString() + " " + RIKI.toString() + " " + AXE.toString() + " " + ENEMY.toString();
    }
}
