# 자바스크립트
## 자바 스크립트의 역사
### 넷스케이프사에서 모카라는 이름으로 시작
> 이후 썬마이크로시스템에서 개발한 자바 프로그래밍 언어와 이름을 같게 하는 마케팅 조약을 채결했을 뿐 자바와 완전히 다른 프로그래밍 언어.

## 자바 스크립트의 활용
### 초기 웹은 정적 글자로만.
> 자바 스크립트가 나오고부터 웹 문서의 내용을 동적으로 바꾸거나 사용자가 마우스를 클릭하는 것 같은 이벤트를 처리할 수 있는 해준다<br/>
> 인터넷 속도가 점점 빨라지면서 웹 문서는 더 많은 자료를 가지고, 웹은 일반적인 웹 문서의 개념을 초월해 일반적인 애플리케이션의 모습에 점점 가까워졌고, 이를 ‘웹 애플리케이션’이라 부른다.<br/>
> 어떠한 엡 애플리케이션은 인터넷에 연결되지 않아도 웹 브라우저에서 실행할 수 있다. 웹 애플리케이션은 노트북, 데스크톱, 스마트폰 등 모든 장치에서 사용할 수 있다.

## HTML 파일 만들기
> - `HTML5`에서는 script태그에 type 속성을 적지 않는 게 원칙
> - `HTML`페이지의 각 태그는 웹 브라우저에 의해 순차적으로 실행. 웹 브라우저는 `<head>`태그를 먼저 읽은 후 `<body>` 태그를 읽으므로 `<script>` 태그를 `<head>`에 넣으면 `<body>`읽기전에 실행. 반대로 `<body>`에 넣으면 `<head>`실행 후 실행.

```html
<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>
    <script>
        // 자바는 문자하나 'A' 문자열 "ab"
        // 자바스크립트는 문자하나,문자열 = 문자형 'a' "a"
        alert('경고창을 뿌려주는 함수');
    </script>
</head>
<body>
    <script>alert("경고창 두번째");</script>
    <h1>문자열은 큰 따옴표도 작은 따옴표도 가능하나</h1>
    <script>alert("This is 'javaScript'");</script>
    <h2>일관적으로 따옴표를 사용한다.</h2>
    <script>alert('This is "javaScript"');</script>
</body>
</html>
```
> - `<script>`태그를 `<head>` 안에 넣어야 코드를 살펴보기 편하므로 특수한 경우가 아니면 대부분 `<script>`를 head 안에 위치시킨다.
```html
<html lang="ko" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>
  <script>
    document.write('<h1>첫번째 라인</h1>');
  </script>
</head>
<body>
  <h1>두번째 라인</h1>
  <script>
    document.body.innerHTML += "<h2>세번째 메세지를 제목으로</h2>";
  </script>
  <h1>네번째 메세지 뿌린 후 제목</h1>
  <script>alert('다섯번째 메세지');</script>
</body>
</html>
```

 - first example
 ```html
<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta charset="utf-8" />
        <title></title>
        <!-- HTML 주석 -->
        <script>
            // 동적인 예
            /*
            * 여러줄 주석 
            */
            let name = prompt('이름을 입력하세요', '홍길동');
            if (name == 'null') {
            alert('이름을 꼭 입력 후 확인을 눌러야지 취소를 왜 눌러?');
            } else {
                alert(name + '님 어서오세요');
            }
        </script>
    </head>
    <body></body>
</html>
```