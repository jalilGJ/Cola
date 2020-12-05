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
public class Nodos_cola {
    int dato;
    Nodos_cola siguiente;//Para agreagar otro elemento al nodo
    public Nodos_cola (int d){
        dato=d;
        siguiente=null;
    }
    
}
