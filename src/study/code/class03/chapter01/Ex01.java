package study.code.class03.chapter01;

public class Ex01 {
	
	public static int i = 100;
	public int j =200;
	
	public Ex01() {}
	
	public int add(int i , int j ) {
		return i+j;
	}

	public int loop(int i , int j ) {
		int result = 0;
		for( ;i <= j; i++ ) {
			System.out.println(result+"+"+i);
			result+=i;
		}
		return result;
	}
	private void privatePrint() {
		System.out.println("private");
	}
	
    	void defaultPrint() {
    		this.privatePrint();		//this는 나 자신을 가리킨다.
		System.out.println("default");
	}
	
	protected void protectedPrint() {
		System.out.println("protected");
	}
	
	public void publicPrint() {
		System.out.println("public");
	}
	
	public Ex01 returnObject() {
		return new Ex01();
	}
	
}
