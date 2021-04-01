# 오버로딩 (Overloading)
## 정의
 - 오버로딩은 같은이름의 메소드를 매개변수(파라미터)의 구성으로 구분지어 여러개의 매소드로 정의 하는 것을 의미한다.

```java
public class Overloading{
    public void print(){
        System.out.println("print method");
    }

    public void print(String content){
        System.out.println(content);
    }

    public void print(String content, int round){
        for(int i = 0; i<round;i++){
            System.out.println(content);
        }
    }

    public void print(String content, int round, boolean boo){
        if(boo){
            for(int i = 0; i<round;i++){
                System.out.println(content);
            }
        }
    }
}
```
[[오버로딩 - 예제]](../../code//class03/chapter03/Overloading.java)

### 주의 
  1. 갯수와 데이터 타입의 자리가 중복되지 않아야 한다.
      - 갯수가 같아도 파라미터의 데이터타입 자리가 다르다면 사용가능하다.
  2. 리턴타입이 달라도 파라미터의 갯수와 파라미더 데이터 타입의 자리가 같으면 컴파일 오류가 발생한다.
      - `void print(String content, int round){...}` 이런 메소드가 정의되어 있다면 
      - `String print(String content, int round){...}` 리턴타입이 다르다고해도 사용할 수 없다.


# 오버라이딩(Overriding)
## 정의
 - 오버라이딩은 자손클래스에서 이미 부모클래스에 정의되어있는 메소드를 재정의하는 것을 의미한다.

```java
public class Child extends Parent{
    @Override
    public void print(){
        System.out.println("자식이다");
    }
}

class Parent{
    public void print(){
        System.out.println("부모다");
    }
}
```
### 특징
  1. 이미 부모클래스에 정의되어 있는 메소드여야 한다.
  2. 파라미터의 갯수와 데이터타입의 자리가 같아야 한다.
  3. `super.메소드이름`으로 오버라이딩 되기전에 메소드를 호출 할 수 있다.