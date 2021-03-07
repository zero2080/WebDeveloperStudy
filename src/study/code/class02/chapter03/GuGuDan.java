package study.code.class02.chapter03;

import java.util.Scanner;

public class GuGuDan {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        while(true){
            System.out.print("출력하고싶은 단수를 입력하세요(숫자만가능)> ");
            int dan = scann.nextInt();

            if(dan==999){
                System.out.println("시스템을 종료합니다.");
                break;
            }
            for(int i = 1; i<10;i++){
                System.out.println(dan+" X "+ i +" = "+dan*i);
            }
        }
        scann.close();
    }
}
