package tasks;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayTask {
    static List<User> users = Arrays.asList(
            new User("C", 30),
            new User("D", 40),
            new User("A", 10),
            new User("B", 20),
            new User("E", 50));

    public void userSorting() {
        List<User> userStream = users.stream()
                .sorted(Comparator.comparing(User::getName))
                .collect(Collectors.toList());
        userStream.forEach(System.out::println);
    }

    String ordinal(int numeber) {
        return numeber % 100 == 11 || numeber % 100 == 12 || numeber % 100 == 13 ? numeber + "th" : numeber + new String[]{"th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th"}[numeber % 10];
    }

    public void index4(int[] array, int index) {
        int i = Arrays.asList(array).indexOf(index);
        String arr2 = Arrays.toString(array);
        System.out.println("Here is an array " + arr2);
        System.out.println("This is a " + ordinal(index) + " index of an array and an element of this index is " + array[index] + ". Array length is " + array.length);

        for (int i2 : array) {
            System.out.println(i2);
        }
    }
}