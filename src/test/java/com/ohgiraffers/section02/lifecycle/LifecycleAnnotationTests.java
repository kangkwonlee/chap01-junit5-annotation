package com.ohgiraffers.section02.lifecycle;

import org.junit.jupiter.api.*;

public class LifecycleAnnotationTests {
    /* 테스트 메소드의 실행 전 후에 동작하는 어노테이션을 활용 할 수 있다.

    /*
     테스트가 실행되기 전 딱 한번만 실행된다.

     */
    @BeforeAll
    public static void beforeAll(){
        System.out.println("beforeAll");
    }

    /*
    각각의 테스트 메소드가 실행되기 전 실행되나
    @Test, @RepeatedTest, @ParameterizedTest, @TestFactory 가 실행되기 전에 동작한다.
    주로 테스트 하기 전에 필요한 목업 데이터(id,password와 같은 데이터)를 미리 세팅해 줄 목적으로 사용된다.
     */
    @BeforeEach
    public void beforeEach(){
        System.out.println("beforeEach");
    }

    @Test
    public void test1() {
        System.out.println("test1");
    }
    @Test
    public void test2(){
        System.out.println("test2");
    }
    /*
    각각의 테스트 메소드가 동작한 직후 동작을 한다.
    @Test, @RepeatedTest, @ParameterizedTest, @TestFactory가 실행된 이후 동작한다.
    주로 단위 테스트들이 수행된 이후 사용한 자원을 해재할 목적으로 사용한다.
     */
    @AfterEach
    public void afterEach(){
        System.out.println("afterEach");
    }
    /*
    모든 단위 테스트가 완전히 끝난 후 딱 한번만 실행된다.
     */
    @AfterAll
    public static void afterAll(){
        System.out.println("afterAll");
    }
}
