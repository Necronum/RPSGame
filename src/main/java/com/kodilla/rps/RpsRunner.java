package com.kodilla.rps;

import java.util.*;
import java.lang.*;

public class RpsRunner {
    public static void main(String[] args) {
        RPSGame game;
        do {
            int typeOfGame = IOService.typeOfPlayers();
            Player player1;
            Player player2;
            switch (typeOfGame) {
                case 1:
                    player1 = new HumanPlayer(IOService.getName());
                    player2 = new ComputerPlayer("Computer");
                    break;
                case 2:
                    player1 = new HumanPlayer(IOService.getName());
                    player2 = new HumanPlayer(IOService.getName());
                    break;
                case 3:
                    player1 = new ComputerPlayer("Computer 1");
                    player2 = new ComputerPlayer("Computer 2");
                    break;
                default:
                    player1 = new HumanPlayer(IOService.getName());
                    player2 = new ComputerPlayer("Computer");
            }
            game = new RPSGame(player1, player2);
        } while (game.run());
    }
}