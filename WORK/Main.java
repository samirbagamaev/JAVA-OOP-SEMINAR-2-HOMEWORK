/* 
Создать иерархию классов для персонажей
Крестьянин	Разбойник*	Снайпер*	Колдун*
копейщик*	арбалетчик	монах
----------------------------------------------------------------------
Проанализировать персонажей "Крестьянин, Разбойник, Снайпер, Колдун,
Копейщик, Арбалетчик, Монах". Для каждого определит 8 полей данных(здоровье,
сила итд) 3-4 поля поведения(методов атаковать, вылечить итд). Создать 
абстрактный класс и иерархию наследников. Расположить классы в пакет так, 
чтобы в основной программе небыло видно их полей. В не абстрактных классах 
переопределить метод toString() так чтобы он возвращал название класса или имя. 
Создать в основной программе по одному обьекту каждого не абстрактного класса и 
вывести в консоль его имя.
----------------------------------------------------------------------
Добавить файл с описанием интерфейса. В котором описать два метода, void step();
и String getInfo(); Реализовать интерфейсs в абстрактном классе и в наследниках 
так, чтобы getInfo возвращал информацию о персонаже. Создать два списка в классе 
main. В каждый список добавить по десять экземнляров наследников BaseHero. 
В main пройти по спискам и вызвать у всех персонажей getInfo.


*/
// package WORK;

// import WORK.Units.*;

// public class Main {

//     public static void main(String[] args) {
//         Hero hero1 = new Sniper("Alex");     //СНАЙПЕР 
//         Hero hero2 = new Spearman("Vlad");   //КОПЕЙЩИК
//         Hero hero3 = new Witcher("Maxim");   //КОЛДУН
//         Hero hero4 = new Thief("Anatoly");   //РАЗБОЙНИК
//         Hero hero5 = new Peasant("Alexey");  //КРЕСТЬЯНИН
//         Hero hero6 = new Monk("Serega");     //МОНАХ
//         Hero hero7 = new CrossBowMan("Maga"); //АРБАЛЕТЧИК
//         hero4.attack(hero3);

//         System.out.println(hero1.toString());
//         System.out.println(hero2.toString());
//         System.out.println(hero3.toString());
//         System.out.println(hero4.toString());
//         System.out.println(hero5.toString());
//         System.out.println(hero6.toString());
//         System.out.println(hero7.toString());

//     }
// }
//=============================================================================




package WORK;

import java.util.ArrayList;
import java.util.Random;

import WORK.Units.CrossBowMan;
import WORK.Units.Hero;
import WORK.Units.Monk;
import WORK.Units.Peasant;
import WORK.Units.Sniper;
import WORK.Units.Spearman;
import WORK.Units.Thief;
import WORK.Units.Witcher;

public class Main {
    /*
     * Создать иерархию классов для персонажей
     * Крестьянин* Разбойник* Снайпер* Колдун*
     * копейщик* арбалетчик* монах*
     */
    public static void main(String[] args) {
        ArrayList<Hero> team1 = new ArrayList<>();
        ArrayList<Hero> team2 = new ArrayList<>();

        int teamSize = 10;

        for (int i = 0; i < teamSize; i++) {
            switch (new Random().nextInt(1, 5)) {
                case 1:
                    team1.add(new Sniper("Alex"));
                    break;
                case 2:
                    team1.add(new Spearman("Vlad"));
                    break;
                case 3:
                    team1.add(new Witcher("Maxim"));
                    break;
                case 4:
                    team1.add(new Peasant("Alexey"));
                    break;
                case 5:
                    team1.add(new Thief("Anatoly"));
                    break;
                case 6:
                    team1.add(new Monk("Serega"));
                    break;
                case 7:
                    team1.add(new CrossBowMan("Maga"));
                    break;
            }
        }

        for (int i = 0; i < teamSize; i++) {
            switch (new Random().nextInt(1, 5)) {
                case 1:
                    team2.add(new Sniper("Alex"));
                    break;
                case 2:
                    team2.add(new Spearman("Vlad"));
                    break;
                case 3:
                    team2.add(new Witcher("Maxim"));
                    break;
                case 4:
                    team2.add(new Peasant("Alexey"));
                    break;
                case 5:
                    team2.add(new Thief("Anatoly"));
                    break;
                case 6:
                    team2.add(new Monk("Serega"));
                    break;
                case 7:
                    team2.add(new CrossBowMan("Maga"));
                    break;
            }
        }

        team1.forEach(unit -> System.out.println(unit.getInfo()));
        System.out.println();

        System.out.println("==============================================");

        System.out.println();
        team2.forEach(unit -> System.out.println(unit.getInfo()));

    }
}