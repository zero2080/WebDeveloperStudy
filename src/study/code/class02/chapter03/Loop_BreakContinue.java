package study.code.class02.chapter03;

public class Loop_BreakContinue {
    public static void main(String[] args) {
        for(int i = 0; i<10;i++){
            if(i==3){
                System.out.println("컨티뉴!! 3은 건너뛸거야!");         //
                continue;
            }
            System.out.println(i);
            if(i==3){
                System.out.println("여기는 절대 안오지");
                break;
            }
            if(i==5){
                System.out.println("5가 되면 이 반복문을 빠져나갈거야!!");
                break;
            }
        }
    }
}
