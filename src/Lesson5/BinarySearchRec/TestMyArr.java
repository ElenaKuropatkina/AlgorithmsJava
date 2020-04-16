package Lesson5.BinarySearchRec;

class MyArrApp {
    public static void main(String[] args) {
        MyArr arr = new MyArr(3);
        arr.insert(1);
        arr.insert(2);
        arr.insert(3);

        int search = 10;

        try {
            System.out.println(arr.binaryFind(search));
        } catch (MyExeption myExeption) {
            System.out.println(myExeption.getMessage());
        }
    }
}
