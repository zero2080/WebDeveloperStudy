package study.code.class02.chapter02;

public class Operator_01 {
    public static void main(String[] args) {
        /**
         * 단항연산자 예제
         */
        int num = 200;
        int mNum = -num;    //변수가 음수라면 양수로 / 양수라면 음수로 전환된다.
        int pNum = +mNum;    //변화없음 그냥 존재함(진짜로...진짜진자로...)

        System.out.println(num);
        System.out.println(mNum);   //양수가 음수로 전환됨
        System.out.println(pNum);   //음수가 양수로 바뀌지도 않음

        System.out.println(num);    //200
        //num++;                      // num에 1을 더함
        num = num+1; //과 같음
        System.out.println(num);    //201
        //num--;                      // num에서 1을 뺌
        num = num-1; //과 같음;
        System.out.println(num);    //200

        System.out.println("후위연산 : " + num++);  //200출력   후위 연산   현제 행을 실행하고 해당 변수를 1증가시킴
        System.out.println(num);    //201출력
        System.out.println("전위연산 : " + --num);  //202출력   전위 연산   현제 행을 실행하기 전에 해당변수에서 1을 감소시키고 실행
    }
}
