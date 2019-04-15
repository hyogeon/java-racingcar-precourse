package Util;

import object.Car;

import java.util.Set;

public class PrintUtil {
        public static void printInputCarsNameMessage() {
                System.out.println("경주할 자동차 이름을 입력하세요.(이름은 (,) 기준으로 구분)");
        }

        public static void printInputTrialNumberMessage() {
                System.out.println("시도할 회수는 몇회인가요?");
        }

        public static void printResultMessage() {
                System.out.println("실행 결과");
        }

        public static void printCarAndPosition(String name, int position) {
                System.out.print(name + " : ");
                for(int i=0;i<position;i++){
                        System.out.print("-");
                }
                System.out.println();
        }

}
