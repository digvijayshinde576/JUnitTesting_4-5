package org.unittesting.ServiceTest;

import org.junit.jupiter.api.*;
import org.unittesting.Service.CalculatorService;

public class CalculatorServiceTest5 {


    @Test
    @DisplayName("Maths")
    public void addTwoNumberTest(){
        int actual = CalculatorService.addTwoNumber(12, 12);

        int expected=24;
        Assertions.assertEquals(expected,actual,"Test Fail...");
        System.out.println("Add Two Numbers Test Case Successful...");


    }

    @Test
    @Disabled
    public void subArrayTest(){
    int actual = CalculatorService.subAraay(3, 4, 5, 2);
int expected=14;
Assertions.assertEquals(expected,actual,"Test Faild...");
        System.out.println("SubArray  Test Case Successful...");

}

    @Test
    public void productTest(){
        double actual = CalculatorService.productOfTwoNumber(13, 12);
        double expected=156;
        System.out.println("Product Test Case Successful...");
//        Assertions.assertEquals();
//        Assertions.assertArrayEquals();
//        Assertions.assertThrows();
//        Assertions.assertNotEquals();
//        Assertions.assertNotNull();
//        Assertions.assertNull();
//        Assertions.assertTrue();
//        Assertions.assertFalse();
    }

    @BeforeAll
    public static void init(){
        System.out.println("Before Class init...");
    }
    @AfterAll
    public  static  void afterAll(){
        System.out.println("After All....");
    }
    @BeforeEach
    public void beforeEach(){
        System.out.println("Before Each Test Case... ");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("After Each Test Case... ");
    }

//    @Tag()
//    @Nested
//    @TestFactory

}
