package study.code.class02.chapter02;

public class Operator_01 {
    public static void main(String[] args) {
        int a = 8;
        int j = 3;

        System.out.println("a = "+ a + " / j = "+j);
        System.out.println("a 더하기 j 는 " + (a + j));
        System.out.println("a 빼기 j 는 " + (a - j));
        System.out.println("a 곱하기 j 는 " + a * j);
        System.out.println("a 나누기 j의 몫은 " + a / j);
        System.out.println("a 나누기 j의 나머지 는 " + a % j);

        System.out.println("=======================================");

        System.out.println("지금 a는 " + a);
        System.out.println(" ++ 는 증가연산자 : " + (++a));   // 1을 1증가시키고 출력
        System.out.println(" ++ 는 증가연산자 : " + (a++));   // 1을 출력하고 1증가
        System.out.println("지금 a는 " + a);
        
        System.out.println("=======================================");

        System.out.println("지금 a는 " + a);
        System.out.println(" -- 는 감소연산자 : " + (--a));   // 1을 1감소시키고 출력
        System.out.println(" -- 는 감소연산자 : " + (a--));   // 1을 출력하고 1감소
        System.out.println("지금 a는 " + a);

    }
}
