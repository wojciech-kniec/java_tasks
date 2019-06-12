package tasks;

public class Map {
    public static void main(String args[]) {
    }

    byte[] mapChanger(String s) throws Exception {
        byte arr[] = s.getBytes("UTF8");
        for (byte x : arr) {
            System.out.print(x + " ");
        }
        return arr;
    }
}
