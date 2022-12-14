package com.example.lambda.basic;

@FunctionalInterface        // 람다식을 쓸 수 있는 인터페이스인지 컴파일 라인에서 체크
public interface Calculator {

    int calc(int n1, int n2);

    default void zz(){};

//    int add(int n1, int n2);

//    int sub(int n1, int n2);
//
//    default int multi(int n1, int n2){      // default를 붙이고 대충 아무렇게나 만들면, 오버라이딩을 강제하지 않음
//        return 0;
//    };
}
