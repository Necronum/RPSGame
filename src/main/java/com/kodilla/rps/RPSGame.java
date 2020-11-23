package com.kodilla.rps;

//Class for RPS
class RPSGame{
    private final Player player1;
    private final Player player2;

    public RPSGame(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    //method for playing a match
    public void playGame(int winsCount) {
        RPSRules win = new RPSRules();
        int player1WinNumber = 0;
        int player2WinNumber = 0;
        int roundNumber = 1;
        while ((winsCount > player1WinNumber) && (winsCount > player2WinNumber)) {
            IOService.announceRound(roundNumber);
            int player1Roll = player1.getRoll();
            int player2Roll = player2.getRoll();
            int winner = win.getWinner(player1Roll, player2Roll);
            if (winner == 1) {
                player1WinNumber++;
            } else {
                if (winner == -1) {
                    player2WinNumber++;
                }
            }
            IOService.announceRound(player1, player2, win, player1WinNumber, player2WinNumber, player1Roll, player2Roll);
            roundNumber++;
        }
        IOService.announceWinner(player1WinNumber, player2WinNumber, player1, player2);
    }

    //method to check if player wants to continue after one match or to exit game
    public boolean afterMatch() {
            String input = IOService.afterRound();
            if (input.equals("x")) {
                IOService.shutdown();
                return false;
            } else {
                return true;
            }
    }

    //main method running all methods above
    public boolean run() {
        boolean end = false;
        this.playGame(IOService.numberOfWins());
        return this.afterMatch();
    }
}
