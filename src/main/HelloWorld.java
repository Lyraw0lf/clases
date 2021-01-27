package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class HelloWorld {
    // Esto es un comentario
    /* Main es el método de entrada del programa
    * La primera linea ejecutable va a ser la del método Main
    */
    public static void main(String[] args) throws IOException {
        HelloWorld.menu();
        // Siguiente clase
        // Hacer que el programa te diga que has escrito una opción incorrecta
        // Potencias
        // Condiciones con or y and


    }
    public static void edad(String nombre) throws IOException {
        // Esta linea de código sirve para escribir por consola
        System.out.println(nombre + " ¿Qué edad tienes?");
        // Estas dos variables sirven para leer por consola
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        Boolean edadincorrecta = false;
        String edad ="";
        Integer edad1 =1;
        while(edadincorrecta == false){
            try{ // Esta es la linea que lee por consola
                edad = bufferedReader.readLine();
                edad1 = Integer.parseInt(edad);
                edadincorrecta = true;
            } catch (Exception ex){
                System.out.println("Edad incorrecta. Por favor, escribe un número.");
            }

        }
        System.out.println("Tienes " + edad + " años :D");
        if (edad1<18){
            System.out.println("Eres menor de edad D:");
        } else {
            System.out.println("Eres mayor de edad");
        }
        while(edad1>0){
            System.out.println("Cuenta atrás"+ edad1);
            edad1= edad1 - 1;
        }
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

    public static void menu () throws IOException {
        System.out.println("Elige una de las opciones");
        System.out.println("a) Introducir nombre");
        System.out.println("b) Introducir edad");
        System.out.println("c) Reproducir primera sesión");
        System.out.println("x) Salir");
        String opcion;
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        opcion= bufferedReader.readLine();
        String nombre="Desconocido";
        while (!opcion.equals("x")){
            if(opcion.equals("a") || opcion.equals("A")){
                nombre= HelloWorld.saludo();
            }
            if(opcion.toLowerCase().equals("b")){
                HelloWorld.edad(nombre);
            }
            if (opcion.equals("c")){
                HelloWorld.primerasesion();
            }
            System.out.println("Elige una de las opciones");
            System.out.println("a) Introducir nombre");
            System.out.println("b) Introducir edad");
            System.out.println("c) Reproducir primera sesión");
            System.out.println("x) Salir");
            opcion= bufferedReader.readLine();
        }
    }
}
