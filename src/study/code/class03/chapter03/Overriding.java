package study.code.class03.chapter03;

public class Overriding {
   public static void main(String[] args) {
       Child c = new Child();
       Child c2 = new Child();

       c.i= 100;
       c2.i= 200;

       System.out.println(c.myInt());
       System.out.println(c2.myInt());

       //Child.myInt(); static메소드가 아니기때문에 사용불가

       c.print();
       c.print("fafa");
   } 
}

class Child extends Parent{
    int i =0;
    @Override
    public void print(){
        super.print();      //super키워드는 상속받았을때 부모클래스를 가르키는 키워드이며 this와 속성이 비슷하다.
        System.out.println("의 자식쓰");
    }

    public void print(String content){
        System.out.println(content);
    }

    public int myInt(){
        return this.i;
    }
}

class Parent{
    public void print(){
        System.out.println("부모쓰");
    }
}