package object;

import Util.PrintUtil;
import Util.RacingCarConstant;

import java.util.*;

public class Try {
        private final List<Car> cars = new ArrayList<Car>();
        private final int trialNumber;

        public Try(Set<String> carsName, int trialNumber) {
                for (String name : carsName) {
                        this.cars.add(new Car(name));
                }
                this.trialNumber = trialNumber;
        }

        public void Operate() {
                PrintUtil.printResultMessage();
                for (int i = RacingCarConstant.zero; i < trialNumber; i++) {
                        oneOperate();
                }
        }

        private void oneOperate() {
                for (Car car : this.cars) {
                        car.GoOrStop(RandomNumber.getRandomNumber());
                        car.print();
                }
                System.out.println();
        }

        public List<String> makeWinner() {
                List<String> winnerCars = new ArrayList<String>();
                Collections.sort(this.cars);
                for (Car car : this.cars) {
                       compareCars(cars.get(RacingCarConstant.zero),car,winnerCars);
                }
                return winnerCars;
        }

        public void compareCars(Car winner, Car car, List<String> winnerCars){
                if(car.isWinner(cars.get(RacingCarConstant.zero))){
                        winnerCars.add(car.toString());
                }
        }

}
