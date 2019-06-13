package tasks;

import java.util.Arrays;
import java.util.HashMap;

public class ArrayTask {

    HashMap hashMap;

    public static String ordinal(int index) {
        return index % 100 == 11 || index % 100 == 12 || index % 100 == 13 ? index + "th" : index + new String[]{"th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th"}[index % 10];
    }

    public void index4(int[] array, int index) {
        int i = Arrays.asList(array).indexOf(index);
        String arr2 =Arrays.toString(array);
        System.out.println("Here is an array " + arr2);
        System.out.println("This is a " + ordinal(index) + " index of an array and an element of this index is " + array[index] + ". Array length is " + array.length);
    }
}