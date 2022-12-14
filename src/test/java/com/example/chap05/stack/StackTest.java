package com.example.chap05.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void stackTest(){
        Stack<String> foodStack = new Stack<>();

        foodStack.push("자장면");
        foodStack.push("볶음밥");
        foodStack.push("짬뽕");
        foodStack.push("깐풍기");

        String r1 = foodStack.pop();
        System.out.println("re = 1" + r1);

        assertEquals("깐풍기", r1);

        foodStack.pop();
        foodStack.pop();
        foodStack.pop();
        foodStack.pop();    // stack is empty!!
    }
}