package kr.ac.sahmyook.home.func;

public class StaticMethodSample {
    public void testMathRandom(){
        int ran = (int)(Math.random()+46)+1;
        System.out.println(ran);
    }
    public void testMathAbs(){
        System.out.println("-12.77의 절대값은 : " + Math.abs(-12.77));
    }
    public void testMathMax(){
        System.out.println("120과 54중 더 큰값 : " + Math.max(120,54));
    }
}
