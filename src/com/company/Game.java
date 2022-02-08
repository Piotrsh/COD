package com.company;

import com.google.gson.JsonElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    private final List<Player> players = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addPlayer() {
        System.out.println("Podaj nazwę gracza");
        String name = scanner.nextLine();
        int amountOfKills = 0;
        int amountOfDeaths = 0;
        double ratioKills = 0;
        Player player = new Player(amountOfKills, amountOfDeaths, name, ratioKills);
        players.add(player);
    }
    public JsonElement displayPlayer()
    {
        for(Player player : players){
        player.displayPlayerInformation();
    }
        return null;
    }
    public void addPoints() {
        for (Player player : players) {
            player.displayPlayerName();
            System.out.println("Podaj ilość zabójstw");
            int addKill = scanner.nextInt();
            player.amountOfKills += addKill;
            System.out.println("Podaj ilość zgonów");
            int addDeath = scanner.nextInt();
            player.amountOfDeaths += addDeath;
        }
    }
}

