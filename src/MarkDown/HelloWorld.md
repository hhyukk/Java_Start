# 개발 환경 설정
#### IDE 선택
- 인텔리제이(IntelliJ) 권장
    - 이클립스(Eclipse) → 과거에 많이 사용
    - 인텔리제이 → 최근 트렌드, 빠른 속도, 편리한 사용성
    - 대부분의 메이저 기업에서도 인텔리제이 사용

> **참고**
- 무료: IntelliJ Community Edition → 학습용으로 충분
>- 유료: IntelliJ Ultimate → 웹 개발, 기업용 고급 기능 제공

# 자바 프로그램 실행

**HelloJava**
```java
public class HelloJava {
    public static void main(String[] args){
        System.out.println("hello java");
    }
}

```
**실행 결과**
`hello java`

| 구문                          | 설명                        |
| --------------------------- | ------------------------- |
| `public class HelloJava`    | 클래스 선언 (파일명과 동일해야 함)      |
| `{ ... }`                   | **블록**: 범위를 나타냄 (들여쓰기 사용) |
| `public static void main()` | 프로그램의 **시작점**             |
| `System.out.println()`      | 콘솔 출력 함수                  |
| `"..."`                     | **문자열** 표현 (쌍따옴표 사용)      |
| `;`                         | 문장 끝에 **세미콜론** 필수         |


**실행 과정**
- HelloJava 프로그램을 실행한다.
- 자바는 시작점인 main() 메서드를 실행한다.
- System.out.println("hello java") 을 만나고, 문자열 hello java 을 출력한다.
- main() 메서드의 {} 블록이 끝나면 프로그램은 종료된다.

**블록(block) 예시**
```java
public class HelloJava { //HelloJava 클래스의 범위 시작
    public static void main(String[] args) { //main() 메서드의 범위 시작
        System.out.println("hello java");
    } //main() 메서드의 범위 끝
} //HelloJava 클래스의 범위 끝
```
- 블록 중첩 시 들여쓰기 사용 (스페이스 4칸 or Tab)
- 들여쓰기는 필수는 아니지만 가독성을 위해 반드시 지키는 것이 좋음

**추가 예제**

```java
// HelloJava2.java
public class HelloJava2 {
    public static void main(String[] args){
        System.out.println("hello java1");
        System.out.println("hello java2");
        System.out.println("hello java3");
    }
}

```
**실행 결과**
```
hello java1
hello java2
hello java3
```
프로그램은 main() 을 기준으로 위 → 아래 순서대로 한 줄씩 실행

#### 주의
- 대소문자 구분 필수
- 클래스 이름과 파일 이름 동일하게 작성

# 주석(comment)
#### 주석(comment)이란?
- 소스 코드의 설명이나 일시적으로 코드 실행을 막고 싶을 때 사용하는 문법
- 자바는 주석 부분을 무시하고 실행

#### 주석의 종류
- 한 줄 주석
    - // 사용
    - 해당 줄의 // 이후 텍스트 모두 주석 처리
- 여러 줄 주석
    - /* ~ */ 사용
    - /*와 */ 사이의 텍스트 모두 주석 처리

```java
public class CommentJava {
    public static void main(String[] args) {
        System.out.println("hello java1");//helolo java1을 출력합니다.
        //System.out.println("hello java2");

        /*
        System.out.println("hello java3");
        System.out.println("hello java4");
         */
    }
}
```
***실행 결과***
```
hello java1
```

#### 요약
- 주석 = 자바 프로그램이 무시하는 부분
- 목적 : 코드 설명 or 실행 잠시 중단
- 사람이 읽기 위한 용도

# 자바란?
### 자바 표준 스펙
#### 자바 표준 스펙과 구현
![](https://velog.velcdn.com/images/hhyukk/post/007d0ccd-b4a8-40a4-9db7-24599543086b/image.png)

자바는 **표준 스펙**과 **구현**으로 나눌 수 있다.
- 자바 표준 스펙
    - 자바는 이렇게 만들어야 한다는 설계도이며, 문서이다.
    - 이 표준 스펙을 기반으로 여러 회사에서 실제 작동하는 자바를 만든다.
    - 자바 표준 스펙은 자바 커뮤니티 프로세스(JCP)를 통해 관리된다.
- 다양한 자바 구현
    - 여러 회사에서 자바 표준 스펙에 맞추어 실제 작동하는 자바 프로그램을 개발한다.
    - 각각 장단점이 있다. 예를 들어 Amazon Corretto는 AWS에 최적화 되어 있다.
    - 각 회사들은 대부분 윈도우, MAC, 리눅스 같이 다양한 OS에서 작동하는 버전의 자바도 함께 제공한다.

>참고: 다양한 자바 구현에 대해서는 다음 사이트를 참고하자.
https://whichjdk.com/ko

#### 변경의 용이

![](https://velog.velcdn.com/images/hhyukk/post/97ed3704-be4e-410f-b41c-6a5df7d1813d/image.png)


- 자바 구현들은 모두 표준 스펙에 맞도록 개발되어 있다. 따라서 오라클 Open JDK를 사용하다가 Amazon Corretto 자바로 변경해도 대부분 문제 없이 동작한다.

>참고: 학습 단계에서는 어떤 자바를 사용하든 크게 상관이 없다.

#### 컴파일과 실행
![](https://velog.velcdn.com/images/hhyukk/post/bc0feab3-6254-4036-ada8-92909e83ef9a/image.png)

1. 작성 : `Hello.java` 같은 자바 소스 코드 작성
2. 컴파일 : `javac Hello.java`
    - `java → .class` (바이트 코드)
    - 문법 오류 검출, 최적화 수행
3. 실행 : `java `
    - JVM(자바 가상 머신) 이 `.class` 파일을 실행함

#### IDE와 자바
- IntelliJ 같은 개발 도구를 사용하면 자바 설치 및 실행이 쉬워짐
- 컴파일 → 실행 자동화
- `javac` + `java` 명령어 직접 입력 불필요
- 학습 초반에는 인텔리제이 안에서 설치한 자바로 충분

![](https://velog.velcdn.com/images/hhyukk/post/bff2523e-fdf8-46de-b8fd-3b0568e95f44/image.png)

# 자바와 운영체제 독립성
![](https://velog.velcdn.com/images/hhyukk/post/58b19cf1-274d-45d1-83b3-615a954a13ce/image.png)

- 일반 프로그램: OS마다 따로 만들어야 함 (윈도우용, 맥용 등)

![](https://velog.velcdn.com/images/hhyukk/post/896a32d1-9d2f-4314-bd2a-1a25da5235e7/image.png)


- **자바 프로그램: "한 번 작성, 어디서나 실행 (Write Once, Run Anywhere)"**
    - JVM 덕분에 OS에 무관하게 실행 가능
    - 개발용 OS: 윈도우, 맥
    - **운영 서버용 OS: 리눅스**
- 개발 환경과 실행 환경이 달라도 **JVM만 설치되어 있으면 문제 없음**

#### 요약
| 항목           | 내용                                        |
| ------------ | ----------------------------------------- |
| **구성**       | 표준 스펙(JCP) + 다양한 구현체(OpenJDK, Corretto 등) |
| **컴파일 과정**   | `.java` → `.class` → JVM 실행               |
| **운영체제 독립성** | JVM 덕분에 OS 상관없이 자바 프로그램 실행 가능             |
| **추천 설치 방식** | 인텔리제이 내부 설치 기능 사용 (편리함)                   |