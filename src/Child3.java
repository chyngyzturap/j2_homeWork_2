public class Child3 extends Parent implements Printable{
    private int height;

    public Child3(int height, String maleOrFemale){
        super(maleOrFemale);
        this.height = height;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Height: " + height);

    }
}
