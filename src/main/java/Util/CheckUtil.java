package Util;

import object.Winners;

import java.util.Set;

public class CheckUtil {
        public static void checkEmptyString(Set<String> tokenizedString) throws Exception {
                if (tokenizedString.contains("")) {
                        throw new Exception("공백 또는 빈 입력 오류");
                }
                return;
        }

        public static void checkNameLength(Set<String> tokenizedString) throws Exception {
                for (String carName : tokenizedString) {
                        checkOneNameLength(carName);
                }
                return;
        }

        private static void checkOneNameLength(String carName) throws Exception {
                if (carName.length() > RacingCarConstant.maxNameLength) {
                        throw new Exception("차 이름 길이 제한 오류");
                }
                return;
        }

        public static void checkMinusTrialNumber(int input) throws Exception {
                if (input < RacingCarConstant.zero) {
                        throw new Exception("시도 횟수 음수 오류");
                }
                return;
        }

        public static void checkMaxTrialNumber(int input) throws Exception {
                if (input > RacingCarConstant.maxTrialNumber) {
                        throw new Exception("시도 횟수 최대값 초과 오류");
                }
                return;
        }
}
