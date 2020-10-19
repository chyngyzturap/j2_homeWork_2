public class Main {

    public static void main(String[] args) {


    }
    public static Parent createObject1 (String className){
        return switch className;
        case "Child1" -> new Child1(7);
        case "Child2" -> new Child2("Timur");
        case "Child3" -> new Child3(176);
        default -> null;


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
