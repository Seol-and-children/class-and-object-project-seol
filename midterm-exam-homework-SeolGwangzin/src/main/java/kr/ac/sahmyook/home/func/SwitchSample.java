package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class SwitchSample {
    public void calculator(){
        Scanner sc = new Scanner(System.in);
        System.out.print("1번쨰 정수를 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.print("2번쨰 정수를 입력하세요 : ");
        int num2 = sc.nextInt();
        System.out.print("연산기호를 입력하세요 : ");
        String sign = sc.next();
        System.out.println(sign);
        if(sign.equals("+")) System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        else if(sign.equals("-")) System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        else if(sign.equals("*")) System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
        else if(sign.equals("/")) System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
        else if(sign.equals("%")) System.out.println(num1 + " % " + num2 + " = " + (num1%num2));
        else System.out.println("입력하신 연산은 없습니다. 프로그램을 종료합니다.");
    }
    public void fruitPrice(){
        Scanner sc = new Scanner(System.in);
        System.out.print("과일 이름(사과, 바나나, 복숭아, 키위)을 입력하세요 : ");
        String fruit = sc.next();
        if(fruit.equals("사과")) System.out.println(fruit + "의 가격은 1000원 입니다.");
        else if(fruit.equals("바나나")) System.out.println(fruit + "의 가격은 3000원 입니다.");
        else if(fruit.equals("복숭아")) System.out.println(fruit + "의 가격은 2000원 입니다.");
        else if(fruit.equals("키위")) System.out.println(fruit + "의 가격은 5000원 입니다.");
        else System.out.println("준비된 상품이 없습니다.");
    }
}
