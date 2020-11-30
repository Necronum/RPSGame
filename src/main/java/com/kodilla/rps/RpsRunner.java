package com.kodilla.rps;

import java.lang.*;

public class RpsRunner {
    public static void main(String[] args) {
        RPSGame game;
        do {
            Rules rules = new RPSLSRules();
            int gameType = IOService.gameType();
            int typeOfPlayers = IOService.typeOfPlayers();
            Player player1;
            Player player2;
            switch (typeOfPlayers) {
                case 1:
                    player1 = new HumanPlayer(IOService.getName(), gameType);
                    player2 = new ComputerPlayer("Computer", gameType);
                    break;
                case 2:
                    player1 = new HumanPlayer(IOService.getName(), gameType);
                    player2 = new HumanPlayer(IOService.getName(), gameType);
                    break;
                case 3:
                    player1 = new ComputerPlayer("Computer 1", gameType);
                    player2 = new ComputerPlayer("Computer 2", gameType);
                    break;
                case 4:
                    player1 = new HumanPlayer(IOService.getName(), gameType);
                    player2 = new ComputerPlayer("Hard Computer", gameType);
                    break;
                default:
                    player1 = new HumanPlayer(IOService.getName(), gameType);
                    player2 = new ComputerPlayer("Computer", gameType);
            }
            game = new RPSGame(player1, player2, typeOfPlayers, rules, gameType);
        } while (game.run());
    }
}