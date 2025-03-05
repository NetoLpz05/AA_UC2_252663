package ejercicio2.bubble.sort;

/**
 * Clase que implementa el algoritmo de ordenamiento Bubble Sort
 * @author ErnestoLpz_252663
 */
public class Ordenamientos {
    int a[];
    
    public Ordenamientos(int[] a){
        this.a = a;
    }
    
    public void burbuja(){
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < a.length - i; i++) {
                //Condicion principal
                if(a[j]>a[j+1]){
                    //Intercambio
                    int aux = a[j];
                    a[j] = a[j+1];
                    a[j+1] = aux;
                }
            }
        }
    }
}
