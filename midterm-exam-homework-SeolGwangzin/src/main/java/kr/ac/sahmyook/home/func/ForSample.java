package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class ForSample {
    public void sum1To10(){
        int num=0;
        for(int i = 1; i<11; i++){
            num += i;
        }
        System.out.println(num);
    }
    public void sumEven1To100(){
        int sum = 0;
        for(int i=1;i<=100;i++) {
            if(i%2==0)sum += i;
        }
        System.out.println(sum);
    }
    public void oneGugudan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요. : ");
        int num = sc.nextInt();
        for (int a=1;a<10;a++){
            System.out.println(num + " * " + a + "= " + num*a);
        }
    }
    public void sumMinToMax(){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수를 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두번째 정수를 입력하세요 : ");
        int num2 = sc.nextInt();
        int mini = Math.min(num1,num2);
        int big = Math.max(num1,num2);
        for(int i=mini;i<=big;i++) {
            sum += i;
        }
        System.out.println(sum);
    }
    public void printStar(){
        System.out.println("printStar() 호출됨.");
    }
    public void printNumberStar(){
        System.out.println("printNumberStar() 호출됨");
    }
    public void printTriangleStar(){
        System.out.println("printTriangleStar() 호출됨");
    }
    public void guguDan(){
        for(int i=2;i<=9;i++) {
            for(int z=1;i<=9;i++) {
                System.out.println(i + " * " + z + "= " + i*z);
            }
        }
    }
}
