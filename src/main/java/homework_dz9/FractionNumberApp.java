package homework_dz9;

public class FractionNumberApp {

    public static void main(String[] args) {
        FractionNumber number1 = new FractionNumber(1, 2);
        FractionNumber number2 = new FractionNumber(1, 4);

        System.out.println(number1);
        System.out.println(number2);

        FractionNumber plusResult = number1.plus(number2);
        System.out.println(plusResult);
    }
}
