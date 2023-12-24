package com.rw.apps.simulations.prisoner.strategy;

import com.rw.apps.simulations.prisoner.Choice;
import com.rw.apps.simulations.prisoner.result.RoundScore;

public interface Strategy {
    Choice submitChoice();

    void acceptRoundResult(RoundScore roundResult);
}
