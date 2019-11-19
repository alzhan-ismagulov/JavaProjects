public class Main {
    public static void main(String[] args) {
        Rect rect = new Rect();
        rect.Sizes(6,6);
        Double perimetr = rect.Perimetr();
        Double ploschad = rect.Ploschad();
        System.out.println("Perimetr = " + perimetr);
        System.out.println("Ploschad = " + ploschad);
    }
}
