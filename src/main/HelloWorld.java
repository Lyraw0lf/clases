package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloWorld {
    // Esto es un comentario
    /* Main es el método de entrada del programa
    * La primera linea ejecutable va a ser la del método Main
    */
    public static void main(String[] args) throws IOException {
        // Esta linea ejecuta el método saludo y guarda su resultado en la variable nombre
        String nombre = HelloWorld.saludo();
        // Esta linea ejecuta el método edad pasándole como parámetro la variable nombre
        HelloWorld.edad(nombre);
        HelloWorld.primerasesion();




    }
    public static void edad(String nombre) throws IOException {
        // Esta linea de código sirve para escribir por consola
        System.out.println(nombre + " ¿Qué edad tienes?");
        // Estas dos variables sirven para leer por consola
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        // Esta es la linea que lee por consola
        String edad = bufferedReader.readLine();
        System.out.println("Tienes " + edad + " años :D");
        //Como edad la hemos definido de tipo String pero ahora queremos hacer una operación numérica
        // tenemos que convertirla al tipo Integer usando Integer.parseInt(variable)
        Integer segundaedad = Integer.parseInt(edad) + 1;
        System.out.println("Y el año que viene tendrás " + segundaedad);
    }
    public static String saludo() throws IOException {
        System.out.println("Hola, ¿Cómo te llamas?");
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        String nombre = bufferedReader.readLine();
        System.out.println("Hola " + nombre + " :D");
        return nombre;
    }
    public static void primerasesion(){
        System.out.println("HolaMundo");
        String mensaje = "Hola Lala! =)";
        System.out.println(mensaje);
        mensaje = "Patataaaa";
        System.out.println(mensaje);

        String color;
        color = "negro";
        System.out.println("Me gusta el color " +     color);
    }
}
