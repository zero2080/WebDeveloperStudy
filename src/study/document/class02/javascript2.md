# 기본문법

## 1 기본 용어

### 1-1. 표현식과 문장

> 하나 이상의 표현식이 모여 문장. 한 문장 단위로 세미콜론을 찍는다.

### 1-2. 키워드

> 자바스크립트가 처음 만들어질 때 정해진 특별한 의미가 이는 단어., `break`, `else`, `instanceof`, `true`, `case`, `false`, `new`, `try`, `catch`, `finally`, `null`, `typeof`, `continue`, `for`, `switch`, `void`, `delete`, `if`, `this`, `while`, `do`, `in`, `throw`, `with`

### 1-3. 식별자

> 이름을 붙일 때 사용하는 단어 
> > ex.변수명, 함수명, 속성, 메소드
>
> - 키워드를 사용하거나 숫자로 시작하면 안 됨. 특수문자는 _과 $만 허용. 공백문자를 포함할 수 없다.
> - 한글이나 한자 일본어 같은 언어를 포함할 수 있으나 알파벳을 사용하는 것이 관례. 의미있는 단어를 사용하고 여러단어로 이루어진 식별자는 각 단어의 첫글자를 대문자로
> - 생성자함수의 이름은 항상 대문자로 시작. 그외 변수는 항상 소문자로 시작

### 1-4. 주석

> `/* 주석 */` 또는 `// 주석`

## 2. 출력

```javascript
    alert('Hello, JavaScript');

    alert("Hello, JavaScript");
```

## 3. 문자열 자료형

- 큰따옴표나 작은 따옴표를 이용할 수 있으며, 항상 일관되게 따옴표를 사용하는 것을 추천
- 그러나 문자열 안에 따옴표를 사용해야 한다면 예외적으로 두 가지를 모두 사용

> ex) `alert('This is "Spring”');` 또는 `alert("This is 'spring'");`

- 이스케이프문자 : `\n`, `\n`, `\'`(백틱), `\”`, `\\`, `\b`(back space), `\r`(커서를 그줄 맨 앞)

## 4. 숫자 자료형

- 정수와 유리수의 구분 없이 사용.
- 우선순위 고려.
- `%`(나머지 연산자)와 사칙연산 가능

```html
<script>
    let i = 10 + 11.1;
    alert(i);
    alert(5 + 3 * 2);
    alert(10 % 7);
</script>
```

- 정수형은 진법에 따라 10진수(10), 8진수(012), 16진수(0xa)로 표현가능.
- 실수형은 일반 소수형실수(3.141592)와 지수형 실수(0.3141592E+9)로 표현 가능

```html
<script>
        alert('10진수' + 10);
        alert('8진수' + 012);
        alert('16진수' + 0xa);
        alert('소수형' + 314159.2);
        alert('지수형' + 0.3141592E+9);
        alert(true);
        alert(false);
</script>
```

## 5. 불 자료형

- 비교연산자 (`!=`다르다) 등을 이용하여 불 자료형을 만들 수 있다.
- 논리연산자 (`!` 부정연산자, `&&` 논리곱연산자, `||` 논리합연산자)
- 잘못된 연산자의 사용: `alert(30>20>10)` **논리연산자**는 **삼항연산자**가 ***아니다***.
- 바른 예 : `alert( 30>20 && 20>10);`

## 6. 변수

### 6-1. 변수의 생성과 사용

```html
<!DOCTYPE html>
<html lang="ko" xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta charset="utf-8" />
        <script>
            let str = 'coffe';
            alert(str);
            str = 5;
            alert(str);
        </script>
        <title></title>
    </head>
    <body>

    </body>
</html>
```

### 6-2. 복합 대입 연산자(`+=`, `-=`, `*=`, `/=`, `%=`)

### 6-3. 증감연산자(`++`, `--`)

## 7. 자료형 검사

```html
<script>
        let str = 'coffed';
        alert(typeof (str));    //문자열
        str = 5;
        alert(typeof str);      //숫자형
        alert(typeof true);
        alert(typeof (function () { }));//함수
        alert(typeof ({}));     //객체
        alert(typeof (alpha));  //undefined
        alpha = 10;
        alert(typeof (alpha));
</script>
```

## 8. `undefined` 자료형

- 선언했어도 초기화하지 않았을 때 `undefined` 자료형을 가진다
  
## 9. 입력

> 자바스크립트에 내장된 대화상자를 이용한 인터페이스

### 9-1. `alert` 함수 : 경고 메시지를 전달하기 위한 대화상자를 표시

```javascript
 alert(단순히 전달사항을 출력할 때 사용하는 함수)
```

### 9-2. `confirm` 함수 : 사용자의 확인을 받기 위한 대화상자를 표시

> `반환값 = confirm(출력할 메시지);` //반환값이 `true`면 **확인**단추가 `false`면 **취소**단추가 선택된 것임.

```html
<script>
        answer = confirm("[확인] [취소] 중 선택 : 수강신청을 하시겠습니까?");
        if (answer == true)
            alert("등록되었습니다");
        else
            alert("취소되었습니다. 다시 신청해 주세요");
    </script>
```

### 9-3. `prompt` 함수 : 사용자로 내용을 입력받을 수 있는 대화상자를 표시.

> 원하는 데이터를 키보드에서 입력받고 싶을 때 prompt함수를 사용.
> > `반환값 = prompt(메시지, 초기값);`

```html
<script>
    name = prompt("이름을 입력하세요", "홍길동");(
    alert(name + "씨 환영합니다");
</script>
```

## 10. 숫자와 문자열 자료형 변환

문자열 + 숫자 => 문자열이 우선

```javascript
    alert(52+’273’);
```

- `Number(ob)` : 다른 자료형을 숫자로 바꿀 때. 일반문자열을 숫자로 표시할 수 없지만 강제로 숫자자료형으로 바꿨을 시 `NaN`으로 출력.
- `parseInt(string, [진수])`와 `parseFloat(string)` : 문자열을 정수와 실수로 변경. 문자열 타입의 숫자만 가능
- `eval(string)` : 문자열을 수식으로 바꾸어 준다.
- `String(ob)` : 다른 자료형을 문자열로 바꿀 때
- `isNaN(숫자)` : 주어진 데이터가 **숫자**면 `false`리턴, **숫자가 아니면** `true`리턴

```html
<script>
    let i = Number("a");
    alert(i);
    let pi = parseInt("a");
    alert(pi);
</script>
```

## 11. 불자료형 변환

- `Boolean()` : `Boolean` 자료형으로 변환. 다음의 경우는 `false`로 변환

> - `Boolean(0)`
> - `Boolean(NaN)`
> - `Boolean('')`
> - `Boolean(null)`
> - `Boolean(undefined)`
> - `Boolean(false)`
