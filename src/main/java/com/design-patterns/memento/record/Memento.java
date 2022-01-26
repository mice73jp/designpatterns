package com.cleanarchitect.memento.record;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    int money;
    List<String> fruits;
    
    public Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList<>();
    }

    public int getMoney() {
        return this.money;
    }

    public List<String> getFruits() {
        return this.fruits;
    }

    public void addFruit(String fruit) {
        this.fruits.add(fruit);
    }
}
