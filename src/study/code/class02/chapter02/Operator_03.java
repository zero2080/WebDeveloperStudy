package study.code.class02.chapter02;

public class Operator_03 {
    public static void main(String[] args) {
        /**
         * 논리 연산자
         */
        int i = 100;
        int j = 200;

        if(i > j){  //거짓
            System.out.println(i>j);
            System.out.println("100은 200보다 크다");
        }
        // if(i > j)   
        //     System.out.println("100은 200보다 크다");

        if(i >= j){ //거짓
            System.out.println(i>=j);
            System.out.println("100은 200보다 크거나 같다");
        }
        // if(i >= j)  
        //     System.out.println("100은 200보다 크거나 같다");

        if(i < j){  //참
            System.out.println(i<j);
            System.out.println("100은 200보다 작다");
        }
        // if(i < j)
        //     System.out.println("100은 200보다 작다");

        if(i <= j){ //참
            System.out.println(i<=j);
            System.out.println("100은 200보다 작거나 같다");
        }
        // if(i <= j)
        //     System.out.println("100은 200보다 작거나 같다");

        if(i == j){ //거짓
            System.out.println(i==j);
            System.out.println("100은 200보다 같다");
        }
        // if(i == j)
        //     System.out.println("100은 200보다 같다");
        System.out.println("==================== 논리 연산 ==========================");

        /**
         * or (||)
         * and (&&) 
         * 연산자
         */
        System.out.println("=================== or 연산 / and 연산 ===================");
        if( i > j || i == 100 ){
             System.out.println(" i는 j보다 크거나 i는 100이다");
         }

        if( i > j && i == 100 ){
            System.out.println(" i는 j보다 크고 i는 100이다");
        }

        /**
         * 삼항연산자 ( 조건식 ? true : false )
         */
        System.out.println("==================삼항 연산자==================");
        System.out.println(i>j?"i는 j보다 크다":"i는 j보다 작다");
        System.out.println(i<j?"i는 j보다 크다":"i는 j보다 작다");
        System.out.println(i>=j?"i는 j보다 크거나 같다":"i는 j보다 작거나 같다");
        System.out.println(i<=j?"i는 j보다 크거나 같다":"i는 j보다 작거나 같다");
        System.out.println(i==j?"i는 j와 같다":"i는 j와 다르다");

        int result = i>j ? (i+j) : (i-j);
        System.out.println(result);

        System.out.println("===================== 조건문 ====================");
        boolean bool = true;
        if(bool){
            //참일때 실행
            System.out.println("트루");
        }

        bool = false;

        if(bool){
            System.out.println("트루");
        }else{
            //거짓일때 실행
            System.out.println("펄스");
        }

        if(i>90){
            
        }else if(i>100){
            //if문이 거짓일때 다음 조건문
        }else if(i>100){
            System.out.println("아님");
        }else if(i>100){

        }else if(i>100){

        }else if(i>100){

        }else if(i>100){

        }else if(i>100){

        }else if(i>100){

        }

        System.out.println("================ switch 조건문 ====================");
        // i=90;
        i=0;
        
        switch(i){
            case 90:
                System.out.println("i는 90");
            break;
            case 100:
                System.out.println("i는 100");
            case 300000:
                System.out.println("브레이크 없잖아");
                break;
            default:
                System.out.println("디폴트");
        }

    }

}
