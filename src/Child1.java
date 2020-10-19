public class Child1 extends Parent implements Printable{
    private int age;

    public Child1(int age) {
        super(yearOfBirth);
        this.age = age;
    }

    @Override
    public void print() {
        System.out.println("Age: " + age);

    }
}
