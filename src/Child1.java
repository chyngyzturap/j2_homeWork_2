public class Child1 extends Parent implements Printable{
    public int age;

    @Override
    public void print() {
        System.out.println("Age: " + age);

    }
}
