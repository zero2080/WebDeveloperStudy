package study.code.class03.chapter03;

public class Calcul {
    public int jegop(int x, int y){
        int result = 1;
        for(int i = 0; i < y; i++){
            result = result*x;
        }
        return result;
    }
}
