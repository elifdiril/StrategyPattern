package v1.strategy.impl;

import v1.strategy.MovementStrategy;

/**
 * @author Elif
 */
public class AdultMovementStrategy implements MovementStrategy {
    @Override
    public void move() {
        System.out.println("Running...");
    }
}
