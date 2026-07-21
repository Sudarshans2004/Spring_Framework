package sterotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("student")
public class Student {
    @Value("Sudarshan")
    private String name;
    //by using spring expression language
    @Value("#{22+11-2}")
    private int id;
    @Value("#{temp}")
    private List<String> city;
    @Value("#{ T(java.lang.Math).sqrt(25) }")
    private int x;

    @Value("#{ T(java.lang.Math).PI }")
    private double z ;

    public boolean isB() {
        return b;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", city=" + city +
                ", x=" + x +
                ", z=" + z +
                ", s='" + s + '\'' +
                ", b=" + b +
                '}';
    }

    public void setB(boolean b) {
        this.b = b;
    }

    @Value(" #{new java.lang.String('Sudarshan') }")
    private String s;

    @Value("#{ 8>3 }")
    private boolean b;

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public List<String> getCity() {
        return city;
    }

    public void setCity(List<String> city) {
        this.city = city;
    }

}
