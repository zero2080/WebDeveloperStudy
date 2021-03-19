package study.code.class03.chapter01.access;

import study.code.class03.chapter01.Ex01;

public class Ex03 {
	public static void main(String[] args) {
		Ex01 ex01 = new Ex01();
		
		ex01.publicPrint();
//		ex01.defaultPrint();		//패키지가 달라서 접근이 불가하여 메소드를 수행할 수 없다.
//		ex01.protectedPrint();		//패키지가 달라서 접근이 불가
//		ex01.privatePrint();		//같은 클래스가 아니라서 접근 불가
	}
}
