import org.w3c.dom.ls.LSOutput;

import javax.xml.namespace.QName;

public class Dog {
    String name;
    String poroda;
    int speed;

    void run(){
        String word = "Begu";
        for (int i = 0; i < speed; i++){
            System.out.println("word");
        }
    }

    String info(){
        return "Name dog: " + name + ", Poroda: "  + poroda + ", Speed: " + speed + ".";
    }
}
