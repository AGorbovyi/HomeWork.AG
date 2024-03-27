package hw29;

import services.RubberList;

public class RunLinkedListApp {

    public static void main(String[] args) {

        RubberList rubberList = new RubberList();
        //add
        rubberList.add(7);
        rubberList.add(4);
        rubberList.add(12);
        rubberList.add(1);
        rubberList.add(-5);
        System.out.println(rubberList);

        //contains
        System.out.println(rubberList.contains(7) + ", " + rubberList.contains(12) + ", " + rubberList.contains(-5));
        System.out.println(rubberList.contains(25));
        System.out.println(rubberList);

        //get
        System.out.println(rubberList.get(2));
        System.out.println(rubberList.get(3));
        System.out.println(rubberList.get(-1));
        System.out.println(rubberList.get(6));

        //remove
        rubberList.remove(0);
        System.out.println(rubberList);


        //remove


    }


}
