package ejercicio2.bubble.sort;

/**
 *
 * @author ErnestoLpz_252663
 */
public class Ejercicio2BubbleSort {
    public static void main(String[] args) {
        int[] a = {0, 5, 2};
        int n = a.length -1;
        
        Ordenamientos.quickSort(a, 0, 0);
        
//        System.out.println("Arreglo original:");
//        imprimirArreglo(a);
//        
//        Ordenamientos ordenamiento = new Ordenamientos(a);
//        ordenamiento.burbuja();
//        
//        System.out.println("Arreglo ordenado:");
//        imprimirArreglo(a);
    }
    
    /**
     * Método auxiliar para imprimir un arreglo.
     *
     * @param a El arreglo a imprimir.
     */
    public static void imprimirArreglo(int[] a) {
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    
}
