package Tema4_ProgramacionObjetos;

public class HeroMain {
    public static void main(String[] args) {
        //heroes
        Hero heroe1 = new Hero("Aragorn", 1, 50, 100, 0, 30, 15);
        Hero heroe2 = new Hero("Orco", 1, 60, 60, 0, 20, 5);

        System.out.println("Batalla");
        System.out.println("Stats:");
        System.out.println(heroe1.toString());
        System.out.println(heroe2.toString());
        System.out.println();

        // curacion de pocion
        System.out.println(heroe1.toString() + " encuentra una pocion:");
        heroe1.drinkPotion();
        System.out.println();

        // combate
        // que ataque el 2 para ver si sube de nivel
        System.out.println(heroe1.toString()+ " ataca al " + heroe2.toString()+ " varias veces:");
        heroe1.attack(heroe2);
        heroe1.attack(heroe2);
        heroe1.attack(heroe2);
        heroe1.attack(heroe2);
        heroe1.attack(heroe2);
        System.out.println();

        //descanso
        System.out.println("El " + heroe2.toString()+ "se retira a descansar:");
        heroe2.rest(); // recupera vida
        System.out.println();

        //final
        System.out.println("estado final:");
        System.out.println(heroe1.toString());
        System.out.println(heroe2.toString());
    }
}
