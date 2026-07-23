package collection.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext con = new ClassPathXmlApplicationContext("standaloneconfig.xml");
        Person p = con.getBean("person1", Person.class);
        System.out.println(p);
    }
}
