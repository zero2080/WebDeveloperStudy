# HTML - III
 목표 : 공간분할태그, 시맨틱태그

- 공간분할 태그(레이아웃태그) – `div`(블록형식의 태그), `span`(라인형식의 태그)
- `div` : `block` 형식으로 공간을 분할. 하나의 블록형식의 태그므로 **개행포함**
- `span` : `inline` 형식으로 공간을 분할
> `inline`과 `block`
> > `HTML`을 구성하는 요소는 각각 자리를 차지하기위한 성질이 있는데 그 성질을 구분하는 기준이다.
> > - `inline` : 한줄 안에 표현되는 요소들로서 이 `inline`속성 태그를 연속으로 쓰면 개행하지 않고 연속으로 작성된다. 높이 값을 가질 수 없습니다.
> > - `block` : 이 성격을 가진 태그는 자체만으로 한줄을 전부 차지하며, 연속적으로 위치 할 수 없습니다.
> > - `inline-block` : 위 두개의 성격을 모두 가진 타입으로서 연속적으로 나열되지만 높이 값을 가질 수 있습니다.

```html
<!DOCTYPE html>
<html lang="ko" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>
</head>
<body>
    <p>대표적인 블럭태그</p>
    <ul>
        <li>item1</li>
        <li>item2</li>
    </ul>
    <div align="center">block_01</div>
    <div>block_02</div>
    <div>block_03</div>
    <div>block_04</div>
    <div>block_05</div>
    <br />
    <br />
    <span>inline_01</span>
    <span>inline_02</span>
    <span>inline_03</span>
    <span>inline_04</span>
    <span>inline_05</span>
    <span>inline_01</span>
</body>
</html>
```

- `div`를 이용한 레이아웃
```html
<!DOCTYPE html>
<html lang="ko" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>
</head>
<body>
    <div>
        <h1>My HOMEPAGE(해더부분)</h1>
        <hr />
    </div>
    <div>
        <ul>
            <li>HTML5 (메뉴부분)</li>
            <li>CSS3</li>
            <li>JavaScript</li>
        </ul>
        <hr />
    </div>
    <div>
        <h1>What is HTML5?(정보내용부분)</h1>
        <p>HTML5 is gooooooooooooooooooood!</p>
        <hr />
    </div>
    <div>
        <p>***개쩌는 풀스텍 강의를 듣고 계십니다.***</p>
    </div>
</body>
</html>
```

혹은
```html
    <div id=”header”>
        <h1>My HOMEPAGE(해더부분)</h1>
        <hr />
    </div>
    <div id=”menu”>
        <ul>
            <li>HTML5 (메뉴부분)</li>
            <li>CSS3</li>
            <li>JavaScript</li>
        </ul>
        <hr />
    </div>
    <div id=”content” >
        <h1>What is HTML5?(정보내용부분)</h1>
        <p>HTML5 is gooooooooooooooooooood!</p>
        <hr />
    </div>
    <div id=”footer”>
        <p>***개쩌는 풀스텍 강의를 듣고 계십니다.***</p>
    </div>
```
- 시멘틱을 이용한 레이아웃
- 일반적으로 `HTML5` 태그의 가장 큰 변화를 시멘틱 태그라고 한다. <br/>
이 때문에 일반적으로 `HTML5` 웹 페이지를 시멘틱 웹 페이지라고 말한다. 
- > 시멘틱(`semantic`)은 `의미론적인` 뜻.
- 웹 페이지는 글자로 입력한다.<br/>
스타일시트(`CSS`)를 적용하고 사용자가 눈으로 볼 때, "이것은 **제목**이고, 이것은 **본문**이다"라는 식으로 구분할 수 있다.
- 기계적인 검색 엔진은 어떠한 태그가 어떠한 기능을 하는지 분별할 수 없고 웹 페이지에서 데이터를 효율적으로 추출할 수 없다.<br/>
 이를 해결하고자 특정 태그에 의미를 부여해서 웹 페이지를 만드는 시도가 시작되었다.<br/>
 그리고 이를 `시멘틱 웹`이라고 표현한다.<br/>
 시멘틱 웹의 장점은 검색엔진이 보다 **효율적으로 검색**을 할 수 있고 **유지보수시 효율**적이다.
- `HTML5` 시멘틱 구조 태그
- `header` : 해더
- `nav` : 내비게이션
- `aside` : 사이드에 위치하는 공간
- `article` : 독립적으로 의미를 가지고 있는 영역
- `section` : 같은 의미의 내용을 공유하고 있는 영역
- `footer` : 꼬리말

```html
<!DOCTYPE html>
<html lang="ko" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>
</head>
<body>
    <header>
        <h1>My HOMEPAGE</h1>
        <hr />
    </header>
    <nav>
        <ul>
            <li>HTML5</li>
            <li>CSS3</li>
            <li>JAVASCRIPT</li>
        </ul>
        <hr />
    </nav>
    <section>
        <article>
            <h1>What is HTML5?</h1>
            <p>HTML5 is gooooooooood!</p>
        </article>
        <hr />
    </section>
    <footer>
        <p>***개쩌는 풀스텍 강의를 듣고 계십니다.***</p>
    </footer>
</body>
</html>
