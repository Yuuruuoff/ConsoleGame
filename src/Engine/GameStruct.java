package Engine;

import type.hero.*;

public class GameStruct {

    private Hero pers = null;
    private Hero pers2 = null;

    public void game() {
        Console.formattedOutput("Соломид 1 vs 1 ");
        Console.breakLine();
        Console.formattedOutput("Первый игрок выбирает перса");
        pers = choose();
        pers.outputFormattedHp();
        pers.outputFormattedDmg();
        Console.breakLine();
        Console.formattedOutput("Второй игрок выбирает перса");
        pers2 = choose();
        pers2.outputFormattedHp();
        pers2.outputFormattedDmg();
        fightLogic();

    }


    private void fightLogic() {
        while (pers.isAlive() && pers2.isAlive()) {
            pers.getDmgFrom(pers2);
            if (pers.isAlive()) {
                pers2.getDmgFrom(pers);
            }


        }

    }

    private Hero choose() {
        Console.formattedOutput(HeroTypeEnum.getAllHeroes());
        String choose = Console.readUpperString();

        if (HeroTypeEnum.PUDGE.toString().equals(choose)) {
            return new Pudge();
        } else if (HeroTypeEnum.AXE.toString().equals(choose)) {
            return new Axe();
        } else if (HeroTypeEnum.RIKI.toString().equals(choose)) {
            return new Riki();
        } else {
            return choose();
        }
//        HeroTypeEnum heroTypeEnum;
//        try{
//            heroTypeEnum = HeroTypeEnum.valueOf(choose);
//        }catch (IllegalArgumentException ex){
//            return choose();
//        }
    }


}