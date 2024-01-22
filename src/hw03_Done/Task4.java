package hw03_Done;
public class Task4 {
    public static void main(String[] args) {

        double tempMonday = 19.9;
        double tempTuesday = 20.9;
        double tempWednesday = 16.1;
        double tempThursday = 17.9;
        double tempFriday = 19.0;
        double tempSaturday = 19.9;
        double tempSunday = 21.3;

        double averageTemp = (tempMonday + tempTuesday + tempWednesday + tempThursday + tempFriday + tempSaturday + tempSunday) / 7;

        System.out.println("Average temperature: " + averageTemp);

    }

}
