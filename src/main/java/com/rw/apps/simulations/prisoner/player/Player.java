package com.rw.apps.simulations.prisoner.player;

import com.rw.apps.simulations.prisoner.Choice;
import com.rw.apps.simulations.prisoner.result.RoundScore;
import com.rw.apps.simulations.prisoner.strategy.Strategy;

public final class Player {
    private final String name;
    private final Strategy strategy;
    private int score;

    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public Choice submitChoice() {
        return strategy.submitChoice();
    }

    public void acceptRoundResult(RoundScore roundResult) {
        strategy.acceptRoundResult(roundResult);
        score += roundResult.getYourScore();
    }

    public String getName() {
        return name;
    }

    public String getStrategy() {
        return strategy.getClass().getSimpleName();
    }

    public int getScore() {
        return score;
    }
}
