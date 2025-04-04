package EJERCICIOS;

public class Ejercicio7 {
	
	public static void mergeSort(int[] arr) {
        int[] temp = new int[arr.length];
        mergeSortHelper(arr, temp, 0, arr.length - 1);
    }

    private static void mergeSortHelper(int[] arr, int[] temp, int left, int right) {
        if (left >= right) return;

        int mid = (left + right) / 2;
        mergeSortHelper(arr, temp, left, mid);
        mergeSortHelper(arr, temp, mid + 1, right);
        merge(arr, temp, left, mid, right);
    }

    private static void merge(int[] arr, int[] temp, int left, int mid, int right) {
        for (int i = left; i <= right; i++)
            temp[i] = arr[i];

        int i = left, j = mid + 1, k = left;

        while (i <= mid && j <= right) {
            if (temp[i] <= temp[j])
                arr[k++] = temp[i++];
            else
                arr[k++] = temp[j++];
        }

        while (i <= mid)
            arr[k++] = temp[i++];
    }

    public static void main(String[] args) {
        int[] arreglooo = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Arreglo original:");
        for (int num : arreglooo)
            System.out.print(num + " ");
        System.out.println();
        mergeSort(arreglooo);
        System.out.println("Arreglo ordenado:");
        for (int num : arreglooo)
            System.out.print(num + " ");
    }
}