package study.code.class03.chapter02;

public class DrawShape {

	public static void main(String[] args) {
		Point[] p = {new Point(100,100),
					 new Point(140,50),
					 new Point(200,100)
		};
		Triangle t = new Triangle(p);
		Circle c = new Circle(new Point(150,150),50);
		
		t.draw();	//삼각형을 그린다.
		c.draw();	//원을 그린다.
	}
}

class Shape{
	String color = "black";
	Object o = new Object();
	void draw() {
		System.out.printf("[color=%s]%n",color);
	}
}

class Point{
	int x;
	int y;
	
	public Point (int x, int y){
		this.x = x;
		this.y = y;
	}
	public Point(){
		this(0,0);
	}
	
	publicString getXY() {
		return "("+x+","+y+")";	//x와 y값을 문자열로 반환
	}
}

class Circle extends Shape{	//상속 관계
	Point center;			//포함 관계
	int r;
	
	Circle(){
		this(new Point(0,0),100);	//Circle(Point center,int r)를 호출
	}
	Circle(Point center,int r){
		this.center=center;
		this.r = r;
	}
	void draw() {	//원을 그리는 대신에 원의 정보를 출력하도록 한다.
		System.out.printf("[center=(%d, %d), r=%d, color=%s]%n",center.x,center.y,r,color);
	}
}

class Triangle extends Shape{
	Point[] p = new Point[3];
	
	Triangle(Point[] p) {
		this.p = p;
	}
	
	void draw() {
		System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n",p[0].getXY(),p[1].getXY(),p[2].getXY(),color);
	}
}