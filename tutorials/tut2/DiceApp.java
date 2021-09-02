package tutorials.tut2;

import java.util.Scanner;

public class DiceApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Dice dice1 = new Dice();
        System.out.println("Press <key> to roll the first dice");
        in.nextLine();
        dice1.setDiceValue();
        dice1.printDiceValue();
        
        Dice dice2 = new Dice();
        System.out.println("Press <key> to roll second dice");
        in.nextLine();
        dice2.setDiceValue();
        dice2.printDiceValue();

        System.out.println("Your total number is: " + (dice1.getDiceValue() + dice2.getDiceValue()));

        in.close();
    }
}
