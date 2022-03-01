/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Jennifer Pérez
 */
public class Listas {

    private ListaUsuario listaUsuario;
    private ListaRelaciones listaRelaciones;

    public Listas(ListaUsuario listaUsuario, ListaRelaciones listaRelaciones) {
        this.listaUsuario = listaUsuario;
        this.listaRelaciones = listaRelaciones;
    }

    
    
    public void imprimirlistas(){
        listaUsuario.getInformacionListaUsuario();
        listaRelaciones.getInformacionListaRelaciones();
    }
    
    
    public ListaUsuario getListaUsuario() {
        return listaUsuario;
    }

    public void setListaUsuario(ListaUsuario listaUsuario) {
        this.listaUsuario = listaUsuario;
    }

    public ListaRelaciones getListaRelaciones() {
        return listaRelaciones;
    }

    public void setListaRelaciones(ListaRelaciones listaRelaciones) {
        this.listaRelaciones = listaRelaciones;
    }
    
    
}
