package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class NonStaticMethodSample {
    public void testScanner(){
        Scanner sc = new Scanner(System.in);
        System.out.print("논리형(boolean) 입력하기");
        boolean a = sc.nextBoolean();
        System.out.print("문자형(char) 입력하기");
        char b = sc.next().charAt(0);
        System.out.print("정수형(int)값 입력하기");
        int c = sc.nextInt();
        System.out.print("실수형(float) 입력하기");
        float d = sc.nextFloat();
        System.out.println("논리형 : " + a);
        System.out.println("문자형 : " + b);
        System.out.println("정수형 : " + c);
        System.out.println("실수형 : " + d);
    }
    public void testRandom(){
        int num = (int)(Math.random()*10)+1;
        double flo = Math.random()*10;
        System.out.println("정수에 대한 난수 : " + num);
        System.out.println("실수에 대한 난수 : " + flo);

    }
}
