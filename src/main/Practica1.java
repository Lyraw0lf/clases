package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practica1 {

    public static void main(String[] args) throws IOException {
        Practica1.presentacion();
        Practica1.pregunta();
    }

    public static void presentacion() {
        String mensaje1 = "Soy un fantasma...";
        System.out.println(mensaje1);
        System.out.println(".....");
    }

    public static String pregunta() throws IOException {
        System.out.println("Y tú, ¿Cómo te llamas?");
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        String nombre = bufferedReader.readLine();
        System.out.println("Entendido," + nombre);
        return nombre;
    }

    public static void hermanos() {
        System.out.println();
    }
}
