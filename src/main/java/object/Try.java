package object;

import Util.PrintUtil;

import java.util.HashSet;
import java.util.Set;

public class Try {
        private Set<Car> cars = new HashSet<Car>();

        public Try(Set<String> carsName) {
                for(String name : carsName){
                        this.cars.add(new Car(name));
                }
        }

        public void oneTry(){
                for(Car car : this.cars){
                        car.GoOrStop(RandomNumber.getRandomNumber());
                        car.print();
                }
                System.out.println();
        }

}
