# 조건문

## 1. `if` 조건문

```javascript
    if(조건식){
        alert('참');
    }
```

## 2. `if else` 조건문

```javascript
    if(조건식){
        alert('참');
    }else{
        alert('거짓');
    }
```

## 3. 중첩 조건문

```javascript
    if(조건식 1){
        if(조건식 2){

        }
    }
```

## 4. `if else if` 조건문

```javascript
    if( 조건식 1 ){

    }else if( 조건식 2 ){

    }else if( 조건식 3 ){

    }else if( 조건식 4 ){

    }else if( 조건식 n ){

    }else{

    }
```

```html
<script>
    let date = new Date();
    let hour = date.getHours();
    if (hour < 12) {
        alert("상쾌한 오전입니다");
    } else if (hour >= 12) {
        alert("따스한 오후입니다");
    }
</script>
```

## 5. `switch` 조건문

```javascript
    switch(비교할 값) {
        case 값: 
            문장; 
            break;
        case 값: 
            문장; 
            break;
        default:
            문장; 
            break;
    }
```

```html
<script>
    let input = Number(prompt('숫자를 입력하세요', '숫자'));
    switch(input % 2){
        case 0: 
            alert("짝수입니다"); 
            break;
        case 1: 
            alert("짝수입니다"); 
            break;
        default:
            alert("숫자가 아닙니다"); 
            break;
    }
</script>
```

> ※ 연습문제
>
> - 사용자에게 학점을 입력받아 소수점으로 
>   - **4.0 ~ 4.5**은 **`A학점이군요`**라고 메시지 출력.
>   - **3.0 ~ 4.0 미만**은 **`B학점이군요`**라는 메시지 출력.
>   - **2.0 ~ 3.0 미만**은 **`C학점이군요`**라는 메시지 출력.
>   - **2.0미만**은 **`분발하세요`**메시지 출력하는 자바스크립트 코드를 구현하시오.
>   - > (유효하지 않은 학점일시에도 메시지 출력)

```html
<script>
    document.write("<h3>요일에 따른 바탕화면 변경</h3>");
    let today = new Date();
    let week = today.getDay();
    switch (week) {
        case 0: document.bgColor = "#ff0000"; document.write(“즐건 일요일”);break;
        case 1: document.bgColor = "orange"; break;
        case 2: document.bgColor = "yellow"; break;
        case 3: document.bgColor = "green"; break;
        case 4: document.bgColor = "blue"; break;
        case 5: document.bgColor = "navy"; break;
        case 6: document.bgColor = "purple"; break;
    }
</script>
```

## 6. 삼항연산자

- `(불 표현식)? (참일 때 실행하는 문장) : (거짓일 때 실행하는 문장);`

> 예제 : 두 수를 `input` 상자를 통해 제대로 입력 받았는지 체크하고, 
> 첫째 입력수가 더 큰지 둘째 입력한 수가 더 큰지 경고 메시지를 표시하는 자바스크립을 구현하시오.

```html
<!DOCTYPE html>
<html lang="ko" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>
    <style type="text/css">
        * {background-color: #FFFFee;}
        input {border:1px solid blue;}
    </style>
    <script>
        function chk() {
            if (!frm.num1.value) {
                alert("수1을 꼭 입력");
                frm.num1.focus();
                return false;
            } else if (!frm.num2.value) {
                alert("수2를 꼭 입력");
                frm.num2.focus();
                return false;
            }

            let num1 = Number(frm.num1.value);
            let num2 = Number(frm.num2.value);
            let cha = ((num1 - num2) >= 0) ? (num1 - num2) : (num2 - num1);
            
            if (frm.num1.value > frm.num2.value) {
                alert("수1("+num1+")이 "+ cha +"만큼 더 큽니다");
                return false;
            } else if (frm.num1.value == frm.num2.value) {
                alert("수1="+num1+"\n"+"수2="+num2+"\n"+"두 수가 같습니다"); return false;
            } else if (frm.num1.value < frm.num2.value) {
                alert("수2(" + num2 + ")이 " + cha + "만큼 더 큽니다");
                return false;
            }

            return true;
        }
    </script>
</head>
<body>
    <form name="frm" onsubmit="return chk()">
        <fieldset>
            <legend>불 연산자</legend>
                <p>수1 : <input type="number" name="num1" /></p>
                <p>수2 : <input type="number" name="num2" /></p>
                <p><input type="submit" value="두 수 비교" /></p>
        </fieldset>
    </form>
</body>
</html>
```

## 7. 짧은 조건문

짧은 조건문은 논리연산자의 특성을 조건문으로 사용한다.<br/> 다음 논리합 연산자를 사용한 표현식은 뒤에 어떠한 값이 들어가도 항상 참이므로 우변을 실행하지 않는다.

- `true || OOO // 우변을 항상 실행하지 않는다.`
- `false || XXX //우변을 항상 실행`

```html
<script>
    true || alert(‘실행될까요?... A’);
    false || alert(‘실행될까요?... B’);
</script>
```

```html
<script>
    let input = Number(prompt('숫자를 입력하세요', '숫자'));
    input % 2 == 0 || alert('홀수입니다');
    input % 2 == 0 && alert('짝수입니다');
</script>
```
