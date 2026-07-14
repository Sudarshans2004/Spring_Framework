package constructorinjection;

public class Addition {
    private int a ;
    private int b;

    // here if we dont give type in xml bean then it will take addition constructor depend on sequence
    public Addition(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("int ,int");
    }

    public Addition(double a, double b) {
        this.a = (int)a;
        this.b =(int) b;
        System.out.println("double ,double");
    }
//    here it matches the string type with xml string type then it will execute irrespective of sequence
    public Addition(String a, String b) {
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
        System.out.println("String ,String");
    }
    public void doSum(){
        System.out.println("sum is  " + this.a+this.b);
    }
}
