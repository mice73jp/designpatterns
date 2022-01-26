package com.cleanarchitect.strategy.handstrategy;

import java.util.Random;

import com.cleanarchitect.strategy.player.Hand;

public class WinningStrategy implements Strategy{
    private Random random;
    private boolean won = false;
    private Hand prevHand;
    public WinningStrategy(int seed) {
        this.random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if (!won) {
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        if (win) {
            won = win;
        }
    }
}
