public class Child1 extends Parent implements Printable{
    private int age;

    public int getAge() {
        return age;
    }

    public Child1(int age) {
        this.age = age;
    }

    @Override
    public void print() {
        System.out.println("Age: " + age);

    }
}
