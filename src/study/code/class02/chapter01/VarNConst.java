package study.code.class02.chapter01;

public class VarNConst {
    public static void main(String[] args) {
        int num = 100;

        /**
         * final 은 상수를 표시하기 위한 제어자다.
         * final 은 한번 값이 저장되면 다시 바꿀 수 없다.
         * final 은 초기화 될때 메모리에 우선적으로 저장된다.
        */
        final int fNum = 200;

        System.out.println(num);
        System.out.println(fNum);

        num = 800;
        // fNum= 500;   // 에러!! 변할 수 없기때문에 오류 발생
        
    }   
}
