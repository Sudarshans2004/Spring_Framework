package constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ciconfig.xml");
        Person p = (Person) context.getBean("person1");
        System.out.println(p);
        Addition add = (Addition) context.getBean("adn");
        add.doSum();
    }
}
