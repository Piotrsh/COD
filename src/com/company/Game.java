package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    private List<Player> players = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addPlayer() {
        System.out.println("Podaj nazwę gracza");
        String name = scanner.nextLine();
        int amountOfKills = 0;
        int amountOfDeaths = 0;
        Player player = new Player(amountOfKills, amountOfDeaths, name);
        players.add(player);
    }
    public void displayPlayer()
    {
        for(Player player : players){
        player.displayPlayerInformation();
    }
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

