package study.code.class02.chapter03;

public class Loop {
    public static void main(String[] args) {
        for(int i = 1; i < 10; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        for(String a ="오범수"; a.equals("오범수"); a = "김현욱"){
            System.out.println(a);
            
        }

        // System.out.println(a);
    }
}
