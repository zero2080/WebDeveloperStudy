package study.code.class02.chapter02;

public class Ch_04_if {

    public static void main(String[] args) {
        //조건문
        int a = 100;
        int b = 200;
        String name="오범수";
        boolean bool = true;

        if(a>b){
            System.out.println("참");
        }else{
            System.out.println("거짓");
        }

        if(a>b){
            System.out.println("참");
        }else if(a==100){
            System.out.println("a가 b보다 크진않지만 a가 100은 맞지");
        }else{
            System.out.println("거짓!!위에 뭔가 맞는다면 여긴오지 않는다.");
        }

        //문자열의 비교
        if(name.equals(new String("오범수"))){
            System.out.println("오범수가 맞군");
        }else{
            System.out.println("누구냐!!");
        }
        
        if(name==new String("오범수")){
            System.out.println("오범수가 그 오범수가 맞군");
        }else{
            System.out.println("분명!!같은 문자인데?!");
        }
    }
}