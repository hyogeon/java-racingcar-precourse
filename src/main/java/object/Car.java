package object;

import Util.PrintUtil;
import Util.RacingCarConstant;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public void GoOrStop(int random){
        if(random >= RacingCarConstant.minGoOneStep){
            this.position++;
        }
        return;
    }

    public void print() {
        PrintUtil.printCarAndPosition(this.name, this.position);
    }
}
