package com.rw.apps.simulations.prisoner.strategy.custom;

import com.rw.apps.simulations.prisoner.Choice;
import com.rw.apps.simulations.prisoner.SimulationConfig;
import com.rw.apps.simulations.prisoner.strategy.TitForTat;

public class LastRoundDefect extends TitForTat {
    private int roundCounter;

    @Override
    public Choice submitChoice() {
        roundCounter++;
        if (roundCounter == SimulationConfig.DEFAULT_ROUNDS) {
            return Choice.DEFECT;
        }
        return super.submitChoice();
    }
}
