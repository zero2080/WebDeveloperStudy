# CSS3
> 1. 변형
> 2. 애니메이션
> 3. 변환
> 4. 규칙과 반응형웹


1. 변형 
> - 변형이란, `html` 태그 요소의 속성(형태, 색상 등등..)이 변경될 때, `CSS3`변형 속성을 적용하여 단계적으로 변화하는 것
```html
<!DOCTYPE html>
<html lang="ko" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>
    <style>
        *{margin:0; padding:0;}
        #wrap .rec {
            width:100px;
            height:200px;
            background-color:red;
            transition-duration:3s;
            transition-delay:2s; 
            transition-timing-function:ease-in; /*처음엔 느리다 점점 빠르게 (반)easy-out */
        }
        #wrap .rec:hover{ 
            width:200px; 
            height:100px;
            background-color: blue; 
        }
        #wrap .rec:active{
            width:200px; 
            height:200px; 
            background-color: green; 
            border-radius:100px 0;
        }
    </style>
</head>
<body>
    <div id="wrap">
        <div class="rec"></div>
    </div>
</body>
</html>
```
> 2. 변형 속성
> > 대표적인 변형 속성들
```html
<!DOCTYPE html>
<html lang="ko" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>
    <style>
        * {margin: 0;padding: 0;}
        li {list-style: none;}
        div {width: 600px;height: 300px; margin: 0 auto; }
        #gnb ul li { 
            width: 100px; 
            height: 50px; 
            line-height: 50px;
            margin: 5px;
            text-align: center; 
            background-color: yellow;
            transition-property: background-color, width; /*변형속성은 백그라운드컬러와 높이변화를 주겠다*/
            transition-duration: 5s, 2s; /*백그라운드컬러는 5초 동안 변하고 높이는 2초 빨리 변하겠지*/
        }
        #gnb ul li:nth-child(1) { 
            transition-delay: 2s; 
        }
        #gnb ul li:nth-child(2) { 
            transition-timing-function: ease-in; 
        } /*점점빨리애니메이션*/

        #gnb ul li:nth-child(3) { 
            transition-timing-function: ease-out; 
        } /* 점점 느리게 */

        #gnb ul li:nth-child(1):hover {  
            width: 250px; 
            background-color: darkgreen;
            color: white; 
        }
        #gnb ul li:nth-child(2):hover { 
            width: 250px; 
            background-color: darkgreen; 
            color: white; 
        }
        #gnb ul li:nth-child(3):hover { 
            width: 250px; 
            background-color: darkgreen; 
            color: white; 
        }
        #gnb ul li:nth-child(4):hover { 
            width: 250px; 
            background-color: black; 
            color: white; 
        }
        #gnb ul li:nth-child(5):hover { 
            width: 250px; 
            background-color: brown; 
            color: white; 
        }
    </style>
</head>
<body>
    <div id="gnb">
        <ul>
            <li>GNB_01</li>
            <li>GNB_02</li>
            <li>GNB_03</li>
            <li>GNB_04</li>
            <li>GNB_05</li>
        </ul>
    </div>
</body>
</html>
```
2. 애니메이션 
> - 키 프레임과 애니메이션 속성(앞의 변형은 형태나 색상. 애니메이션은 위치가 변하는 것). 
> - 키 프레임을 이용한 애니메이션 속성을 이용합니다
> - 모든 브라우저(사파리, 파이어폭스 등)에서 최신 `CSS3`의 모든 기능을 지원하고 있지는 않다. 그래서 모든 브라우저에서 다 볼 수 있도록 해주는 밴더프리픽스 태그를 넣어준다. 원래는 `CSS`에 다 넣어줘야 하지만 다음과 같이 간편하게 `js`파일을 이용한다. `<script src=”prefixfree.min.js”></script>`
> > [다운로드](https://projects.verou.me/prefixfree/)
> - `CSS3` 표준안은 아직 확정되지 않았기 때문에 모든 브라우저들에서 동일한 효과를 보이지 않습니다. 때문에 브라우저에서 `CSS3`를 테스트하기 위해서 접두어를 붙이는 방식으로 사용된다. 이것이 밴더프리픽스이다.
```html
<!DOCTYPE html>
<html lang="ko" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>
    <script src="prefixfree.min.js"></script>
    <style>
        *{margin:0; padding:0;}
        #wrap{position:relative;}
        #wrap #rec {
            background-color: yellow;
            width:100px; 
            height:100px;
            line-height:100px;
            text-align:center;
            animation-name:ani1;
            animation-duration:2s;
            animation-timing-function:ease-in;
 }
        @keyframes ani1{ /*키 프레임 규칙 */
            from {width:100px;height:100px;}
            to { width:500px;height:500px;}
        }
        #wrap #cir{
            background-color:mediumpurple;
            width:100px;
            height:100px;
            line-height:100px;
            text-align:center;
            position:absolute;
            left:0;
            top:110px;
            border-radius:100px;

            animation-name:ani2;
            animation-duration:2s;
            animation-timing-function:ease-in;
        }
        @keyframes ani2{
            from {left:0px; top:110px; transform:rotate(0deg);}
            to { left:400px; top:210px; transform:rotate(360deg);}
        }
    </style>
</head>
<body>
    <div id="wrap">
        <div id="rec">rec</div>
        <div id="cir">cir</div>
    </div>    
</body>
</html>
```
- 또 다른 예제
  > 애니메이션 효과가 모든 브라우저에서 완벽하게 지원되지 않는다. 밴더프리픽스를 걸어야지 모든 브라우저에서 애니메이션 효과가 나타난다.
```html
<!DOCTYPE html>
<html lang="ko" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>
    <script src="prefixfree.min.js"></script>
    <style>
        *{margin:0; padding:0;}
        li{list-style:none;}
        #wrap {
            width:1000px;
            margin:0 auto;
            position:relative;
        }
        #wrap #lnb { 
            width:250px;
            background-color:lightyellow;
        }
        #wrap #lnb ul li a{
            width:100px;
            height:50px;
            line-height:50px;
            border-radius:10px;
            margin-top:2px;
            display:block;
            padding:10px 25px;
            background-color:yellow;
            color:white;
            font-weight:bold;
        }
        #wrap #lnb ul li a:hover{
            animation-name:ani;
            animation-duration:2s;
            animation-iteration-count: infinite;
        }
        @keyframes ani{
            from{
                width:100px;
            }
            to{
                width:200px;
                background-color:orange;
            }
        }
        #wrap #rec {
            position:absolute;
            left:0;
            width:100px;
            height:100px; 
            line-height:100px;
            border-radius:10px;
            text-align:center;
            background-color:yellow; 
            animation-name: rec_ani;
            animation-duration:2s;
            animation-iteration-count:infinite;
            animation-direction:alternate; /*애니매이션 진행했다가 다시 역방향으로 진행*/
        }
        #wrap #rec:hover{animation-play-state:paused;}
        @keyframes rec_ani{
            from{
                width:100px;
                left:0;
                transform:rotate(0deg);
            }
            to {
                width:500px;
                height:200px;
                border-radius:100px;
                line-height:200px;
                background-color:saddlebrown;
                left:500px;
                transform:rotate(360deg);
                font-size:4em;
                 
            }
        }
    </style>
</head>
<body>
    <div id="wrap">
        <div id="lnb">
            <ul>
                <li><a href="#none">lnb01</a></li>
                <li><a href="#none">lnb02</a></li>
                <li><a href="#none">lnb03</a></li>
                <li><a href="#none">lnb04</a></li>
                <li><a href="#none">lnb05</a></li>
            </ul>
       </div>
        <div id="rec">rec</div>
    </div>
</body>
</html>
```
3. 변환 속성
> 과거 `Java Script`에서만 구현이 가능한 변환 기능을 이제는 `CSS3`에서도 구현이 가능합니다. 키프레임 애니메이션에 변환 속성을 응용할 수도 있습니다. 어떠한 태그의 속성을 변환시키는 기능
> - 변환함수
> - `translate(x,y)` - 이동
> - `translateX` - X 이동
> - `translateY` - Y 이동
> - `scale(x, y)` - 크기
> - `scaleX` - X축 크기
> - `scaleY` - Y축 크기
> - `skew(x, y)` - 기울이기
> - `skewX` - X축 기울이기
> - `skewY` - Y축 기울이기
> - `rotate(n)` - 회전
```html
<!DOCTYPE html>
<html lang="ko" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>
    <script src="prefixfree.min.js"></script>
    <style>
        #content_wrap1{
            width:200px;
            height:200px;
            border:5px solid red;
        }
        #content_wrap1 .content_tran {
            width:200px;
            height:200px;
            line-height:200px;
            text-align:center;
            background-color:blue;
            opacity:0.5;
            transform:rotate(45deg) skew(20deg) scale(2);
        }
        #content_wrap2{
            width:200px;
            height:200px;
            border:5px solid red;
        }
        #content_wrap2 .content_tran {
            width:200px;
            height:200px;
            line-height:200px;
            text-align:center;
            background-color:yellow;
            opacity:0.5;
            transform: rotate(270deg) scale(1.5);
            transform-origin:top right;
        }
    </style>
</head>
<body>
    <div id="content_wrap1">
        <div class="content_tran">content1</div>
    </div>
    <br /><br /><br /><br /><br /><br />
    <div id="content_wrap2">
        <div class ="content_tran">content2</div>
    </div>
</body>
</html>
```
```html
<!DOCTYPE html>
<html lang="ko" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>
    <script src="prefixfree.min.js"></script>
    <style type="text/css">
        * {margin:0; padding:0; }
        li {list-style:none;}
        a {text-decoration:none;}
        #lnb {
            width:800px;
            height:500px;
            margin:0 auto;
        }
        #lnb ul { }
        #lnb ul li{float:left;}
        #lnb ul li a{
            display:block;
            padding: 5px 60px;
            background-color:darkseagreen;
            color:white;
        }
        #lnb ul li:nth-child(1) a:hover{ 
            background-color:red; 
            transform:scale(2);
            transform-origin:100% 0; 
            z-index:9999;
        }
        #lnb ul li:nth-child(2) a:hover { 
            background-color:yellow;
            transform:rotate(10deg); z-index:9999;
        }
        #lnb ul li:nth-child(3) a:hover { 
            background-color:greenyellow;
            transform:skewX(-15deg);
            z-index:9999;
        }
        #lnb ul li:nth-child(4) a:hover { 
            background-color: aquamarine; 
            transform:scale(2) rotate(5deg) skewX(-15deg);
            transform-origin: 50% 0; 
            z-index:9999;
        }
        #lnb ul li:nth-child(5) a:hover {
            animation-name:ani;
            animation-duration:2s;
            animation-iteration-count:infinite;
            animation-direction:alternate
        }
        @keyframes ani{
            from{}
            to{
                background-color:yellow;
                transform: scale(2) rotate(5deg) skewX(-15deg);
                transform-origin:50% 0;
                z-index:9999;
            }
        }
    </style>
</head>
<body>
    <div id="lnb">
        <ul>
            <li><a href="#">lnb1</a></li>
            <li><a href="#">lnb2</a></li>
            <li><a href="#">lnb3</a></li>
            <li><a href="#">lnb4</a></li>
            <li><a href="#">lnb5</a></li>
        </ul>
    </div>
</body>
</html>
```
4. `CSS3` 규칙
 > 1. `CSS`파일 분리 : `CSS`를 `HTML` 문서에서 분리하여 별도로 관리할 수 있습니다
```html
<link rel="stylesheet" href="initialcode.css" />
<link rel="stylesheet" href="header.css" />
```
 > 2. `@import` 규칙
 > > `CSS`3에서 `@` 시작하는 키워드들을 규칙이라 합니다.<br/> `@keyframe`도 규칙입니다. `@import` 규칙은 다음과 같은 한계를 갖습니다
 ```html
<style>
 @import url(‘title.css’);
</style>
```

- `link`를 대신할 수 있습니다.
- `<style>`태그 내부에 위치해야 합니다.
- `<style>`태그 상단에 위치해야 합니다.

> 3. `@media` 규칙
> > `link`태그에 `media`속성을 이용하여 상황에 따른 `CSS`를 적용할 수 있습니다
- 미디어 종류 
- `all` : 모든 미디어 타입
- `aural` : 음성 합성 장치
- `braille` : 점자 표시 장치
- `handheld` : 손으로 들고 다니면서 볼 수 있는 작은 스크린에 대응하는 용도
- `print` : 인쇄 용도
- `projection` : 프로젝터 표현 용도
- `screen` : 컴퓨터 스크린을 위한 용도
- `tv` : 음성과 영상이 동시 출력되는 TV와 같은 장치
- `embossed` : 페이지에 인쇄된 점자 표지 장치
우리가 쓰는 디바이스의 종류는 상당히 많다. 단말기의 사이즈도 다양하고 웹 페이지를 만들면 디바이스에 따라 달리 보여야 한다. (배경 그래픽 체크 여부 확인하자)
```html
<!DOCTYPE html>
<html lang="ko" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>
    <style type="text/css">
        *{ margin:0; padding:0}
        #wrap {
            width:800px;
            margin:0 auto;
            border:1px solid #cccccc;
            padding:10px;
        }
        #hr {
            margin:10px 0;
        }
        /*
        #wrap .title{text-align:center;height:100px;line-height:100px; text-decoration:underline;}
        #wrap .content {background-color:darkgreen; color:white; padding: 30px 10px;}
        #wrap .date{ height:70px; padding-top:30px;text-align:center;}*/
    </style>
    <link rel="stylesheet" href="css/title.css" />
    <link rel="stylesheet" href="css/content-pc.css" media="screen"/>
    <link rel="stylesheet" href="css/content-pc.css" media="print" />
    <link rel="stylesheet" href="css/content-pc.css" media="handheld" />
    <link rel="stylesheet" href="css/date.css" />
</head>
<body>
    <div id="wrap">
        <div class="title">
            <h1>NOTICE</h1>
        </div>
        <hr />
        <div class="content">
            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.
            </p>
        </div>
        <div class="date">
            <p>2019. 01.21<br />write by Hong Gil-Dong</p>
        </div>
    </div>
</body>
</html>
```
```html
<style>
    @media screen{
        #wrap .content {
            background-color:darkgreen; 
            color:white; 
            padding: 30px 10px;
        }
    }
    @media print{
        #wrap .content { 
            color:black; 
            padding: 30px 10px;
        }
    }
<style> 
```
위와 같이 변경도 가능

5. 반응형 웹
> 예전엔 PC환경에서 주로 웹문서를 봤으나 최근 새롭게 웹문서를 접근하는 것이 PC환경 외 스마트폰 테블릿 등 소형 디바이스 환경이 넓혀지고 있다. PC 환경과 소형디바이스 영향력이 미치고 있다. 이젠 PC 전용 문서가 많고 어디서 출력될 것인지 따라 고민을 많이 해야 한다.
```html
<!DOCTYPE html>
<html lang="ko" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" name="viewport"
      content="width=device-width, initial-scale=1.0"/>
    <title></title>
    <style>
        @media screen and (max-width:767px) {
            #wrap { 
                width: 100%;
                background-color: lightyellow;
            }
            #wrap #nav ul li:last-child{display:none;}
            #wrap #nav ul li{width:25%;}
            #wrap #content p {font-size:1.5em;}
        }
        @media screen and (min-width:768px) and (max-width:959px){
            #wrap { 
                width:100%; 
                background-color:aqua;
                opacity:0.8;       
            }
            #wrap #nav ul li{
                width:20%;
            }
        }
        @media screen and (min-width:960px){
            #wrap {width:800px; }
            #wrap #content {background-color:coral;}
            #wrap #nav ul li{width:20%;}
        }
        *{margin:0; padding:0;}
        li{list-style:none;}
        a {
            text-decoration:none;
            display:block;
            color:black;
        }
        #wrap{ margin:0 auto;}
        #wrap #header {
            border:1px solid lightgray;
            height:100px;
            text-align:center;
            line-height:100px;
        }
        #wrap #nav ul{ 
            overflow:hidden; 
            border:1px solid lightgray;
        }
        #wrap #nav ul li {
            float: left;
            height:60px;
            line-height:60px;
            text-align:center;
            border: 1px solid gray;
            box-sizing:border-box;
        }
        #wrap #content {
            border: 1px solid lightgray;
            padding:10px;
        }
        #wrap #content > h2 {
            text-align:center;
            color:darkolivegreen;
        }
        #wrap #footer {
            border:1px solid lightgray; 
            height:100px;
            text-align:center; 
            line-height:100px;
            font-size: 1.2em;
        }
    </style>
</head>
<body>
    <div id="wrap">
        <div id="header"><h1>웹표준 반응형</h1></div>
        <div id="nav">
            <ul>
                <li><a href="#m1">menu1</a></li>
                <li><a href="#m2">menu2</a></li>
                <li><a href="#m3">menu3</a></li>
                <li><a href="#m4">menu4</a></li>
                <li><a href="#m5">menu5</a></li>
            </ul>
        </div>
        <div id="content">
            <h2>Why do we use it?</h2>
            <p>It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. </p>
        </div>
        <div id="footer">오범수</div>
    </div>
</body>
</html>
```