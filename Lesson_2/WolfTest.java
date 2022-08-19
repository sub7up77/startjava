public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.isMale = true;
        wolfOne.nickName = "Petya";
        wolfOne.weight = 32.2f;
        wolfOne.age = 7;
        wolfOne.color = "grey";
        System.out.println("\nis male? " + wolfOne.isMale);
        System.out.println("nickname: " + wolfOne.nickName);
        System.out.println("weight: " + wolfOne.weight);
        System.out.println("age: " + wolfOne.age);
        System.out.println("color: " + wolfOne.color);
        wolfOne.go();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}