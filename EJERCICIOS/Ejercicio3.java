package EJERCICIOS;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio3 {
	public static int moda(int[] v) {
		 Map<Integer, Integer> frecuencia = new HashMap<>();
		 int maxFrecuencia = 0;
		 int moda = v[0];
		 for (int num : v) {
			 int f = frecuencia.getOrDefault(num, 0) + 1;
			 frecuencia.put(num, f);
			 if (f > maxFrecuencia) {
				 maxFrecuencia = f;
				 moda = num;
			 }
		 }
		 return moda;
	}
	
	public static void main(String []args) {
		int []arreglo = {1,2,2,2,2,2,2,4};
		System.out.print("El numero que mas se repite del arreglo es: " + moda(arreglo));
	}
}
