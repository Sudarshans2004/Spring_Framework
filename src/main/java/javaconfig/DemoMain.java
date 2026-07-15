package javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMain {
    public static void main(String[] args) {
        ApplicationContext con =
                new AnnotationConfigApplicationContext(JavaConfig.class);
        Student st = con.getBean("tempp" , Student.class);
        st.Study();
        System.out.println(st);
    }
}
