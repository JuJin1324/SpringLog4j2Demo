# SpringLog4j2Demo

## 개요
* SpringBoot 2.0 에서 Log4j2 사용 샘플 코드

### Maven
* ※ log4j2 사용을 위해서 기존 spring-boot-starter dependency에서 로그 디펜던시를 제외해야함.

```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter</artifactId>
    <exclusions>
        <!-- log4j2 디펜던시와 충돌나지 않도록 기존 로깅 디펜던시 제외 -->
        <exclusion>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-logging</artifactId>
        </exclusion>
    </exclusions>
</dependency>

<!-- log4j2 -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-log4j2</artifactId>
</dependency>     
```
### log4j2 설정 파일 위치
* conf/log4j2.xml

## 테스트 실행 코드 위치
* src/main/java/spring.boot.log4j2.demo/DemoApplication.java
