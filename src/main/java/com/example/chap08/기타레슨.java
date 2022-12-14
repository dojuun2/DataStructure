package com.example.chap08;

import java.util.Scanner;

// 백준 2343
public class 기타레슨 {

    // 강의 갯수
    public static int N;

    // 필요한 블루레이 수
    public static int M;

    // 강의들(강의 분)이 담긴 배열
    // ex: [10, 17, 25, 7, 3, 11]
    public static int[] A;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt(); // 레슨의 수
        M = sc.nextInt(); // 블루레이의 수

        A = new int[N]; // 레슨 배열
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // 최대 길이(분)의 레슨(블루레이의 최소 분을 구하기 위해)과,
        // 레슨 길이 총합 구하기(블루레이의 최대 분을 구하기 위해)
        int start = 0, end = 0;
        for (int i = 0; i < N; i++) {
            if (start < A[i]) start = A[i];
            end += A[i];
        }

        int answer = 0; // 정답
        while (start <= end) {
            int mid = (start + end) / 2; // 블루레이의 크기
            if (isRightSize(mid)) {
                answer = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println(answer);

    }

    private static boolean isRightSize(int mid) {
        int cnt = 0;
        int total = 0;
        for (int i = 0; i < N; i++) {
            if (total + A[i] > mid) { // 레슨크기의합이 사이즈보다 커지면
                cnt++; // 블루레이의 개수를 1개늘리고
                total = A[i]; // 새로운 그룹을 만든다
            } else {
                total += A[i];
            }
        }
        return cnt < M;
    }
}