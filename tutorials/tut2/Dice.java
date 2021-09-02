package tutorials.tut2;

public class Dice {
    private int valueOfDice;

    public Dice() {
        setDiceValue();
    }

    public void setDiceValue() {
        valueOfDice = 1 + (int)(Math.random() * 6);
    }

    public int getDiceValue() {
        return valueOfDice;
    }

    public void printDiceValue() {
        System.out.println("Current Value is " + valueOfDice);
    }
}
