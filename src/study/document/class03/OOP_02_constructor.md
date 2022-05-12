# 생성자

```java
접근제어자 클래스이름(파라미터) {
	...
}
```
- 생성자는 반환 값이 없고, 클래스의 이름과 동일

- 파라미터가 없는 생성자를 기본생성자라고 함

- 객체(인스턴스)를 생성할 때 new 키워드와 함께 사용  `new Car();`

- 생성자는 일반 함수처럼 기능을 호출하는 것이 아니고 객체를 생성하기 위해 new 와 함께 호출 됨

- 객체가 생성될 때 변수나 상수를 초기화 하거나 다른 초기화 기능을 수행하는 메서드를 호출 함


- 대부분의 생성자는 외부에서 접근 가능하지만, 필요에 의해 private 으로 선언되는 경우도 있음

----

## 기본 생성자

- 클래스에는 반드시 적어도 하나 이상의 생성자가 존재

- 클래스에 생성자를 작성하지 않아도 `new` 키워드와 함께 생성자를 호출할 수 있음

- 클래스에 생성자가 하나도 없는 경우 컴파일러가 생성자 코드를 넣어 줌 

    ```java
    public Student(){}
    ```

-  컴파일러가 생성한 기본생성자는 매개 변수가 없음

----

## 생성자 추가

- 기본 생성자외에 필요에 의해 생성자를 직접 추가 할 수 있음
- 직접 생성자를 작성하면 컴파일러는 기본생성자를 추가해 주지 않음
  - (추가설명 : 클래스 내부에 생성자가 하나라도 있으면 컴파일러는 기본생성자를 추가하지 않는다.)

Human.java
```java
public class Human {

	public String name;
	public int age;
	public int weight;
	public int height;
	
	public Human(String name, int age, int weight, int height) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	
	public String info() {
		return "이름 : "+name+" / 나이 : " + age + " / 키 : "+height+" / 몸무게 : "+ weight;
	}
}
```

God.java
```java
public class God {

	public static void main(String[] args) {

		//Human khw = new Human();
		
		Human khw = new Human("김현욱", 32, 180,80);
		
		String data = khw.info();
		System.out.println(data);
	}

}
```
