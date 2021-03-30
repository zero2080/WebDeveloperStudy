package study.code.class03.chapter02;

public class VariableInit {
    public static void main(String[] args) {
        Init init = new Init();
        System.out.println(init.b);     // 0
        System.out.println(init.i);     // 0
        System.out.println(init.l);     // 0
        System.out.println(init.boo);   // false
        System.out.println(init.f);     // 0.0
        System.out.println(init.d);     // 0.0
        System.out.println(init.ch);    // '' 빈칸
        System.out.println(init.str);   // null     String은 객체형이기 때문
    }
}


class Init{
    byte b;
    short s;
    int i;
    long l;
    boolean boo;
    float f;
    double d;
    char ch;
    String str;
}