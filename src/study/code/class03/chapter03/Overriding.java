package study.code.class03.chapter03;

public class Overriding {
   public static void main(String[] args) {
       Child c = new Child();
       c.print();
   } 
}

class Child extends Parent{
    @Override
    public void print(){
        super.print();      //super키워드는 상속받았을때 부모클래스를 가르키는 키워드이며 this와 속성이 비슷하다.
        System.out.println("자식쓰");
    }
}

class Parent{
    public void print(){
        System.out.println("부모쓰");
    }
}