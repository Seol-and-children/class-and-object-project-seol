package kr.ac.sahmyook.home.func;

public class ContinueSample {
    public void sumJumpThree(){
        int sum = 0;
        for(int i =1;i<=100;i++){
            if (i%3==0){
                i++;
                continue;
            }
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
    public void rowColJump(){
        for (int i = 1; i<4; i++){
            for (int z = 1; z<6; z++){
                if(i==1&&(z>2&&z<6)) continue;
                System.out.println(i+"행"+z+"열");
            }
        }
    }
}
