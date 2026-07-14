package constructorinjection;

public class Certificate
{
    private String certiName;

    public Certificate(String certiName) {
        this.certiName = certiName;
    }

    public String getCertiName() {
        return certiName;
    }

    public void setCertiName(String certiName) {
        this.certiName = certiName;
    }

    public Certificate() {
    }
}
