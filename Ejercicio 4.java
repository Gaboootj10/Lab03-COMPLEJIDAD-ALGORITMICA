import java.util.HashMap;
import java.util.Map;

public class NumeroMasFrecuente {
    public static int encontrarMasFrecuente(int[] arr) {
        HashMap<Integer, Integer> frecuencia = new HashMap<>();

        // Contar la frecuencia de cada número
        for (int num : arr) {
            frecuencia.put(num, frecuencia.getOrDefault(num, 0) + 1);
        }

        // Encontrar el número con la mayor frecuencia
        int masFrecuente = arr[0];
        int maxFrecuencia = 0;

        for (Map.Entry<Integer, Integer> entry : frecuencia.entrySet()) {
            if (entry.getValue() > maxFrecuencia) {
                masFrecuente = entry.getKey();
                maxFrecuencia = entry.getValue();
            }
        }

        return masFrecuente;
    }

    public static void main(String[] args) {
        int[] arreglo = {3, 1, 2, 3, 4, 3, 2, 1, 2, 2};
        System.out.println("Número más frecuente: " + encontrarMasFrecuente(arreglo));
    }
}
