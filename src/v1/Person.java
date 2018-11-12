package v1;

import v1.strategy.MovementStrategy;

/**
 * @author Elif
 */
public class Person
{
    private MovementStrategy movementStrategy;

    public void move()
    {
        this.movementStrategy.move();
    }


    public Person(MovementStrategy movementStrategy)
    {
        this.movementStrategy = movementStrategy;
    }

    public void changeMovementStrategy(MovementStrategy movementStrategy)
    {
        System.out.println("Movement Strategy Changing!");
        this.movementStrategy = movementStrategy;

    }

}
