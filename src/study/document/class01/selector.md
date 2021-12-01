# CSS 선택자
1. 선택자란? `HTML` 문서 중 특정 부분을 선택하여, 해당 부분의 속성을 변경하는 목적으로 사용 (`CSS`를 사용하는 이유)
```html
<!DOCTYPE html>
<html lang="ko" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title>선택자 예제</title>
    <style type="text/css">
        div {
            background : #ffd800;
            border : pink solid 5pt;
        }
        h1 {
           background-color: #f7fac9;
        }
    </style>
</head>
<body>
    <h1>제목입니다</h1>
    <p>본문입니다</p>
    <div align="center">
        <h1>제목입니다</h1>
        <p>본문입니다</p>
    </div>
    <br /><br />
    <div>
        여기도 div입니다
    </div>
</body>
</html>
```
2. `tag` 선택자란?
> 특정 태그를 선택하여 CSS속성을 적용할 수 있다.
```html
<!DOCTYPE html>
<html lang="ko" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>
    <style type="text/css">
        header {
            color:#0d24f2;
        }
        li, p {
            color : #ffd800;
            background-color: pink;
            font-weight: bold; /* 글씨 진하게 */
        }
        p{
            background-color: chocolate;
        }
        footer {
            border:1px dashed #0d24f2; 
        }
    </style>
</head>
<body>
    <header>
        <h1>OO 주식회사</h1>
    </header>
    <nav>
        <ul>
            <li>회사소개</li>
            <li>제품소개</li>
            <li>고객센터</li>
            <li>공지사항</li>
        </ul>
    </nav>
    <section>
        <p>우리 회사는 50년 전통의 역사와 뛰어난 기술을 바탕의 좋은 회사입니다.</p>
    </section>
    <footer>
        <p>서울시 oo구 oo동 oo빌딩</p>
    </footer>
</body>
</html>
```

3. `*` 선택자? 전체라는 의미의 `*` 선택자를 사용하면 문서 전체를 선택하는 의미가 있다.
```html
<!DOCTYPE html>
<html lang="ko" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>
    <style type="text/css">
        * {
            color: #ffd800;
            margin:0;
            padding:0;
        }
        p {  color: black; }
    </style>
</head>
<body>
    <header>
        <h1>OO 주식회사</h1>
    </header>
    <nav>
        <ul>
            <li>회사소개</li>
            <li>제품소개</li>
            <li>고객센터</li>
            <li>공지사항</li>
        </ul>
    </nav>
    <section>
        <p>우리 회사는 50년 전통의 역사와 뛰어난 기술을 바탕의 좋은 회사입니다.</p>
    </section>
    <footer>
        <p>서울시 oo구 oo동 oo빌딩</p>
    </footer>
</body>
</html>
```

4. 전체와 특정태그의 혼합
> 전체적으로 속성을 설정한 다음 특정 태그의 속성을 변경한다
```html
<!DOCTYPE html>
<html lang="ko" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>
    <style type="text/css">
        * {
            font-size: large;
            color: #057117;
        }
       p{
            font-size: small;
            color:#343434;
        }
        h1 {
            text-decoration:underline;
        }
    </style>
</head>
<body>
    <h1>web과 html</h1>
    <p>Web(웹)이란, 사전적인 의미로 거미줄이란 뜻으로 하나의 사이트나 또는 다른 사이트와의 관계가 거미집처럼 복잡하게 얽혀 있는 것에 비유하여 부르게 되었습니다. <br />
    IT에서는 WWW(world wide web) 의 줄임말로 사용됩니다. 전 세계의 컴퓨터들을 연결하여 정보 공유를 하는데 주 목적이 있습니다.<br />
    </p>
</body>
</html>
```

5. id(`#`)와 class(`.`) : 태그의 `id`와 `class`를 이용하여 `CSS`에 속성을 설정할 수 있다.
```html
<!DOCTYPE html>
<html lang="ko" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>
    <style type="text/css">
        #header {
            width:600px;
            background-color: #ffd800;
            border: 1px solid #808080;
            text-align:center;
        }
        #wrap{
            width: 600px;
            background-color: #66dbf6;
            border: 2px solid #808080;
            text-align: center;
            overflow: hidden;
        }
        #content{
            width: 350px;
            border: 1px solid red;
            float: left;
        }
        #side_banner{
            border: 1px solid red;
            float: left;
        }
        #footer{
            clear: both;
            width: 600px;
            background-color: #ffd800;
            border:3px solid #808080;
            text-align:center;
        }
        .menu1 {
            color: #1822e2;
            font-weight: bold;
        }
        .menu1, .menu3, .menu5{
            font-size:20px;
        }
    </style>
</head>
<body>
    <div id="header">
        <h1>HEADER</h1>
    </div>
    <div id="wrap">
        <div id="content">
            <h1>CONTENT</h1>
            <ul>
                <li class="menu1">menu1</li>
                <li class="menu2">menu2</li>
                <li class="menu3">menu3</li>
                <li class="menu4">menu4</li>
                <li class="menu5">menu5</li>
            </ul>
        </div>
        <div id="side_banner">
            <h1>BANNER</h1>
            <a href="http://www.naver.com" target="_blank">
               <img src="http://img.naver.net/static/www/u/2013/0731/nmms_224940510.gif">
            </a>
        </div>
    </div>
    <div id="footer">
        <h1>FOOTER</h1>
    </div>
</body>
</html>
```

6. `tag`, `id`, `class` 혼합
> `tag`, `id`, `class`를 혼합하여 `CSS`에서 속성을 설정할 수 있다.
```html
<!DOCTYPE html>
<html lang="ko" xmlns="http://www.w3.org/1999/xhtml">
<head>
  <meta charset="utf-8" />
  <title></title>
	<style>
	   #header, #footer{
            width: 600px;
            background-color: yellow;
            border: 1px solid #808080;
		text-align:center;
        }
        #wrap{
            width:600px;
            background-color:aquamarine;
            border: 2px solid red;
            text-align:center; /* text 가운데 정렬 */
            overflow: hidden; /* 꼭 (왼쪽에 content, 오른쪽에 banner)*/
        }
        #content{
            width:350px;
            border:1px solid green;
            float: left;
        }
        #side_banner{
            width:240px;
            border:1px solid green;
            float: left;
        }
        #footer{
            clear:both;
        }
        li.menu1,  li.menu2{
            color: orange;
            font-weight:bold;
            font-size:25px;
        }
        ul li.menu2{
            color : blue;
        }
	</style>
</head>
<body>
	<div id="header">
    <h1>HEADER</h1>
  </div>
  <div id="wrap">
    <div id="content"> <!--좌측-->
			<h1>CONTENT</h1>
      <ul>
				<li class="menu1">menu1</li>
				<li class="menu2">menu2</li>
				<li class="menu1">menu1</li>
			</ul>
			<ol>
				<li class="menu1">menu1</li>
				<li class="menu2">menu2</li>
				<li class="menu1">menu1</li>
			</ol>
		</div>
    <div id="side_banner">
			<h1>BANNER</h1>
			<a href="http://www.mega-it.co.kr">
				<img src="http://www.mega-it.co.kr/images/mega_logo.png" />
			</a>
		</div>
    </div>
  <div id="footer">
		<p>서울시 종로구 삼일대로 17길 51 스타골드 BD 3층</p>
	</div>
</body>
</html>
```

7. 속성 선택자 : `tag`의 속성을 선택하여 CSS의 속성을 설정할 수 있다.
  1. 선택자`[속성=값]``[속성=값]` : 속성안의 값이 특정 값을 단어로 포함
  2. 선택자`[속성^=값]` : 속성안의 값이 특정 값으로 시작
  3. 선택자`[속성$=값]` : 속성안의 값이 특정값으로 끝나는 경우
```html
<!DOCTYPE html>
<html lang="ko" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>
    <style type="text/css">
        body { 
	        background-color: #FFF0B5; 
	        font-size: 9pt; 
        }
        input{
            color: green;
            font-size:30px;
            font-weight: bold;
        }
        input[type=text]{
            color:orange;
            font-size: 50px;
            width: 300px;
        }
        input[type=tel]{
            color:red;
        }
        img[src]{ /*img의 src속성 선택 */
            border: 5px solid green;
        }
    </style>
</head>
<body>
    <form>
        <p>이름 : <input type="text" /></p>
        <p>아뒤 : <input type="text" /></p>
        <p>비번 : <input type="password" /></p>
        <p>전화 : <input type="tel" /></p>
    </form>
    <img src=" sulhyun.jpg" alt="설현" />
</body>
</html>
```
 
8. 후손 및 자손 선택자
> `tag`의 속성을 선택하여 `CSS`의 속성을 설정할 수 있다.
```html
<!DOCTYPE html>
<html lang="ko" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>
    <style type="text/css">
        #header, #wrap, #footer {
            border:1px solid #cccccc;
            width: 700px;
        }
        div li {  /*후손선택자*/
            background-color: red;
        }
        div  p { /*후손선택자*/
            font-size: 25px;
        }
	div > p { /*자손선택자*/
	    color:blue;
	}
        div > h1{ /*자손선택자*/
            font-weight: bold;
            color:yellow;
        }
    </style>
</head>
<body>
    <div id="header">
        <div class="logo">
            <h1>LOGO</h1>
        </div>
        <div class="copy">
            <h2>소셜 벤쳐</h2>
        </div>
    </div>    
    <div id="wrap">
        <p>예비 창업가 혹은 기존 벤처 사업가들이 자신의 사업 아이템과 
        Solution 을 기반으로 SE/ 소셜 벤처 창업에 나서는데 도움이 될 수 
        있도록, SE 및 소셜 벤처 BM을 유형화 하고 창업 가이드를 정리하여 
        제시 </p>
        <ul>
            <li><p>사회적문제 해결</p></li>
            <li><h1>사회적 기업 소셜 창업</h1></li>
            <li><p>장기적 협력 관계</p></li>
        </ul>
    </div>
    <header id="footer">
        <p>서울시 종로구 삼일대로 17길 51 스타골드BD 3층 </p>
    </header>
</body>
</html>
```

9. 동위(=형제) 선택자(+하나만, ~다선택)
> 태그의 동등한 위치를 판단하여 CSS속성을 설정할 수 있다.
```html
<!DOCTYPE html>
<html lang="ko" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>
    <style type="text/css">
        h3~div{   /*h3아래의 동등한 위치에 있는 것 중에 div는 다 선택*/
            font-size:10px;
            color:orange; 
        }
        h3+div{   /*h3아래의 동등한 태그 중 h3와 바로 근접한 아래 쪽 div 하나만 선택*/
            font-size:20px;
            font-weight: bold;
            color:blue;
        } 
        #title~div{    /*title아래의 동등한 위치 div 다 선택*/
            width: 300px; /**/
            background-color:yellow;
        }
    </style>
</head>
<body>
    <div>실험</div>
    <h3 id="title">동위 선택자(+,~)</h3>
    <div>div_01</div>
    <div>div_02</div>
    <div>div_03</div>
    <div>div_04</div>
    <div>div_05</div>
</body>
</html>
```
10.	반응 선택자 
> 마우스를 올려 놓았을 때(`hover`상태)의 반응에 따른 속성을 설정할 수 있다
```html
<!DOCTYPE html>
<html lang="ko" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>

    <style type="text/css">
        div{
            width:300px;
            margin: 0 auto; /*값이 4개면 상, 하, 우, 좌 두개면 좌우균등정렬*/
            background-color: red;
        }
        ul > li {
            font-size:20px;
            font-weight:bold;
            color:orange;
        }
        li:hover {
            color:blue;
            font-size:.5em;
        }
    </style>

</head>
<body>

    <div>
        <ul>
            <li>Java</li>
            <li>Oracle</li>
            <li>My SQL</li>
            <li>HTML</li>
            <li>CSS</li>
        </ul>
    </div>
</body>
</html>
```

※ 다음과 같은 테이블에 마우스를 올려놓으면 초록색으로 반응하는 페이지를 만들어 보시오.
```html
<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>
    <style>
        table{
            border: 1px solid green;
            background-color: lightyellow;
            font-size: 30px;
        }
        tr:hover{
            background-color:green;
            color:white;
        }
    </style>
</head>
<body>
    <table>
        <tr><td>1행1열</td><td>1행2열</td></tr>
        <tr><td>2행1열</td><td>2행2열</td></tr>
        <tr><td>3행1열</td><td>3행2열</td></tr>
        <tr><td>4행1열</td><td>4행2열</td></tr>
    </table>
</body>
</html>
```

11.	상태 선택자 
> 상태에 따라 CSS속성이 변화하는 설정을 할 수 있다.  `ex. input태그의 경우 focus가 맞혀졌을 때`
```html
<!DOCTYPE html>
<html lang="ko" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>
    <style type="text/css">
        input:focus {
            border:2px dashed #ff0000;
            padding: 10px;
        }
        input:enabled {
            color : #00ff00;
            font-weight: bold;
        }
        input:disabled{
            color:#0000ff;
        }
    </style>
</head>
<body>
    <div>
        <form>
            이 름 : <input type="text" name="uname" /><br />
            아 뒤 : <input type="text" name="uid" /><br />
            주민번호 : <input type="password" name="upw" value="12345" disabled="disabled" /><br />
            <input type="submit" value="입력" />
        </form>
    </div>
</body>
</html>
```

12.	구조 선택자 
> 구조에 따라 CSS 속성이 변화하는 설정을 할 수 있다
```html
<!DOCTYPE html>
<html lang="ko" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>
    <style type="text/css">
        #wrap {
            width: 200px;
            margin: 0 auto;
        }
        #wrap ul li {
            list-style: none;
            border : 1px solid gray;
            background-color: #eeeeee;
            padding: 10px;
            text-align: center;
            font-size: 20px;
            font-weight: bold;
            margin: 2px;
        }
        #wrap ul li a {
            text-decoration: none;
            color: black;
        }
        #wrap ul li:nth-child(2n+1){
            background-color: orange;
        }
        #wrap ul li:first-child, #wrap ul li:last-child {
            background-color: yellow;
        }
        #wrap ul li:first-child{
            border-radius: 10px 10px 0 0;
                       /* 좌상 우상 우하 좌하*/
        }
        #wrap ul li:last-child{
            border-radius: 0 0 10px 10px;
        }
    </style>
</head>
<body>
    <div id="wrap">
        <ul>
            <li><a href="#">menu1</a></li>
            <li><a href="#">menu2</a></li>
            <li><a href="#">menu3</a></li>
            <li><a href="#">menu4</a></li>
            <li><a href="#">menu5</a></li>
            <li><a href="#">menu6</a></li>
            <li><a href="#">menu7</a></li>
            <li><a href="#">menu8</a></li>
        </ul>
    </div>
</body>
</html>
```
13.	전체적인 레이아웃 설정 
> 지금까지 살펴본 내용을 바탕으로 아래의 레이아웃을 설정해 봅니다
 
![이미지](../../img/class01/example.jpg)


14.	문자 선택자
> 특정문자 또는 문자열을 선택하여 `CSS`속성을 설정할 수 있다
```html
<!DOCTYPE html>
<html lang="ko" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>
    <style type="text/css">
        #wrap {
            width: 800px;
            margin:0 auto;
        }
        #header {
            border-bottom : 1px solid #cccccc;
        }
        #history1:first-letter, #history2:first-letter {/* span태그를 이용할 수도 있으나 */
            font-size: 2em;
        }
        #history1:first-line, #history2::first-line{
            font-weight: bold;
            color:#041762;
        }
        #footer ul {
            overflow: hidden;
            border: 2px solid #cccccc;
        }
        #footer li{
            list-style:none;
            float:left;
            padding:5px;
        }
        
    </style>
</head>
<body>
    <div id="wrap">
        <div id="header">
            <h1>홍길동 고용노동부 설립개요</h1>
        </div>
        <div id="content">
            <p>시대는 조선시대. 직업은 농민무장대의 지도자</p>
            <p id="history1">
                1500년(연산군 6)을 전후하여 서울 근처에서 활약하던 농민무장대의 지도자. <br />
                양반지주층을 중심으로 토지소유가 확대되면서,
                토지를 잃고 지배층의 착취에 시달리던 농민들은 자기가 살던 곳에서 도망쳤다. 이들은 산속으로 피해 무장대의 기본성원이
                되어 양반지주나 관청을 습격했는데, 지배층들은 이들을 「도적」이라 했다.
            </p>
            <p id="history2">
                15세기 말에서 16세기 초 연산군 통치기간에는 전국 곳곳에서 <br />
                이러한 농민무장대가 일어났고, 그 가운데 대표적인 것이
                홍길동이 이끄는 무장대였다. 홍길동은 양반관리의 복장을 하고 스스로 「첨지」라 하면서 무장한 많은 농민을 지휘해
                여러 고을의 관청들을 습격했다. 결국 체포되어 의금부에서 취조당한 기록이 남아 있다. 뒤에 그에 대한 이야기는 <홍길동전>
                    으로 소설화되기도 한다.
            </p>
        </div>
        <div id="footer">
            <ul>
                <li><img src="logo.gif" alt="회사로고" /></li>
                <li><img src="address.gif" alt="회사주소" /></li>
            </ul>
        </div>
    </div>
</body>
</html>
```
> 문자선택자를 모르면 다음과 같이 할 수도 있다.
```html
<!DOCTYPE html>
<html lang="ko" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>
    <style>
        #wrap {
            width: 700px;
            margin: 0 auto;
        }

        #header {
            border-bottom: 1px solid lightgray;
        }
        
        #footer {
            border: 1px solid lightgray;
            height: 90px;
        }

        ul {
            overflow: hidden;
        }

            ul li {
                float: left;
                list-style: none;
                line-height: 70px; /* 상하 가운데 정렬하는 잔머리*/
                /* text-align: center는 좌우 가운데 정렬 */
            }

        #content p:nth-child(2)::selection {
            background-color: violet;
            color: yellow;
        }
        .fl{
            font-size:2em;
            color:blue;
            font-weight: bold;
        }
        .fline{
            color: blue;
            font-weight:bold;
        }
    </style>
</head>
<body>
    <div id="wrap">
        <div id="header">
            <h1>홍길동 고용노동부 설립개요</h1>
        </div>
        <div id="content">
            <p>조선 농민무장대의 지도자</p>
            <p class="history">
                <span class="fl">1</span><span class="fline">500년(연산군 6)을 전후하여</span><br />
                서울 근처에서 활약하던 농민무장대의 지도자. 양반지주층을 중심으로 토지
                소유가 확대되면서, 토지를 잃고 지배층의 착취에 시달리
                던 농민들은 자기가 살던 곳에서 도망쳤다. 이들은 산속
                으로 피해 무장대의 기본성원이 되어 양반지주나 관청을
                습격했는데, 지배층들은 이들을 「도적」이라 했다.
                15세기 말에서 [네이버 지식백과] 홍길동 [洪吉同]
                (한국고중세사사전, 2007. 3. 30., 가람기획)
            </p>
            <p class="history">
                <span class="fl">1</span><span class="fline"> 6세기 초 연산군 통치기간에는</span><br />
                전국 곳곳에서 이러한 농민무장대가 일어났고, 그 가운데
                대표적인 것이 홍길동이 이끄는 무장대였다. 홍길동은
                양반관리의 복장을 하고 스스로 「첨지」라 하면서
                무장한 많은 농민을 지휘해 여러 고을의 관청들을 습격했
                다. 결국 체포되어 의금부에서 취조당한 기록이 남아
                있다. 뒤에 그에 대한 이야기는 &lt;홍길동전&gt;
                으로 소설화되기도 한다.  [네이버 지식백과] 홍길동
                [洪吉同] (한국고중세사사전, 2007. 3. 30., 가람기획)
            </p>
        </div>
        <div id="footer">
            <ul>
                <li><img src="logo.gif" alt="회사로고" /></li>
                <li><img src="address.gif" alt="주소" /></li>
            </ul>
        </div>
    </div>
</body>
</html>
```

> 드래그 되어 있는 문자들의 속성을 설정할 수 있다
```css
#content p:first-child::selection, #content p:last-child::selection {
    background-color: yellow;
    color : green;
}
```

15.	링크 선택자
> 문서에 링크(`href`) 되어 있는 문자를 선택하여, CSS 속성을 설정할 수 있다
```html
<!DOCTYPE html>
<html lang="ko" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>
    <style type="text/css">
        a:link {text-decoration:none; color:green; }
        a:visited {text-decoration:none; color:yellow; }
        a:active {text-decoration:none; color:red; }
        a:hover {text-decoration:underline; color:black; }
    </style>
</head>
<body>
    <a href="http://www.daum.co.kr">다음</a> <br> 
    <a href="http://www.naver.com"> 네이버 </a> <br>
     <a href="http://www.yahoo.com"> 야후 </a> <br> 
</body>
</html>
```
```html
<!DOCTYPE html>
<html lang="ko" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>
    <style type="text/css">
        #wrap {
            width: 500px;
            margin: 0 auto;
        }
        #header {
            border-bottom: 1px solid #cccccc;
        }
        #content a {
            text-decoration:none;
        }
        #content a:after{
            content: ' - ' attr(href);
        }
        #content li {
            padding:2px;
        }
        #footer ul {
            overflow: hidden;
            border: 2px solid #cccccc;
        }

        #footer li {
            list-style: none;
            float: left;
            padding: 5px;
        }
    </style>
</head>
<body>
    <div id="wrap">
        <div id="header">
            <h1>Weekly connect website</h1>
        </div>
        <div id="content">
            <ul>
                <li><a href="http://www.naver.com" target="_blank">네이버</a></li>
                <li><a href="http://www.google.com" target="_blank">구글</a></li>
                <li><a href="http://www.tjoeunit.co.kr" target="_blank">더조은IT아카데미</a></li>
            </ul>
        </div>
        <div id="footer">
            <ul>
                <li><img src="logo.gif" alt="회사로고" /></li>
                <li><img src="address.gif" alt="회사로고" /></li>
            </ul>
        </div>
    </div>
</body>
</html>
```

16.	부정 선택자
> 나를 제외한 모든 태그에 CSS 속성을 적용할 수 있다
```html
<!DOCTYPE html>
<html lang="ko" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>
    <style>
        #wrap {
            width:800px;
            margin:0 auto;
        }
        #header {
            border-bottom:1px solid #cccccc;
        }
        #content a {
            text-decoration:none;
        }
        #content a::after {
            content: ' - ' attr(href);
        }
        #content li:not(.fa) {
            background-color:#ffd800;
        }
        #footer ul {
            overflow:hidden;
            border:2px solid #cccccc;
        }
        #footer ul li {
            list-style:none;
            float:left; padding:20px;
        }
    </style>
</head>
<body>
    <div id="wrap">
        <div id="header">
            <h1>Weekly connect website</h1>
        </div>
        <div id="content">
            <ul>
                <li><a href="http://www.naver.com" target="_blank">네이버</a></li>
                <li class="fa"><a href="http://www.google.com" target="_blank">구글</a></li>
                <li><a href="http://www.yahoo.com" target="_blank">야후</a></li>
                <li class="fa"><a href="http://www.tjoeunit.co.kr" target="_blank">더조은IT아카데미</a></li>
            </ul>
        </div>
        <div id="footer">
            <ul>
                <li><img src="logo.gif" alt="회사로고" /></li>
                <li><img src="address.gif" alt="회사로고" /></li>
            </ul>
        </div>
    </div>
</body>
</html>
```