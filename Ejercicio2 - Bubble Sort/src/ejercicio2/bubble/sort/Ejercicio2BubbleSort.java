package ejercicio2.bubble.sort;

/**
 *
 * @author ErnestoLpz_252663
 */
public class Ejercicio2BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = {8, 30, 15};
        
        System.out.println("Arreglo original:");
        imprimirArreglo(a);
        
        Ordenamientos ordenamiento = new Ordenamientos(a);
        ordenamiento.burbuja();
        
        System.out.println("Arreglo ordenado:");
        imprimirArreglo(a);
    }
    
    // Función para imprimir el arreglo
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
