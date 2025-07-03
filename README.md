Spring Boot
-------------
# `Framework`

### 프레임워크

## Frame + work

“틀” + “일하다”의 합성어

합쳐서 “틀을 가지고 일하다”

프라 모델 키트 부품 = “Framework”

다양한 건담 = “page”

# `Framework`

일정한 구조나 규칙에 따라 코드를 작성할 수 있도록 도와주는 재사용 가능한 소프트웨어 툴로 개발 효율성을 높이고, 일 관련된 구조를 유지하게 해줌

# `Library`

프로그램을개발하기 위해 사용되는 도구 모음

# `Framework 와 Library 차이점`

---

Framework           차이점

규악, 틀 제공           자유도

---

Library                 공통점

도구 모음               프로그램을 쉽게 만들기 위한 것

---

# `Spring Boot`

복잡한 설정이 빠르게 웹 어플리케이션을 개발할 수 있도록 도와주는 Spring 프레임워크 기반의 개발 도구

# `환경구성`

## JDK(Java Development Kit)

JDK는 자바 개발 키트의 약자로 개발자들이 Java 기반 소프트웨어를 개발하기 위한 도구 모음

## IDE(Integrated Development Environment)

코드를 작성하고, 저장하고 컴파일 및 디버깅을 도와주는 통합 개발 환경으로 자바 개발자의 필수 프로그램

# `IDE download`

https://www.jetbrains.com/idea/download/?section=mac

# `Spring Project 만들기`

https://start.spring.io/

# `의존성 4가지 추가`

**Spring Web**

**Mustache -html 템플릿 엔진** 

**Spring Data JPA - DB를 저장하거나 데이터 조회를 자동화**

**H2 Database - 가벼운 인메모리 데이터**

# `Project`

**Project : 전체 프로젝트가 저장되는 최상위 디렉터리**

**Java : 애플리케이션의 핵심 기능을 작성하는 JAVA 파일들의 위치**

**Resources : 외부 파일 (설정파일, 정적파일, 템플릿)을 담음**

**Project Application : Spring Boot 애플리케이션을 시작하는 진입점 -tomcat**

**Build.gradle : 프로젝트 빌드 방식 및 의존성 관리하는 설정 파일**

# `Spring Framework`

스프링 프레임워크

자바 기반의 대표적인 프레임워크로, 객체 생성과 관리, 트랜잭션, AOP, MVC 웹 구조 등을 지원해, 엔터프라이즈급 웹 애플리케이션을 구성할 수 있게 해주는 강력한 기능을 제공.

# `Spring boot`

스프링 부트

스프링 프레임워크의 복잡한 설정을 최소화해주는 도구로, 자동설정, 내장 톰캣, 간편한 실행을 지원해서 빠르게 웹 프로젝트를 시작하고 배포할 수 있음.

# `part1. DI`

dependence - 의존성

**한 객체가 다른 객체의 기능이다 데이터를 사용할 때 생기는 관계**

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

# `뷰 템플릿 (Mustache)`

**웹 페이지를 하나의 툴로 만들고 여기에 변수를 삽입해 서로 다른 페이지로 보여 주는 기술.**

**동적인 데이터를 HTML에 삽입해 사용자에게 보여주는 역할**

**프레젠테이션 로직을 담당 (ex. `if`, `for` 등을 통해 데이터 반복/조건 처리)**

### resources → templates → new → file

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

# `페이지 이동`

# `링크`

미리 정해놓은 요청을 간편히 전송하는 기능으로 페이지 이동을 위해 사용

# `로깅(logging)`

**로깅이란 시스템이 동작할 때 당시의 상태와 작동 정보를 기록하는 것을 의미.**

# `리다이렉트`

클라이언트가 보낸 요청을 마친 후 계속해서 처리할 다음 요청 주소를 재지시

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


