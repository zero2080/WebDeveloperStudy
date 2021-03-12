package study.code.class02.chapter02;

public class TypeCast {
    public static void main(String[] args) {
        double dou = 1.5;
		float flo = 0.6F;
		
		int i = (int)dou + (int)flo;
		int j = (int)(dou + flo);
		
		/**
		 * (int)dou : 1.5의 소수 부분이 제거되어 1로 변환됨 
		 * (int)flo : 0.6의 소수 부분이 제거되어 0으로 변환됨
		 */
		System.out.println(i);	//1

		/**
		 * (int)(dou + flo) : 1.5와 0.6을 더한 값(2.1)을 정수형(int)으로 형변환함
		 */
		System.out.println(j);	//2
    }
}
