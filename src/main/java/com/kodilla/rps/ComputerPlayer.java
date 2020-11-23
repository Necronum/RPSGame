package com.kodilla.rps;

import java.util.Random;

public class ComputerPlayer implements Player {
    private final Random rnd = new Random();
    private final String name;

    public ComputerPlayer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getRoll() {
        return rnd.nextInt(5);
    }
}
