package lifecycle;

public class Samosa
{
    private int price ;

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }

    public Samosa() {
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void init(){
        System.out.println("init");
    }
    public void destroy(){
        System.out.println("destroy");
    }
}
