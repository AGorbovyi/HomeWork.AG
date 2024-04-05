package hw33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {
        List<Integer> listOne = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> listTwo = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7));
        List<Integer> listThree = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 0));

        listOne.retainAll(listTwo);
        listOne.retainAll(listThree);
        System.out.println(listOne);
        System.out.println();

//
//
//        public static List
    }
}
