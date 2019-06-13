package tasks;

import java.nio.charset.StandardCharsets;

public class Map {

    void mapChanger(String s) throws Exception {
        byte arr[] = s.getBytes(StandardCharsets.UTF_8);
        for (byte x : arr) {
            System.out.print(x + " ");
        }
    }
}
