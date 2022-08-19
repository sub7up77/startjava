public class Person {

    boolean isMan = true;
    String name = "Michael";
    float height = 1.82f;
    float weight = 76.2f;
    int age = 22;
    String occupation = "student";

    boolean isLearnJava() {
        return true;
    }

    void go() {
        System.out.println("He(She)'s going.");
    }

    void sit() {
        System.out.println("He(She)'s sitting.");
    }

    void run() {
        System.out.println("He(She)'s running.");
    }

    String speak() {
        return "is speaking";
    }
}
