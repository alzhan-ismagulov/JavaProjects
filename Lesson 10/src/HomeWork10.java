public class HomeWork10 {
    public static void main(String[] args) {
        int[] array1 = new int[900];
        for (int i = 0; i < array1.length;i++){
            array1[i] = i+100;
        }
        int[] array2 = new int[array1.length];
        for (int i = 0, j = array1.length -1; i < array1.length; i++, j--){
            array2[j] = array1[i];
        }
        for (int i : array2){
            System.out.println(i);
        }
    }
}
