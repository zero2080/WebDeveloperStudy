package study.code.class02.chapter01;

public class CharactorType {
    public static void main(String[] args) {
        char ch = 'A';
        
        System.out.println(ch);

        /**
         * 형변환( 데이터타입을 강제로 변환하는 문법)
         * 형변환을 통해 char타입을 int타입으로 변환해보자
         * 변환이 불가능하다면 컴파일 단계에서 오류가 발생할것이다.
         * 하지만 문자형타입은 정수타입을 사용하기때문에 형변환시
         * 오류가 발생하지 않는다.
         */
        int chNum = (int)ch;    //A에 해당하는 정수형 문자코드가 출력된다.

        System.out.println(chNum);

        char han = '\uD55C';    //유니코드를 직접 쓸수도 있다.
        System.out.println(han);

        int hNum = (int)han;
        System.out.println(hNum);
    }
}
