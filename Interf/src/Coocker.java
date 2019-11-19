public class Coocker extends Employee implements CookeAble{
    public Coocker(String name) {
        super(name);
    }

    @Override
    public void coocking(){
        System.out.println("Готовлю еду");
    }
}
