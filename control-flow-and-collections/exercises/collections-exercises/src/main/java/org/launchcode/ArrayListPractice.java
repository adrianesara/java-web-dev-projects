package org.launchcode;
import java.util.Arrays;
import java.util.ArrayList;

public class ArrayListPractice {
    public static void main (String [] arg){
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        int total = sumEven(intList);

        System.out.println(total);
    }

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }
}
