# 스키마 (schema )
> 모든 응용 시스템과 사용자들이 필요로하는 데이터를 통합한 조직 전체의 데이터베이스 구조를 논리적으로 정의한 것 - 위키피디아

## 스키마의 종류

### User 스키마
- 사용자 정보를 담당하는 스키마
- DB 접속 / 조회 / 입력 / 수정 / 생성 등의 행동을 할수있는 스키마

### 권한 스키마
- 실질적으로 데이터베이스의 리소스를 핸들링 할수있는 스키마
- 테이블,뷰,프로시져 등을 컨트롤 할 수있는 권한이 정의죄는 스키마

### 테이블
- 실 데이터를 저장하고 핸들링할수있는 공간을 정의한 스키마

### 뷰
- 가상의 테이블로서 조회만이 가능한 테이블과 유사한 스키마
> DBMS의 종류에 따라 insert가 가능한 뷰를 생성할 수도 있음

### key
- 테이블간의 관계를 정의한 스키마
- primary, foreign, unique 등의 키를이용해 테이블간에 관계를 정의한다.