package Lesson2.ArraySort;

public class MyArray {
    private int size;
    private int[] array;

    public MyArray(int size){
        this.size = 0;
        this.array = new int[size];
    }

    public int getSize() {
        return this.size;
    }

    public int getArrayElement(int i) {
        return this.array[i];
    }

    public void printArray(){
        for (int i = 0; i < this.size; i++) {
            System.out.println(this.array[i]);
        }
    }

    public void delete(int element){
        int tmp = search(element);
        for (int j = tmp; j < this.size - 1; j++) {
            this.array[j] = this.array[j + 1];
        }
        this.size--;

    }

    public void add(int element){
        this.array[this.size] = element;
        this.size++;

    }

    public int search(int element){
        int tmp = 0;
        for (int i = 0; i < this.size; i++) {
            if (this.array[i] == element) {
                tmp = i;
                System.out.println("Искомый элемент " + element +  " найден в списке под номером " + tmp);
                return tmp;

            }
        }
        System.out.println("Искомый элемент " + element +  " не найден");
        return -1;
    }

    public int binarySearch(int element){
        int low = 0;
        int high = this.size - 1;
        int mid;
        while(low <= high){
            mid = Math.round((low + high)/2);
            if(array[mid] == element){
                System.out.println("Искомый элемент " + element +  " найден в списке под номером " + mid);
                return mid;
            } else if(array[mid] < element){
                low = mid + 1;
            } else if(array[mid] > element) {
                high = mid - 1;
            }
        }
        System.out.println("Искомый элемент " + element +  " не найден");
        return -1;

    }

    public void change(int i, int j){
        int tmp = this.array[i];
        this.array[i] = this.array[j];
        this.array[j] = tmp;
    }

    public void bubbleSort(){
        int out, in;
        for (out = this.size - 1; out >= 1; out--) {
            for(in = 0; in < out; in++) {
                if (this.array[in] > this.array[in + 1]) {
                    change(in, in + 1);
                }
            }
        }
    }

    public void selectSort(){
        int out, in, mark;
        for(out = 0; out < this.size; out++){
            mark = out;
            for(in = out + 1; in < this.size; in++){
                if (this.array[in] < this.array[mark]){
                    mark = in;
                }
            }
            change(out, mark);
        }
    }

    public void insertSort(){
        int in, out;
        for(out = 1; out < this.size; out++){
            int temp = this.array[out];
            in = out;
            while(in > 0 && this.array[in - 1] >= temp){
                this.array[in] = this.array[in - 1];
                --in;
            }
            this.array[in] = temp;
        }
    }
}






