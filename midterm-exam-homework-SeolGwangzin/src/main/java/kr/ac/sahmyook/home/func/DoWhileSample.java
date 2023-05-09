package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class DoWhileSample {
    public void addDashToken(){
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하세요 : ");
        String main = sc.nextLine();
        String sub = "";
        int i = 0;
        do {if(i==0){
            sub += main.charAt(i);
            i++;
        }
        else {
            sub += "-";
            sub += main.charAt(i);
            i++;
        }
        }while (i<main.length());
        System.out.print(sub);
    }
    public void burgerKingMenu(){
        System.out.println("burgerKingMenu()메뉴 호출됨.");
    }
    public void isStringAlphabet(){
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String a = sc.next();
        int i = 0, cnt =0;
        do {
            int x = (int)a.charAt(i);
            if ((x < 123 && x > 95)||(x < 123 && x > 95)){
                cnt++;
            }i++;
        }while(i<a.length());
        if(cnt==a.length()) System.out.println("모든 글자는 영문자이다");
        else System.out.println("모든 글자는 영문자가 아니다");
    }
}
