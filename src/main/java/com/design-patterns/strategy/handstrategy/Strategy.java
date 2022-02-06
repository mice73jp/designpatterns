package com.cleanarchitect.strategy.handstrategy;

import com.cleanarchitect.strategy.player.Hand;

public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);
}
