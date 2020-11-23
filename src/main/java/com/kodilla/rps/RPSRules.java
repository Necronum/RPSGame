package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;

public class RPSRules {
    private static final int[][] RULES = new int[][] {
            // COLUMNS (rock, paper, scissors, lizard, Spock)
            // ROWS (rock, paper, scissors, lizard, Spock)
        {0, -1, 1, 1, -1},
        {1, 0, -1, -1, 1},
        {-1, 1, 0, 1, -1},
        {-1, 1, -1, 0, 1},
        {1, -1, 1, -1, 0}
    };
    private static final List<String> ROLLS = new ArrayList<>() {{
        add("rock");
        add("paper");
        add("scissors");
        add("lizard");
        add("Spock");
    }};

    public String getROLLS(int roll){
        return ROLLS.get(roll);
    }


    public int getWinner(int player1Roll, int player2Roll){
        return RULES[player1Roll][player2Roll];
    }
}
