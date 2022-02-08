package com.company;

import com.google.gson.Gson;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        Game game = new Game();

        while(!exit) {
            System.out.println("Wybierz opcje");
            System.out.println("1. Dodaj gracza");
            System.out.println("2. Wyświetl wyniki");
            System.out.println("3. Dodaj punkty");
            System.out.println("4. Wyjdź");

            String userChoice = scanner.nextLine();
            if(userChoice.equals("1") || userChoice.equals("2") || userChoice.equals("3") || userChoice.equals("4")==true) {

                switch (userChoice) {
                    case "1" -> game.addPlayer();
                    case "2" -> game.displayPlayer();
                    case "3" -> game.addPoints();
                    case "4" -> exit = true;
                }
            } else { System.out.println("Wybrano niewlasciwa cyfrę, spróbuj ponownie..");}

            Gson gson = new Gson();
            String json = gson.toJson(game.displayPlayer());
            System.out.println(json);
        }
    }
}
