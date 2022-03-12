package com.company;

public class Main {

    public static void main(String[] args) {
        Boss b1 = new Boss();
        b1.setAbiity("Super Endurance");
        b1.setHealth(700);
        b1.setDalmage(60);
        System.out.println(b1.getAbiity()+ " " + b1.getHealth()+ " "+b1.getDalmage());
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println(createHeroes()[i].getAbiity()+ " "+ createHeroes()[i].getDalmage()+ " "
                    + createHeroes()[i].getHealth());
        }
    } public static Hero[] createHeroes(){
        Hero h1 = new Hero(500, 100, "abiity");
        Hero h2 = new Hero(400, 50, "medic");
        Hero h3 = new Hero(300, 70, "magic");
        Hero[] heroes = {h1,h2,h3};
        return heroes;
    }
}
