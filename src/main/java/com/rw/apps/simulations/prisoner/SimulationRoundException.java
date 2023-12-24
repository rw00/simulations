package com.rw.apps.simulations.prisoner;

public class SimulationRoundException extends RuntimeException {
    public SimulationRoundException(String message, Exception cause) {
        super(message, cause);
    }
}
