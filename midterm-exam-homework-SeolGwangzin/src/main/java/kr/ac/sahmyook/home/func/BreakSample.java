package kr.ac.sahmyook.home.func;

public class BreakSample {
    public void sumBreak(){
        int sum = 0;
        int i =1;
        while (true){
            sum += i;
            i++;
            if(i>100) break;
        }
        System.out.println(sum);
    }
    public void guguDanBreak(){
        for (int i = 1; i<10; i++){
            for (int z = 1; z<10; z++){
                if (i==5)break;
                System.out.println(i +" *"+z+" = "+i*z);
            }
        }
    }
}
