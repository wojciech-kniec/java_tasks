package tasks;

public class Map {
    public static void main(String args[]) throws Exception {
        String s = "qqqq";
        byte arr[] = s.getBytes("UTF8");
        for (byte x: arr) {
            System.out.print(x+" ");
        }
    }
}
