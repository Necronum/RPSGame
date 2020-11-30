package com.kodilla.rps;

public class RPSRules implements Rules {
    private static final int[][] RULES = new int[][] {
            // COLUMNS (rock, paper, scissors)
            // ROWS (rock, paper, scissors)
            {0, -1, 1},
            {1, 0, -1},
            {-1, 1, 0},
    };

    @Override
    public int getWinner(int player1Roll, int player2Roll){
        return RULES[player1Roll][player2Roll];
    }
}
