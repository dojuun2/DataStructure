package com.example.lambda.basic;

import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test
    void calcTest() {

        // 람다식을 쓰기 위한 전제조건
        // => 해당 인터페이스에 추상메소드가 반드시 단 한개일 것!!
        Calculator addCalc = (n1, n2) ->  n1 + n2;
//        Calculator addCalc = new Calculator() {
//            @Override
//            public int calc(int n1, int n2) {
//                return n1 + n2;
//            }
//        };
        int r1 = addCalc.calc(10, 20);
        System.out.println("r1 = "+ r1);

        Calculator multiCalc = (n1, n2) -> n1 * n2;
        int r2 = multiCalc.calc(10, 20);
        System.out.println("r2 = "+ r2);

        Operator op = new Operator(10, 20);
        int r3 = op.operate((n1, n2) -> n1 - n2);
        System.out.println("r3 = " + r3);

        int r4 = op.operate((n1, n2) -> n1 % n2);
        System.out.println("r4 = " + r4);
    }
}