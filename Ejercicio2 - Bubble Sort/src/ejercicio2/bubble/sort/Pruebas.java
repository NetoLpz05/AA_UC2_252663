package ejercicio2.bubble.sort;

import static ejercicio2.bubble.sort.Ordenamientos.quickSort;

/**
 *
 * @author ErnestoLpz_252663
 */
public class Pruebas {
    public static void main(String[] args) {
        int[] arregloQuickSort = {5, 2, 8};
        
        System.out.println("Arreglo original para QuickSort:");
        imprimirArreglo(arregloQuickSort);

        quickSort(arregloQuickSort, 0, arregloQuickSort.length - 1);

        System.out.println("Arreglo ordenado con QuickSort:");
        imprimirArreglo(arregloQuickSort);

        int[] arregloSelectionSort = { 5, 8, 3 };
        System.out.println("\nArreglo original para SelectionSort:");
        imprimirArreglo(arregloSelectionSort);

        Ordenamientos.selectionSort(arregloSelectionSort);

        System.out.println("Arreglo ordenado con SelectionSort:");
        imprimirArreglo(arregloSelectionSort);
    }

    private static void imprimirArreglo(int[] a) {
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}