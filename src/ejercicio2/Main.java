package ejercicio2;

public class Main {
    public static void main(String[] args) {
        // ^ Definimos un array entero de 10 posiciones
        int[] numerosAleatorios = new int[10];
        
        // ! Mediante un bucle for generaremos 10 numeros aleatorios y se los asignaremos al array
        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = (int) (Math.random() * (100 - 1));
        }

        // ! Mediante un bucle for mostraremos los valores del array
        for (int i = 0; i < numerosAleatorios.length; i++) {
            System.out.println("[" + i + "] > " + numerosAleatorios[i]);
        }
    }
}
