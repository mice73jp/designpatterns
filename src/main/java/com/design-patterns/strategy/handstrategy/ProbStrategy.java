package com.cleanarchitect.strategy.handstrategy;

import java.util.Random;

import com.cleanarchitect.strategy.player.Hand;

public class ProbStrategy implements Strategy{
    private Random random;
    private int prevHandValue = 0;
    private int currentHandValue = 0;
    private int[][] history = {
        {1, 1, 1},
        {1, 1, 1},
        {1, 1, 1},
    };

    
    public ProbStrategy(int seed) {
        this.random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        int bet = this.random.nextInt(getSum(this.currentHandValue));
        int handvalue = 0;

        if ( bet < history[currentHandValue][0]) {
            handvalue = 0;
        } else if ( bet < history[currentHandValue][0] + history[currentHandValue][1]) {
            handvalue = 1;
        } else {
            handvalue = 2;
        }

        prevHandValue = currentHandValue;
        currentHandValue = handvalue;
        return Hand.getHand(handvalue);
    }

    private int getSum(int hv) {
        int sum = 0;
        for( int i = 0; i < 3; i++ ) {
            sum += this.history[hv][i];
        }
        return sum;
    }

    @Override
    public void study(boolean win) {
        if (win) {
            this.history[this.prevHandValue][currentHandValue]++;
        } else {
            this.history[this.prevHandValue][(currentHandValue + 1)%3]++;
            this.history[this.prevHandValue][(currentHandValue + 2)%3]++;
        }
        
    }
    
}
