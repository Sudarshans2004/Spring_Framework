package lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class WithAnnotations {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public WithAnnotations() {
        super();
    }

    @PostConstruct
    public void init() {
        System.out.println("Example bean initialized (@PostConstruct called)");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("Example bean destroyed (@PreDestroy called)");
    }

    @Override
    public String toString() {
        return "Example [message=" + message + "]";
    }
}