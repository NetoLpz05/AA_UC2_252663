package ejercicio2.bubble.sort;

/**
 *
 * @author ErnestoLpz_252663
 */
public class Pruebas {
    public static void main(String[] args) {
        int[] a = {5, 8, 3};
        int n = a.length -1;
        
        Ordenamientos.selectionSort(a);
        
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
