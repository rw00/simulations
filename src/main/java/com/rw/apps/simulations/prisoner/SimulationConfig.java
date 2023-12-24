package com.rw.apps.simulations.prisoner;

public class SimulationConfig {
    public static final int DEFAULT_ROUNDS = 200;
    private final int rounds;

    public SimulationConfig(int rounds) {
        this.rounds = rounds;
    }

    public int getRounds() {
        return rounds;
    }
}
