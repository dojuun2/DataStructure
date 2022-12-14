package com.example.chap06.bubble;

import java.util.Arrays;

// 버블 정렬
public class BubbleSort {

    public static void sort(int[] arr) {

        boolean flag = false;
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {  // 인접 자료를 비교해서 왼쪽이 더 크면 swap
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) break;   // swap이 한번도 안일어났다는 뜻 => 정렬이 끝났다.
        }
    }

    public static void main(String[] args) {
        int[] arr = {33, 11, 99, 1, 22, 88, 55, 44, 66, 77};

        sort(arr); // 버블정렬

        System.out.println("정렬 후: " + Arrays.toString(arr));
    }
}
