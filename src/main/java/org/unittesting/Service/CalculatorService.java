package org.unittesting.Service;

public class CalculatorService {

    public static int addTwoNumber(int a,int b){
        return a+b;
    }


    public static double productOfTwoNumber(double a,double b){
        return a*b;
    }

    public static int subAraay(int ...numbers){
        int s=0;
        for(int n:numbers){
            s+=n;
        }
        return s;
    }

}
