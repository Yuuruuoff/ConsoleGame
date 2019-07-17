package Engine;

import type.hero.Axe;
import type.hero.Hero;
import type.hero.Pudge;
import type.hero.Riki;

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


    }

    private Hero choose() {
        Console.formattedOutput("паджер рики акс");
        String choose = Console.readLoweredString();
        switch (choose) {
            case "паджер":
                return new Pudge();
            case "рики":
                return new Riki();
            case "акс":
                return new Axe();
            default:
                Console.formattedOutput("ГЫГЫ");
                return choose();
        }
    }
}