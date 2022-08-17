public class Person {

    //Создание и инициализация обьекта класса Person

    boolean isMan;
    String name;
    double height;
    int weight;
    int age;
    String occupation;

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

    public static void main(String[] args) {
        Person visitor = new Person();
        visitor.isMan = true;
        visitor.name = "Michael";
        visitor.height = 1.82;
        visitor.weight = 76;
        visitor.age = 22;
        visitor.occupation = "student";
    }

}
