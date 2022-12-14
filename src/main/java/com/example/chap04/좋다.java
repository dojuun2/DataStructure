package com.example.chap04;

import java.util.Arrays;
import java.util.Scanner;

// 백준 1253
public class 좋다 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = 10; // 수의 개수
        int count = 0; // 좋은 수의 개수

        // 수를 담을 배열
//        long[] A = {1,2,3,4,5,6,7,8,9,10};
        long[] A = new long[N];

        // 배열 초기화
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }
        sc.close();

        // 배열 정렬
        Arrays.sort(A);

        // 모든 수를 순회하여 좋은 수인지 판단
        // 좋은 수 판단을 위한 숫자 타게팅
        for (int i = 0; i < A.length; i++) {
            long target = A[i]; // 좋은 수 판단 타겟 숫자

            // 투포인터 초기화
            int start = 0, end = N - 1;

            // 투포인터 알고리즘
            while (start < end) {
                // 포인터가 지목한 두 수를 더함
                long M = A[start] + A[end];
                if (target == M) {
                    // 일단은 좋은 수인데 혹시 타겟을 포함해서 더한건 아닌지 확인
                    if (start == i) {   // start가 타겟이면
                        start++;
                    } else if (end == i) {  // end가 타겟이면
                        end--;
                    } else {    // 아무 문제 없으면
                        count++;
                        break;
                    }
                } else if (M < target) {  // 두 수의 합이 타겟보다 작으면
                    start++;
                } else {    // 두 수의 합이 타겟보다 크면
                    end--;
                }
            }
        }
        System.out.println(count);
    }

}
