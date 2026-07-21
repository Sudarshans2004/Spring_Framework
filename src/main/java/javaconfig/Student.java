package javaconfig;

import org.springframework.stereotype.Component;

public class Student {
    private  Samosa samosa;

    public Samosa getSamosa() {
        return samosa;
    }

    public Student(Samosa samosa) {
        this.samosa = samosa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "samosa=" + samosa +
                '}';
    }

    public void setSamosa(Samosa samosa) {
        this.samosa = samosa;
    }

    public void Study(){
        this.samosa.display();
      System.out.println("Studying");
    }
}
