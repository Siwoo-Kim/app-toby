package com.siwoo.projpa;

import com.siwoo.projpa.domain.*;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Slf4j
public class FixtureFactory {

    public static String getName(Object object) {
        return object.getClass().getSimpleName();
    }

    public static List<Document> documents() {
        List<Document> documents = null;
        try {
            documents = new ArrayList<>();

            Document document = new Document();
            document.setTitle("변수");
            document.setDescription("다음 예제는 변수에 값을 대입하는 방법을 보여주는 예제다.");
            document.setContent("위의 구문은 변수 a를 지금부터 사용하겠다고 변수를 선언한 것이다. 변수 a 앞에는 int라는 키워드가 있다. 이 키워드는 integer의 약자로 한국어로는 정수라는 의미다. 정수는 0을 중심으로 -1, -2, -3과 같은 음수와 1, 2, 3과 같은 양수를 통틀어서 정수라고 한다. 위의 코드는 변수 a가 정수를 담는 그릇임을 명시한 것이다. 이 변수를 사용하는 입장에서는 이 변수 안에 들어있는 데이터가 틀림 없이 정수라는 것을 확신 할 수 있게 된다.\n" + "\n" + "a = 1;\n" + "\n" + "좌항의 변수 a의 데이터가 1이라는 의미다. a에 숫자 1을 대입한 것이다. 이제부터 a 안에는 1이 들어있다. 이러한 것을 변수 a에 숫자 1을 할당했다고 한다.\n" + "\n" + "위의 실습 결과는 각각 2와 3이 출력될 것이다. 변수 a에 담겨 있는 값이 1일 때는 a+1의 결과가 2가 된다. 두번째 결과가 3이 된 것은 a의 값이 2로 바뀌었고, 2+1의 결과인 3이 출력된 것이다.\n" + "\n" + "//은 주석(comment)으로 코드에 부가적인 설명을 쓰거나 사용하지 않는 코드를 비활성화시키기 위해서 사용한다. 뒤에 따라오는 내용은 해석되지 않는다.\n" + "\n" + "세미콜론(;)은 하나의 구문이 끝났음을 명시적으로 나타내는 기호다. 다음처럼 한줄에 여러구문을 사용하고 싶을 때 세미콜론이 유용하다.\n" + "\n" + "int a; a = 1; System.out.println(a+1); //2\n" + "a = 2; System.out.println(a+1); //3\n" + "\n" + "자바에서는 세미콜론을 생략할 수 없다.");
            HashMap<String, URL> map = new HashMap();
            map.put("추가정보1", new URL("http", "www.localhost.com", 8080, "/notExits1"));
            map.put("추가정보2", new URL("http", "www.localhost.com", 8080, "/notExits2"));
            map.put("추가정보3", new URL("http", "www.localhost.com", 8080, "/notExits3"));
            document.setResources(map);
            documents.add(document);

            document = new Document();
            document.setTitle("데이터 타입");
            document.setSubtitle("데이터의 크기");
            document.setDescription("데이터 타입은 조금 어렵다. 후속 수업에서 필수적인 선행지식은 아니지만, 또 뒤에 배치하는 것도 애매하다. 이번 토픽의 학습이 어렵게 느껴지면 다음 토픽으로 넘어가고 나중에 다시 학습하면 된다.");
            document.setContent("byte a;\n" +
                    "이 변수에 담을 수 있는 숫자의 범위는 -128~127까지다. 이 범위 밖의 수인 -129나 128을 변수에 대입하려고 하면 오류가 발생할 것이다. 그럼 매우 큰 표현범위를 가지고 있는 long형을 사용하지 왜 byte 형을 사용할까? 만약 표현하고자 하는 수가 많아봐야 100을 넘지 않는 경우가 있다고 생각해보자.\n" + "\n" + "행정구역을 숫자로 표시한다고 가정해보자." + "즉 어떤 숫자를 저장하느냐에 따라서 사용하는 메모리의 크기가 달라지는 것이 아니고, 어떤 데이터 타입으로 변수를 선언했느냐에 따라서 사용하는 메모리의 크기가 달라지는 것이다. 결국, 변수에 들어올 수 있는 숫자의 최대 크기를 잘 판단해서 데이터 타입을 지정해야 귀한 메모리의 용량을 아낄 수 있다. 하지만 오늘날은 메모리의 용량이 늘어났고, 또 어떤 데이터형을 사용할 것이냐는 문제를 판단하기 위해서는 여러 가지가 고려되어야 한다. 결과적으로 말해서 정수를 저장할 때는 int를 사용하면 된다. int 형을 처리 할 때 CPU의 처리속도가 빠르고, int는 충분히 큰 수를 표현할 수 있는 데이터 타입이기 때문이다.");
            map = new HashMap();
            map.put("추가정보1", new URL("http", "www.localhost.com", 8080, "/notExits1"));
            map.put("추가정보2", new URL("http", "www.localhost.com", 8080, "/notExits2"));
            map.put("추가정보3", new URL("http", "www.localhost.com", 8080, "/notExits3"));
            document.setResources(map);
            documents.add(document);

            document = new Document();
            document.setTitle("상수");
            document.setSubtitle("상수의 데이터 타입");
            document.setDescription("변수는 변하는 값을 의미한다. 그 대척점에 있는 것이 상수인데, 상수(常數, constant)란 변하지 않는 값을 의미한다. 아래의 코드 중에서 a는 변수이고, 1은 상수이다.");
            document.setContent("변수는 변하는 값을 의미한다. 그 대척점에 있는 것이 상수인데, 상수(常數, constant)란 변하지 않는 값을 의미한다. 아래의 코드 중에서 a는 변수이고, 1은 상수이다.\n" + "\n" + "1\n" + "int a = 1;\n" + "변수 a는 대입 연산자(=)에 의해서 1이 되었다. 아래 예제를 보자.\n" + "\n" + "1\n" + "1 = 3;\n" + "컴파일이 되지 않는다. 1은 3이 될 수 없기 때문이다. 1은 1이고, 3은 3이다. 고유한 값을 가지고 있고, 그 값을 변경 할 수 없는 데이터 타입을 상수라고 한다. \n" + "\n" + "상수와 데이터 타입\n" + "실수의 표현\n" + "앞 수업에서 변수를 만들 때 데이터 타입을 지정했었다. 그것은 변수가 메모리를 얼마나 사용할 것인가를 지정하는 의미를 갖는다. 그렇다면 변수에 저장되는 상수도 데이터 타입이 있을까? 물론 있다. 아래 코드는 오류를 발생한다. (실행)\n" + "\n" + "1\n" + "int a = 2.2;\n" + "2.2는 실수다. 실수를 정수 타입의 변수 a에 저장하려고 했기 때문에 오류가 발생한 것이다. 이것은 변수와 똑같이 상수도 데이터 타입이 있다는 것이다. 그럼 위의 예에서 사용한 상수 2.2의 데이터 타입은 무엇일까? float일까? double일까?\n" + "\n" + "아래 코드를 보자. (실행)\n" + "\n" + "1\n" + "float a = 2.2;\n" + "\"Type mismatch: cannot convert from double to float\"\n" + "\n" + "위와 같은 에러가 발생한다. 즉 2.2는 float가 아니라는 뜻이다. 예제를 조금 바꿔보자");
            map = new HashMap();
            map.put("추가정보1", new URL("http", "www.localhost.com", 8080, "/notExits1"));
            map.put("추가정보2", new URL("http", "www.localhost.com", 8080, "/notExits2"));
            map.put("추가정보3", new URL("http", "www.localhost.com", 8080, "/notExits3"));
            document.setResources(map);
            documents.add(document);

            document = new Document();
            document.setTitle("메소드");
            document.setDescription("지금까지 배운 것으로도 얼마든지 프로그램을 만들 수 있다. 반복문, 조건문, 변수, 상수와 같은 것들은 사실상 프로그램을 만드는 가장 중요한 도구들이라고 할 수 있다. 지금부터 배우게 될 메소드나 객체지향과 같은 개념들은 웅장하고, 결함이 없고, 유지보수가 쉬운 애플리케이션을 만들기 위한 기법들이라고 할 수 있다. 이것들 없이도 프로그램을 만들 수는 있지만, 이것들 없이 규모있는 애플리케이션을 만든다는 것은 현실적으로 어려운 일이다. 지금까지 만드는 방법을 배웠다면 이제부터는 잘 만드는 방법을 익히는 것이라고 해도 과언이 아니다.");
            document.setContent("이것이 메소드다. 지금까지 수없이 만들었던 저 main이라고 하는 것이 바로 메소드인 것이다. 위의 그림을 자세히 보면 핑크색으로 된 부분과 검은색으로 된 부분이 있다. 이 중에서 검은색으로 된 부분은 이번 토픽에서 다루지 않을 개념이다. 이것들은 객체지향과 함께 언급되어야 본질을 이해할 수 있기 때문에 여기서는 언급하지 않겠다. 메소드를 만들 때 public static이라고 적어야 한다고 일단은 기계적으로 이해하자. 여러분이 주목할 것은 핑크색으로 강조한 부분이다.\n" + "\n" + " 살아있는 것들은 외부의 자극에 따라서 반응한다. 외부의 자극이 입력이라면 반응은 출력이라고 할 수 있다. 우리가 아는 쓸모있는 대부분의 프로그램이 사용자의 입력에 따라서 다른 결과를 출력한다. 메소드는 프로그램 안에서 동작하는 하나의 작은 프로그램이라고 할 수 있다. 위에서 살펴본 numbering이라는 메소드는 항상 똑같은 동작만을 반복한다. 이것도 재활용이라는 측면에서는 장점이 있지만, 입력 값에 따라서 출력 값을 달리 제공한다면 더욱 쓸모 있는 프로그램이 될 수 있을 것이다.\n" + "\n" + "매개변수와 인자\n" + "메소드의 입력 값은 매개변수(parameter)를 통해서 이루어진다. 위의 예제를 조금 개선해보자. 이전 예제는 0부터 9까지의 숫자를 화면에 출력했다. 만약 필요에 따라서 0부터 4까지 출력하고 싶거나 0부터 8까지 출력하고 싶다면 어떻게 해야 할까? 각각에 맞는 메소드를 새로 정의해야 할까? 그렇게 해도 되지만 더 좋은 방법이 있다. 입력 값에 따라서 다른 출력 값을 갖도록 메소드를 정의하면 된다. 즉, 입력을 고민할 때가 된 것이다. 아래의 예제를 보자. (실행)");
            map = new HashMap();
            map.put("추가정보1", new URL("http", "www.localhost.com", 8080, "/notExits1"));
            map.put("추가정보2", new URL("http", "www.localhost.com", 8080, "/notExits2"));
            map.put("추가정보3", new URL("http", "www.localhost.com", 8080, "/notExits3"));
            document.setResources(map);
            documents.add(document);
        }catch (MalformedURLException e) {
            e.printStackTrace();
            System.out.printf("Error URL Format");
        }
        return documents;
    }
    public static List<Section> sections() {
        List<Section> sections = new ArrayList<>();

        Section section = new Section();
        section.setName("JAVA 설치");
        section.setDescription("자바로 프로그램을 만들기 위해서는 아래와 같은 과정이 필요하다.\n" + "\n" + "코드 작성\n" + "컴퓨터가 실행할 수 있는 형태로 코드를 컴파일\n" + "컴파일된 프로그램을 실행");
        section.setBasicTime(new BasicTime(LocalDateTime.now(),null));
        sections.add(section);

        section = new Section();
        section.setName("숫자와 문자");
        section.setDescription("프로그래밍 입문자에게 가장 익숙한 데이터 타입(data type)은 숫자와 문자일 것이다. 이번 시간에는 실제로 가장 많이 사용되는 데이터 형인 문자와 숫자를 프로그래밍에서는 어떻게 표현하고 연산하는지 알아보자.");
        section.setBasicTime(new BasicTime(LocalDateTime.now(),null));
        sections.add(section);

        section = new Section();
        section.setName("변수");
        section.setDescription("영어로는 Variable로 (문자나 숫자 같은) 데이터를 담는 컨테이너다. 여기에 담겨진 데이터는 다른 데이터로 바꿀 수 있다. 변수는 마치 (사람이 쓰는 언어인) 자연어에서 대명사와 비슷한 역할을 한다.");
        section.setBasicTime(new BasicTime(LocalDateTime.now(),null));
        sections.add(section);

        section = new Section();
        section.setName("주석과 세미콜론");
        section.setDescription("주석(comment)은 로직에 대한 설명이나 코드를 비활성화 할 때 사용한다. 주석은 프로그래밍적으로 해석되지 않는다.");
        section.setBasicTime(new BasicTime(LocalDateTime.now(),null));
        sections.add(section);

        section = new Section();
        section.setName("데이터 타입");
        section.setDescription("데이터 타입은 조금 어렵다. 후속 수업에서 필수적인 선행지식은 아니지만, 또 뒤에 배치하는 것도 애매하다. 이번 토픽의 학습이 어렵게 느껴지면 다음 토픽으로 넘어가고 나중에 다시 학습하면 된다.\n" + "데이터 타입에 대해서 자세히 알아보기 전에 데이터의 크기에 대해서 학습하자.");
        section.setBasicTime(new BasicTime(LocalDateTime.now(),null));
        sections.add(section);

        return sections;
    }

    public static List<Project> projects() {
        List<Project> projects = null;

        try {
            projects = new ArrayList<>();
            Project project = new Project();
            project.setBasicTime(new BasicTime(LocalDateTime.now(),null));
            project.setName("Java");
            project.setDescription("Java SE(Java Platform, Standard Edition)는 자바의 표준안이다. 자바라는 언어가 어떠한 문법적인 구성을 가졌는지와 같은 것들을 정의하고 있다. 이것은 구체적인 소프트웨어가 아니고 그 소프트웨어의 설계도라고 할 수 있다. 소프트웨어에서는 설계도라는 표현 대신에 명세서(spec, specification)이라는 말을 사용한다. 이 명세서에 따라서 Java가 만들어지게 된다. Java SE 7은 버전 7에 대한 명세서이다. 자바는 계속 진화하고 있는 기술이다. 이 명세서는 JCP(Java Community Process, http://jcp.org)라는 조직을 통해서 만들어진다.");
            project.setIcon("fa-java");
            project.setType(Project.Type.BACKEND);
            project.setUrl(new URL("http","www.localhost.com",8080,"/java"));
            projects.add(project);

            project = new Project();
            project.setBasicTime(new BasicTime(LocalDateTime.now(),null));
            project.setName("Javascript");
            project.setDescription("JavaScript는 웹페이지를 동적으로, 프로그래밍적으로 제어하기 위해서 고안된 언어다. 그렇기 때문에 오늘날 가장 중요한 플랫폼이라고 할 수 있는 웹브라우저에서 유일하게 사용할 수 있는 프로그래밍 언어이다. 최근에는 HTML5의 적용이 가속화되면서 지금까지 모바일 환경에서 네이티브 앱(안드로이드, IOS)으로 구현해왔던 기능이 웹에서도 대부분 구현할 수 있게 되고 있다. 웹이 크로스플랫폼이라는 점, 검색 가능하다는 점, 네이티브 디바이스를 제어할 수 있는 하드브리드 시스템(phonegap 등)이 존재한다는 점에서 웹의 중요함은 더욱 확대될 전망이다. 자연스럽게 웹에서 구동되는 유일한 언어인 JavaScript의 중요함도 점점 커질 것으로 예상된다.");
            project.setIcon("fa-js");
            project.setType(Project.Type.BACKEND);
            project.setUrl(new URL("http","www.localhost.com",8080,"/javscript"));
            projects.add(project);

            project = new Project();
            project.setBasicTime(new BasicTime(LocalDateTime.now(),null));
            project.setName("Regular Expression");
            project.setDescription("정규표현식(正規表現式, Regular Expression)은 문자열을 처리하는 방법 중의 하나로 특정한 조건의 문자를 '검색'하거나 '치환'하는 과정을 매우 간편하게 처리 할 수 있도록 하는 수단이다.");
            project.setIcon("fa-re");
            project.setType(Project.Type.BACKEND);
            project.setUrl(new URL("http","www.localhost.com",8080,"/re"));
            projects.add(project);

            project = new Project();
            project.setBasicTime(new BasicTime(LocalDateTime.now(),null));
            project.setName("HTML");
            project.setDescription("HTML is the standard markup language for creating Web pages. HTML stands for Hyper Text Markup Language. HTML describes the structure of Web pages using markup. HTML elements are the building blocks of HTML pages. HTML elements are represented by tags.");
            project.setIcon("fa-html");
            project.setType(Project.Type.FRONTEND);
            project.setUrl(new URL("http","www.localhost.com",8080,"/html"));
            projects.add(project);

        } catch (MalformedURLException e) {
            log.error("Error creating Projects fixtures");
            throw new RuntimeException();
        }

        return projects;
    }

    public static List<User> users() {
        List<User> fixtures = new ArrayList<>();
        User user = new User();
        user.setEmail("user1@email.com");
        user.setLevel(User.Level.BRONZE);
        user.setLogin(1);
        user.setRecommend(0);
        user.setName(new Name("Siwoo","Kim",null));
        user.setPassword("passuser1");
        user.setPoint(10);
        fixtures.add(user);
        user = new User();
        user.setEmail("user2@email.com");
        user.setName(new Name("Jee eun","Kim",null));
        user.setPassword("passuser2");
        user.setLevel(User.Level.BRONZE);
        user.setLogin(3);
        user.setRecommend(6);
        user.setPoint(10);
        fixtures.add(user);
        user = new User();
        user.setEmail("user3@email.com");
        user.setName(new Name("Polo","Marco","D."));
        user.setPassword("passuser3");
        user.setLevel(User.Level.BRONZE);
        user.setLogin(5);
        user.setRecommend(5);
        user.setPoint(10);
        fixtures.add(user);
        user = new User();
        user.setEmail("user4@email.com");
        user.setName(new Name("Minhee","Lee",null));
        user.setPassword("passuser4");
        user.setLevel(User.Level.BRONZE);
        user.setLogin(29);
        user.setRecommend(20);
        user.setPoint(10);
        fixtures.add(user);
        user = new User();
        user.setEmail("user5@email.com");
        user.setName(new Name("Suk","Hong",null));
        user.setPassword("passuser5");
        user.setLevel(User.Level.BRONZE);
        user.setLogin(30);
        user.setRecommend(20);
        user.setPoint(10);
        fixtures.add(user);
        user = new User();
        user.setEmail("user6@email.com");
        user.setName(new Name("Min Hae","Park",null));
        user.setPassword("passuser6");
        user.setLevel(User.Level.SILVER);
        user.setLogin(50);
        user.setRecommend(30);
        user.setPoint(10);
        fixtures.add(user);
        user = new User();
        user.setEmail("user7@email.com");
        user.setName(new Name("Hyun","Choi",null));
        user.setPassword("passuser7");
        user.setLevel(User.Level.GOLD);
        user.setLogin(100);
        user.setRecommend(100);
        user.setPoint(10);
        return fixtures;
    }

    public static void assignProjectToUser(List<User> users, Project project, JpaRepository repository) {
        for(User user: users) {
            user.addProject(project);
            repository.save(user);
        }
    }
}
