package main;

public class Question8 {
    public int rollDice(int sides) {
        double randomDouble = Math.random();
        randomDouble = randomDouble * sides;
        int randomInt = (int) randomDouble;
        randomInt = randomInt + 1;
        return randomInt;
    }

    public int rollDice() {
        return rollDice(6);
    }

    public int monopolyRoll() {
        int dice1 = rollDice();
        int dice2 = rollDice();
        if(dice1 != dice2){
            System.out.println("Dice 1: "+dice1);
            System.out.println("Dice 2: "+dice2);
            return dice1 + dice2;
        }
        else {
            System.out.println("go again");
            int dice3 = rollDice();
            int dice4 = rollDice();
            return dice1 + dice2 + dice3 + dice4;
        }
    }
}
