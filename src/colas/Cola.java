/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

/**
 *
 * @author PC7
 */
public class Cola {

    Nodos_cola inicio, fin;
    int tama; // se declara una variable de tipo entero

    public Cola() {
        inicio = fin = null;
        tama = 0;

    }

    public boolean estavacia() { // se crea un metodo para combrobar si esta vacia 
        return inicio == null; // se retorna para saber si esta vacia o no.

    }

    public void insertar(int elemento) {//metodo para insertar elementos a la cola
        Nodos_cola nuevo = new Nodos_cola(elemento);
        if (estavacia()) {
            inicio = nuevo; // esto lo ponemos con el fin de saber que nuevos elemntos vamos insertando

        } else {
            fin.siguiente = nuevo;

        }
        fin = nuevo;
        tama++; // incrementamos el tamaño
    }

    public int quitar_elemento() {//metodo para quitar un elemento
        int aux = inicio.dato;
        inicio = inicio.siguiente;
        tama--;
        return aux; // se retorna el auxiliar

    }

    public int inicio_cola() {
        return inicio.dato;

    }

    public int tamanio_cola() {//Tamaño de la cola
        return tama;

    }
}
