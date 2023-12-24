package com.rw.apps.simulations.prisoner;

import com.rw.apps.simulations.prisoner.player.Player;
import com.rw.apps.simulations.prisoner.result.RoundScore;
import com.rw.apps.simulations.prisoner.result.SimulationResult;

public class SimulationOrchestrator {
    private final SimulationConfig simulationConfig;
    private final Player player1;
    private final Player player2;

    public SimulationOrchestrator(SimulationConfig simulationConfig, Player player1, Player player2) {
        this.simulationConfig = simulationConfig;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void runSimulation() {
        for (int i = 0; i < simulationConfig.getRounds(); i++) {
            simulateRound();
        }
    }

    public SimulationResult getResults() {
        return new SimulationResult(player1.getScore(), player2.getScore());
    }

    private void simulateRound() {
        Choice player1Choice = player1.submitChoice();
        Choice player2Choice = player2.submitChoice();

        RoundScore player1RoundScore = determineRoundScoreForPlayer1(player1Choice, player2Choice);
        RoundScore player2RoundScore = otherRoundScore(player1RoundScore);

        player1.acceptRoundResult(player1RoundScore);
        player2.acceptRoundResult(player2RoundScore);
    }

    private RoundScore determineRoundScoreForPlayer1(Choice player1Choice, Choice player2Choice) {
        if (player1Choice == Choice.COOPERATE && player2Choice == Choice.COOPERATE) {
            return RoundScore.COOPERATE_COOPERATE;
        }
        if (player1Choice == Choice.DEFECT && player2Choice == Choice.DEFECT) {
            return RoundScore.DEFECT_DEFECT;
        }
        if (player2Choice == Choice.COOPERATE) {
            return RoundScore.DEFECT_COOPERATE;
        }
        assert player1Choice == Choice.COOPERATE && player2Choice == Choice.DEFECT;
        return RoundScore.COOPERATE_DEFECT;
    }

    private RoundScore otherRoundScore(RoundScore roundScore) {
        if (roundScore == RoundScore.DEFECT_COOPERATE) {
            return RoundScore.COOPERATE_DEFECT;
        }
        if (roundScore == RoundScore.COOPERATE_DEFECT) {
            return RoundScore.DEFECT_COOPERATE;
        }
        return roundScore;
    }
}
