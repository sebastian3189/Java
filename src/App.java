public class App {
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
        System.out.println("Elemento en la posición 0: " + vector[0]);
        System.out.println("Elemento en la posición 2: " + vector[2]);

        // Recorrido del vector usando un bucle for
        System.out.println("Recorrido del vector:");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Elemento en la posición " + i + ": " + vector[i]);
        }
    }
}

