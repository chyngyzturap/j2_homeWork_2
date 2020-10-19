public class Child3 extends Parent implements Printable{
    private int height;

    public Child3(int height){
        super(yearOfBirth);
        this.height = height;
    }

    @Override
    public void print() {
        System.out.println("Height: " + height);

    }
}
