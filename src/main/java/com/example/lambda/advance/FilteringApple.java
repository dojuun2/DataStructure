package com.example.lambda.advance;

import com.example.lambda.advance.Apple.Color;

import java.util.ArrayList;
import java.util.List;

// 사과를 필터링해주는 기능 클래스
public class FilteringApple {

    /**
     * @solution - try 1: 사과 바구니에서 녹색 사과들만 필터링 해주세요
     * @problem - 만약 사용자가 빨간색 사과를 필터링 하고싶을 때?
     * - 메소드 스펙을 바꾸거나 새로운 redApples를 선언할 것인가?
     * - 색깔이 2종류가 아니라 10종류라면?
     */
    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> resultList = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getColor() == Apple.Color.GREEN) {
                resultList.add(apple);
            }
        }
        return resultList;
    }

    /**
     * @solution try 2 - 색깔을 파라미터화 한다
     * @problem - 만약 필터 기준이 색상이 아니라면?
     * - 만약 필터 기준이 색상 + 무게라면?
     * - 결국 기준에 맞는 메소드를 또 만들 것인가...
     */
    public static List<Apple> filterApplesByColor(List<Apple> inventory, Color color) {
        List<Apple> resultList = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getColor() == color) {
                resultList.add(apple);
            }
        }
        return resultList;
    }

    /**
     * @solution - try 3: 동작 파라미터화 - 추상적 조건으로 필터링
     * <p>
     * a. 사과의 필터 조건에 따라 참 거짓을 반환하게하는 추상 메서드를
     * 가진 ApplePredicate 인터페이스를 정의한다.
     * b. 특정 조건을 설정할 구현 클래스를 정의하고 기능을 오버라이딩
     * c. 위 내용을 기반으로 필터 메서드들을 사용.
     * @problem - 사과가 아니면 필터링 불가하다..
     */
    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate predicate) {
        List<Apple> resultList = new ArrayList<>();
        for (Apple apple : inventory) {
            if (predicate.test(apple)) {
                resultList.add(apple);
            }
        }
        return resultList;
    }

    /**
     * @solution - try 4 : 타입을 Apple에서  제너릭 타입으로 교체
     */
    public static <T> List<T> filter(List<T> inventory, Predicate<T> predicate) {
        List<T> resultList = new ArrayList<>();
        for (T apple : inventory) {
            if (predicate.test(apple)) {
                resultList.add(apple);
            }
        }
        return resultList;
    }
}














