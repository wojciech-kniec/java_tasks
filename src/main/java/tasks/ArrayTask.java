package tasks;

import java.util.Arrays;
import java.util.HashMap;

public class ArrayTask {

    HashMap hashMap;

    public static String ordinal(int numeber) {
        return numeber % 100 == 11 || numeber % 100 == 12 || numeber % 100 == 13 ? numeber + "th" : numeber + new String[]{"th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th"}[numeber % 10];
    }

    public void index4(int[] array, int index) {
        int i = Arrays.asList(array).indexOf(index);
        String arr2 =Arrays.toString(array);
        System.out.println("Here is an array " + arr2);
        System.out.println("This is a " + ordinal(index) + " index of an array and an element of this index is " + array[index] + ". Array length is " + array.length);
    }
}