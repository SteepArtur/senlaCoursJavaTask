import java.util.Random;

public class Task1 {
    public static void main(String[] args) {

        Random random = new Random();
        int numbers = random.nextInt(1000) + 100;
        int number1 = numbers % 10;
        int number2 = (numbers / 10) % 10;
        int number3 = (numbers / 100) % 10;

        if (number1 >= number2 & number1 > number3 || number1 > number2 & number1 >= number3) {
            System.out.println("В числе " + numbers + " наибольшая цифра " + number1);
        } else {
            if (number2 > number1 & number2 >= number3) {
                System.out.println("В числе " + numbers + " наибольшая цифра " + number2);
            } else {
                System.out.println("В числе " + numbers + " наибольшая цифра " + number3);
            }
        }
    }
}
