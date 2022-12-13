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

        // ! Sobreescribimos el valor minimo y maximo del array con la posición 0 del array
        numeroMaximo = listaNumerosReales[0];
        numeroMinimo = listaNumerosReales[0];

        // ^ Cerramos el Scanner tras su uso
        read.close();

        // ? Salto de Línea Triple
        System.out.println("\n------------------------------\n");

        // ! Recorremos el array en busca del numero máximo y mínimo
        for (double numeroArray : listaNumerosReales){
            // ! Imprimimos el numero actual de la posición del array así como el número máximo y mínimo
            System.out.println("[" + posicionArray + "] = " + numeroArray + " | El numero mínimo es: " + numeroMinimo + " y el máximo es: " + numeroMaximo + "\n");

            // ! Combrobamos si el numero actual es mayor o menor que el numero máximo y mínimo
            if (numeroArray > numeroMaximo){
                System.out.println(numeroArray + " > " + numeroMaximo + "\n");
                numeroMaximo = numeroArray; // * En caso de que el numero sea mayor al anterior máximo sustituiremos el anterior
                posicionArrayMaximo = posicionArray;
            } if (numeroArray < numeroMinimo){
                System.out.println(numeroArray + " < " + numeroMinimo + "\n");
                numeroMinimo = numeroArray; // * En caso de que el numero sea menor al anterior mínimo sustituiremos el anterior
                posicionArrayMinimo = posicionArray;
            } posicionArray++; // * Incrementamos la posición del array

            try { // ? Delay agregado para que se vea mejor el proceso
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // ? Salto de Línea Triple
        System.out.println("\n------------------------------\n");

        // ! Imprimimos los resultados
        System.out.println("El numero máximo es [" + posicionArrayMaximo + "] > " + numeroMaximo);
        System.out.println("El numero mínimo es [" + posicionArrayMinimo + "] > " + numeroMinimo);
    } // € Hecho por Antonio Navarro
}
