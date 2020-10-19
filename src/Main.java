public class Main {

    private static Object Child1;
    private static Object Child2;
    private static Object Child3;

    public static void main(String[] args) throws Exception {
        createObject((String) Child1);
        createObject((String) Child2);
        createObject((String) Child3);
    }

    public static void createObject (String className) throws Exception {
        switch (className) {
            case "Child1" -> new Child1(7);
            case "Child2" -> new Child2("Timur");
            case "Child3" -> new Child3(176);
            default -> throw new RuntimeException("Wrong Class", new RuntimeException());
        }
    }
}
