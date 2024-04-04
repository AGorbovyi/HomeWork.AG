package task3;

import task3.entity.Apple;
import task3.entity.Box;
import task3.entity.Orange;

public class FruitsApp {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        System.out.println(appleBox);
        System.out.println("Box weight: " + appleBox.getWeight());

        System.out.println("============== Adding Oranges into the box ==============");

        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        System.out.println(orangeBox);
        System.out.println("Box weight: " + orangeBox.getWeight());

        System.out.println("============== Compare boxes ==============");

        System.out.println("Compare: " + appleBox.compareTo(orangeBox));
        System.out.println("Compare: " + orangeBox.compareTo(orangeBox));
        System.out.println("Compare: " + orangeBox.compareTo(appleBox));

        System.out.println("============== Move fruits ==============");

        Box<Apple> newAppleBox = new Box<>();
        appleBox.moveTo(newAppleBox);
        System.out.println("appleBox: " + appleBox);
        System.out.println("newAppleBox: " + newAppleBox);
    }
}
