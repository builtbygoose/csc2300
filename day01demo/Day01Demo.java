
/**
 * CSC 2300 Day 1 Demo: Hello, World!
 *
 * @author ellie
 * @version 2026-8-26
 */
import java.util.Scanner;

public class Day01Demo {
    public static void main(String[] args) { // adds a function called main, defining args as a array of strings
        Scanner scnr = new Scanner(System.in); // System.in is how we get input from the keyboard
        
        System.out.println("who r u?");
        String name = scnr.nextLine(); // [Datatype:String] [varName] = [dataInVar]
        
        // System.out.println("Hello, world!");
        System.out.println("oh hey " + name);
    }
    
    
}