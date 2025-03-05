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
        int[] a = {8, 15, 30};
        
        System.out.println("Arreglo original:");
        System.out.println(a);
        
        Ordenamientos ordenamiento = new Ordenamientos(a);
        ordenamiento.burbuja();
        
        System.out.println("Arreglo ordenado:");
        System.out.println(a);
    }
}
