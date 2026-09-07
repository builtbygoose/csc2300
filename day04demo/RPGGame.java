/**
 * Day 4 Demo: branching, loops, methods
 *
 * @author sspurlock
 * @version 2026-09-02
 */
import java.util.Scanner;

public class RPGGame {
    /*
     * Generate a random number between low and high
     */
    public static double randBetween(int low, int high) {
        return Math.random() * (high - low) + low;
    }
    
    /*
     * Print out character profile info
     */
    public static void printProfile(String playerName, String characterClass, String weapon, double hitPoints, int gold, int silver, int copper){
        // Print out the details
        // %-15s means: String, left-aligned, padded to 15 characters
        // %d means: Integer
        // %.2f means: Double, 2 decimal places
        System.out.println("\n==========================================");
        System.out.println("           HERO PROFILE          ");
        System.out.println("==========================================");
        System.out.printf("%-15s : %s\n", "HERO NAME", playerName);
        System.out.printf("%-15s : %s\n", "CLASS", characterClass);
        System.out.printf("%-15s : %s\n", "WEAPON", weapon);
        System.out.printf("%-15s : %.2f HP\n", "HIT POINTS", hitPoints);
        System.out.printf("%-15s : %d gp, %d sp, %d cp\n", "MONEY", gold, silver, copper);
        System.out.println("==========================================");
    }
    
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // for today, we'll hardcode some values to save time testing.
        String playerName = "Sir Spur";
        String characterClass = "Knight";
        String weapon = "Sword";
        
        // TODO: create a new method: randBetween.
        // Math.random() gives you a random number between 0 and 1
        // double hitPoints = Math.random() * 10 + 5;
        // int copper = (int)(Math.random() * 200);
        double hitPoints = randBetween(5, 15);
        int copper = (int)randBetween(0, 200);

        
        // convert to gold and silver
        int gold = copper / 100;
        copper = copper % 100;
        int silver = copper / 10;
        copper = copper % 10;
        
        // TODO: create a new method: printProfile.
        printProfile(playerName, characterClass, weapon, hitPoints, gold, silver, copper);

        // ==========================================================
        // DAY 4: BOOLEANS AND BRANCHING
        // ==========================================================
        
        // Hardcoded monster stats for today
        String monsterName = "Goblin Scout";
        int monsterAttack = 5;

        System.out.println("\n!!! DISTURBANCE IN THE BUSHES !!!");
        System.out.printf("A wild %s jumps out!\n", monsterName);
        System.out.printf("It looks ready to attack for %d damage!\n", monsterAttack);
        
        System.out.println("\nWhat will you do?");
        System.out.println("1. FIGHT");
        System.out.println("2. FLEE");
        System.out.print("Enter your choice (word or number): ");
        
        boolean validInput =! true;
        while (validInput) {
            String choice = scnr.nextLine().trim().toUpperCase();
            // TODO: Handle choices using if / else if / else
            if (choice.equals("FIGHT") || choice.equals("1")) {
                System.out.println("The Goblin Scout shot you before you could fight back.\nYou Died.");
            } else if (choice.equals("FLEE") || choice.equals("2")) {
                System.out.println("You tried to flee but the Goblin Scout shot you in the back as you ran away.\nYou Died.");
            } else {
                System.out.print("That was NOT a choice....\nIn return, the Goblin Scout shot you for not following instructions.");
                validInput = false;
            }
        }
        
        // TODO: Keep prompting user until we get valid input
        
    }
}