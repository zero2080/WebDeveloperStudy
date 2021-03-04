package study.code.class02.chapter02;

public class Operator_02 {
    public static void main(String[] args) {
        char aa = 'a';
        System.out.println(aa);
        /**
         *  사칙연산자
         */
        int a = 8;
        int j = 3;

        System.out.println("a = "+ a + " / j = "+j);
        System.out.println("a 더하기 j 는 " + (a + j));
        System.out.println("a 빼기 j 는 " + (a - j));
        System.out.println("a 곱하기 j 는 " + a * j);
        System.out.println("a 나누기 j의 몫은 " + a / j);
        System.out.println("a 나누기 j의 나머지 는 " + a % j);
        
        System.out.println("====================== 문자열 더하기 ==============");
        System.out.println("오범수"+"짱짱맨");
        System.out.println(123+"짱짱맨");       // 123짱짱맨
        System.out.println(123+2+"짱짱맨");     // 125짱짱맨
        System.out.println("짱짱맨"+123);       // 짱짱맨123
        System.out.println("짱짱맨"+123+2);     // 짱짱맨1232
        System.out.println("짱짱맨"+(123+2));   // 짱짱맨125
        System.out.println("짱짱맨"+123*2);     // 짱짱맨246

    }
}
