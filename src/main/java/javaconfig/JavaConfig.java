package javaconfig;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean("temp")
    public Samosa getSamosa (){
        Samosa sa = new Samosa();
        return sa;
    }
    @Bean("tempp")
    public Student getStudent(){
        Student s = new Student(getSamosa());
        return s;
    }
}
