/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import javax.swing.JOptionPane;

/**
 *
 * Esta clase contiene los métodos y funciones para la ListaRelaciones que
 * servirá para el manejo de los datos referentes a las relaciones
 *
 *
 */
public class ListaRelaciones {

    private NodoRelaciones primero;
    private NodoRelaciones ultimo;
    private int tamano;

    /**
     *
     * Constructor de ListaRelaciones
     *
     */
    public ListaRelaciones() {
        this.primero = null;
        this.ultimo = null;
        this.tamano = 0;
    }//Cierre del constructor
    
    /**
     *
     * Método que devuelve si la lista es vacia o no
     *
     * @return true si está vacía, si no false
     *
     */
    public boolean estaVacia() {
        return getPrimero() == null;
    }

    /**
     *
     * Procedimiento para agregar elementos a lista
     *
     * @param usuario1 id del usuario1
     * @param usuario2 id del usuario2
     * @param tiempoDeAmistad tiempo de amistad entre usuarios
     */
    public void agregarFinalRelaciones(int usuario1, int usuario2, int tiempoDeAmistad) {

        NodoRelaciones nuevo = new NodoRelaciones(usuario1, usuario2, tiempoDeAmistad);

        if (estaVacia()) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            NodoRelaciones aux = ultimo;
            aux.setSiguiente(nuevo);
            ultimo = nuevo;
        }
        tamano += 1;
    }
  
    /**
     *
     * Método que te devuelve la información de los campos de la lista separados
     * con coma
     *
     * @return informacion de los campos de la lista
     *
     */
    public String getInformacionListaRelaciones() {
        String info = "Relaciones\n";
        if (!estaVacia()) {

            NodoRelaciones aux = getPrimero();

            for (int i = 0; i < getTamano(); i++) {
                info += aux.getUsuario1() + "," + " " + aux.getUsuario2() + "," + " " + aux.getTiempoDeAmistad() + "\n";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, info);
        }
        return info;
    }

    /**
     *
     * Método que te devuelve el numero correspodiente al usuario1 a partir de
     * la posicion que se encuentre en la lista
     *
     * @param posicion posicion dentro de la lista
     * @return numero correspodiente a la posicion dentro de la lista
     *
     */
    public String getValor(int posicion) {

        if (!estaVacia()) {
            NodoRelaciones aux = getPrimero();

            for (int i = 0; i <= getTamano(); i++) {
                if (i == posicion) {
                    return Integer.toString(aux.getTiempoDeAmistad());
                }
                aux = aux.getSiguiente();
            }

        } else {
            return "";
        }
        return "";
    }
    
    /**
     * Método que devuelve un booleano dependiendo de las relaciones que se
     * pasen por parametro
     *
     * @param usuario1 id del usuario1
     * @param usuario2 id del usuario2
     *
     * @return booleano
     */
    public boolean existeRelacion(int usuario1, int usuario2) {

        NodoRelaciones aux = getPrimero();
        for (int i = 0; i < getTamano(); i++) {
            if ((aux.getUsuario1() == usuario1) && aux.getUsuario2() == usuario2) {
                return true;
            }
            aux = aux.getSiguiente();
        }
        return false;
    }

    /**
     *
     * Método que te devuelve una lista con los datos de las relaciones
     *
     * @return lista con los datos de las relaciones
     *
     */
    public String[] getArrayRelacion() {
        NodoRelaciones aux = getPrimero();
        String[] rutas = new String[getTamano()];
        for (int i = 0; i < getTamano(); i++) {
            rutas[i] = aux.getUsuario1() + "," + aux.getUsuario2() + "," + aux.getTiempoDeAmistad();
            aux = aux.getSiguiente();
        }
        return rutas;
    }

    /**
     *
     * Método que te devuelve la posición del tiempo de amistad en la lista
     *
     * @param valor numero correspodiente al tiempo de amistad que se quiere
     * hallar la posicion
     * @return posición del tiempo de amistad en la lista
     *
     */
    public int getPosicionRelacion(int valor) {
        if (!estaVacia()) {
            NodoRelaciones aux = getPrimero();
            int cont = 0; 

            while (aux != null) {

                if (aux.getTiempoDeAmistad() == valor) {
                    return cont;
                }
                cont++;
                aux = aux.getSiguiente();
            }
            return 0;
        } else {
            return 0;
        }
    }
    
   
    public NodoRelaciones[] getNodo(int id) {
        NodoRelaciones[] nodos = new NodoRelaciones[getTamano()];
        NodoRelaciones aux = getPrimero();
        int posicion = 0;
        for (int i = 0; i < getTamano(); i++) {
            if (id == aux.getUsuario1() || id == aux.getUsuario2()) {
                nodos[posicion] = aux;
                posicion++;
            }
            aux = aux.getSiguiente();
        }

        return nodos;
    }

    public void eliminarRelacion(String id) {
        NodoRelaciones[] nodos = getNodo(Integer.parseInt(id));
        for (int i = 0; i < nodos.length && nodos[i] != null; i++) {
            NodoRelaciones nodo = nodos[i];
            if (nodo != null) {
                if (tamano == 1) {

                } else {
                    if (primero == nodo) {
                        primero = primero.getSiguiente();
                    } else if (ultimo == nodo) {
                        NodoRelaciones aux = primero;
                        for (int j = 0; j < tamano - 1; j++) {
                            aux = aux.getSiguiente();
                        }
                        aux.setSiguiente(null);
                        ultimo = aux;
                    } else {
                        NodoRelaciones aux = primero;
                        while (aux.getSiguiente() != nodo) {
                            aux = aux.getSiguiente();
                        }
                        aux.setSiguiente(nodo.getSiguiente());
                    }
                }
            }
            tamano--;
        }
    }
   
    
    /**
     *
     * Método que te devuelve un string con las relaciones del nodo con el formato apto
     * para usar Graphviz
     *
     * @return string con las relaciones del nodo con el formato apto para usar
     * Graphviz
     *
     */
    public String getRelacionesGraphviz() {
        NodoRelaciones aux = getPrimero();
        String info = "";
        for (int i = 0; i < getTamano(); i++) {
            info += "\"" + aux.getUsuario1() + "\"" + " -- " +"\"" + aux.getUsuario2() + "\"" + " " + "[label=\"" + aux.getTiempoDeAmistad() + "\"];" + "\n";
            aux = aux.getSiguiente();
        }
        return info;
    }
    
    //Getters y Setters    
    public NodoRelaciones getPrimero() {
        return primero;
    }

    public void setPrimero(NodoRelaciones primero) {
        this.primero = primero;
    }

    public NodoRelaciones getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoRelaciones ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }
   
    
    

}