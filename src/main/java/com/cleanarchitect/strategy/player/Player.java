package com.cleanarchitect.strategy.player;

import com.cleanarchitect.strategy.handstrategy.Strategy;

public class Player {
    private String name;
    private Strategy strategy;
    private int wincount;
    private int losecount;
    private int gaemcount;
    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }
    
    public Hand nextHand() {
        return this.strategy.nextHand();
    }

    public void win() {
        this.strategy.study(true);
        wincount++;
        gaemcount++;
    }

    public void lose() {
        this.strategy.study(false);
        losecount++;
        gaemcount++;
    }

    public void even() {
        gaemcount++;
    }

    public String toString() {
        return "[" + name + ":" + gaemcount + " games, " + wincount + " win, " + losecount + " lose" + "]";
    }
}
