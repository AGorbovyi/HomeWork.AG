package hw02;

public class Task3 {
    public static void main(String[] args){
        int number = 345;

        int first = number / 100;
        System.out.println(first);

        int second = number % 100 / 10;
        System.out.println(second);

        int third = number % 10;
        System.out.println(third);

        String numberString = String.valueOf(number);
        System.out.println(numberString);

        System.out.println("Число " + number + " -> " + first + " , " + second + " , " + third);



    }



}
