package object;

import Util.PrintUtil;

import java.util.List;

public class Winners {
        List<String> carsName;

        public Winners(List<String> carsName) {
                this.carsName = carsName;
        }

        public void printWinner() {
                PrintUtil.printWinnerMessage(this.carsName);
        }
}
