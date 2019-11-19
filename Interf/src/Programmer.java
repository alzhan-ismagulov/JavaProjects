public class Programmer extends Employee implements ProgrammingAble {
    @Override
    public void writeCode() {
        System.out.println("Пишу код");
    }

    public Programmer(String name) {
        super(name);
    }
}
