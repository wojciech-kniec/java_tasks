package tasks;

public class App {
    public static void main(String[] args) throws Exception {
//        Map map = new Map();
//        map.mapChanger(".");

        ArrayTask arrayTask = new ArrayTask();
        arrayTask.index4( new int[]{-25,-6,65,-123,1},3);
        arrayTask.userSorting();
        arrayTask.stringEquals("sometext2","sometext2");
        arrayTask.mapTasks();
    }
}
