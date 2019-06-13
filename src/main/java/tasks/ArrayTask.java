package tasks;

import java.util.Arrays;

public class ArrayTask {

    public void index4(int[] array, int index) {
        int i = Arrays.asList(array).indexOf(index);
        System.out.println("This is a "+index+" index and element is " + i);
    }
}
