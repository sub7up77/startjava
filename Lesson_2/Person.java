public class Person {

    //Создание и инициализация обьекта класса Person

    boolean isMan = true;
    String name = "Michael";
    double height = 1.82;
    int weight = 76;
    int age = 22;
    String occupation = "student";

    boolean isLearnJava() {
        return true;
    }

    void go() {
        System.out.println("He(She)'s going...");
    }

    void sit() {
        System.out.println("He(She)'s sitting...");
    }

    void run() {
        System.out.println("He(She)'s running...");
    }

    String speak() {
        return "is speaking";
    }
}
