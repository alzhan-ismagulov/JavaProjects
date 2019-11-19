public class Driver extends Employee implements DriveAble{
    public Driver(String name) {
        super(name);
    }

    @Override
    public void driving() {
        System.out.println("Пишу код");
    }
}
