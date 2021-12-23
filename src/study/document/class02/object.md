# 객체
## 6-1.	객체 개요

```javascript
/* 여러가지 변수를 모아놓은 자료형 typeof() 이용시 object */
    let array = [‘사과’, ‘바나나’, ‘망고’,’딸기’]; 

    array[0];  // ‘사과’
    let product = {
        제품명 : ‘7D 건조 망고’, 
        유형 : ‘당절임’, 
        성분 : ‘망고, 설탕, 메타중아황산나트륨, 치자황색소’,
        원산지 : ‘필리핀’
    };

    product[‘제품명’];  // ‘7D 건조 망고’
    product.제품명;     //‘7D 건조 망고’
```

```javascript
    let array = ['사과','바나나','망고','딸기']; 
    let product = {
        제품명 : '7D 건조 망고', 
        유형 : '당절임', 
        성분 : '망고, 설탕, 메타중아황산나트륨, 치자황색소', 
        원산지 : '필리핀'
    };
    let obj = {
        'with': 273,
        'with space' : 52
    }
    alert(product.제품명 + obj['with']+ product['제품명']);
```

## 6-2.	속성과 메서드
- 배열 내부에 있는 값을 요소(`element`). 객체 내부에 있는 값은 속성(`property`). 자바스크립트에서는 요소와 속성을 구분하지 않고 쓴다. 객체 속성 중 함수형 자료형인 속성을 특별히 메서드라고 부른다.

```javascript
    let object = {
        number: 273,
        string: 'RintIanTta',
        boolean: true,
        array: [52, 273, 103, 32],
        method: function () {}
    }; 
```

- `this` 키워드 생략 불가
```javascript
    let person = {
        name: '윤인성',
        eat: function (food) {
            alert(this.name + '이 ' + food + '을/를 먹습니다.'); 
        }
    };
    person.eat('밥');
```

## 6-3. 객체와 반복문
- 배열은 단순 `for` 반복문과 `for in` 반복문으로 요소에 쉽게 접근. 객체는 단순 `for`문은 불가. `for in`반복문을 사용한다
```javascript
    // 변수를 선언합니다.
    let product = {
        name: 'Microsoft Visual Studio 2012 Ultimate',
        price: '15,000,000원',
        language: '한국어',
        supportOS: 'Win 32/64',
        subscription: true
    };
    // 출력합니다.
    let output = '';
    for (let key in product) {
        output += '●' + key + ': ' + product[key] + '\n';
    }
    alert(output);
```

## 6-4. 객체 관련 키워드
### 6-4-1 `in` 키워드
- `in` 키워드를 `for` 키워드와 별도로 사용하면 해당 키가 객체 안에 있는지 확인할 수 있다.
```javascript
	let output = '';
    let student = {
        이름: '연하진',
        국어: 92, 수학: 98, 영어: 96, 과학: 98
    };
    output += "'이름' in student : " + ('이름' in student) + '\n';
    output += "'성별' in student : " + ('성별' in student);
    alert(output);
```

### 6-4-2 `with` 키워드
```javascript
    let student = {
        이름: '연하진',
        국어: 92, 수학: 98, 영어: 96, 과학: 98
    };
    let output = '';
    output += '이름 : ' + student.이름 + '\n';
    output += '국어 : ' + student.국어+ '\n';
    output += '수학: ' + student.수학+ '\n';
    output += '영어: ' + student.영어+ '\n';
    output += '과학: ' + student.과학+ '\n';
    alert(output);
```

- `with`를 이용하여 쉽게 간결하게 구현한다.
```javascript
    let student = {
        이름: '연하진',
        국어: 92, 수학: 98, 영어: 96, 과학: 98
    };
    let output = '';
    with (student) {
        output += '이름 : ' + 이름 + '\n';
        output += '국어 : ' + 국어 + '\n';
        output += '수학: ' + 수학 + '\n';
        output += '영어: ' + 영어 + '\n';
        output += '과학: ' + 과학 + '\n';
    }
    alert(output);
```
- `with` 키워드와 객체가 충돌하는 경우
```javascript
    let student = {
        이름: '연하진',
        국어: 92, 수학: 98,
        영어: 96, 과학: 98,
        output: '이미있지롱'
    };
    let output = '';
    with (student) {
        window.output += '이름: ' + 이름 + '\n';
        window.output += '국어: ' + 국어 + '\n';
        window.output += '수학: ' + 수학 + '\n';
        window.output += '영어: ' + 영어 + '\n';
        window.output += '과학: ' + 과학 + '\n';
        window.output += '총점: ' + (국어 + 수학 + 영어 + 과학);
    }
    alert(output);
```

- 객체내에는 속성값으로 함수가 올 수도 있다
```html
<html lang="ko" xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta charset="utf-8" />
        <title></title>
        <script>
            let output = '';
            let student = {
                이름: '허결',
                국어: 92, 수학: 98, 영어: 96, 과학: 98,
                총점: function () {
                    return this.국어 + this.수학 + this.영어 + this.과학;
                },
                output: 'ㅋㅋㅋㅋ공부 개잘함',
                toString: function () {
                    let output = '';
                    for (let key in this) {
                        if (key != 'toString' && key != '총점') {
                            output += key + ':' + this[key] + '\n';
                        }
                    }
                    return output;
                }
            };
            alert(student.toString());
            alert(student.총점());
        </script>
    </head>
    <body>

    </body>
</html>
```

## 6-5. 객체의 속성 추가와 제거
### 6-5-1. 속성 추가
```javascript
    // 변수를 선언합니다.
    let student = {};
    student.이름 = '허결';
    student.취미 = '프로그래밍';
    student.특기 = '해킹';
    student.장래희망 = '농부';

    // toString() 메서드를 만듭니다.
    student.toString = function () {
        let output = '';
        for (let key in this) {
            // toString() 메서드는 출력하지 않게 합니다.
            if (key != 'toString') {
                output += key + '\t' + this[key] + '\n';
            }
        }
        return output;
    };

    // 출력합니다.
    alert(student.toString());
```

### 6-5-2. 속성 제거 : `delete` 이용
```javascript
    let student = {};
    student.이름 = '윤인성';
    student.취미 = '악기';
    student.특기 = '프로그래밍';
    student.장래희망 = '생명공학자';
    
    // toString() 메서드를 만듭니다.
    student.toString = function () {
        let output = '';
        for (let key in this) {
            // toString() 메서드는 출력하지 않게 합니다.
            if (key != 'toString') {
                output += key + '\t' + this[key] + '\n';
            }
        }
        return output;
    };        
    
    // 출력합니다.
    alert(student.toString());
    
    delete(student.장래희망); // 속성을 제거합니다.
    
    // toString() 메서드를 사용하지 않아도 toString() 메서드를 사용합니다
    alert(student);
```

## 6-6. 객체와 배열을 사용한 데이터 관리
```javascript
    // 학생 정보 배열을 만듭니다.
    let students = [];
    students.push({ 이름: '허결', 국어: 87, 수학: 98, 영어: 88, 과학: 95 });
    students.push({ 이름: '오범수', 국어: 92, 수학: 98, 영어: 96, 과학: 98 });
    students.push({ 이름: '아이유', 국어: 76, 수학: 96, 영어: 94, 과학: 90 });
    students.push({ 이름: '누구', 국어: 98, 수학: 92, 영어: 96, 과학: 92 });
    students.push({ 이름: '김김김', 국어: 95, 수학: 98, 영어: 98, 과학: 98 });

    // 모든 students 배열 내의 객체에 메서드를 추가합니다.
    for (let i in students) {
        // 총점 구하는 메서드를 추가합니다.
        students[i].getSum = function () {
            return this.국어 + this.수학 + this.영어 + this.과학;
        };

        // 평균을 구하는 메서드를 추가합니다.
        students[i].getAverage = function () {
            return this.getSum() / 4;
        };
    }

    // 출력합니다.
    let output = '이름\t총점\t평균\n';
    for (let i in students) {
        with (students[i]) {
            output += 이름 + '\t' + getSum() + '\t' + getAverage() + '\n';
        }
    }
    alert(output);
```

## 6-7. 함수를 사용한 객체 생성
```javascript
    function makeStudent(name, korean, math, english, science) {
        let willReturn = {
            // 속성
            이름: name,
            국어: korean,
            수학: math,
            영어: english,
            과학: science,
            // 메서드
            getSum: function () {
                return this.국어 + this.수학 + this.영어 + this.과학;
            },
            getAverage: function () {
                return this.getSum() / 4;
            },
            toString: function () {
                return this.이름 + '\t' + this.getSum() + '\t' + this.getAverage();
            }
        };
        return willReturn;
    }

    // 학생 정보 배열을 만듭니다.
    let students = [];
    students.push(makeStudent('윤인성', 87, 98, 88, 95));
    students.push(makeStudent('연하진', 92, 98, 96, 98));
    students.push(makeStudent('구지연', 76, 96, 94, 90));
    students.push(makeStudent('나선주', 98, 92, 96, 92));
    students.push(makeStudent('윤아린', 95, 98, 98, 98));
    students.push(makeStudent('윤명월', 64, 88, 92, 92));
    students.push(makeStudent('김미화', 82, 86, 98, 88));
    students.push(makeStudent('김연화', 88, 74, 78, 92));
    students.push(makeStudent('박아현', 97, 92, 88, 95));
    students.push(makeStudent('서준서', 45, 52, 72, 78));


    // 출력합니다.
    let output = '이름\t총점\t평균\n';
    for (let i in students) {
        output += students[i].toString() + '\n';
    }
    alert(output);
```
