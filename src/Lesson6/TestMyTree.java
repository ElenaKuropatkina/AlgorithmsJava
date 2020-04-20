package Lesson6;

public class TestMyTree {

    public static void main(String[] args) {

        for (int a = 0; a < 20; a++) {
            MyTree<Integer, Integer> tree = new MyTree<>();
            while (tree.getLevel() < 6) {
                tree.put((int) Math.round(Math.random() * 200 - 100), tree.size());
            }
            System.out.println(tree.toString());

        }
    }
}


