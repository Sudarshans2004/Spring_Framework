package sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext con = new ClassPathXmlApplicationContext("sterotypeconfig.xml");
        Student st = con.getBean("student", Student.class);
        System.out.println(st);
        System.out.println(st.getCity());
    }
}
