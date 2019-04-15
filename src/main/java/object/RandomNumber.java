package object;

import Util.RacingCarConstant;

import java.util.Random;

public class RandomNumber {
        public static int getRandomNumber() {
                return (new Random()).nextInt(RacingCarConstant.maxRandomNumber);
        }
}
