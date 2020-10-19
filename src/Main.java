public class Main {

    public static void main(String[] args) throws Exception {

        createObject("Child1").print();
        createObject("Child2").print();
        createObject("Child3").print();
    }


    public static Printable createObject (String className) throws Exception {
        return switch (className) {
            case "Child1" -> new Child1(7,"male");
            case "Child2" -> new Child2("Timur","male");
            case "Child3" -> new Child3(176, "female");
            default -> throw new RuntimeException("Chyngyz", new RuntimeException());
        };
    }
}
