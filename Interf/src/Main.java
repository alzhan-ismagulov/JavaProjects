public class Main {
    public static void main(String[] args) {
        Coocker coocker = new Coocker("Ваня-повар");
        Driver driver = new Driver("Петя-водитель");
        Programmer programmer = new Programmer("Билл-программер");

        coocker.coocking();
        coocker.voice();
        driver.driving();
        driver.voice();
        programmer.writeCode();
        programmer.voice();
    }

}
