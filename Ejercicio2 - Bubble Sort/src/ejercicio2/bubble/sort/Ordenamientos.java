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
    
    /**
     * Entrada: Arreglo [a]
     * Precondición: El arreglo no debe ser nulo
     * Postcondición: El arreglo se devuelve ordenado en orden ascendente
     * Salida: Arreglo ordenado
     */
    public void burbuja(){
        int n = a.length; //Asignacion: 1 -> O(1)
        for (int i = 1; i < n; i++){ // Asignacion: 1, Condicion: n, Incremento: n-1 -> O(n)
            for (int j = 0; j < n - i; j++){ // Asignacion: n-1, Condicion: n(n-1)/2, Incremento: n(n-1)/2 -> O(n^2)
                //Condicion principal
                if(a[j]>a[j+1]){ // n(n-1)/2 -> O(n^2)
                    //Intercambio
                    int aux = a[j]; // En el peor caso: n(n-1)/2 -> O(n^2)
                    a[j] = a[j+1]; // n(n-1)/2
                    a[j+1] = aux; // n(n-1)/2
                    //Como cada vez que se llega a la parte del intercambio y todas las asignaciones valen lo mismo
                    //Se multiplica por 3 a n(n-1)/2 
                    // Total de asignaciones en el intercambio: 3*n(n-1)/2 -> O(n^2) 
                }
            }
        }
        // Total: 1 + (n-1) + n(n-1)/2 + 3*n(n-1)/2 = 2n + 5n(n-1)/2
        // Big O: O(n^2) (En el peor caso) [El arreglo esta desordenado]
        // Big O: O(n) (En el mejor caso) [El arreglo ya esta ordenado]
    }

    public static void seleccion(int[] a){
        int n = a.length; //1
        for (int i = 0; i < n-1; i++) {//Nos va a dar la posicion del elemento mas pequeño del arreglo 
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if(a[j] < a[minIndex]){
                    minIndex = j;
                }
            }
            //Intercambio
            int aux = a[minIndex];
            a[minIndex] = a[i];
            a[i] = aux;
        }
    }
}