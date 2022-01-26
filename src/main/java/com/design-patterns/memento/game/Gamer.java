package com.cleanarchitect.memento.game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import com.cleanarchitect.memento.record.Memento;

public class Gamer {
    private int money;
    private List<String> fruits = new ArrayList<>();
    private Random random = new Random();
    private static String[] fruitsname = {
        "사과","포도","바나나","귤",
    };

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return this.money;
    }

    @Override
    public String toString() {
        return "[money = " + money + ", fruits = " + fruits + "]";
    }

    public void bet() {
        int dice = this.random.nextInt(6) + 1;
        if (dice == 1) {
            money += 100;
            System.out.println("돈이 증가했습니다.");
        } else if (dice == 2) {
            money /= 2;
            System.out.println("돈이 반으로 줄었습니다.");
        } else if ( dice == 6 ) {
            String f = this.getFruit();
            System.out.println("과일(" + f + ")을 받았습니다.");
            this.fruits.add(f);
        }
    }

    public Memento createMemento() {
        Memento m = new Memento(this.money);
        Iterator it = this.fruits.iterator();
        while(it.hasNext()) {
            String f = (String)it.next();
            if ( f.startsWith("맛있는 ")) {
                m.addFruit(f);
            }
        }
        return m;
    }

    public void restoreMemento(Memento memento) {
        this.money = memento.getMoney();
        this.fruits = memento.getFruits();
    }

    private String getFruit() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "맛있는 ";
        }

        return prefix + fruitsname[random.nextInt(fruitsname.length)];
    }
}
