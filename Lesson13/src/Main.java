public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Bak";
        dog1.poroda = "Dog";
        dog1.speed = 5;
        dog1.run();
        String result = dog1.info();
        System.out.println(result);
    }
}
