package Lesson8;

public class TestMyHashMap {
    public static void main(String[] args) {
        MyHashMap<Integer, String> map = new MyHashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(12, "twelve");
        map.put(15, "fifteen");
        map.put(3, "three");
        map.put(10, "ten");
        map.put(11, "eleven");
        map.put(5, "five");

        System.out.println(map);
        System.out.println("Удалим элемент с ключом 17");
        map.delete(17);
        System.out.println(map);
        System.out.println("Удалим элемент с ключом 3");
        map.delete(3);
        System.out.println(map);

    }
}
