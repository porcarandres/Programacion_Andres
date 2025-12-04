package EntornosEj;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HolaMundo {
        public static void main(String[] args) {
            // 1. Crear lista con muchos elementos
            List<Integer> numeros = new ArrayList<>();
            Random rand = new Random();
            int totalElementos = 100_000;

            for (int i = 0; i < totalElementos; i++) {
                numeros.add(rand.nextInt(1_000_000));
            }

            // 2. Medir el tiempo antes de recorrer la lista
            long startTime = System.currentTimeMillis();

            // Contar cuántos números son mayores que 500,000
            int contador = 0;
            for (int numero : numeros) {
                if (numero > 500_000) {
                    contador++;
                }
            }

            // Medir el tiempo después del recorrido
            long endTime = System.currentTimeMillis();
            long tiempoTotal = endTime - startTime;

            // 3. Mostrar resultados
            System.out.println("Número de elementos mayores que 500,000: " + contador);
            System.out.println("Tiempo empleado (ms): " + tiempoTotal);
        }
}

