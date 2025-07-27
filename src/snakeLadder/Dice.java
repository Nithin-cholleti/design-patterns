package snakeLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    private final int numberOfDice;
    private final int numberOfFaces;

    public Dice(int numberOfDice, int numberOfFaces) {
        this.numberOfDice = numberOfDice;
        this.numberOfFaces = numberOfFaces;
    }

    public int rollDice(){
        int jumpValue = 0;
        for(int i = 0 ; i< numberOfDice; i++){
            jumpValue += ThreadLocalRandom.current().nextInt(1, numberOfFaces+1);
        }
        return jumpValue;
    }

}
