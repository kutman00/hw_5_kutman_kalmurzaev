package com.company;

public class Hero {
    private int health;
    private int dalmage;
    private String abiity;

    public String getAbiity() {
        return abiity;
    }

    public int getDalmage() {
        return dalmage;
    }

    public int getHealth() {
        return health;
    }

    public Hero(int health, int dalmage, String abiity) {
        this.health = health;
        this.dalmage = dalmage;
        this.abiity = abiity;
    }
    public Hero(int health, int dalmage) {
        this.health = health;
        this.dalmage = dalmage;

    }
}
