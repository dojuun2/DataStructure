package com.example.lambda.advance;

public interface Predicate<T> {     // 타입을 범용적으로 하고싶다면 제너릭 타입!!!

    boolean test(T t);
}
