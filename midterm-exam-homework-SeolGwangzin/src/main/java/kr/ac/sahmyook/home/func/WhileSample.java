package kr.ac.sahmyook.home.func;

import java.sql.Struct;
import java.util.Scanner;

public class WhileSample {
    public void printUniCode(){
        Scanner sc = new Scanner(System.in);
        boolean numtry = true;
        while (numtry == true){
            System.out.print("문자를 입력하세요 : ");
            char ch = sc.next().charAt(0);
            if (ch=='0') numtry=false;
            else System.out.println((int)ch);
        }
    }
    public void sum1To100(){
        int sum = 0;
        int a = 1;
        while (a>100){
            sum += a;
            a++;
        }
    }
    public void numberGame(){
        int cnt = 1;
        int ran = (int)(Math.random()*101) +1;
        int main = 0;
        boolean num = true;
        Scanner sc = new Scanner(System.in);
        while (num == true){
            System.out.print("정수를 입력하세요 : ");
            main = sc.nextInt();
            if (main==ran){ System.out.println("정답입니다. " + cnt + "회 만에 정답을 맞추셨습니다."); num = false;} else if (main<ran) {System.out.println("입력하신 정수보다 큽니다."); cnt++;} else if (main>ran) {System.out.println("입력하신 정수보다 작습니다."); cnt++;}
        }
    }
    public void countCharacter(){
        Scanner sc = new Scanner(System.in);
        String main = sc.nextLine();
        int i = 0;
        while (i<main.length()){
            i++;
        }
        System.out.println(i);
    }

    public void countInChar(){
        int cnt = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 :");
        String main = sc.next();
        for (char x : main.toCharArray()) {
            if ((int) x >= 123 || (int) x <= 95 || (int) x <= 64 || (int) x >= 91) {
                System.out.println("영문자가 아닌 문자가 포함되어 있습니다.");
                cnt = 10000;
                break;
            }
        }
        if (cnt != 10000){
            System.out.print("문자 입력 :");
            String word = sc.next();
            for (char x : main.toCharArray()) {
                if (word.charAt(0) == x) cnt++;
            }
            System.out.println("포함된 갯수 : "+ cnt + "개");
        }
    }
}
