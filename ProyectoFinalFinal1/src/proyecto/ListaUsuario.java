/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import javax.swing.JOptionPane;

/**
 *
 * Esta clase contiene los métodos y funciones para la ListaUsuario que servirá
 * para el manejo de los datos referentes a los usuarios
 *
 *
 */
public class ListaUsuario {
    
    private NodoUsuario primero;
    private NodoUsuario ultimo;
    private int tamano;
    
    /**
     *
     * Constructor de ListaUsuario
     *
     */
    public ListaUsuario() {
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
     * @param id id del usuario
     * @param nombre nombre del usuario
     */
    public void agregarFinal(int id, String nombre) {
        NodoUsuario nuevo = new NodoUsuario(id, nombre);

        if (estaVacia()) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            NodoUsuario aux = ultimo;
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
    public String getInformacionListaUsuario() {
        String info = "Usuarios\n";
        if (!estaVacia()) {

            NodoUsuario aux = getPrimero();

            for (int i = 0; i < getTamano(); i++) {
                info += aux.getId() + "," + aux.getNombre() + "\n";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, info);
        }
        return info;
    }
    /**
     *
     * Método que te devuelve la posición del id en la lista
     *
     * @param id numero correspodiente al id que se quiere hallar la posicion
     * @return posición del id en la lista
     *
     */
    public int getPosicion(int id) {
        NodoUsuario aux = getPrimero();
        for (int i = 0; i < getTamano(); i++) {
            if (aux.getId() == id) {
                return i;
            }
            aux = aux.getSiguiente();
        }
        return -1;
    }

    /**
     *
     * Método que te devuelve el numero correspodiente al id a partir de la
     * posicion que se encuentre en la lista
     *
     * @param posicion posicion dentro de la lista
     * @return numero correspodiente a la posicion dentro de la lista
     *
     */
    public int getID(int posicion) {
        NodoUsuario aux = getPrimero();
        for (int i = 0; i <= posicion; i++) {
            aux = aux.getSiguiente();
        }
        return aux.getId();
    }
    
    /**
     *
     * Método que te devuelve una lista con los datos de los usuarios
     *
     * @return lista con los datos de los usuarios
     *
     */
    public String[] getArrayUsu() {
        String[] arrayUsuario = new String[getTamano()];
        NodoUsuario aux = getPrimero();
        for (int i = 0; i < getTamano(); i++) {
            arrayUsuario[i] = aux.getId() + ", " + aux.getNombre();
            aux = aux.getSiguiente();
        }
        return arrayUsuario;
    }
    
    public String[] getIDs(){
        String[] arrayIDs = new String[getTamano()];
        NodoUsuario aux = getPrimero();
        for (int i = 0; i < getTamano(); i++) {
            arrayIDs[i] = Integer.toString(aux.getId());
            aux = aux.getSiguiente();
        }
        return arrayIDs;
    }
    
    /**
     *
     * Método que te devuelve una lista con el id del usuario que se pase por
     * parámetro
     *
     * @param usuario id del usuario que se quiere buscar en la lista
     * @return lista con el id de un usuario
     *
     */
    public int buscarUsu(String usuario) {
        NodoUsuario aux = getPrimero();
        for (int i = 0; i < getTamano(); i++) {
            if (Integer.toString(aux.getId()).equals(usuario)) {
                return aux.getId();
            }
            aux = aux.getSiguiente();
        }
        return -1;

    }
    
    
    public NodoUsuario getNodo(int id) {
        
        NodoUsuario aux = getPrimero();
        for (int i = 0; i < getTamano(); i++) {
            if (id == aux.getId()){
                return aux;
            }
            aux = aux.getSiguiente();
        }
        
        return null;
    }

    public void eliminarUsuario(String id) {
        NodoUsuario nodo = getNodo(Integer.parseInt(id));
        if (nodo != null) {
            if (tamano == 1) {
                
            } else {
                if (primero == nodo) {
                    primero = primero.getSiguiente();
                } else if (ultimo == nodo) {
                    NodoUsuario aux = primero;
                    for (int i = 0; i < tamano - 1; i++) {
                        aux = aux.getSiguiente();
                    }
                    aux.setSiguiente(null);
                    ultimo = aux;
                } else {
                    NodoUsuario aux = primero;
                    while (aux.getSiguiente() != nodo) {
                        aux = aux.getSiguiente();
                    }
                    aux.setSiguiente(nodo.getSiguiente());
                }
            }
        }
        tamano--;
    }
    
    //Getters y setters
    public NodoUsuario getPrimero() {
        return primero;
    }

    public void setPrimero(NodoUsuario primero) {
        this.primero = primero;
    }

    public NodoUsuario getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoUsuario ultimo) {
        this.primero = ultimo;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    //    public void imprimirUsuario(){
//        String imprimirListaUsuario = "Usuarios\n";
//        if (!estaVacia()){
//            NodoUsuario aux = primero;
//                for (int i= 0; i<tamano; i++){
//                    imprimirListaUsuario += aux.getId() +","+ aux.getNombre() + "\n";
//                    aux = aux.getSiguiente();               
//                }
//                JOptionPane.showMessageDialog(null, imprimirListaUsuario);                
//        }else{
//            JOptionPane.showMessageDialog(null, "La lista de usuarios está vacía."); 
//        }
//    }
}
