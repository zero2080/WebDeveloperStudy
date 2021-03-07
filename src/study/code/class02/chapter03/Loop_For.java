package study.code.class02.chapter03;

public class Loop_For {
    public static void main(String[] args) {
        
        for(int i = 1; i < 10 ; i++){
        //  초기화영역  조건영역  후연산영역
            System.out.println(2*i);    //구구단 2단의 결과만 출력
        }

        for(int i = 1; i<10; i++){
            /**
             * 2 X 1 = 2
             * ~~
             * 2 X 9 = 18
             */
            System.out.println("2 X "+ i + " = "+ (2*i));
        }

        for(int i=9; i>0; i--){
            /**
             * 2 X 9 = 18
             * ~~
             * 2 X 1 = 2
             */
            System.out.println("2 X "+ i + " = "+ (2*i));
        }

    }
}


