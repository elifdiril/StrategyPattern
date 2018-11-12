package v1;

import v1.strategy.impl.AdultMovementStrategy;
import v1.strategy.impl.BabyMovementStrategy;
import v1.strategy.impl.ChildMovementStrategy;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author Elif
 */
public class StrategyPatternV1App
{
    static int counter=0;
    public static void main(String[] Args){

        Timer myTimer=new Timer();
        Person person = new Person(new BabyMovementStrategy());

        TimerTask task =new TimerTask() {

            @Override
            public void run() {
                if(counter<5) {
                    counter++;
                }
                if(counter>=5 && counter<=18) {
                    person.changeMovementStrategy(new ChildMovementStrategy());
                    counter++;
                }
                else if(counter >18 && counter<30){
                   person.changeMovementStrategy(new AdultMovementStrategy());
                    counter++;
                }
                else if(counter>=30){
                    myTimer.cancel();
                }
                person.move();
            }
        };
        myTimer.schedule(task,0,1000);

    }
}
