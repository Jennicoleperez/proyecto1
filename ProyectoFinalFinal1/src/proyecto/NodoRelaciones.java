/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author jenni
 */
public class NodoRelaciones {
    private NodoRelaciones siguiente;
    private int usuario1;
    private int usuario2;
    private int tiempoDeAmistad;

    public NodoRelaciones(int usuario1, int usuario2, int tiempoDeAmistad) {
        this.siguiente = null;
        this.usuario1 = usuario1;
        this.usuario2 = usuario2;
        this.tiempoDeAmistad = tiempoDeAmistad;
    }

    public NodoRelaciones getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoRelaciones siguiente) {
        this.siguiente = siguiente;
    }

    public int getUsuario1() {
        return usuario1;
    }

    public void setUsuario1(int usuario1) {
        this.usuario1 = usuario1;
    }

    public int getUsuario2() {
        return usuario2;
    }

    public void setUsuario2(int usuario2) {
        this.usuario2 = usuario2;
    }

    public int getTiempoDeAmistad() {
        return tiempoDeAmistad;
    }

    public void setTiempoDeAmistad(int tiempoDeAmistad) {
        this.tiempoDeAmistad = tiempoDeAmistad;
    }
    
    

}