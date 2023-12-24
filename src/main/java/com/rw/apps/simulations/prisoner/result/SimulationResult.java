package com.rw.apps.simulations.prisoner.result;

public class SimulationResult {
    private final int player1Score;
    private final int player2Score;
    private final String winner;

    public SimulationResult(int player1Score, int player2Score) {
        this.player1Score = player1Score;
        this.player2Score = player2Score;

        this.winner = resolveWinner(player1Score, player2Score);
    }

    public int getPlayer1Score() {
        return player1Score;
    }

    public int getPlayer2Score() {
        return player2Score;
    }

    public String getWinner() {
        return winner;
    }

    @Override
    public String toString() {
        return "Results{player1Score=" + player1Score +
               ", player2Score=" + player2Score +
               ", winner='" + winner + "'}";
    }

    private static String resolveWinner(int player1Score, int player2Score) {
        if (player1Score == player2Score) {
            return "Draw!";
        }
        return (player1Score > player2Score) ? "Player1" : "Player2";
    }
}
