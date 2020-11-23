package com.kodilla.rps;

public class HumanPlayer implements Player {
    private final String name;

    public HumanPlayer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getRoll() {
        return IOService.getPlayerRoll();
    }
}
