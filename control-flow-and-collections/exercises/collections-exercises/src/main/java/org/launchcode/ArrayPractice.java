package org.launchcode;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] integerArray = {1, 1, 2, 3, 5, 8};
        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] % 2 == 0) {
                System.out.println(integerArray[i]);
            } else {
                System.out.println("odd");
            }

        }

    }
}