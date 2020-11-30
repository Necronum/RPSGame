package com.kodilla.rps;

public class HumanPlayer implements Player {
    private final String name;
    private final int gameType;

    public HumanPlayer(String name, int gameType) {
        this.name = name;
        this.gameType = gameType;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getRoll() {
        return IOService.getPlayerRoll(gameType);
    }
}
