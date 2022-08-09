# STS
* 유용한 단축키
>전체 검색 ctrl+ h
>마우스 커서 주석 ctrl + shift + c
>메소드 호출한곳 찾기 ctirl + alt + h

##### 셋팅
1. encoding 설정
* window > prefer... > encoding 검색 > utf-8로 변경
  * xml 수정   
* pom.xml 자바버전 맞추기
```java
    <filter> 
    <filter-name>encodingFilter</filter-name> 
    <filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class> 
    <init-param> 
       <param-name>encoding</param-name> 
       <param-value>UTF-8</param-value> 
    </init-param> 
    <init-param> 
       <param-name>forceEncoding</param-name> 
       <param-value>true</param-value> 
    </init-param> 
    </filter> 
    <filter-mapping> 
    <filter-name>encodingFilter</filter-name> 
    <url-pattern>/*</url-pattern> 
     </filter-mapping> 
	 <!-- jsp 파일 utf-8 페이지 인코딩 설정 <%@ page pageEncoding="UTF-8" %>  -->
	<jsp-config>

		<jsp-property-group>

			<url-pattern>*.jsp</url-pattern>

			<page-encoding>UTF-8</page-encoding>

		</jsp-property-group>
	</jsp-config>

```
2. 톰캣 서버 연동
3. pom.xml 버전 체크
  * 자바버전 1.8
  * 스프링프레임워크 5.0.7
  * junit 4.12
  * maven 플러그인 1.8
  
 4. maven 디펜던시 추가 안될때 Window - Preferences - Maven > 다운로드 관련 다 체크
 5. [db테스트를 위한 sql 생성](./src/main/resources/springbook.sql) 
* junit // 4.12 ? ???
* maven plugin 버전 맞추기

## polymorphism

* IOC(제어의 역전)
* DI(의존성 주입)
   * 생성자 인젝션
   * setter 인젝션
   * 멤버변수 인젝션
* AOP(공통관심사 OR 횡단관심사)
* SPRING 컨테이너

## 어노테이션 설정하기
사용법
* @어노테이션명()
* 빈 등록 어노테이션
* @Component("tv")

의존성주입 어노테이션
* @AutoWired
* 데이터 타입을 자동으로 찾아감
* @Qualifier

>직접 개발한 클래스는 어노테이션을 사용할수 있고, XML설정을 할 수도 있다.
하지만 라이브러리 형태로 제공되는 클래스는 반드시 XML설정을 통해서 사용해야한다.

* @Component
* @Service
* @Repository
* @Controller


Presentaion(화면계층) - 화면에 보여주는 기술을 사용하는 영역 
Business(비지니스계층) - 고객이 원하는 요구사항을 반영하는 계층
> VO, DAO, Service, Servicelmpl

Persistence(영속계층 / 데이터 계층) - 데이터를 어떤 방식으로 보관하고 사용하는가에 대한 설계가 들어가는 계층