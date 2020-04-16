package Lesson5.Exponentiation;

public class Exponentiation {

    static long exponentitionRec(int base, int power) {
        if (power == 0) {
            return 1;
        }
        return exponentitionRec(base, power - 1) * base;
    }

//    static long exponentition(int base, int power){
//        long result = 1;
//        for (int i = 1; i <= power ; i++) {
//            result = result*base;
//        }
//        return result;
//    }

    public static void main(String[] args) {

        System.out.println(exponentitionRec(8, 3));
    }
}
