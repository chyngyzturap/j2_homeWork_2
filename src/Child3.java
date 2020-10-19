public class Child3 extends Parent implements Printable{
    public int height;

    @Override
    public void print() {
        System.out.println("Height: " + height);

    }
}
