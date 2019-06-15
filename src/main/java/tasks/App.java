package tasks;

public class App {
    public static void main(String[] args) throws Exception {
//        Map map = new Map();
//        map.mapChanger(".");
        ArrayTask arrayTask = new ArrayTask();
        System.out.println("---------------------------------------------------");
        arrayTask.index4(new int[]{-25, -6, 65, -123, 1}, 3);
        System.out.println("---------------------------------------------------");
        arrayTask.userSorting();
        System.out.println("---------------------------------------------------");
        arrayTask.stringEquals("sometext2", "sometext3");
        System.out.println("---------------------------------------------------");
        arrayTask.mapTasks();
        System.out.println("---------------------------------------------------");
        arrayTask.saltGenerated();
        System.out.println("---------------------------------------------------");
        arrayTask.userAgeMeanCalculating();
        System.out.println("---------------------------------------------------");
        arrayTask.sortArray();
        System.out.println("---------------------------------------------------");
        arrayTask.ifArrayCointainsValue(new int[]{1,2,3,4,5},2);
        arrayTask.ifArrayCointainsValue(new int[]{1,2,3,4,5},6);
    }
}
