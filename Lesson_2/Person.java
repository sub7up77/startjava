public class Person {

    //Создание и инициализация обьекта класса Person

    boolean isMan;
    String name;
    double height;
    double weight;
    int age;

    boolean isLearnJava() {
        return true;
    };

    void go() {
        System.out.println("He(She)'s going...");
    };

    void sit() {
        System.out.println("He(She)'s sitting...");
    };

    void run() {
        System.out.println("He(She)'s running...");
    };

    String speak() {
        return "is speaking";
    };

    public Person(boolean isMan, String name, double height, double weight, int age) {
        this.isMan = isMan;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    Person student = new Person(true, "Michael", 1.82, 76, 22);
}
