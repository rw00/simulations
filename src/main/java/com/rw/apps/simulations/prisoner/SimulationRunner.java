package com.rw.apps.simulations.prisoner;

import com.rw.apps.simulations.common.Logger;
import com.rw.apps.simulations.prisoner.player.Player;
import com.rw.apps.simulations.prisoner.strategy.TitForTat;
import com.rw.apps.simulations.prisoner.strategy.custom.LastRoundDefect;

public class SimulationRunner {
    public static void main(String[] args) {
        Player player1 = new Player("Player1", new LastRoundDefect());
        Player player2 = new Player("Player2", new TitForTat());
        SimulationConfig simulationConfig = new SimulationConfig(200);

        SimulationOrchestrator simulationOrchestrator = new SimulationOrchestrator(simulationConfig, player1, player2);
        simulationOrchestrator.runSimulation();
        Logger.info(simulationOrchestrator.getResults());
    }
}
