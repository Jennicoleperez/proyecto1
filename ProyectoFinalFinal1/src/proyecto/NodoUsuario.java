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
public class NodoUsuario {
    private NodoUsuario siguiente;
    private int relacion;
    private int id;
    private String nombre;

    public NodoUsuario(int id, String nombre) {
        this.siguiente = null;
        this.id = id;
        this.nombre = nombre;
        this.relacion = relacion;
    }

    public NodoUsuario getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoUsuario siguiente) {
        this.siguiente = siguiente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the relacion
     */
    public int getRelacion() {
        return relacion;
    }

    /**
     * @param relacion the relacion to set
     */
    public void setRelacion(int relacion) {
        this.relacion = relacion;
    }
    
}
