package com.company;

public class Player {
    private String name;
    int amountOfKills;
    int amountOfDeaths;

    public Player( int amountOfKills, int amountOfDeaths,String name) {
    this.amountOfKills = amountOfKills;
    this.amountOfDeaths = amountOfDeaths;
    this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getamountOfKills() {
        return amountOfKills;
    }
    public int getamountOfDeaths() {
        return amountOfDeaths;
    }
    public void displayPlayerInformation()
    {
        System.out.println("Nazwa gracza: " + name );
        System.out.println("Ilosc zabójstw:  " + amountOfKills );
        System.out.println("Ilosc zgonów:  " + amountOfDeaths );
        System.out.println();
    }
    public void displayPlayerName()
    {
        System.out.println("Nazwa gracza: " + name );
    }
}
