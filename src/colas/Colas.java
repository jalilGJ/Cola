/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

import java.util.Scanner;

public class Colas {

    public static void main(String[] args) {
        int opcion = 0, elemento = 0;
        Cola opc = new Cola();
        do {//para crear el menu y sea dinamico
            Scanner leer = new Scanner(System.in);
            System.out.println("1.-insertar un elemento en la cola");
            System.out.println("2.quitar  un elemento de la cola");
            System.out.println("3.-la cola esta vacia");
            System.out.println("4.-elemento ubicado al inicio de la cola");
            System.out.println("5.-tamaño de la cola");
            System.out.println("6.-Salir");
            System.out.println(" ");
            System.out.print("Elige una opcion:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("ingresa el elemento:");//opcion para ingresar elementos a la cola
                    elemento = leer.nextInt();
                    opc.insertar(elemento);
                    break;
                case 2:
                    if (!opc.estavacia()) {//opcion para sacar elementos de la cola
                        System.out.println("El elemento atendido es:" + opc.quitar_elemento());
                    } else {
                        System.out.println("la cola esta vacia:");

                    }
                    break;
                case 3://opcion para saber si la cola esta vacia o si esta llena
                    if (!opc.estavacia()) {
                        System.out.println("la cola no esta vacia");
                    } else {
                        System.out.println("la cola esta vacia");
                    }

                    break;
                case 4://opcion para saber que elemento se encuentra al inicio
                    if (!opc.estavacia()) {
                        System.out.println("El elemento ubicado al inicio de la cola es:" + opc.inicio_cola());
                    } else {
                        System.out.println("la cola esta vacia");
                    }
                    break;
                case 5:
                    System.out.println("El tamaño de la cola es:" + opc.tamanio_cola());//opcion para saber el tamalo de la col
                    break;
                case 6://salir
                    System.out.println("aplicacion finalizada");
                default:
                    System.out.println("opcion incorrecta");
                    break;

            }

        } while (opcion != 6);
    }

}
