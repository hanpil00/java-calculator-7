package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String input = Console.readLine();

        try {
            StringCalculator calculator = new StringCalculator();
            int result = calculator.calculate(input);
            System.out.println("결과 : " + result);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
