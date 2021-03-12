package study.code.class02.chapter04;

public class Arr {
    public static void main(String[] args) {
        //변수선언 배열의 갯수만 지정(기본값으로 자동초기화)
        int[] numArr = new int[3];          
        float[] fArr = new float[3];
        boolean[] bArr = new boolean[6];
        String[] strArr = new String[5];    //String은 객체형이라 null로 초기화

        //선언과 동시에 초기화
        int[] numArr2 = {1,2,3,4,5};
        String[] strArr2 = {"가","나","다라마"};
        
        //선언과 동시에 초기화
        int numArr3[] = new int[]{6,7,8};
        String strArr3[] = new String[]{"오","범","수","천","재"};

        System.out.println("==== numArr(0으로 초기화) ====");
        System.out.println(numArr[0]);
        System.out.println(numArr[1]);
        System.out.println(numArr[2]);

        System.out.println("==== fArr(0.0으로 초기화) ====");
        System.out.println(fArr[0]);
        System.out.println(fArr[1]);
        System.out.println(fArr[2]);

        System.out.println("==== bArr(false로 초기화) ====");
        System.out.println(bArr[0]);
        System.out.println(bArr[1]);
        System.out.println(bArr[2]);
        
        System.out.println("==== strArr(null로 초기화) ====");
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);
        System.out.println(strArr[3]);
        System.out.println(strArr[4]);
        
        System.out.println("==== numArr2 ====");
        System.out.println(numArr2[0]);
        System.out.println(numArr2[1]);
        System.out.println(numArr2[2]);
        System.out.println(numArr2[3]);
        System.out.println(numArr2[4]);
        
        System.out.println("==== numArr3 ====");
        System.out.println(numArr3[0]);
        System.out.println(numArr3[1]);
        System.out.println(numArr3[2]);
        
        System.out.println("==== strArr2 ====");
        System.out.println(strArr2[0]);
        System.out.println(strArr2[1]);
        System.out.println(strArr2[2]);
        
        System.out.println("==== strArr3 ====");
        System.out.println(strArr3[0]);
        System.out.println(strArr3[1]);
        System.out.println(strArr3[2]);
        System.out.println(strArr3[3]);
        System.out.println(strArr3[4]);
    }
}
