import java.util.Scanner;

public class nada {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe las champions del Real Madrid:");
        int champions = sc.nextInt();
        int champions1 = champions-15;
        System.out.println("15-15");
        System.out.println("El madrid tiene: "+champions1+" ya que todas son robadas");
        sc.close();
    }
}
