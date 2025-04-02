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
    
    /**
    * Total: 2(n/2) + O(n)
    * Mejor caso: O(n log n) -> Cuando el pivote divide en mitades exactas
    * Caso promedio: O(n log n) [Distribución equilibrada de particiones]
    * Peor caso: O(n^2) [Cuando el pivote es siempre el mayor o menor elemento]
    */
    
    /**
     * Método que implementa el algoritmo de ordenamiento por insercion
     * @param arreglo Arreglo de enteros a ordenar
     */
    public static void insertionSort(int[] arreglo) {
        int n = arreglo.length; // 1 operación -> O(1)
        for (int i = 1; i < n; i++) { // Se ejecuta n veces -> O(n)
            int clave = arreglo[i]; // O(n)
            int j = i - 1; // O(n)
            // Desplazar elementos mayores que la clave una posición adelante
            while (j >= 0 && arreglo[j] > clave) { // En el peor caso, se ejecuta n veces por cada i -> O(n^2)
                arreglo[j + 1] = arreglo[j]; // O(n^2) en el peor caso
                j = j - 1; // O(n^2) en el peor caso
            }
            arreglo[j + 1] = clave; // O(n)
        }
    }
    /**
    * Mejor caso (arreglo ya ordenado): O(n)
    * Peor caso (arreglo en orden inverso): O(n^2)
    * 
    * Total: (n^2 + n) -> O(n^2)
    * Mejor caso: O(n) -> Cuando el arreglo ya está ordenado
    * Caso promedio: O(n^2) -> Distribución aleatoria de elementos
    * Peor caso: O(n^2) -> Cuando el arreglo está en orden inverso
    */

    /**
     * Método que implementa el algoritmo de ordenamiento por selección (Selection Sort)
     * @param a Arreglo de enteros a ordenar
     * Entrada: Arreglo [a]
     * Precondición: El arreglo no debe ser nulo
     * Postcondición: El arreglo se devuelve ordenado en orden ascendente
     * Salida: Arreglo ordenado
     */
    public static void selectionSort(int[] a) {
        int n = a.length;//1 operación -> O(1)
        for (int i = 0; i < n - 1; i++) {//Se ejecuta n-1 veces -> O(n)
            int minIndex = i;//O(n)
            for (int j = i + 1; j < n; j++) {//Se ejecuta n-i-1 veces -> O(n^2)
                if (a[j] < a[minIndex]) {//O(n^2)
                    minIndex = j;//O(n^2)
                }
            }
            // Intercambio de elementos
            int aux = a[minIndex];//O(n)
            a[minIndex] = a[i];//O(n)
            a[i] = aux;//O(n)
            }
        }
    /**
     * Mejor caso (arreglo ya ordenado): 
     * Peor caso (arreglo en orden inverso)
     * 
     * Total: (n^2 + n) -> O(n^2)
     * Mejor caso: O(n^2) -> Cuando el arreglo ya esta ordenado
     * Caso Promedio: O(n^2) -> Distribucion aleatoria de elementos 
     * Peor caso: O(n^2) -> Cuando el arreglo está en orden inverso
     */
    
    /**
     * Método que implementa el algoritmo de QuickSort
     * @param a Arreglo a ordenar
     * @param inicio Índice inicial
     * @param fin Índice final
     */
    public static void quickSort(int[] a, int inicio, int fin){
        //Caso Base
        if(inicio < fin){// 1 operación -> O(1)
        
        //Caso Recursivo
        int pivote = particionar(a,inicio,fin);// 2 operaciones -> O(n)
            
        //Recursion de la izquierda
        quickSort(a, inicio, pivote - 1); // n/2 en caso promedio
        
        //Recursion de la derecha
        quickSort(a, pivote + 1, fin); // n/2 en caso promedio
        }
    } 
    /**
     * Método auxiliar para particionar el arreglo usando el último elemento como pivote
     * @param a Arreglo a ordenar
     * @param inicio Índice inicial
     * @param fin Índice final
     * @return Índice del pivote
     */
    private static int particionar(int[] a, int inicio, int fin) {
        // Selección del pivote
        int pivote = a[fin]; // 1 operación -> O(1)

        // Inicialización del índice menor
        int i = inicio - 1; // 1 operación -> O(1)

        // Recorrer todo el arreglo buscando elementos menores al pivote
        for (int actual = inicio; actual < fin; actual++) { // Se ejecuta n veces -> O(n)
            if (a[actual] < pivote) { // En el peor caso, se ejecuta n veces -> O(n)
                i++; // O(n) en el peor caso

                // Intercambio de elementos
                int aux = a[i]; // O(n) en el peor caso
                a[i] = a[actual]; // O(n) en el peor caso
                a[actual] = aux; // O(n) en el peor caso
            }
        }

        // Último intercambio para colocar el pivote en su posición correcta
        int temp = a[i + 1]; // 1 operación -> O(1)
        a[i + 1] = a[fin]; // 1 operación -> O(1)
        a[fin] = temp; // 1 operación -> O(1)

        return i + 1; // O(1)
    }
    /**
     * Total: O(n) para el bucle principal + O(n) para el intercambio -> O(n)
     * Mejor caso: O(n) -> Cuando el pivote es el elemento central
     * Caso promedio: O(n) -> Distribución equilibrada de particiones
     * Peor caso: O(n) -> Cuando el pivote es el mayor o menor elemento
     */
}