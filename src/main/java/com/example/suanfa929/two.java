package com.example.suanfa929;

/**
 * @author 池恩
 * @date 2022/9/30 10:31
 * @project_name
 */
public class two {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,10 };
        int i = 0, j = arr.length-1;
        int sum = 20;
        while (i <= j) {
            if (arr[i] + arr[j] > sum) {
                j--;
            } else if (arr[i] + arr[j] < sum) {
                i++;
            } else {
                System.out.println(arr[i] + " + " + arr[j] + " = " + sum);
                break;
            }
        }
    }
}
