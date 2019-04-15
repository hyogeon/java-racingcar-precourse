package Util;

import java.util.*;

public class InputUtil {
        public static Set<String> inputCarsName() {
                try {
                        Set<String> carsName = splitString((new Scanner(System.in)).nextLine());
                        CheckUtil.checkEmptyString(carsName);
                        CheckUtil.checkNameLength(carsName);
                        return carsName;
                } catch (Exception e) {
                        return inputCarsName();
                }
        }

        public static int inputTrialNumber() {
                try {
                        int input = (new Scanner(System.in)).nextInt();
                        CheckUtil.checkMinusTrialNumber(input);
                        CheckUtil.checkMaxTrialNumber(input);
                        return input;
                } catch (Exception e) {
                        return inputTrialNumber();
                }
        }

        private static Set<String> splitString(String input) {
                String[] splitedInput = input.trim().split(",");
                Set<String> carsName = new HashSet<String>();
                for (String str : splitedInput) {
                        carsName.add(str.trim());
                }
                return carsName;
        }
}
