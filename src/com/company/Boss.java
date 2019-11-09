package com.company;

import java.util.Random;

public class Boss {
   private int health;
    private int damage;
    private String deFenceType;

    public  static String[] changeBossDeFence={"Physical", "Magic", "Kinetic"};

    public Boss(){};

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getDeFenceType() {
        return deFenceType;
    }

    public void setDeFenceType(String deFenceType) {
        this.deFenceType = deFenceType;
    }
    public void changeBossDeFence(){
        Random r = new Random();
        int randomIndex = r.nextInt(3);
        deFenceType = changeBossDeFence[randomIndex];


    }


}