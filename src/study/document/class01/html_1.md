# HTML – I
목표 : 	글자관련태그, 목록 태그, 표 태그, 이미지태그, 오디오,  비디오 태그

## 1. 태그란? 
> HTML문서를 구성하고 있는 요소 입니다.<br/>
> 이 태그는 열린태그와 닫힌태그로 나눠진다.<br/>
> 그리고 태그에는 이름과 속성, 속성값이 있습니다.<br/>
> 우리는 앞으로 태그에 대해서 학습하게 됩니다.<br/>
> 이러한 태그는 모두 W3C 재단에서 미리 정해놓았습니다.<br/>
> 우리는 그 정해 놓은 태그를 쓰면 됩니다.

```html
<!DOCTYPE html>
<html lang="ko" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>
	<style>
		body{background-color: #fff000;}
	</style>
</head>
<body>
	<!-- 열린 태그, 닫힌 태그가 있고, 이 둘은 쌍이다. 닫힌 태그가 필요없는 태그도 있긴 하다 -->
	<a href="http://www.naver.com/">
    <!-- 태그 이름 : A, 태그속성 :href, 태그값이 있다 -->
	<img src="https://blogfiles.pstatic.net/20150818_268/coucou616_1439909614466cVBc3_JPEG/%B3%D7%C0%CC%B9%F6.jpg" alt="네이버 로고"/>
	</a>
</body>
</html>
```
## 2. HTML 구조 
### 1. `<!DOCTYPE html>`
> 우선 첫번째 줄의 이 태그는 웹 브라우저가 현재 웹 페이지가 `HTML5` 문서임을 인식하게 만들어 줍니다.<br/>
> `W3C`의 `HTML5` 명세에 따르면 모든 `HTML5`문서는 반드시 `<!DOCTYPE html>`태그를 표기해야 합니다.<br/>
> 또한 반드시 문서의 가장 첫번째 줄에 있어야 합니다.<br/>

### 2. `<html  lang=”ko”>`
> `html`태그의 시작을 알리고 `lang` 속성을 입력할 수 있습니다.<br/>
> 이 `lang`속성은 실제 웹 브라우저가 동작하는데 어떠한 영향도 끼치지 않습니다.<br/>
> 대신 **구글**과 같은 검색 엔진이 웹 페이지를 탐색할 때 해당 웹 페이지가 어떠한 언어로 만들어져 있는지 쉽게 인식하게 만듭니다.<br/>
> 전 세계적인 데이터 네트워크 구축을 위해서는 `lang` 속성을 입력하는 것이 좋겠습니다.
> > |code| national|
> > |:-:|:-:|
> > |ko|한국|
> > |en|미국|
> > |ja|일본|
> > |ru|러시아|
> > |zh|중국|
> > |de|독일어|

### 3.`<head>  …  </head>`
> 이 문서의 정보인 `title`이나 설정값들인 `css`, `javaScript`등의 환경설정에 관한 정보를 넣는다.<br/>
> `Head` 태그 내부에는 다음의 태그들만 넣을 수 있고 그 외 태그를 넣으면 웹 브라우저가 자동으로 해당 태그를 `body`내부로 옮깁니다<br/>
> > `meta` : 웹 페이지에 추가 정보를 전달<br/>
> > `title` : 엡 페이지의 제목<br/>
> > `script` : 웹 페이지에 스크립트를 추가<br/>
> > `link` : 웹 페이지에 다른 파일을 추가<br/>
> > `style` : 웹 페이지의 스타일시트를 추가

### 4. `<body>  …  </body>`
> 사용자에게 보이는 웹 문서 실제 정보

## 3. 글자에 관련된 태그 : `H1~6`(제목), `p`(본문), `br`(개행), `a`(앵커), `b`, `i`, `sup`, `ins`, `del` 태그
```html
<!doctype html>
<html lang="ko">
 <head>
  <meta charset="UTF-8">
  <title>글자관련 태그</title>
 </head>
 <body>
	<h1 id="top">h1 태그입니다. 해더를 의미하는 태그이므로 개행포함</h1>
	<h2>h2 태그입니다</h2>
	<h3>h3 태그입니다</h3>
	<h4>h4 태그입니다</h4>
	<h5>h5 태그입니다</h5>
	<h6>h6 태그입니다</h6>
	<p>주로 본문에 사용되는 태그<br/>로 단락 구분이 됩니다. 하나의 단락 문단이 이루는 
	태그 기본은 16pixel의 크기를 갖는다.</p>
	<p>주로 본문에 사용되는 태그로 단락 구분합니다.</p>
	<p>주로 본문에 사용되는 태그로 단락 구분이 됩니다.<br/> 행바꿈 태그</p>
	<p align="center">주로 <b>본문</b>에 사용되는 태그로 단락을 구분합니다. 단락이므로 개행이 포함됩니다</p>
	<p><a href="http://www.google.com" target="_blank">구글 웹 사이트</a>로 hyper link 이동. 어디로 가는지
	href속성값을 지정한다. 경로를 프로토콜까지 기입해야 한다</p>
	<p><i>KOREA(이태릭체)</i></p>
	<p>KOREA <sup>SEOUL</sup></p>
	<p>KOREA <sub>SEOUL</sub></p>
	<p><ins>KOREA(언더라인)</ins></p>
	<p><del>DELETE</del></p>
	<ruby>
		<span>大韓民國</span>
		<rt>대한민국</rt>
	<ruby><br><br>
	<food>food 태그와 rice 태그는 웹 표준에서 정하지 않은 태그입니다<food><br>
	<rice>하지만 코드는 문제없이 실행됩니다</rice><br><br>
	<a href="#top">위로</a> 페이지 내부 맨 위로 이동
 </body>
</html>
```

## 4. 목록 태그 – `ul`, `ol`, `dl`
> - `ul` : 순서가 없는 목록 태그
> - `ol` : 순서가 있는 목록 태그
> - `li` : 목록 요소
> - `dl` : 정의목록태그
> - `dt` : 정의 용어 태그
> - `dd` : 정의 설명 태그
```html
<!DOCTYPE html>
<html lang="ko" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title>목록태그</title>
</head>
<body>
	<p>메뉴리스트</p>
	<ul type="square"> <!-- disc(검은원), circle(흰원), square -->
		<li>menu1</li>
		<li>menu2</li>
		<li>menu3</li>
		<li>menu4</li>
	</ul>
	<p>지역 리스트</p>
	<ol type="a" start="2"> <!-- type= a, A, i, I, 1 -->
		<li>서울</li>
		<li>경기</li>
		<li>충청</li>
		<li>전라</li>
		<li>경상</li>
		<li>강원</li>
	</ol>
	<p>검색사이트 리스트</p>
	<ol>
		<li><a href="http://www.google.com" target="_blank">google</a></li>
		<li><a href="http://www.yahoo.com" target="_self">yahoo</a></li>
	</ol>
	<dl>
		<dt>HTML5</dt>
        	<dd>Multimedia tag 포함되어 플러그인이 필요없다</dd>
        	<dd>디바이스에 따라 달리 반응한다</dd>
		<dt>목록태그(dt는 상단 타이틀 역할)</dt>
		<dd>정의목록(dl)과 일반목록(ol, ul)은 용도에 맞게 잘 사용한다.</dd>
		<dd>정의목록은 dl(definition list), dt(definition term=title), dd(definition description)</dd>
	</dl>
</body>
</html>
```

## 5. 표를 나타내는 태그 – `table`
> 표형식의 레이아웃을 만드는 태그로, 예전에는 웹사이트의 전체적인 레이아웃을 만들었으나 현재는 회원가입폼이나 로그인폼, 게시판폼 등에 다양하게 사용된다.
> > 1. `tr` : 표 내부의 행 태그
> > 2. `th` : 행 내부의 열. 제목 셀 태그
> > 3. `td` : 행 내부의 열. 일반 셀 태그
```html
<!DOCTYPE html>
<html lang="ko" xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta charset="utf-8" />
        <style>
            body{
                background-color: lightyellow;
                font-size:9pt;
            }
            table{
                background-color: red;
            }
            tr:hover{background-color:orange;}
            tr{background-color:yellow;}
            caption{font-size:12pt;}
        </style>
        <title></title>
    </head>
    <body>
        <table>
            <tr>
                <td rowspan="3">1행1열</td>
            </tr>
            <tr>
                <td>2행2열</td>
                <td>2행3열</td>
                <td>2행4열</td>
            </tr>
            <tr>
                <td>3행2열</td>
                <td>3행3열</td>
                <td>3행4열</td>
            </tr>
        </table>
    </body>
</html>
```

```html
<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
	<style>
        body{
            background-color: lightyellow;
            font-size:9pt;
        }
        table{
            background-color: red;
        }
        tr:hover{background-color:orange;}
        tr{background-color:yellow;}
        caption{font-size:12pt;}
    </style>
    <title>테이블 태그</title>
</head>
<body>
	<table>
		<caption>table ex2</caption>
		<tr>
			<th>국어</th>
			<th>영어</th>
			<th>수학</th>
		</tr>
		<tr>
			<td>100</td>
			<td>60</td>
			<td>80</td>
		</tr>
		<tr>
			<th colspan="2">평균</th>
			<td>80</td>
		</tr>
	</table>
</body>
</html>
```
```html
<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <style>
        body{
            background-color: lightyellow;
            font-size:9pt;
        }
        table{
            background-color: red;
        }
        tr:hover{background-color:orange;}
        tr{background-color:yellow;}
        caption{font-size:12pt;}
    </style>
    <title>테이블 태그</title>
</head>
<body>
	<table>
		<caption>table ex3</caption>
		<tr>
			<th rowspan="3">중간고사성적</th>
			<th>국어</th>
			<th>영어</th>
			<th>수학</th>
		</tr>
		<tr>
			<td>100</td>
			<td>60</td>
			<td>80</td>
		</tr>
		<tr>
			<th colspan="2">평균</th>
			<td>80</td>
		</tr>
	</table>
</body>
</html>
 ```

## 6. 이미지를 출력하는 태그 – `img`
> -	`src` : 이미지의 경로 지정
> - `alt` : 이미지가 없을 때 나오는 글자 지정
> - `width` : 이미지의 너비 지정 (css 부분에 설정해주는 경우가 더 많다)
> - `height` : 이미지의 높이 지정 (css 부분에 설정해주는 경우가 더 많다)
> 
```html
<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>
</head>
<body>
	<p><img src="img/html_is_not_program_language.jpg" alt="HTML은 프로그램언어가 아닙니다."></p>
	<p><img src="img/why_it_work.jpg" alt="이게 왜 되지?"></p>
	<p><img src="img/WTF.jpg" alt="어?!금지"></p>
	<p><img src="img/WTF.jpg" alt="설현1" width="100"></p>
	<p><img src="img/WTF.jpg" alt="설현1" width="50" height="100"></p>
<!--요즘 width는 css에서 주로 조정-->
	<p><img src="http://cafefiles.naver.net/20160322_244/alsdnr0054_14586562713882lIBe_JPEG/Na1458656261413.jpg" alt="웹설현"></p>
</body>
</html>
```

## 7. 오디오 태그 – `audio`
> 1. 사운드를 출력하기 위한 태그로써 `HTML5`에 추가된 기능이므로 인터넷 **익스플로러 8 이하**에서는 사용할 수 없습니다.<br/>
> 익스플로러 8이하의 과거에는 사운드를 출력하기 위해서는 외부 플러그인을 사용하였다.<br/>
> HTML5에서는 별도의 플러그인 없이 `audio` 태그만으로 사운드를 출력할 수 있다
> 2. `src` : 오디오 파일의 경로 지정
> 3. `preload` : 오디오를 재생하기 전에 모두 불러올지 지정
> 4. `autoplay` : 오디오를 자동 재생할지 지정
> 5. `loop` : 오디오를 반복할지 지정
> 6. `conrols` : 오디오 재생 도구를 출력할지 지정
```html
<!DOCTYPE html>
<html lang="ko" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>
</head>
<body>
    스티브 잡스 스탠포드 연설문 도입부<br />
    <audio src="sound/stevejobs1.mp3" preload="auto" controls="controls" loop="loop"></audio>
    <br />
    스티브 잡스 스탠포드 연설문 후반부<br />
    <audio src="sound/stevejobs2.mp3" controls="controls" autoplay="autoplay" loop="loop"/>    
</body>
</html>
```

## 8. 동영상을 출력하는 태그 - `video`
> 1. `src`
> 2. `poster` : 비디오 준비 중일 때의 이미지 파일 경로 지정
> 3. `preload` : 비디오를 재생하기 전에 모두 불러올지 지정
> 4. `autoplay` : 비디오를 자동 재생할지 지정
> 5. `loop` : 비디오를 반복 재생할지 지정
> 6. `controls` : 비디오 재생 도구를 출력할지 지정
> 7. `width` : 비디오의 너비를 지정
> 8. `height` : 비디오의 높이를 지정
```html
<!DOCTYPE html>
<html lang="ko" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title>동영상 출력</title>
</head>
<body>
    <video controls="controls" width="200" autoplay="autoplay" loop="loop">
        <source src="video/sonatina.mp4" type="video/mp4" />
    </video>
    <br/>
    <video src="video/sonatina.mp4" type="video/mp4" controls="controls" width="200" />
</body>
</html>
```