package v1.strategy.impl;

import v1.strategy.MovementStrategy;

/**
 * @author Elif
 */
public class BabyMovementStrategy implements MovementStrategy {
    @Override
    public void move() {
        System.out.println("Crawling...");
    }
}
