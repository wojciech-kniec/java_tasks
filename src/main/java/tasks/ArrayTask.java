package tasks;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayTask {
    static List<User> users = Arrays.asList(
            new User("C", 30),
            new User("A", 35),
            new User("A", 10),
            new User("B", 40),
            new User("E", 50));

    public void userAgeMeanCalculating(){
        double mean = users.stream()
                .map(User::getAge)
                .mapToInt(i->i)
                .average()
                .orElse(Double.NaN);
        System.out.println(mean);
    }

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

    }

    protected void stringEquals(String s2, String s3) {
        boolean equals = s2.equals(s3);
        if (equals) {
            System.out.println("word: " +s2+ " and "+s3+" are identical.");
        } else System.out.println("Both words are different.");
    }

    void mapTasks() {
        HashMap<String, Integer> peopleMapping = new HashMap<>();
        peopleMapping.put("John", 32);
        peopleMapping.put("Steve", 30);
        peopleMapping.put("Angie", 33);

        System.out.println(peopleMapping);
        for (String i : peopleMapping.keySet()) {
            System.out.println("key: " + i + " value: " + peopleMapping.get(i));
        }
        peopleMapping.forEach((key, value) -> System.out.println(key + " = " + value));

    }

    private byte[] generateSalt() {
        SecureRandom random = new SecureRandom();
        byte bytes[] = new byte[20];
        random.nextBytes(bytes);
        return bytes;
    }

    void saltGenerated() {
        String a = Arrays.toString(generateSalt());
        System.out.println(a);
    }


}