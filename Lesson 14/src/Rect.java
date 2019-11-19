public class Rect {
    double lenth;
    double width;
    double perimetr;

    Double Sizes(double lenth, double width){
        this.lenth = lenth;
        this.width = width;
        return lenth + width;
    }
    Double Perimetr(){
        return lenth*2 + width*2;
    }
    Double Ploschad(){
        return lenth*width;
    }
}
