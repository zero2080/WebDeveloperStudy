package study.code.class02.chapter01;

public class Variable {
	public static void main(String[] args) {
		//정수형
		byte by = 0;
		short sh = 0;
		int in = 0;
		long lo = 0;
		
		//각 타입별 최소/최대값
		System.out.println("byte 타입 최소 : " + Byte.MIN_VALUE);
		System.out.println("byte 타입 최대 : " + Byte.MAX_VALUE);
		System.out.println("short 타입 최소 : " + Short.MIN_VALUE);
		System.out.println("short 타입 최대 : " + Short.MAX_VALUE);
		System.out.println("int 타입 최소 : " + Integer.MIN_VALUE);
		System.out.println("int 타입 최대 : " + Integer.MAX_VALUE);
		System.out.println("long 타입 최소 : " + Long.MIN_VALUE);
		System.out.println("long 타입 최대 : " + Long.MAX_VALUE);
		
		//소수형
		float fl = 0.00123F;	//float형은 마지막에 'F'를 붙여줘야 함
		double db = 0.1289037198273;
		
		System.out.println("float 타입 최소 : "+Float.MIN_VALUE);
		System.out.println("float 타입 최대 : "+Float.MAX_VALUE);
		System.out.println("double 타입 최소 : "+Float.MIN_VALUE);
		System.out.println("double 타입 최대 : "+Float.MAX_VALUE);
		
		//문자형
		char ch = 'c';		//1개의 문자만 저장할 수 있다.
		String str = "문자열";	//여러개의 문자를 저장할 수 있고, 길이의 제한이 없다(PC에서 사용하는 메모리한계)
		
		//논리형
		boolean bool_t = true;
		boolean bool_f = false;
		
	}
}
