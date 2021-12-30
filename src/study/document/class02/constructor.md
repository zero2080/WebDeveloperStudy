# 생성자 함수
## 1. 생성자 함수
생성자는 객체지향 프로그램에서 객체를 생성할 때 호출되는 단위 메서드를 말한다.
``` javascript
function 생성자함수명(속성명들) {
    ...
}
let 객체명 = new 생성자함수명(속성값들); 
```
`new` 키워드로 객체를 생성하므로 `생성자함수`.

`생성자함수`로 만든 객체를 `객체` 또는 `인스턴스`라 부른다. 해당 객체가 어떠한 `생성자함수`로 생성됐는지 확인할 때 `instanceof` 키워드를 사용할 수 있다. 

```javascript
function Student(name, kor, eng, mat) {
    this.name = name;  // this는 현재 객체의 속성을 가리킬 때 씀, name은 파라미터로 받은 지역변수
    this.kor = kor;
    this.eng = eng;
    this.mat = mat;
    this.sum = kor+eng+mat;
    
    this.getSum = function (){ 
        return this.kor + this.eng + this.mat; 
    };
    
    this.getAvg = function (){ 
        return Math.round(this.getSum() / 3*10)/10; 
    };
    
    this.toString = function (){ 
        return this.name + '\t' + this.getSum() + '\t' + this.getAvg(); 
    };
}
let student = new Student('윤하린', 100, 96, 98);
let students = [];
students.push(new Student('홍길동', 80, 70, 50));
students.push(new Student('김길동', 80, 70, 50));
students.push(new Student('김홍동', 100, 70, 50));
let output = '이름\t총점\t평균\n';
for (let i in students) {
    output += students[i].toString() + '\n';
}
alert(output);
console.log ('student는 Student 생성자함수의 인스턴스인지 '+(student instanceof Student));
console.log ('student는 Array 생성자함수의 인스턴스인지 ' + (student instanceof Array));
```

## 2. 프로토타입
일반함수를 사용하여 객체를 만든 것과 생성자함수를 사용하여 객체를 만드는 것의 차이점이 없습니다. 
   
`Student`의 경우 속성은 모든 객체가 다른 속성을 가지지만 메소드는 모두 같습니다. 

> 각 객체를 생성할 때마다 동일한 함수를 계속 생성하게 된다 

이러한 문제를 해결하고자 `포르토타입`을 이용한다.
> `프로토타입`이란, `생성자함수`로 생성된 `객체`가 공통으로 가지는 공간.

`메서드`를 모두 `프로토타입` 안에 넣어준다. `프로토타입`은 우리가 만드는 것이 아니다. 함수안에 자동으로 만들어지는 배열 `arguments`와 마찬가지로 자바스크립트의 모든 함수는 `prototype` 객체를 갖는다.

```javascript
function Student(name, kor, eng, mat){
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.mat = mat;
}

Student.prototype.getSum = function (){ 
    return this.kor + this.eng + this.mat; 
};

Student.prototype.getAvg = function (){ 
    return Math.round(this.getSum() / 3 * 10) / 10; 
};

Student.prototype.toString = function (){ 
    return this.name + '\t' + this.getSum() + '\t' + this.getAvg(); 
};

let students = [];
students.push(new Student('홍길동', 80, 70, 50));
students.push(new Student('김길동', 80, 70, 50));
students.push(new Student('김홍동', 100, 70, 50));
let output = '이름\t총점\t평균\n';
for (let i in students) {
    output += students[i].toString() + '\n';
}
alert(output);
```

## 3. `new` 키워드
``` javascript
    function Constructor(value) {
        this.value = value;
    }
    let constructor = new Constructor('Hello');
    alert(constructor.value);
```
```javascript
    function Constructor(value) {
        this.value = value;         // this.value는 window.value
    }
    let constructor = Constructor('Hello'); //일반 함수가 되고
    alert(constructor);
```
`new` 키워드로 함수를 호출하면 객체를 위한 공간을 만들고 `this` 키워드가 해당 공간을 의미한다. 

## 4. 캡슐화
> 만일의 상황을 대비해서 특정 속성이나 메서드를 사용자가 바로 사용할 수 없게 막는 기술이다. 숨겨 놓은 특정 속성은 getter와 setter를 이용하여 간접적으로 접근할 수 있다.
```javascript
    function Rectanle(width, height) {
        this.width = width;
        this.height = height;
    }
    Rectanle.prototype.getArea = function () {
        return this.width * this.height;
    };
    let rectangle = new Rectanle(5, 7);
    alert('AREA : ' + rectangle.getArea());
```
위의 예제를 `width`와 `height`를 사용자가 사용할 수 없게 숨겨 놓고 캡슐화 시켜 놓은 예제가 아래와 같다.

```javascript
    function Rectangle(w, h) {
        let width = w;
        let height = h;
        this.getWidth = function () { return width; };
        this.getHeight = function () { return height; };
        this.setWidth = function (w) {
            if (w < 0) {
                throw '길이는 음수일 수 없습니다';
            } else {
                width = w;
            }
        };
        this.setHeight = function (h) {
            if (h < 0) {
                throw '길이는 음수일 수 없습니다';
            } else {
                height = h;
            }
        };
    }
    Rectangle.prototype.getArea = function () {
        return this.getWidth() * this.getHeight();
    };
    let rectangle = new Rectangle(5, 7);
    rectangle.setHeight(-1);
    alert('AREA : ' + rectangle.getArea());
```
```javascript
    function Rectangle(w, h) {
        if (w >= 0) { let width = w; } else { throw '길이는 음수일 수 없습니다'; }
        if (h >= 0) { let height = w; } else { throw '길이는 음수일 수 없습니다'; }
        this.getWidth = function () { return width; };
        this.getHeight = function () { return height; };
        this.setWidth = function (w) {
            if (w < 0) {
                throw '길이는 음수일 수 없습니다';
            } else {
                width = w;
            }
        };
        this.setHeight = function (h) {
            if (h < 0) {
                throw '길이는 음수일 수 없습니다';
            } else {
                height = h;
            }
        };
    }
    Rectangle.prototype.getArea = function () {
        return this.getWidth() * this.getHeight();
    };
    let rectangle = new Rectangle(-5, 7);
    //rectangle.setHeight(-1);
    alert('AREA : ' + rectangle.getArea());
```