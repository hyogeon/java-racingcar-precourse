package Util;


import java.util.*;

public class InputUtil {
        public static Set<String> inputCarsName() {
                Set<String> carsName;
                try {
                        carsName = splitString(inputString());
                        CheckUtil.checkEmptyString(carsName);
                        CheckUtil.checkNameLength(carsName);
                } catch (Exception e) {
                        System.err.println(e.getMessage());
                        return inputCarsName();
                }
                return carsName;
        }

        private static String inputString() {
                return new Scanner(System.in).nextLine();
        }

        private static Set<String> splitString(String input) {
                String[] splitedInput = input.trim().split(",");
                Set<String> carsName = new HashSet<String>();
                for(String str : splitedInput){
                        carsName.add(str.trim());
                }
                return carsName;
        }
}
