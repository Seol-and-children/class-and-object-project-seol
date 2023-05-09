package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class IfSample {
    public void maxNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수를 입력하세요 : ");
        int a = sc.nextInt();
        System.out.print("두번째 정수를 입력하세요 : ");
        int b = sc.nextInt();
        System.out.println(Math.max(a,b));
    }
    public void minNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수를 입력하세요 : ");
        int a = sc.nextInt();
        System.out.print("두번째 정수를 입력하세요 : ");
        int b = sc.nextInt();
        System.out.println(Math.min(a,b));
    }
    public void threeMaxMin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수를 입력하세요 : ");
        int a = sc.nextInt();
        System.out.print("두번째 정수를 입력하세요 : ");
        int b = sc.nextInt();
        System.out.print("세번째 정수를 입력하세요 : ");
        int c = sc.nextInt();
        System.out.print("작은수 : "+ Math.min(a,Math.min(b,c)));
        System.out.print("큰수 : "+ Math.max(a,Math.max(b,c)));
    }
    public void checkEven(){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int a = sc.nextInt();
        if(a%2==0) System.out.println("짝수");
        else if (a%2==1) System.out.println("홀수");
        else System.out.println("정수를 입력하세요.");
    }
    public void isPassFail(){
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 점수를 입력하세요 : ");
        int kr = sc.nextInt();
        System.out.print("영어 점수를 입력하세요 : ");
        int en = sc.nextInt();
        System.out.print("수학 점수를 입력하세요 : ");
        int math = sc.nextInt();
        int mid = (kr+en+math)/3;
        if(mid>=60&&kr>=40&&en>=40&&math>=40) System.out.println("합격입니다!");
        else { if(mid<60) System.out.println("평균 점수 미달로 불합격입니다.");
            if(kr<40) System.out.println("국어 점수 미달로 불합격입니다.");
            if(en<40) System.out.println("영어 점수 미달로 불합격입니다.");
            if(math<40) System.out.println("수학 점수 미달로 불합격입니다.");
        }
    }
    public void scoreGrade(){
        System.out.println("scoreGrade()메소드 호출됨");
    }
    public void checkPlusMinusZero(){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int a = sc.nextInt();
        if(a > 0) System.out.println("양수입니다.");
        else if(a < 0) System.out.println("음수입니다.");
        else if(a==0) System.out.println("0 입니다.");
        else System.out.println("정수를 입력하세요.");
    }
    public void whatCaracter(){
        Scanner sc = new Scanner(System.in);
        System.out.print("문자를 입력하세요 : ");
        char a = sc.next().charAt(0);
        int x = (int)a;
        if (x < 123 && x > 95) {
            if(x > 122) x = 96 + (x-122);
            System.out.print((char)x + "는 영어 소문자이다");
        } else if ((int) x > 64 && (int) x < 91) {
            if(x > 90) x = 65 + (x-90);
            System.out.print((char)x + "는 영어 대문자이다");
        }
    }
}
