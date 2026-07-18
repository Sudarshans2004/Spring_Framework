package constructorinjection;

import java.util.List;

public class Person {
    private String name;
    private int personId;
    private Certificate cer;
    List <String> li;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personId=" + personId +
                ", cer=" + cer +
                ", li=" + li +
                '}';
    }

    public Person(String name, int personId, Certificate cer, List<String> li) {
        this.name = name;
        this.personId = personId;
        this.cer = cer;
        this.li = li;
    }

    public List<String> getLi() {
        return li;
    }

    public void setLi(List<String> li) {
        this.li = li;
    }

    public Certificate getCer() {
        return cer;
    }

    public void setCer(Certificate cer) {
        this.cer = cer;
    }

    public Person(String name, int personId, Certificate cer) {
        this.name = name;
        this.personId = personId;
        this.cer = cer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPersonId() {
        return personId;
    }

    public Person(String name, int personId) {
        this.name = name;
        this.personId = personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public Person() {
    }
}
