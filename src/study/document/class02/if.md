# 조건문
주어진 조건이 `참(true)`인지 `거짓(false)`인지에 따라 실행할 명령의 분기를 나누는 기능

## `if`문
   1. 형태
   - ```java
     if(논리 연산자){   
         //if뒤의 괄호안의 연산 결과가 true혹은 false만 가능하다
         ....
     }else if(논리 연산자){
         /**
         * if문 후에 자리하며 필요에의해 쓰인다.
         * 또한 else if의 사용 횟수 제한은 없다.
         */
         ....
     }else{
         //if와 else if의 논리연산결과가 false일때 실행된다.
         //else if문이 없다면 if가 false일때 실행된다.
         ....
     }
     ```

## `switch`문
   1. 형태
   - ```java
     switch(변수){
         case 변수값 :  //변수값과 같은 값의 case문부터 차례로 실행문들을 실행한다.아래에 있는 케이스문들도 실행한다.
            실행문
            
         case 변수값 :
            실행문
         break;         //break를 만나면 switch문을 빠져나온다

         case 변수값 :
            실행문

         default:       // switch뒤의 case값들중 변수값에 해당하는 값이 없으면 default부터 실행한다. (선택)

     }
     ```

[[예제]](../../code/class02/chapter02/Operator_03.java)