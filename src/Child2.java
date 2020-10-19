public class Child2 extends Parent implements Printable {
    public String name;

    @Override
    public void print() {
        System.out.println("Name: " + name);

    }
}
