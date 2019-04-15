package object;

import java.util.Random;

public class RandomNumber {
       public static int getRandomNumber(){
               return (new Random()).nextInt(10);
       }
}
