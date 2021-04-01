package study.code.class03.chapter03;

public class Calcul2 extends Calcul {
    @Override
    public int jegop(int x, int y) {
        int result = 1;
        for(int i = 0; i < y; i++){
            System.out.print(result);
            result = result*x;
            System.out.println("곱하기 "+x+" : "+(i+1)+"번째="+result);
        }
        return super.jegop(x, y);
    }
}
