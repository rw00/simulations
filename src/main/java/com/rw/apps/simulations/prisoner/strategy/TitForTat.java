package com.rw.apps.simulations.prisoner.strategy;

import com.rw.apps.simulations.prisoner.Choice;
import com.rw.apps.simulations.prisoner.result.RoundScore;

public class TitForTat implements Strategy {
    private Choice theirLastRoundChoice;

    @Override
    public Choice submitChoice() {
        if (theirLastRoundChoice == Choice.DEFECT) {
            return Choice.DEFECT;
        }
        return Choice.COOPERATE;
    }

    @Override
    public void acceptRoundResult(RoundScore roundResult) {
        theirLastRoundChoice = roundResult.getTheirChoice();
    }
}
