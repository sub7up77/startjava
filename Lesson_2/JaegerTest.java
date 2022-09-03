public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Saber Athena");
        jaeger1.setMark("Mark-7");
        jaeger1.setStatus("Destroyed");
        jaeger1.setHeight(252);
        jaeger1.setWeight(1628);
        Jaeger jaeger2 = new Jaeger("Guardian Bravo", "Mark-6", "Active", 240, 1975);
        jaeger1.selfTest();
        jaeger1.drift();
        jaeger2.selfTest();
        jaeger2.fight();
        jaeger1.setStatus("Active");
        jaeger1.selfTest();
        jaeger1.drift();
    }
}