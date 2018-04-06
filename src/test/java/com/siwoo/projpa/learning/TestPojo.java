package com.siwoo.projpa.learning;

import lombok.Setter;
import org.junit.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.RuntimeBeanNameReference;
import org.springframework.beans.factory.config.RuntimeBeanReference;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.context.support.StaticApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import java.util.Scanner;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class TestPojo {

    @Setter
    private static class Hello {
        String name;
        Printer printer;

        public String greeting() {
            return "Hello " + name;
        }

        public void print() {
            this.printer.print(greeting());
        }
    }

    private interface Printer {
        void print(String message);
    }

    private static class StringPrinter implements Printer {
        private StringBuffer stringBuffer = new StringBuffer();

        @Override
        public void print(String message) {
            stringBuffer.append(message);
        }

        public String toString() {
            return this.stringBuffer.toString();
        }
    }

    private static class ScannerPrinter implements Printer {
        private Scanner scanner = null;

        @Override
        public void print(String message) {
            scanner = new Scanner(message);
        }

        public String toString() {
            return this.scanner.nextLine();
        }
    }

    @Test
    public void beanDefinition() {
        StaticApplicationContext c = new StaticApplicationContext();
        c.registerSingleton("hello1", Hello.class);

        Hello hello1 = c.getBean("hello1", Hello.class);
        assertThat(hello1, is(notNullValue()));

        c.registerBeanDefinition("printer",new RootBeanDefinition(ScannerPrinter.class));
        BeanDefinition helloDef = new RootBeanDefinition(Hello.class);
        helloDef.getPropertyValues().addPropertyValue("name", "Spring");
        helloDef.getPropertyValues().addPropertyValue("printer",new RuntimeBeanReference("printer"));
        c.registerBeanDefinition("hello2",helloDef);

        Hello hello2 = (Hello) c.getBean("hello2");
        assertThat(hello2.greeting(), is("Hello "+ "Spring"));
        assertThat(hello1,is(not(hello2)));
        assertThat(c.getBeanFactory().getBeanDefinitionCount(),is(3));
        hello2.print();
        System.out.println(hello2.printer.toString());
    }

    /*new FileSystemResource("src/test/java/com/siwoo/projpa/learning/testing-context.xml")*/
    @Test
    public void genericApplicationContext() {
//        GenericApplicationContext c = new GenericApplicationContext();
//        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(c);
//        reader.loadBeanDefinitions(new FileSystemResource("src/test/java/com/siwoo/projpa/learning/testing-context.xml"));
//        c.refresh();
        GenericApplicationContext c = new GenericXmlApplicationContext(new FileSystemResource("src/test/java/com/siwoo/projpa/learning/testing-context.xml"));
        Hello hello = c.getBean("hello",Hello.class);
        assertNotNull(hello);
        hello.print();
        assertThat(c.getBean(Printer.class).toString(), is("Hello Spring"));
    }

}
