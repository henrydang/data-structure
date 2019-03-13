package com.example.recursion;

public class Recursion {

    public static boolean binarySearch(int[] data, int target, int low, int high) {
        if (low > high) {
           return false;
        }
        int mid = (low + high) / 2;
        if (target == data[mid]) {
            return true;
        } else if (target < data[mid]) {
            return binarySearch(data, target, low, mid-1);
        } else {
            return binarySearch(data, target, mid+1, high);
        }
    }


    public static int sumArray(int[] data, int n) {
        if (n == 0) {
            return 0;
        }
        return sumArray(data, n-1) + data[n - 1];
    }

    public static void reverseArray(int[] data, int low, int high) {
        if (low < high) {
            int temp = data[low];
            data[low] = data[high];
            data[high] = temp;
            reverseArray(data, low + 1, high - 1);
        }
    }


    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }
}
