package com.example.chap05.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

// 백준 1874
public class 스택수열 {

    public static void main(String[] args) throws IOException {

        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));

//        // 한 줄에 여러 숫자 입력받기
//        // 5 3 => 5 토큰하나, 3 토큰하나
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int X = Integer.parseInt(st.nextToken());   // 5
//        int Y = Integer.parseInt(st.nextToken());   // 3


        // 1 ~ N까지의 자연수
        int N = Integer.parseInt(br.readLine());

        // 만들어야 할 수열
        int[] A = new int[N];
        for (int i = 0; i < A.length; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }

        Stack<Integer> stack = new Stack<>();

        // 자연수 변수
        int num = 1;

        // 기호를 저장할 문자열 변수
        StringBuilder s = new StringBuilder("");

        // 수열배열 A에서 값을 하나씩 타겟팅해서 push, pop 여부 확인
        for (int i = 0; i < N; i++) {
            int targetNum = A[i];   // 현재 타겟 값

            // push인 경우
            if (targetNum >= num){
                while(targetNum >= num){
                    stack.push(num++);
                    s.append("+\n");
                }
                // 타겟넘버에 도달하는 순간 해당 숫자를 바로 pop
                stack.pop();
                s.append("-\n");
            }
            // pop인 경우
            else {
                Integer n = stack.pop();
                s.append("-\n");

                if (n > targetNum){
                    // 스택 수열 실패 케이스
                    s = new StringBuilder("No");
                    break;
                } else {
                    s.append("-\n");
                }
            }
        } // end for
        System.out.println(s);
    }
}









