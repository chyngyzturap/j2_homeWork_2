public class Parent implements Printable{
    private String maleOrFemale;

    public Parent (String maleOrFemale){
        this.maleOrFemale = maleOrFemale;
    }

    @Override
    public void print() {
        System.out.println("Sex: " + maleOrFemale);
    }
}
