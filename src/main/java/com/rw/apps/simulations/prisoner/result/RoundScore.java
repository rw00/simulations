package com.rw.apps.simulations.prisoner.result;


import com.rw.apps.simulations.prisoner.Choice;

public final class RoundScore {
    public static final RoundScore DEFECT_COOPERATE = new RoundScore(5, Choice.DEFECT, Choice.COOPERATE, "WIN_LOSE");
    public static final RoundScore COOPERATE_COOPERATE = new RoundScore(3, Choice.COOPERATE, Choice.COOPERATE, "WIN_WIN");
    public static final RoundScore DEFECT_DEFECT = new RoundScore(1, Choice.DEFECT, Choice.DEFECT, "LOSE_LOSE");
    public static final RoundScore COOPERATE_DEFECT = new RoundScore(0, Choice.COOPERATE, Choice.DEFECT, "LOSE_WIN");
    private final int yourScore;
    private final Choice yourChoice;
    private final Choice theirChoice;
    private final String result;

    private RoundScore(int yourScore, Choice yourChoice, Choice theirChoice, String result) {
        this.yourScore = yourScore;
        this.yourChoice = yourChoice;
        this.theirChoice = theirChoice;
        this.result = result;
    }

    public int getYourScore() {
        return yourScore;
    }

    public Choice getYourChoice() {
        return yourChoice;
    }

    public Choice getTheirChoice() {
        return theirChoice;
    }

    @Override
    public String toString() {
        return result;
    }
}
