public class Child2 extends Parent implements Printable {
    private String name;

    public String getName() {
        return name;
    }

    public Child2 (String name, String MaleOrFemale){
        super(MaleOrFemale);
        this.name= name;

    }
    @Override
    public void print() {
        System.out.println("Name: " + name);

    }
}
