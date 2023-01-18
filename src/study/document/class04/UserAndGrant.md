# 사용준비

## 1. 유저 생성
DataBase를 사용하기위해서는 root계정으로 핸들링하는것을 추천하지 않는다. 각 목적에 맞는 스키마를 정의하여 사용한다.

 최초 루트 계정으로 접속하여 계정을 생성한다.
``` terminal
mysql> create user 'study'@'%' identified by 'a1234';
```
- `create` : 새로운 데이터를 생성할때 사용하는 키워드
- `user` : 생성하고자 하는 스키마 타입
- `'study'@'%'` : 접속 ID가 `study` 이며 접속가능한 IP가 제한이 없음을 의미한다.
- `identified by` : 비밀번호를 정의하기위한 키워드
- `'a1234'` : 접속 비밀번호
- `;` : 터미널환경에서 쿼리를 수행할 때 무조건 세미콜론 (`;`)을 사용해야 쿼리가 끝난다.

## 2. DataBase 생성
데이터를 다루기위한 공간을 정의한다.
``` terminal
mysql> create database study;
```

## 3. 권한 부여
유저를 생성하면 권한이 전혀 없다. 그렇기때문에 권한을 부여해야 한다.
``` terminal
mysql> grant all privileges on study.* to study@'%';
```
- `grant` : 권한을 다루는 키워드
- `all privileges` : 모든 권한을 부여
- `on` : 권한으로 다룰수있는 대상
- `study.*` : `study`라는 데이터베이스의 모든 리소스
- `to` : 권한을 부여할 대상 유저 스키마
- `study@'%'` : 권한을 부여받을 유저 스키마

## 4. 재접속
``` terminal
mysql> exit;
bash-4.4# mysql -ustudy -pa1234
```

## 5. 데이터 베이스 선택
``` terminal
mysql> use study;
```