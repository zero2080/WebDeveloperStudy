package study.code.class03.chapter01;

public class Ex02 {
	public static void main(String[] args) {
		Ex01	 	ex01	=	 new Ex01();
		Ex01	 	ex02	=	 new Ex01();
		Ex01	 	ex03	=	 new Ex01();
	/* 클래스	클래스변수명	클래스 생성자		*/
		ex01.publicPrint();
		ex01.defaultPrint();
		ex01.protectedPrint();
//		ex01.privatePrint();
		
		int i = 0;
			i = i+1;
			i += 1;
			i++;
		System.out.println(ex01.add(199,1));
		System.out.println(ex01.loop(1, 10));
		
		System.out.println(Ex01.i);		//static : 인스턴스를 생성하지 않아도 변수를 쓸수있다.
//		System.out.println(Ex01.j);		//static변수가 아니므로 오류
		System.out.println(ex01.j);
		System.out.println("=========================================");
		System.out.println(ex01.j);
		ex01.j=5000;
		System.out.println(ex01.j);
		
		Ex01.i= 3000;
		
		System.out.println(Ex01.i);
		ex03.i= 500000;
		
		System.out.println(ex01.i);
	}
}
