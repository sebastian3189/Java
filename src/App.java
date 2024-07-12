public class VectorExample {
    public static void main(String[] args) {
        // Declaración y creación de un vector de enteros
        int[] vector = new int[5]; // Vector de tamaño 5

        // Asignación de valores al vector
        vector[0] = 10;
        vector[1] = 20;
        vector[2] = 30;
        vector[3] = 40;
        vector[4] = 50;

        // Acceso y lectura de elementos del vector
        System.out.println("Elemento en la posición 0: " + obtenerElemento(vector, 0));
        System.out.println("Elemento en la posición 2: " + obtenerElemento(vector, 2));

        // Modificación de un elemento del vector
        modificarElemento(vector, 1, 25);
        System.out.println("Elemento en la posición 1 modificado: " + obtenerElemento(vector, 1));

        // Recorrido del vector usando un bucle for mejorado (foreach)
        System.out.println("Recorrido del vector:");
        mostrarVector(vector);
    }

    // Función para obtener un elemento del vector por índice
    public static int obtenerElemento(int[] vector, int indice) {
        return vector[indice];
    }

    // Función para modificar un elemento del vector por índice
    public static void modificarElemento(int[] vector, int indice, int valor) {
        vector[indice] = valor;
    }

    // Función para mostrar todos los elementos del vector
    public static void mostrarVector(int[] vector) {
        for (int elemento : vector) {
            System.out.println("Elemento: " + elemento);
        }
    }
}

