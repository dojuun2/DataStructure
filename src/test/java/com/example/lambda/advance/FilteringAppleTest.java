package com.example.lambda.advance;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.example.lambda.advance.Apple.Color.GREEN;
import static com.example.lambda.advance.Apple.Color.RED;
import static com.example.lambda.advance.Book.Genre.*;

class FilteringAppleTest {
    @Test
    void test() {
        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(80, GREEN));
        inventory.add(new Apple(155, GREEN));
        inventory.add(new Apple(120, RED));
        inventory.add(new Apple(90, GREEN));
        inventory.add(new Apple(110, RED));
        inventory.add(new Apple(50, RED));

        // 녹색 사과만 필터링 해주세용
//        List<Apple> list = FilteringApple.filterGreenApples(inventory);

        // 색깔 지정
//        List<Apple> list = FilteringApple.filterApplesByColor(inventory, RED);

        // 필터 조건을 지정
        List<Apple> list = FilteringApple.filterApples(inventory, apple -> apple.getWeight() > 100 && apple.getColor() == RED);

        for (Apple apple : list) {
            System.out.println(apple);
        }

        // 범용 메소드 filter 사용
        List<Book> bookList = new ArrayList<>();
        bookList.addAll(
                Arrays.asList(
                        new Book(10000, HISTORY)
                        , new Book(20000, ESSAY)
                        , new Book(15000, HISTORY)
                        , new Book(14000, BIBLE)
                        , new Book(17000, COMICS)
                        , new Book(13000, COMICS)
                )
        );
        List<Book> books = FilteringApple.filter(bookList, b -> b.getGenre() == COMICS);
        List<Apple> apples = FilteringApple.filter(inventory, a -> a.getWeight() < 100);


        // 정수 리스트
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 홀수만 필터링
        List<Integer> integers = FilteringApple.filter(numbers, n -> n % 3 == 0);
        for (Integer n : integers) {
            System.out.println(n);
        }

        List<Integer> integerList = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(integerList);
    }
}