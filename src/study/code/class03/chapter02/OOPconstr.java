package study.code.class03.chapter02;

import study.code.class03.example.game.Player;

public class OOPconstr {
    public static void main(String[] args) {
        Construct con1 = new Construct();
        Construct con2 = new Construct(12);
        Construct con3 = new Construct("생성자",11);
        Construct con4 = new Construct(11,"생성자");
        Construct con5 = new Construct(1,2,3,4,5,6,7,8);

        Player p = new Player("김현욱",20000);
        p.status();
    }
    int add = 0;
}

class Construct{
    public int aa = 0;

    public Construct(){
        System.out.println("나는 파라미터가 없어");
    }
    
    public Construct(int i ){
        System.out.println("나는 파라미터가 정수형 하나만 받았어"+i);
    }
    
    public Construct(String name, int i ){
        System.out.println("나는 파라미터가 문자열과 정수형 하나씩만 받았어"+name+"/"+i);
    }
    
    public Construct(int i, String name ){
        System.out.println("나는 파라미터가 정수형과 문자열 하나씩만 받았어"+i+"/"+name);
    }
    
    public Construct(int ...i ){
        System.out.println("나는 파라미터가 정수형파라미터를 무제한으로 받을수 있어");
        for(int a = 0; a<i.length;a++){
            System.out.println(i[a]);
        }
    }
    // public OOPconst(int[] i ){
        
    // }

    public int fuck(int a, int b){
        return a+b;
    }
}
