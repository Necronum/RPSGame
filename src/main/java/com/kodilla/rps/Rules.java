package com.kodilla.rps;

import java.util.Arrays;
import java.util.List;

public interface Rules {
    default String getRolls(int roll){
        List<String> rolls = Arrays.asList("rock", "paper", "scissors", "lizard", "spock");
        return rolls.get(roll);
    }

    int getWinner(int player1Roll, int player2Roll);
}
