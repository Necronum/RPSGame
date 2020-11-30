package com.kodilla.rps;

import java.util.Scanner;

public class IOService {
    private static final Scanner scanner = new Scanner(System.in);

    //method for checking if input is number
    public static String numberCheck(String text, int gameType){
        if (gameType == 1){
            while (!text.matches("-?[1-3]{1}")) {
                System.out.println("Wrong input:");
                text = scanner.nextLine();
            }
        } else {
            while (!text.matches("-?[1-5]{1}")) {
                System.out.println("Wrong input:");
                text = scanner.nextLine();
            }
        }
        return text;
    }

    //method for roll input
    public static int getPlayerRoll(int gameType) {
        String playerInput;
        if (gameType == 1){
            System.out.println("Choose Your roll: \n 1.Rock \n 2.Paper \n 3.Scissors");
        } else {
            System.out.println("Choose Your roll: \n 1.Rock \n 2.Paper \n 3.Scissors \n 4.Lizard \n 5.Spock");
        }
        playerInput = scanner.nextLine();
        return (Integer.parseInt(numberCheck(playerInput, gameType)) - 1);
    }

    //method for number of wins input
    public static int numberOfWins() {
        System.out.println("Please insert number of wins:");
        String roundsNumber = scanner.nextLine();
        while (!roundsNumber.matches("^[0-9]*[1-9][0-9]*$")) {
            System.out.println("Wrong input:");
            roundsNumber = scanner.nextLine();
        }
        return Integer.parseInt(roundsNumber);
    }

    //method for next round
    public static String afterRound() {
        System.out.println("What do You want to do next? \n Press 'n' to play a new game \n Press 'x' to exit game");
        String input = scanner.nextLine();
        while (!(input.equals("x")) && !(input.equals("n"))) {
            System.out.println("What do You want to do next? \n Press 'n' to play a new game \n Press 'x' to exit game");
            input = scanner.nextLine();
        }
        return input;
    }

    public static String getName(){
        System.out.println("Welcome to the game of Rock, Paper, Scissors with additional STEPS! Insert Your name:");
        String name = scanner.nextLine();
        return name;
    }

    public static int typeOfPlayers(){
        System.out.println("Pick a type of players: \n 1. Player vs Computer \n 2. Player vs Player " +
                "\n 3. Computer vs Computer \n 4. Players vs Hard Computer" );
        String in = scanner.nextLine();
        while (!in.matches("-?[1-4]{1}")) {
            System.out.println("Wrong input:");
            in = scanner.nextLine();
        }
        return Integer.parseInt(in);
    }


    //method for announcing winner of the game
     public static void announceWinner(int player1Wins, int player2Wins, Player player1, Player player2) {
        if (player1Wins > player2Wins) {
            System.out.println("The winner is: " + player1.getName());
        } else {
            System.out.println("The winner is: " + player2.getName());
        }
    }

    //method for round number announce
    public static void announceRound(int roundNumber){
        System.out.println("Round number: " + roundNumber + " begins!");
    }

    public static void shutdown(){
        System.out.println("Thank You for a game! Have a nice day!");
    }

    public static void announceRound(Player player1, Player player2, Rules win, int player1WinNumber, int player2WinNumber, int player1Roll, int player2Roll){
        System.out.println(player1.getName() + " rolls " + win.getRolls(player1Roll) + ". " + player2.getName() + " rolls " + win.getRolls(player2Roll));
        System.out.println(player1.getName() + ": " + player1WinNumber + "\n" + player2.getName() + ": " + player2WinNumber + "\n");
    }

    public static int gameType(){
        System.out.println("Pick a type of game: \n 1. Rock, Paper, Scissors. \n 2. Rock, Paper, Scissors, Lizard, Spock");
        String in = scanner.nextLine();
        while(!in.matches("-?[1-2]{1}")) {
            System.out.println("Wrong input:");
            in = scanner.next();
        }
        return Integer.parseInt(in);
    }
}
