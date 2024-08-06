//package org.unittesting.ServiceTest;
//
//import org.unittesting.Service.CalculatorService;
//
//import java.util.Arrays;
//
//public class CalculatorServiceTest4 {
//int counter =0;
//    @BeforeClass
//    public static void beforeClass(){
//        System.out.println("BeforeClass Init...");
//    }
//
//    @Before
//    public void beforeEachTest(){
//
//        String[] str={"FGH","Digvijay","pavan"};
//        System.out.println(str.toString());
//    char[] ch={'a','s','d','d','g'};
//        System.out.println(Arrays.toString(ch));
//        int [] srr={1,2,3,4,5};
//        System.out.println(srr);
//        System.out.println("Before Each Test.....");
//        counter=0;
//    }
//    @Test(timeout = 200)//This test case should be completed in 2 sec.
//     public  void addTwoNumberTest() throws InterruptedException {
//       // Thread.sleep(5000);
//        int expected=133;
//        counter+=10;
//        System.out.println(counter);
//         int res = CalculatorService.addTwoNumber(12, 121);
//         Assert.assertEquals(expected,res);
//     }
//
//     @Test
//     public void subArrayTest(){
//         int i = CalculatorService.subAraay(12, 23, 434, 23);
//    int expected =492;
//    counter+=111;
//         System.out.println(counter);
//    Assert.assertEquals(expected,i);
//     }
//
//     @AfterClass
//     public static void afterClass(){
//         System.out.println("AfterClass Init...");
//     }
//
//
//}
