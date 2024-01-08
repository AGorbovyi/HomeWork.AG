package hw02_Done;

public class Task3 {
    public static void main(String[] args){
        int number = 345;

        int firstNumber = number / 100;
        System.out.println(firstNumber);

        int secondNumber = number % 100 / 10;
        System.out.println(secondNumber);

        int thirdNumber = number % 10;
        System.out.println(thirdNumber);

        String numberString = String.valueOf(number);
        System.out.println(numberString);

        System.out.println("Число " + number + " -> " + firstNumber + " , " + secondNumber + " , " + thirdNumber);

    }

}
