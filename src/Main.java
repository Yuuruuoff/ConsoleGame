import Engine.GameStruct;
import Engine.PropertiesReader;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        new PropertiesReader("src/Engine/test.txt");
        GameStruct gameStruct = new GameStruct();
        gameStruct.game();

    }
}
//игру переделать на Socket
//1 сервер, 2 клиента
//оба клиента коннектятся к серверу и начинают игру
//все расчеты происходят на стороне сервера
//gl hf

//из статического получить не статический - создавать экземпляр класса
//из статики статику - проблем не будет
//из НЕ статическго статический - проблем тоже не будет
//GameConsole - camel case
//game_console - snake case
