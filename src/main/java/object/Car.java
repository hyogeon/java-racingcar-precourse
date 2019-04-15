package object;

import Util.PrintUtil;
import Util.RacingCarConstant;

public class Car implements Comparable {
        private final String name;
        private int position = RacingCarConstant.zero;

        public Car(String name) {
                this.name = name;
        }

        public void GoOrStop(int random) {
                if (random >= RacingCarConstant.minGoOneStep) {
                        this.position++;
                }
                return;
        }

        public void print() {
                PrintUtil.printCarAndPosition(this.name, this.position);
        }

        @Override
        public int compareTo(Object o) {
                return -(this.position - ((Car) o).position);
        }

        public boolean isWinner(Car car) {
                return car.equalPosition(this.position);
        }

        public boolean equalPosition(int position) {
                return this.position == position;
        }

        @Override
        public String toString() {
                return this.name;
        }
}
