package com.rw.apps.simulations.prisoner.strategy;

import com.rw.apps.simulations.prisoner.Choice;
import com.rw.apps.simulations.prisoner.result.RoundScore;

public class Graaskamp implements Strategy {
    private static final double UNPROVOKED_DEFECT_PERCENTAGE = 0.1;
    private Choice theirLastRoundChoice;

    @Override
    public Choice submitChoice() {
        if (theirLastRoundChoice == Choice.DEFECT) {
            return Choice.COOPERATE;
        }
        return Math.random() < UNPROVOKED_DEFECT_PERCENTAGE ? Choice.DEFECT : Choice.COOPERATE;
    }

    @Override
    public void acceptRoundResult(RoundScore roundResult) {
        this.theirLastRoundChoice = roundResult.getTheirChoice();
    }
}
