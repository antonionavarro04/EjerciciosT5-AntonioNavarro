package ejercicio5;

// ? Importamos la Clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // ^ Definimos la variable posicionArray que nos servirá para imprimir la posición actual del Array
        byte posicionArray = 0;

        // ^ Definimos la variable posicionArrayMinimo y posicionArrayMaximo que nos servira para imprimir el máximo y minimo del array
        byte posicionArrayMaximo = 0;
        byte posicionArrayMinimo = 0;

        // ^ Definimos la variable numeroMáximo y numeroMínimo
        double numeroMaximo = 0;
        double numeroMinimo = 0;

        // ^ Definimos un array de 10 posiciones en la variable listaNumerosReales
        double[] listaNumerosReales = new double[10];

        // ^ Creamos una instancia de la clase Scanner en la variable final read y cambiamos su localización a US
        final Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos al usuario que introduzca 10 numeros
        System.out.println("Introduce 10 numeros reales: ");

        for (byte i = 0; i < listaNumerosReales.length; i++){
            // ! Imprimimos la posición
            System.out.print("[" + i + "] > ");
            
            // ! Añadimos el numero al array segun su posición
            listaNumerosReales[i] = read.nextDouble();
        }

        // ^ Cerramos el Scanner tras su uso
        read.close();

        // ? Salto de Línea Triple
        System.out.println("\n------------------------------\n");

        // ! Recorremos el array en busca del numero máximo
        for (double numeroArray : listaNumerosReales){
            if (numeroArray > numeroMaximo){ // * En caso de que el numero sea mayor al anterior máximo sustituiremos el anterior
                numeroMaximo = numeroArray;
                posicionArrayMaximo = posicionArray;
            } posicionArray++;
        } posicionArray = 0; // * Volvemos a poner a 0 la posición del array

        // ! Recorremos el array en busca del numero minimo
        for (double numeroArray : listaNumerosReales){
            if (posicionArray == 0){ // * Si es la primera posición siempre vamos a sustituir el numero mínimo
                numeroMinimo = numeroArray;
                posicionArrayMinimo = posicionArray;
            } else if (numeroArray < numeroMinimo){ // * En caso de que no sea la primera comprobaremos si es menor o no
                numeroMinimo = numeroArray;
                posicionArrayMinimo = posicionArray;
            } posicionArray++;
        }

        // ! Imprimimos los resultados
        System.out.println("El numero máximo es [" + posicionArrayMaximo + "] > " + numeroMaximo);
        System.out.println("El numero mínimo es [" + posicionArrayMinimo + "] > " + numeroMinimo);
    } // € Hecho por Antonio Navarro
}
