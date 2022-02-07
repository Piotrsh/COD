package com.company;

public class Player {
    private final String name;
    double amountOfKills;
    double amountOfDeaths;
    double ratioKills;

    public Player( double amountOfKills, double amountOfDeaths,String name, double ratioKills) {
    this.amountOfKills = amountOfKills;
    this.amountOfDeaths = amountOfDeaths;
    this.name = name;
    this.ratioKills = ratioKills;
    }
    public void displayPlayerInformation()
    {
        displayPlayerName();
        System.out.println("Ilosc zabójstw:  " + amountOfKills );
        System.out.println("Ilosc zgonów:  " + amountOfDeaths );
        System.out.println("Współczynnik zabójstw do zgonów: " + ratioKills);
        System.out.println();
    }
    public void displayPlayerName()
    {
        System.out.println("Nazwa gracza: " + name );
    }
}
