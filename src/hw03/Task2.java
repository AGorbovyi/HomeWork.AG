package hw03;

public class Task2 {

    public static void main(String[] args) {
        int number1 = 0;
        int number2 = 1;
        int number3 = 2;
        int number4 = 3;
        int number5 = 4;
        int number6 = 5;
        int number7 = 6;
        int number8 = 7;
        int number9 = 8;
        int number10 = 9;

        int sum;
        int averageNumber;
        float remainder;
        float tempNumber;

        sum = (number1 + number2 + number3 + number4 + number5 + number6 + number7 + number8 + number9 + number10);
        averageNumber = sum / 10;
        tempNumber = sum;
        remainder = tempNumber / 10 - averageNumber;

        System.out.println("Данные переменные: " + number1 + ", " + number2 + ", " + number3 + ", " + number4 + ", " + number5 + ", " + number6 + ", " + number7 + ", " + number8 + ", " + number9 + ", " + number10);
        System.out.println("Cумма: " + sum);
        System.out.println("Cреднее арифметическое значение всех переменных: " + averageNumber);
        System.out.println("Остаток при делении: " + remainder);



    }


}
