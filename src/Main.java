import Engine.GameStruct;
public class Main {

    public static void main(String[] args) {

       GameStruct gameStruct = new GameStruct();
       gameStruct.game();
    }
}

//из статического получить не статический - создавать экземпляр класса
//из статики статику - проблем не будет
//из НЕ статическго статический - проблем тоже не будет
//GameConsole - camel case
//game_console - snake case
