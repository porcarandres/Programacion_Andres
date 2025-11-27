package Tema3_ProgramacionModular;

public class MyArray {

    public static void mostrarArray(int[] gerom){
        for (int i = 0; i < gerom.length; i++) {
            System.out.println(gerom[i]);
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] gerom = new int[]{0,1,2,3,4};
        mostrarArray(gerom);

    }
}
