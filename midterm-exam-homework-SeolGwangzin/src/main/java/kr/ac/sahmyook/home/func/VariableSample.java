package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class VariableSample {
    public void myProfile(){
        String name = "설광진";
        String job = "학생";
        int day = 991025;
        System.out.println("이름 : " + name + "\n생년월일 : " + day);
    }
    public void empInformation(){
        Scanner sc = new Scanner(System.in);
        System.out.print("직책을 입력하세요 : ");
        String job = sc.next();
        System.out.print("입사 년도를 입력하세요 : ");
        String day = sc.next();
        System.out.println("직책 : " + job + "\n입사 년도 : " + day);
    }
}
