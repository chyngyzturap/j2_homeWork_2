public class Main {

    public static void main(String[] args) throws Exception {

        createObject("Child1");
        createObject("Child2");
        createObject("Child3");
    }


    public static void createObject (String className) {
        switch (className) {
            case "Child1" -> new Child1(7,"male");
            case "Child2" -> new Child2("Timur","male");
            case "Child3" -> new Child3(176, "female");
        }
    }
}
