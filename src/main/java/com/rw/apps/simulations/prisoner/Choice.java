package com.rw.apps.simulations.prisoner;


public final class Choice {
    public static final Choice COOPERATE = new Choice("SPLIT", true);
    public static final Choice DEFECT = new Choice("STEAL", false);
    private final String choice;
    private final boolean cooperate;

    private Choice(String choice, boolean cooperate) {
        this.choice = choice;
        this.cooperate = cooperate;
    }

    public String getChoice() {
        return choice;
    }

    public boolean isCooperate() {
        return cooperate;
    }
}
