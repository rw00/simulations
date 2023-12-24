package com.rw.apps.simulations.prisoner.strategy;

import com.rw.apps.simulations.prisoner.Choice;
import com.rw.apps.simulations.prisoner.result.RoundScore;

public class Friedman implements Strategy {
    private boolean grudge;

    @Override
    public Choice submitChoice() {
        if (grudge) {
            return Choice.DEFECT;
        }
        return Choice.COOPERATE;
    }

    @Override
    public void acceptRoundResult(RoundScore roundResult) {
        if (roundResult.getTheirChoice() == Choice.DEFECT) {
            grudge = true;
        }
    }
}
