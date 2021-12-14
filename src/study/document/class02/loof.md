# 반복문.

## 1. 배열

```javascript
    let array = [273, 32, 103, 57, 52];
```

### 1-1. 어떤 자료형도 배열 요소가 될 수 있다.

```html
<script>
    let array = [273, 'String', true, function () { }, {}, [273, 103]];
    alert(array);
    alert(array[1]);
</script>
```

### 1-2. 배열의 `length`속성과 `push()`메서드

```html
<script>
    let array = [0,1,2,3,4];
    alert('length of array : ' + array.length);
    array.push(5);
    alert('5 push 후 : ' +array);
    alert('5 push 후 length of array : ' + array.length);
</script>
```

### 1-3. 문자열과 배열

```html
<script>
    let a = 'abcde';
    alert('length of array : ' + a.length);
    alert(a[0]);
    alert(a[0] + a[1] + a[2] + a[3] + a[4] + a[5]);
</script>
```

## 2. `while` 반복문

### 2-1. 1초동안 `while`문이 몇번 반복되는지 출력하는 자바스크립트 코드를 구현하시오.

```html
<script>
    let value = 0;
    let startTime = new Date().getTime();
    while (new Date().getTime() < startTime + 1000) {
        value++;
    }
    alert(value);
</script>
```

## 3. `do while` 반복문

```html
<script>
    let value = 0;
    do {
        alert(value + '번째 반복문');
    } while (++value < 5);
    alert(value);
</script>
```

## 4. `for` 조건문

```html
<script>
    let array = ['포도', '사과', '바나나', '망고'];
    for (let i = 0 ; i < array.length; i++) {
        alert(array[i]);
    }
    for (let i = array.length - 1; i >= 0 ; i--) {
        alert(array[i]);
    }
</script>
```

### 4-1. 특이한 점

```html
<script>
    let startTime = new Date().getTime();
    for (let CPS = 0 ; new Date().getTime() < startTime + 1000 ; CPS++) {

    }
    alert('초당 연산 횟수 : ' + CPS);
</script>
```
> 보통은 `for`문 안에서 선언된 변수가 반복문이 끝나면 소멸되지만 자바스크립트에서는 살아남는다. 위 코드에서 `CPS`변수가 그 예이다.

## 5. `for in` 반복문

```javascript
    for(let i in array) { 

    }
```

```html
<script>
    let array = ['포도', '사과', '바나나', '망고'];
    for (let i in array) {
        alert(array[i]);
    }
</script>
```

> 인덱스가 담긴다.

### 5-1. `for-each`문

```html
<script>
        let arr = [273, 's', true, function () { alert(1); }];

        // 1. 일반 for문
        for (let idx = 0; idx < arr.length; idx++) {
            document.write(idx + '번째 값은 ' + arr[idx]+'<br>');
        }
        document.write('<hr color="blue">');

        // 2. for in문
        for (let idx in arr) {
            document.write(idx + '번째 값은 ' + arr[idx] + '<br>');
        }
        document.write('<hr color="red">');

        // 3. forEach문
        arr.forEach(function (data, i) {
            document.write(i + '번째 값은 ' + data + ' &nbsp; &nbsp; ');
            document.write(i + '번째 값은 ' + arr[i] + '<br>');
        });
        document.write('<hr>');

        arr.forEach(function (data) {
            document.write(data + '<br>');
        });
    </script>
```

## 6. 중첩 반복문

``` console
*
**
***
****
*****
******
*******
********
*********
**********
```

```html
<script>
    let output = '';
    for (let i = 0; i < 10; i++) {
        for (let j = 0; j < i; j++) {
            output += '*';
        }
        output += '\n';
    }
    alert(output);
</script>
```

### 6-1. 연습문제 1

보고 싶은 구구단을 입력받아 그 단의 구구단을 출력하는 `javascript` 프로그램을 구현하시오
> (단, 입력받은 것이 숫자가 아닐 시 `숫자를 꼭 입력해야 합니다`라는 경고문구를 출력하시오).

### 6-2. 연습문제 2

2단부터 9단까지 구구단을 출력하는 `javascript`프로그램을 구현하시오.

## 7. `break` 키워드 vs. `continue` 키워드

- `break`문과 `continue`문

```html
<script>
    for (num = 1 ; num < 5 ; num++) {
        if (num % 3 == 0)
            break;
        alert(num);
    }
</script>
```

```html
<script>
    for (num = 1 ; num < 5 ; num++) {
        if (num % 3 == 0)
            continue;
        alert(num);
    }
</script>
```

```html
<script>
    for (let i=0 ; true ; i++){
        alert(i + '번째 반복문입니다');
        if (!confirm('계속 하시겠습니까?')) { //진행여부를 묻는 질문
            break;
        }
    }
    document.write(i + '까지 수행');
</script>
```
