package com.example.chap09;

import java.util.Arrays;
import java.util.StringTokenizer;

// 백준 1541
public class 그리디02 {

    public static void main(String[] args) {

        // 문자열 분리 함수
        // split, StringTokenizer
        String str = "100-40+50+74-30+29-45+43+11";
//        String[] sArr = str.split("-");
//        System.out.println(Arrays.toString(sArr));

        StringTokenizer st = new StringTokenizer(str, "-");

        int answer = 0;
        for (int i = 0; st.hasMoreTokens(); i++) {
            String s = st.nextToken();
            int sum = makeSum(s);
            if (i == 0) {
                answer += sum;
            } else {
                answer -= sum;
            }
        }
        System.out.println(answer);
    }

    // 토큰문자열 (ex: 50+20+30)을 받아서 총합을 구해주는 메소드
    private static int makeSum(String s) {
        int total = 0;
        StringTokenizer st = new StringTokenizer(s, "+");
        while (st.hasMoreTokens()) {
            total += Integer.parseInt(st.nextToken());
        }
        return total;
    }

}
