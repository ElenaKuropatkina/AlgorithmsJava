package Lesson1;

public class BinarySearch {

    public static void main(String[] args) {
        int[] list = {0, 5 , 6 , 8 , 10 , 12 , 15 , 17 , 25 , 33 , 44 , 45 , 51 , 65 , 73 , 84 , 99};
        int item = 13;
        binarySearch(list, item);
        item = 45;
        binarySearch(list, item);
    }

    public static int binarySearch(int [] list, int item){
        int low = 0;
        int high = list.length - 1;
        int mid;
        while(low <= high){
            mid = Math.round((low + high)/2);
            if(list[mid] == item){
                System.out.println("Искомый элемент " + item +  " найден в списке под номером " + mid);
                return mid;
            } else if(list[mid] < item){
                low = mid + 1;
            } else if(list[mid] > item) {
                high = mid - 1;
            }
        }
        System.out.println("Искомый элемент " + item +  " не найден");
        return -1;

    }

}




