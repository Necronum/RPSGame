package com.kodilla.rps;

import java.util.Random;

public class ComputerPlayer implements Player {
    private final Random rnd = new Random();
    private final String name;
    private final int gameType;

    public ComputerPlayer(String name, int gameType) {
        this.name = name;
        this.gameType = gameType;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getRoll() {
        int max;
        if (gameType == 1){
            max = 3;
        } else {
            max = 5;
        }
        return rnd.nextInt(max);
    }
}
