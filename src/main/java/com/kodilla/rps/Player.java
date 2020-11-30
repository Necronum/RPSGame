package com.kodilla.rps;

import java.util.Random;

public interface Player {
    String getName();
    int getRoll();
    static int getHardRoll(int player1Roll){
        Random rnd = new Random();
        RPSLSRules rules = new RPSLSRules();
        int player2Roll = 0;
        if (rnd.nextInt(2) == 1){
            player2Roll = rnd.nextInt(5);
        } else {
            for(int i = 1; i<5; i++){
                if(rules.getWinner(player1Roll, i) == -1){
                    player2Roll = i;
                }
            }
        }
        return player2Roll;
    }
}
