
/**
 * Day 3 Demo: Continuing a RPG game. Learning Math, String, formated printing.
 *
 * @author ellie
 * @version 2026-08-28
 */
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        // get players name
        System.out.println("uhh what's ur name");
        
        // v1 in 2 lines
        // String name = scnr.nextLine();
        // name = name.toLowerCase(); // sets name to lowercase
        // v2 in 1 line
        String name = scnr.nextLine().trim().toLowerCase(); // .trim() gets rid of leading and trailing spaces
        // trim beforehand so that toLowerCase won't have to run through any excess trailing or leading spaces
        
        // get initials (assume two names)
        // int firstInitialIndex = 0; redundant
        int lastInitialIndex = name.indexOf(" ") + 1;
        String initials = name.substring(0, 1) + ". " + name.substring(lastInitialIndex, lastInitialIndex + 1) + ".";
        
        System.out.println("oh hey, " + name);
        System.out.printf("or more elegantly, %s", initials.toUpperCase());
        
        
        // money
        int money = 0;
        
        System.out.println("the bank will convert ur funds \n 1 gold = 100 copper \n 1 silver = 10 copper \n 1 gold = 10 silver\nhow much copper do you want to put into the bank? ");
        scnr.nextLine(); // clear hanging /n as int leaves a /n as it only takes the int.
        int copper = scnr.nextInt();
 
        System.out.printf("%s are your initials", initials.toUpperCase());  
        System.out.printf("%nd is your copper", copper);

        
        /*
        // convert gold and silver
        int gold = copper / 100;
        copper %= 100; //copper = copper % 100;
        int silver = copper / 10;
        copper %= 100; //silver = silver % 10;
        
        
        // character class
        // classes = ("Knights", "Peasant", "Krusty Krab Worker");
        System.out.println("what class does your character have");
        String charClass = scnr.nextLine();
        
        // hitpoints  (fractional number from 0-100)
        System.out.println("how many hitpoints does your character have");
        double hitPoints = scnr.nextDouble();
        
        
        // print out character info
        System.out.println("name: " + name);
        System.out.println("money: \n copper: " + copper + "\n silver: " + silver + "\n gold: " + gold);
        System.out.println("bad news the bank had a 100% lending clients assets rate with no returns \nall your funds were lost and you are now a peasant"); 
        System.out.println("character class: " + charClass);
        System.out.println("hitpoints: " + hitPoints);
        */
    }
}