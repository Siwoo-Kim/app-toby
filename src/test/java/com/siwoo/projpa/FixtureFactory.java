package com.siwoo.projpa;

import com.siwoo.projpa.domain.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.JpaRepository;

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

    public static List<WebPage> webPages() {
        List<WebPage> webPages = null;
        try{
            webPages = new ArrayList<>();
            WebPage webPage = new WebPage();
            webPage.setName("Project");
            webPage.setPublic(true);
            webPage.addImageName("project_icon_1");
            webPage.addImageName("project_icon_2");
            webPage.addImageName("project_icon_3");
            webPage.setDescription("프로젝트란 우리말로 목표정도로 번역 할 수 있을 것 같습니다. 어떤 목표를 달성하기 위해서 많은 사람이 협력합니다. 이 과정에서 소위 막장이라고 부르는 상황들이 발생합니다. 그리고 이런 막장은 어느정도는 숙명과도 같은 것입니다. 하지만 막장은 줄일 수 있습니다. 행복한 프로젝트는 아니더라도 프로젝트를 덜 불행하게 만들수는 있습니다. 이를 위한 많은 도구들이 있고 프로젝트 관리편에서는 이 도구들을 소개해드립니다.");
            webPage.setUrl(new URL("http", "www.localhost.com", 8080, "/project"));
            webPages.add(webPage);

            webPage = new WebPage();
            webPage.setName("Home");
            webPage.setPublic(true);
            webPage.addImageName("home_icon_1");
            webPage.addImageName("home_icon_2");
            webPage.setDescription("온라인용 포트폴리오입니다. 사회에 첫발을 내딛기 위한 정말로, 가장 처음으로 만든 포트폴리오라 할 수 있을 것 같습니다. 영원할 것 같던 대학시절이 끝나고 있습니다. 만감이 교차하는 마음으로 준비했던 포트폴리오입니다.");
            webPage.setUrl(new URL("http", "www.localhost.com", 8080, "/home"));
            webPages.add(webPage);

            webPage = new WebPage();
            webPage.setName("Section");
            webPage.setPublic(false);
            webPage.addImageName("section_icon_1");
            webPage.addImageName("section_icon_2");
            webPage.setDescription("프로그래밍을 처음 시작하는 분들의 눈높이에 맞게 만들어진 강의입니다. 이미 프로그래밍에 익숙한 분의 입장에서는 설명이 조금 장황할 수 있습니다.");
            webPage.setUrl(new URL("http", "www.localhost.com", 8080, "/sections"));
            webPages.add(webPage);

            webPage = new WebPage();
            webPage.setName("Document");
            webPage.setPublic(false);
            webPage.addImageName("document_icon_1");
            webPage.addImageName("document_icon_2");
            webPage.setDescription("주력 웹 페이지 프로그래밍의 정보를 담고있는, 처음인 분들을 위해서 고안된 수업입니다. WEBn을 통해서 교양으로 코딩을 공부하려는 분들에게는 출구를, 직업으로 코딩을 공부하려는 분들에게는 입구를 제공해드리려고 노력하고 있습니다. 웹이라는 구체적인 사례를 통해서 코딩이 무엇인가 파악해보세요. 또 코딩을 통해서 웹을 만드는 방법을 공부해보세요. ");
            webPage.setUrl(new URL("http", "www.localhost.com", 8080, "/document"));
            webPages.add(webPage);

        }catch (MalformedURLException e) {
            e.printStackTrace();
            System.out.printf("Error URL Format");
            throw new RuntimeException(e);
        }
        return webPages;
    }

    public static List<Document> javaDocuments() {

        List<Document> documents = null;
        try{
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
        document.setHit(5);
        document.setContent("이것이 메소드다. 지금까지 수없이 만들었던 저 main이라고 하는 것이 바로 메소드인 것이다. 위의 그림을 자세히 보면 핑크색으로 된 부분과 검은색으로 된 부분이 있다. 이 중에서 검은색으로 된 부분은 이번 토픽에서 다루지 않을 개념이다. 이것들은 객체지향과 함께 언급되어야 본질을 이해할 수 있기 때문에 여기서는 언급하지 않겠다. 메소드를 만들 때 public static이라고 적어야 한다고 일단은 기계적으로 이해하자. 여러분이 주목할 것은 핑크색으로 강조한 부분이다.\n" + "\n" + " 살아있는 것들은 외부의 자극에 따라서 반응한다. 외부의 자극이 입력이라면 반응은 출력이라고 할 수 있다. 우리가 아는 쓸모있는 대부분의 프로그램이 사용자의 입력에 따라서 다른 결과를 출력한다. 메소드는 프로그램 안에서 동작하는 하나의 작은 프로그램이라고 할 수 있다. 위에서 살펴본 numbering이라는 메소드는 항상 똑같은 동작만을 반복한다. 이것도 재활용이라는 측면에서는 장점이 있지만, 입력 값에 따라서 출력 값을 달리 제공한다면 더욱 쓸모 있는 프로그램이 될 수 있을 것이다.\n" + "\n" + "매개변수와 인자\n" + "메소드의 입력 값은 매개변수(parameter)를 통해서 이루어진다. 위의 예제를 조금 개선해보자. 이전 예제는 0부터 9까지의 숫자를 화면에 출력했다. 만약 필요에 따라서 0부터 4까지 출력하고 싶거나 0부터 8까지 출력하고 싶다면 어떻게 해야 할까? 각각에 맞는 메소드를 새로 정의해야 할까? 그렇게 해도 되지만 더 좋은 방법이 있다. 입력 값에 따라서 다른 출력 값을 갖도록 메소드를 정의하면 된다. 즉, 입력을 고민할 때가 된 것이다. 아래의 예제를 보자. (실행)");
        map = new HashMap();
        map.put("추가정보1", new URL("http", "www.localhost.com", 8080, "/notExits1"));
        map.put("추가정보2", new URL("http", "www.localhost.com", 8080, "/notExits2"));
        map.put("추가정보3", new URL("http", "www.localhost.com", 8080, "/notExits3"));
        document.setResources(map);
        documents.add(document);

        }catch (Exception e) {
            e.printStackTrace();
            System.out.printf("Error URL Format");
            throw new RuntimeException(e);
        }
        return documents;
    }

    public static List<Document> javascriptDocuments() {
        List<Document> documents = null;
        try {
            documents = new ArrayList<>();

            Document document = new Document();
            HashMap<String, URL> map;
            document.setTitle("언어소개");
            document.setDescription("JavaScript는 웹페이지를 동적으로, 프로그래밍적으로 제어하기 위해서 고안된 언어다. 그렇기 때문에 오늘날 가장 중요한 플랫폼이라고 할 수 있는 웹브라우저에서 유일하게 사용할 수 있는 프로그래밍 언어이다. 최근에는 HTML5의 적용이 가속화되면서 지금까지 모바일 환경에서 네이티브 앱(안드로이드, IOS)으로 구현해왔던 기능이 웹에서도 대부분 구현할 수 있게 되고 있다. 웹이 크로스플랫폼이라는 점, 검색 가능하다는 점, 네이티브 디바이스를 제어할 수 있는 하드브리드 시스템(phonegap 등)이 존재한다는 점에서 웹의 중요함은 더욱 확대될 전망이다. 자연스럽게 웹에서 구동되는 유일한 언어인 JavaScript의 중요함도 점점 커질 것으로 예상된다.");
            document.setContent("CMAScript\n" + "ECMAScript는 표준화 기구인 Ecma International에 의해서 관리되는 자바스크립트 표준안이다. 현재의 자바스크립트는 ECMAScript 3 기반으로 만들어졌고, 현재 시점(2013년)에서는 ECMAScript 5가 표준으로 정의 되었고 이 버전의 자바스크립트를 브라우저 벤더들이 자신들의 브라우저에 구현하는 작업이 한창이다. 곧 ECMAScript 5의 새로운 기능들을 웹에서도 문제 없이 사용할 수 있게 될 것이다. ECMAScript 4는 기존의 자바스크립트와 너무 큰 차이점 때문에 표준으로 채택되지 못했다.\n" + "\n" + "JavaScript 학습에 요구되는 선행학습\n" + "웹페이지를 동적으로 제어하기 위한 목적으로 자바스크립트를 학습한다면 아래 내용은 반드시 선행해야한다. 아래 내용을 학습 한 후에 본 수업을 공부하고 DOM을 학습하면 웹페이지를 프로그래밍적으로 제어 할 수 있다. 최근에는 DOM을 직접 제어하는 것 보다는 jQuery와 같은 라이브러리를 사용하는 것이 일반적이다. DOM에 대한 내용은 DOM 수업을 참고하고 jQuery에 대한 내용은 jQuery 수업을 참고한다.\n" + "\n" + "HTML\n" + "웹페이지를 만드는 언어로 자바스크립트가 제어하는 직접적인 대상이다.\n" + "생활코딩 HTML 수업과 HTML 사전을 참고한다.\n" + "CSS\n" + "웹페이지를 꾸며주는 언어로 자바스크립트와 함께 사용되어 HTML을 보다 사용자 친화적인 문서, 응용프로그램으로 만들어준다.\n" + "생활코딩 CSS 수업, CSS 사전을 참고한다.");
            document.setBasicTime(new BasicTime(LocalDateTime.of(2018, 1, 5, 0, 0), null));
            map = new HashMap();
            map.put("추가정보1", new URL("http", "www.localhost.com", 8080, "/notExits1"));
            map.put("추가정보2", new URL("http", "www.localhost.com", 8080, "/notExits2"));
            map.put("추가정보3", new URL("http", "www.localhost.com", 8080, "/notExits3"));
            document.setResources(map);
            documents.add(document);

            document = new Document();
            document.setTitle("함수지향");
            document.setContent("함수지향 카테고리의 하위 수업들은 함수형 언어로서 자바스크립트의 면모를 다룬다. 자바스크립트의 핵심적인 도구는 함수다. 자바스크립트의 함수는 매우 강력하다. 함수에 대한 이해 없이는 자바스크립트를 잘 다루기 어렵다. 또한 자바스크립트에서 함수는 객체를 이해하는 데 가장 중요한 기초를 이룬다. \n" + "\n" + "하지만 난이도가 조금 있는 내용이다. 기초수업을 이수했다면 구체적인 자바스크립트의 호스트 환경에 대한 학습으로 넘어가도 된다. 함수에 대한 고급 내용을 다루는 본 카테고리는 나중에 학습해도 좋다. 하지만 언젠가는 꼭 정복해야 할 부분이다. 사실 그렇게 어렵지도 않다. 다만 코드를 처음 다루는 입문자라면 함수와 관련된 기능들의 취지에 공감이 잘 안될지도 모르겠다. ");
            document.setBasicTime(new BasicTime(LocalDateTime.of(2018, 2, 15, 0, 0), null));
            map = new HashMap();
            map.put("추가정보1", new URL("http", "www.localhost.com", 8080, "/notExits1"));
            map.put("추가정보2", new URL("http", "www.localhost.com", 8080, "/notExits2"));
            map.put("추가정보3", new URL("http", "www.localhost.com", 8080, "/notExits3"));
            document.setResources(map);
            documents.add(document);

            document = new Document();
            document.setTitle("클로저");
            document.setDescription("클로저(closure)는 내부함수가 외부함수의 맥락(context)에 접근할 수 있는 것을 가르킨다. 클로저는 자바스크립트를 이용한 고난이도의 테크닉을 구사하는데 필수적인 개념으로 활용된다. ");
            document.setContent("클로저(closure)는 내부함수와 밀접한 관계를 가지고 있는 주제다. 내부함수는 외부함수의 지역변수에 접근 할 수 있는데 외부함수의 실행이 끝나서 외부함수가 소멸된 이후에도 내부함수가 외부함수의 변수에 접근 할 수 있다. 이러한 메커니즘을 클로저라고 한다. 아래 예제는 이전의 예제를 조금 변형한 것이다. 결과는 경고창으로 coding everybody를 출력할 것이다.\n" + "\n" + "1\n" + "2\n" + "3\n" + "4\n" + "5\n" + "6\n" + "7\n" + "8\n" + "function outter(){\n" + "    var title = 'coding everybody';  \n" + "    return function(){        \n" + "        alert(title);\n" + "    }\n" + "}\n" + "inner = outter();\n" + "inner();\n" + "예제의 실행순서를 주의깊게 살펴보자. 7행에서 함수 outter를 호출하고 있다. 그 결과가 변수 inner에 담긴다. 그 결과는 이름이 없는 함수다. 실행이 8행으로 넘어오면 outter 함수는 실행이 끝났기 때문에 이 함수의 지역변수는 소멸되는 것이 자연스럽다. 하지만 8행에서 함수 inner를 실행했을 때 coding everybody가 출력된 것은 외부함수의 지역변수 title이 소멸되지 않았다는 것을 의미한다. 클로저란 내부함수가 외부함수의 지역변수에 접근 할 수 있고, 외부함수는 외부함수의 지역변수를 사용하는 내부함수가 소멸될 때까지 소멸되지 않는 특성을 의미한다.");
            document.setHit(10);
            document.setBasicTime(new BasicTime(LocalDateTime.of(2018, 3, 25, 0, 0), null));
            map = new HashMap();
            map.put("추가정보1", new URL("http", "www.localhost.com", 8080, "/notExits1"));
            map.put("추가정보2", new URL("http", "www.localhost.com", 8080, "/notExits2"));
            map.put("추가정보3", new URL("http", "www.localhost.com", 8080, "/notExits3"));
            document.setResources(map);
            documents.add(document);
        }catch (MalformedURLException e) {
            e.printStackTrace();
            System.out.printf("Error URL Format");
            throw new RuntimeException(e);
        }
        return documents;
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
            document.setHit(5);
            document.setContent("이것이 메소드다. 지금까지 수없이 만들었던 저 main이라고 하는 것이 바로 메소드인 것이다. 위의 그림을 자세히 보면 핑크색으로 된 부분과 검은색으로 된 부분이 있다. 이 중에서 검은색으로 된 부분은 이번 토픽에서 다루지 않을 개념이다. 이것들은 객체지향과 함께 언급되어야 본질을 이해할 수 있기 때문에 여기서는 언급하지 않겠다. 메소드를 만들 때 public static이라고 적어야 한다고 일단은 기계적으로 이해하자. 여러분이 주목할 것은 핑크색으로 강조한 부분이다.\n" + "\n" + " 살아있는 것들은 외부의 자극에 따라서 반응한다. 외부의 자극이 입력이라면 반응은 출력이라고 할 수 있다. 우리가 아는 쓸모있는 대부분의 프로그램이 사용자의 입력에 따라서 다른 결과를 출력한다. 메소드는 프로그램 안에서 동작하는 하나의 작은 프로그램이라고 할 수 있다. 위에서 살펴본 numbering이라는 메소드는 항상 똑같은 동작만을 반복한다. 이것도 재활용이라는 측면에서는 장점이 있지만, 입력 값에 따라서 출력 값을 달리 제공한다면 더욱 쓸모 있는 프로그램이 될 수 있을 것이다.\n" + "\n" + "매개변수와 인자\n" + "메소드의 입력 값은 매개변수(parameter)를 통해서 이루어진다. 위의 예제를 조금 개선해보자. 이전 예제는 0부터 9까지의 숫자를 화면에 출력했다. 만약 필요에 따라서 0부터 4까지 출력하고 싶거나 0부터 8까지 출력하고 싶다면 어떻게 해야 할까? 각각에 맞는 메소드를 새로 정의해야 할까? 그렇게 해도 되지만 더 좋은 방법이 있다. 입력 값에 따라서 다른 출력 값을 갖도록 메소드를 정의하면 된다. 즉, 입력을 고민할 때가 된 것이다. 아래의 예제를 보자. (실행)");
            map = new HashMap();
            map.put("추가정보1", new URL("http", "www.localhost.com", 8080, "/notExits1"));
            map.put("추가정보2", new URL("http", "www.localhost.com", 8080, "/notExits2"));
            map.put("추가정보3", new URL("http", "www.localhost.com", 8080, "/notExits3"));
            document.setResources(map);
            documents.add(document);


            document = new Document();
            document.setTitle("언어소개");
            document.setDescription("JavaScript는 웹페이지를 동적으로, 프로그래밍적으로 제어하기 위해서 고안된 언어다. 그렇기 때문에 오늘날 가장 중요한 플랫폼이라고 할 수 있는 웹브라우저에서 유일하게 사용할 수 있는 프로그래밍 언어이다. 최근에는 HTML5의 적용이 가속화되면서 지금까지 모바일 환경에서 네이티브 앱(안드로이드, IOS)으로 구현해왔던 기능이 웹에서도 대부분 구현할 수 있게 되고 있다. 웹이 크로스플랫폼이라는 점, 검색 가능하다는 점, 네이티브 디바이스를 제어할 수 있는 하드브리드 시스템(phonegap 등)이 존재한다는 점에서 웹의 중요함은 더욱 확대될 전망이다. 자연스럽게 웹에서 구동되는 유일한 언어인 JavaScript의 중요함도 점점 커질 것으로 예상된다.");
            document.setContent("CMAScript\n" + "ECMAScript는 표준화 기구인 Ecma International에 의해서 관리되는 자바스크립트 표준안이다. 현재의 자바스크립트는 ECMAScript 3 기반으로 만들어졌고, 현재 시점(2013년)에서는 ECMAScript 5가 표준으로 정의 되었고 이 버전의 자바스크립트를 브라우저 벤더들이 자신들의 브라우저에 구현하는 작업이 한창이다. 곧 ECMAScript 5의 새로운 기능들을 웹에서도 문제 없이 사용할 수 있게 될 것이다. ECMAScript 4는 기존의 자바스크립트와 너무 큰 차이점 때문에 표준으로 채택되지 못했다.\n" + "\n" + "JavaScript 학습에 요구되는 선행학습\n" + "웹페이지를 동적으로 제어하기 위한 목적으로 자바스크립트를 학습한다면 아래 내용은 반드시 선행해야한다. 아래 내용을 학습 한 후에 본 수업을 공부하고 DOM을 학습하면 웹페이지를 프로그래밍적으로 제어 할 수 있다. 최근에는 DOM을 직접 제어하는 것 보다는 jQuery와 같은 라이브러리를 사용하는 것이 일반적이다. DOM에 대한 내용은 DOM 수업을 참고하고 jQuery에 대한 내용은 jQuery 수업을 참고한다.\n" + "\n" + "HTML\n" + "웹페이지를 만드는 언어로 자바스크립트가 제어하는 직접적인 대상이다.\n" + "생활코딩 HTML 수업과 HTML 사전을 참고한다.\n" + "CSS\n" + "웹페이지를 꾸며주는 언어로 자바스크립트와 함께 사용되어 HTML을 보다 사용자 친화적인 문서, 응용프로그램으로 만들어준다.\n" + "생활코딩 CSS 수업, CSS 사전을 참고한다.");
            document.setBasicTime(new BasicTime(LocalDateTime.of(2018,1,5,0,0),null));
            map = new HashMap();
            map.put("추가정보1", new URL("http", "www.localhost.com", 8080, "/notExits1"));
            map.put("추가정보2", new URL("http", "www.localhost.com", 8080, "/notExits2"));
            map.put("추가정보3", new URL("http", "www.localhost.com", 8080, "/notExits3"));
            document.setResources(map);
            documents.add(document);

            document = new Document();
            document.setTitle("함수지향");
            document.setContent("함수지향 카테고리의 하위 수업들은 함수형 언어로서 자바스크립트의 면모를 다룬다. 자바스크립트의 핵심적인 도구는 함수다. 자바스크립트의 함수는 매우 강력하다. 함수에 대한 이해 없이는 자바스크립트를 잘 다루기 어렵다. 또한 자바스크립트에서 함수는 객체를 이해하는 데 가장 중요한 기초를 이룬다. \n" + "\n" + "하지만 난이도가 조금 있는 내용이다. 기초수업을 이수했다면 구체적인 자바스크립트의 호스트 환경에 대한 학습으로 넘어가도 된다. 함수에 대한 고급 내용을 다루는 본 카테고리는 나중에 학습해도 좋다. 하지만 언젠가는 꼭 정복해야 할 부분이다. 사실 그렇게 어렵지도 않다. 다만 코드를 처음 다루는 입문자라면 함수와 관련된 기능들의 취지에 공감이 잘 안될지도 모르겠다. ");
            document.setBasicTime(new BasicTime(LocalDateTime.of(2018,2,15,0,0),null));
            map = new HashMap();
            map.put("추가정보1", new URL("http", "www.localhost.com", 8080, "/notExits1"));
            map.put("추가정보2", new URL("http", "www.localhost.com", 8080, "/notExits2"));
            map.put("추가정보3", new URL("http", "www.localhost.com", 8080, "/notExits3"));
            document.setResources(map);
            documents.add(document);

            document = new Document();
            document.setTitle("클로저");
            document.setDescription("클로저(closure)는 내부함수가 외부함수의 맥락(context)에 접근할 수 있는 것을 가르킨다. 클로저는 자바스크립트를 이용한 고난이도의 테크닉을 구사하는데 필수적인 개념으로 활용된다. ");
            document.setContent("클로저(closure)는 내부함수와 밀접한 관계를 가지고 있는 주제다. 내부함수는 외부함수의 지역변수에 접근 할 수 있는데 외부함수의 실행이 끝나서 외부함수가 소멸된 이후에도 내부함수가 외부함수의 변수에 접근 할 수 있다. 이러한 메커니즘을 클로저라고 한다. 아래 예제는 이전의 예제를 조금 변형한 것이다. 결과는 경고창으로 coding everybody를 출력할 것이다.\n" + "\n" + "1\n" + "2\n" + "3\n" + "4\n" + "5\n" + "6\n" + "7\n" + "8\n" + "function outter(){\n" + "    var title = 'coding everybody';  \n" + "    return function(){        \n" + "        alert(title);\n" + "    }\n" + "}\n" + "inner = outter();\n" + "inner();\n" + "예제의 실행순서를 주의깊게 살펴보자. 7행에서 함수 outter를 호출하고 있다. 그 결과가 변수 inner에 담긴다. 그 결과는 이름이 없는 함수다. 실행이 8행으로 넘어오면 outter 함수는 실행이 끝났기 때문에 이 함수의 지역변수는 소멸되는 것이 자연스럽다. 하지만 8행에서 함수 inner를 실행했을 때 coding everybody가 출력된 것은 외부함수의 지역변수 title이 소멸되지 않았다는 것을 의미한다. 클로저란 내부함수가 외부함수의 지역변수에 접근 할 수 있고, 외부함수는 외부함수의 지역변수를 사용하는 내부함수가 소멸될 때까지 소멸되지 않는 특성을 의미한다.");
            document.setHit(10);
            document.setBasicTime(new BasicTime(LocalDateTime.of(2018,3,25,0,0),null));
            map = new HashMap();
            map.put("추가정보1", new URL("http", "www.localhost.com", 8080, "/notExits1"));
            map.put("추가정보2", new URL("http", "www.localhost.com", 8080, "/notExits2"));
            map.put("추가정보3", new URL("http", "www.localhost.com", 8080, "/notExits3"));
            document.setResources(map);
            documents.add(document);

        }catch (MalformedURLException e) {
            e.printStackTrace();
            System.out.printf("Error URL Format");
            throw new RuntimeException(e);
        }
        return documents;
    }

    public static List<Section> javaSection() {
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

    public static List<Section> javascriptSection() {

        List<Section> sections = new ArrayList<>();
        Section section = new Section();
        section.setName("Complete beginners");
        section.setDescription("어째서 재입문일까요? 왜냐하면, JavaScript는 세계에서 가장 오해받고 있는 프로그래밍 언어로 악명이 높기 때문입니다. 종종 장난감 따위로 조롱당하기도 했지만, 기만적이고 단순한 그 거짓말 아래에는 몇 가지의 강력한 언어 기능이 있으며, 믿기 힘들 정도로 많은 개수의 고(髙)-프로필 애플리케이션에 현재 사용되고 있다는 것은, 웹 또는 모바일 개발자 누구에게라도 이 기술에 대한 깊은 지식이 중요한 기량이 된다는 것을 보여주는 것입니다.\n" + "\n" + "언어의 역사에서 시작하는 것이 이 이야기를 이해하는데 도움이 됩니다. JavaScript는 1995년 Netscape의 엔지니어 Brendan Eich에 의해 만들어졌고, 이른 1996년에 Netscape 2와 함께 처음 릴리즈 된것입니다. 원래 LiveScript로 불리지기로 되어있었지만, Sun Microsystem의 Java 언어의 성공에 편승해보려고 두 언어 사이의 공통점이 매우 적음에도 불구하고, 이런 불행이 예견된 마케팅 결정에 따라 이름이 바뀌게 됩니다. 이 사실은 사상 유래가 없는 혼란의 근원이 되어버립니다.\n" + "\n" + "Microsoft는 몇달 후 IE3와 함께 JavaScript와 대부분이 호환되는 JScript로 불리는 언어를 발표합니다. Netscape는 1997년에 ECMAScript 표준의 첫번째 판이 되는 JavaScript를 유럽 표준화 단체인 Ecma International에 보냅니다. 표준은 1999년에 ECMAScript edition 3에 따라 큰 규모의 개정을 거친 후, 유래없이 아주 안정된 상태로 계속 유지되고 있습니다. 4번째 판은 중도 포기되었는데 언어의 복잡성 증가에 대한 우려와 관련한 정치적 문제점 때문입니다. 4번째 판의 여러 파트들은 ECMAScript edition 5 (2009년 12월에 출간) 와 6번째 개정판 규격 (2015년에 출간 예정) 의 근간을 형성하고 있습니다. \n" + "\n" + "여기에서는 좀 더 친숙하게 JavaScript 라는 용어를 사용하겠습니다.\n" + "\n" + "대부분의 프로그래밍 언어와는 달리, JavaScript 언어는 입출력 개념이 없습니다. 호스트 환경 아래에서 스크립트 언어로서 동작하도록 디자인 되어있고, 따라서 외부 세계와 통신하기위해 호스트 환경이 제공하는 메커니즘에 의존합니다. 대부분의 경우 일반적인 호스트 환경은 브라우저이지만 JavaScript 인터프리터는 Adobe Acrobat, Photoshop, SVG images, Yahoo! 위젯 엔진 등의 제품에서도 발견할 수 있고, node.js 와 같은 서버 측 환경에서도 찾을 수 있습니다. 하지만 JavaScript가 사용되는 분야는 계속 더 넓혀지고 있습니다. NoSQL 데이터베이스, Apache CouchDB, 임베디드 컴퓨터, GNU/Linux OS의 가장 유명한 GUI 인 GNOME 과 같은 데스크톱 환경에서도 JavaScript가 사용됩니다.");
        section.setBasicTime(new BasicTime(LocalDateTime.now(),null));
        sections.add(section);

        section = new Section();
        section.setName("Introduction");
        section.setDescription("JavaScript는 무엇인가?\n" + "JavaScript는 크로스-플랫폼, 객체지향 스크립트 언어입니다. 작고 가벼운 언어입니다. 호스트 환경(가령, 웹 브라우저) 내에서, JavaScript는 프로그램 제어를 제공하기 위해 그 환경의 객체에 연결될 수 있습니다.\n" + "\n" + "JavaScript는 Array, Date, Math와 같은 객체에 대한 표준 라이브러리와 연산자(operator), 제어 구조, 문과 같은 언어 요소의 코어 집합을 포함합니다. 코어 JavaScript는 거기에 추가 객체를 보충하여 다양한 목적으로 확장될 수 있습니다. 예를 들면:\n" + "\n" + "클라이언트 측 JavaScript는 브라우저와 문서 객체 모델(DOM) 을 제어하는 객체를 제공하여 코어 언어를 확장합니다. 예를 들어, 클라이언트 측 확장은 어플리케이션이 요소(element)를 HTML 폼에 두고, 마우스 클릭, 폼 입력 및 페이지 탐색 같은 사용자 이벤트에 응답하게 해줍니다.\n" + "서버 측 JavaScript는 서버에서 JavaScript 실행에 관련된 객체를 제공하여 코어 언어를 확장합니다. 예를 들어, 서버 측 확장은 어플리케이션이 데이터베이스와 통신하고, 한 번의 호출 정보의 연속성을 어플리케이션의 다른 곳에 제공하거나, 서버에서 파일 조작을 수행할 수 있도록 해줍니다..");
        section.setBasicTime(new BasicTime(LocalDateTime.now(),null));
        sections.add(section);

        section = new Section();
        section.setName("Grammar and types");
        section.setDescription("이 장은 JavaScript의 기본 문법과 변수 선언, 데이터 형 및 리터럴을 다룹니다.\n" + "\n" + "기본\n" + "JavaScript는 Java로부터 구문 대부분을 빌려온 것 뿐만 아니라 Awk, Perl 및 Python의 영향도 받았습니다.\n" + "\n" + "JavaScript는 대소문자를 구별하며 Unicode 문자셋을 이용합니다.\n" + "\n" + "JavaScript에서는 명령을 문(statement)이라고 부르며, 세미콜론(;)으로 분리됩니다. 스페이스, 탭, 줄바꿈 문자를 공백이라고 합니다. JavaScript의 스크립트 소스는 왼쪽에서 오른쪽으로 탐색되어 토큰, 제어 문자, 줄바꿈 문자, 주석이나 공백인 입력 요소의 열(sequence)로 바뀝니다. ECMAScript에서도 특정 키워드와 리터럴을 정의하고 문을 끝내는 세미콜론 자동 삽입 규칙(ASI)이 있습니다. 하지만, 항상 세미콜론을 추가해 문을 끝내기를 권합니다. 왜냐하면 그러면 부작용을 막습니다. 더 자세한 사항은, JavaScript의 어휘 문법(lexical grammar)에 관한 레퍼런스를 참고하세요.");
        section.setBasicTime(new BasicTime(LocalDateTime.now(),null));
        sections.add(section);

        section = new Section();
        section.setName("Control flow and error handling");
        section.setDescription("JavaScript는 어플리케이션 상의 상호작용을 통합하는데 사용할 수 있는 일련의 문법, 특히 제어흐름 문을 지원합니다. 이 장에서는 이러한 문법의 개요를 제공합니다.\n" + "\n" + "JavaScript reference는 이 장의 문법에 대한 철저하고 자세한 내용은 포함하고 있습니다. 세미콜론 (;) 은 JavaScript 코드 상에서 문장을 나누는데 사용됩니다. \n" + "\n" + " JavaScript 표현식도 문법입니다. 표현식에 대한 자세한 내용은 Expressions and operators를 참조하세요.");
        section.setBasicTime(new BasicTime(LocalDateTime.now(),null));
        sections.add(section);

        return sections;
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
            project.setIcon("android");
            project.setType(Project.Type.BACKEND);
            project.setUrl(new URL("http","www.localhost.com",8080,"/java"));
            projects.add(project);

            project = new Project();
            project.setBasicTime(new BasicTime(LocalDateTime.now(),null));
            project.setName("Javascript");
            project.setDescription("JavaScript는 웹페이지를 동적으로, 프로그래밍적으로 제어하기 위해서 고안된 언어다. 그렇기 때문에 오늘날 가장 중요한 플랫폼이라고 할 수 있는 웹브라우저에서 유일하게 사용할 수 있는 프로그래밍 언어이다. 최근에는 HTML5의 적용이 가속화되면서 지금까지 모바일 환경에서 네이티브 앱(안드로이드, IOS)으로 구현해왔던 기능이 웹에서도 대부분 구현할 수 있게 되고 있다. 웹이 크로스플랫폼이라는 점, 검색 가능하다는 점, 네이티브 디바이스를 제어할 수 있는 하드브리드 시스템(phonegap 등)이 존재한다는 점에서 웹의 중요함은 더욱 확대될 전망이다. 자연스럽게 웹에서 구동되는 유일한 언어인 JavaScript의 중요함도 점점 커질 것으로 예상된다.");
            project.setIcon("javascript");
            project.setType(Project.Type.BACKEND);
            project.setUrl(new URL("http","www.localhost.com",8080,"/javscript"));
            projects.add(project);

            project = new Project();
            project.setBasicTime(new BasicTime(LocalDateTime.now(),null));
            project.setName("Regular Expression");
            project.setDescription("정규표현식(正規表現式, Regular Expression)은 문자열을 처리하는 방법 중의 하나로 특정한 조건의 문자를 '검색'하거나 '치환'하는 과정을 매우 간편하게 처리 할 수 있도록 하는 수단이다.");
            project.setIcon("codepen");
            project.setType(Project.Type.BACKEND);
            project.setUrl(new URL("http","www.localhost.com",8080,"/re"));
            projects.add(project);

            project = new Project();
            project.setBasicTime(new BasicTime(LocalDateTime.now(),null));
            project.setName("HTML");
            project.setDescription("HTML is the standard markup language for creating Web pages. HTML stands for Hyper Text Markup Language. HTML describes the structure of Web pages using markup. HTML elements are the building blocks of HTML pages. HTML elements are represented by tags.");
            project.setIcon("html5");
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
