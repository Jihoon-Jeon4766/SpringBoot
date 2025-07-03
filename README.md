Spring Boot
-------------
Framework 와 Library 차이

의존성 4가지 추가

Project : 전체 프로젝트가 저장되는 최상위 디렉터리

Java : 애플리케이션의 핵심 기능을 작성하는 JAVA 파일들의 위치

Resources : 외부 파일 (설정파일, 정적파일, 템플릿)을 담음

Project Application : Spring Boot 애플리케이션을 시작하는 진입점 -tomcat

Build.gradle : 프로젝트 빌드 방식 및 의존성 관리하는 설정 파일

@Component 는 Spring Framework에서 해당 클래스를 스프링이 자동으로 객체로 생성(빈 등록) 하게 해주는 어노테이션입니다.

@Autowired 는 Spring Framework에서 의존성 주입(Dependency Injection) 을 자동으로 해주는 어노테이션입니다.

# `Part2. AOP`

## AOP(Aspect Oriented Programming)

### 관점 지향 프로그래밍

**AOP는 공통적으로 사용되는 기능(로깅, 트랜잭션, 보안 등)을 핵심 비즈니스 로직과 분리하여, 관심사의 분리를 실현하는 프로그래밍 기법.**

# `MVC 패턴`

# **MVC Model 패턴 ★★★**

**모델(model), 뷰(view), 컨트롤러(controller)의 약자로 소프트웨어를 개발하는 방법론**

### **-모델(Model) (Entity / DTO/ Service.java)**

애플리케이션의 데이터와 비즈니스 로직을 담당

Spring Boot에서 모델은 데이터베이스와의 상호작용, 데이터 처리 등을 담당

### **-뷰(View) (file.mustache)**

사용자에게 데이터를 시각적으로 표현하는 역할로 사용자 인터페이스(UI)를 구성하며, 모델의 데이터를 화면에 표시.

뷰는 사용자에게 정보를 시작적으로 표시하는 템플릿 파일로, 이는 HTML코드와 Mustache를 포함.

### **-컨트롤러(Controller) (Controller. java)**

사용자의 입력을 처리하고, 모델과 뷰 간의 상호작용을 조정.

사용자의 요청을 받아 적절한 모델을 업데이트하거나 뷰를 선택하는 웹 애플리케이션의 기능이 실질적으로 정의됨

Spring Boot에서는 @Controller 또는 @RestController로 구현되며, 사용자의 요청을 처리하고 모델 데이터를 가져와 템플릿 뷰로 전달하거나, JSON 응답을 반환한다.

JSON = JavaScript Object Notation -텍스트 기반의 데이터 형식..

**MVC Model 동작 순서**

1. 사용자 요청 → 2. 요청분석(Controller) → 3. 모델 호출 → 4. 데이터반환
→ 5. 데이터 처리 및 뷰 호출 → 6. 웹 브라우저 응답 → 7. 페이지확인

![image.png](attachment:d6362df3-47a1-4e51-b609-ff8fb5ddc706:image.png)

# `뷰 템플릿 (Mustache)`

**웹 페이지를 하나의 툴로 만들고 여기에 변수를 삽입해 서로 다른 페이지로 보여 주는 기술.**

**동적인 데이터를 HTML에 삽입해 사용자에게 보여주는 역할**

**프레젠테이션 로직을 담당 (ex. `if`, `for` 등을 통해 데이터 반복/조건 처리)**

### resources → templates → new → file

![스크린샷 2025-06-17 20.45.47.png](attachment:3e16bc84-a501-444b-9fa8-a84e898ba97d:스크린샷_2025-06-17_20.45.47.png)

### Install 클릭

![스크린샷 2025-06-17 20.48.51.png](attachment:0902b9ca-9be4-462f-a858-81d426975ade:6030aecc-419d-416d-86d5-9c308167ae1f.png)

![스크린샷 2025-06-17 20.50.01.png](attachment:333d0c13-8ef6-460e-92fc-9960f5614b4b:스크린샷_2025-06-17_20.50.01.png)

### **없다면 → 이거 설치**

### **-뷰(View) (file.mustache)**

사용자에게 데이터를 시각적으로 표현하는 역할로 사용자 인터페이스(UI)를 구성하며, 모델의 데이터를 화면에 표시.

뷰는 사용자에게 정보를 시작적으로 표시하는 템플릿 파일로, 이는 HTML코드와 Mustache를 포함.

### **-컨트롤러(Controller) (Controller. java)**

사용자의 입력을 처리하고, 모델과 뷰 간의 상호작용을 조정.

사용자의 요청을 받아 적절한 모델을 업데이트하거나 뷰를 선택하는 웹 애플리케이션의 기능이 실질적으로 정의됨

Spring Boot에서는 @Controller 또는 @RestController로 구현되며, 사용자의 요청을 처리하고 모델 데이터를 가져와 템플릿 뷰로 전달하거나, JSON 응답을 반환한다.

JSON = JavaScript Object Notation -텍스트 기반의 데이터 형식..

**MVC Model 동작 순서**

1. 사용자 요청 → 2. 요청분석(Controller) → 3. 모델 호출 → 4. 데이터반환
→ 5. 데이터 처리 및 뷰 호출 → 6. 웹 브라우저 응답 → 7. 페이지확인

# `뷰 템플릿 (Mustache)`

웹 페이지를 하나의 툴로 만들고 여기에 변수를 삽입해 서로 다른 페이지로 보여 주는 기술.

동적인 데이터를 HTML에 삽입해 사용자에게 보여주는 역할

프레젠테이션 로직을 담당 (ex. `if`, `for` 등을 통해 데이터 반복/조건 처리)

### resources → templates → new → file

# `Mustache 문법 사용`

mustache 에 중괄호 {{ }} 로 감싸서 변수를 출력

변수를 사용할 때 중괄호 2개를 사용한 다음, 그 안에 변수명을 넣어주면 됨.

spring Controller 에서 전달한 데이터를 페이지로 불러올 때 사용

helloworld() 안에다 Model model 추가

import 를 안했기에 오류 남…

우리가 사용하는 모델은 org.spring.framework 에 위치함

이거를 import 해야함.


지금까지 구현 정리

1. hi.mustache → 2. MvcController → 3. helloworld() 

→ 4. 변수 만들기(username) 5. Controller → model 사용, model.addAttribute 모델에다가 변수 설정 → 6. 페이지 실행

# `로깅(logging)`

**로깅이란 시스템이 동작할 때 당시의 상태와 작동 정보를 기록하는 것을 의미.**

Spring Log Level   

TRACE(낮음) → FATAL(위험도 높음)

FATAL : 아주 심각한 에러 발생시

ERROR : 일반적인 에러 발생시

WARN : 실행에는 문제가 없지만 향후에 에러의 원인이 될 수 있는 경우를 대비하여 경고 발생

INFO : 상태 변경으로 인한 정보성 메세지

DEBUG : 디버그용 메세지

TRACE : 디버그보다 더 상세한 정보

# `REST API`

**클라이언트에서 정보를 요청하면 서버는 특정기기에 구애 받지 않고 모든 기기에서 통용할 수 있는 JSON 데이터로 통신할 수 있게 만든 설계 방식.**

# `JSON 데이터`

키(key) - 값(value)의 쌍으로 이루어진 속성의 집합


