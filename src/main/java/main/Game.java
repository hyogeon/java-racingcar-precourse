package main;

import Util.InputUtil;
import Util.PrintUtil;
import object.Try;
import object.Winners;

import java.util.Set;

public class Game {
        public void start() {
                Try trial = new Try(makeCars(), makeTrialNumber());
                trial.Operate();
                Winners winners = new Winners(trial.makeWinner());
                winners.printWinner();
        }

        private Set<String> makeCars() {
                PrintUtil.printInputCarsNameMessage();
                return InputUtil.inputCarsName();
        }

        private int makeTrialNumber() {
                PrintUtil.printInputTrialNumberMessage();
                return InputUtil.inputTrialNumber();
        }
}
